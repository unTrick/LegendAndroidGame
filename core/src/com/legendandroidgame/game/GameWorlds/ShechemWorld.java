package com.legendandroidgame.game.GameWorlds;

import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.Bullet;
import com.badlogic.gdx.physics.bullet.DebugDrawer;
import com.badlogic.gdx.physics.bullet.linearmath.btIDebugDraw;
import com.legendandroidgame.game.AddonTools.Environment;
import com.legendandroidgame.game.AddonTools.WorldCamera;
import com.legendandroidgame.game.BulletComponent.*;
import com.legendandroidgame.game.BulletSystem.*;
import com.legendandroidgame.game.BulletTools.CharacterEntityFactory;
import com.legendandroidgame.game.BulletTools.MapEntityFactory;
import com.legendandroidgame.game.BulletTools.ObjectEntityFactory;
import com.legendandroidgame.game.Buttons.ActualGameButtons;
import com.legendandroidgame.game.Buttons.Controller;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 10/22/2017.
 */
public class ShechemWorld {
    private ModelBatch batch;
    private Environment environment;
    private WorldCamera worldCam;
    private Engine engine;
    private BulletSystem bulletSystem;
    private Entity character;
    private Entity map, stone, portal1Entity, portal2Entity, portal3Entity;
    private PlayerSystem playerSystem;
    private IsraelitesSystem israelitesSystem;
    private AnimationComponent characterAnimation;
    private ModelComponent modelComponent;
    private ActualGameButtons actualGameButtons;

    private DebugDrawer debugDrawer;
    private static final boolean debug = false;

    private String current = gameData.getString("current");

    private float posX, posZ;
    public Vector2 mover;

    public boolean stoneCollide = false, nearTree = false;

    public boolean goToHaran = false, goToJordan = false, goToBethel = false;

    private Vector3 playerPos, portal1Pos, portal2Pos, portal3Pos;
    private Vector3 treePosition = new Vector3(94.93171f,5.256006f,46.945618f);


    public ShechemWorld(Controller controller, ActualGameButtons actualGameButtons) {
        Bullet.init();
        this.actualGameButtons = actualGameButtons;
        initCamera();
        initModelBatch();
        initEnvironment();
        setDebug();
        map = MapEntityFactory.loadShechem();
        modelComponent = map.getComponent(ModelComponent.class);
        mover = new Vector2();
        if(gameData.getInteger(current + " from") == 2){
            posX = 258;
            posZ = -225;
//            (275.20697,6.101687,201.14828)
//            this is z(-1419.0806,1500.0,-1397.7231)
        }
        if(gameData.getInteger(current + " from") == 3){
            posX = -210;
            posZ = -134;
//            (-693.1684,7.3171496,295.76648)
//            this is z(-2387.456,1500.0,-1303.105)
        }
        if(gameData.getInteger(current + " from") == 9){
            posX = -181;
            posZ = 262;
//            (62.54196,6.64147,-306.0129)
//            this is z(-1631.7456,1500.0,-1904.8844)
        }
        if(gameData.getInteger(current + " from") == 25){
            posX = 121;
            posZ = -2;
//            (62.54196,6.64147,-306.0129)
//            this is z(-1631.7456,1500.0,-1904.8844)
        }

        if(gameData.getInteger(current + " from") == 26){
            posX = 121;
            posZ = -2;
//            (62.54196,6.64147,-306.0129)
//            this is z(-1631.7456,1500.0,-1904.8844)
        }

        else {
            posX = 0;
            posZ = 0;
        }
        addSystems(controller, actualGameButtons, modelComponent);
        addEntities();
    }


    private void initEnvironment() {
        environment = new Environment();
    }

    private void initCamera() {

        worldCam = new WorldCamera();
        if(gameData.getInteger(current + " from") == 2){
            worldCam.worldCam.position.x = -1433f;
            worldCam.worldCam.position.z = -1815f;
//            (62.54196,6.64147,-306.0129)
//            this is z(-1631.7456,1500.0,-1904.8844)
        }
        if(gameData.getInteger(current + " from") == 3){
            worldCam.worldCam.position.x = -1956f;
            worldCam.worldCam.position.z = -1549f;
//            (62.54196,6.64147,-306.0129)
//            this is z(-1631.7456,1500.0,-1904.8844)
        }
        if(gameData.getInteger(current + " from") == 9){
            worldCam.worldCam.position.x = -1872f;
            worldCam.worldCam.position.z = -1327f;
//            (62.54196,6.64147,-306.0129)
//            this is z(-1631.7456,1500.0,-1904.8844)
        }
        if(gameData.getInteger(current + " from") == 25){
            worldCam.worldCam.position.x = -1570f;
            worldCam.worldCam.position.z = -1591f;
//            (62.54196,6.64147,-306.0129)
//            this is z(-1631.7456,1500.0,-1904.8844)
        }

        if(gameData.getInteger(current + " from") == 26){
            worldCam.worldCam.position.x = -1570f;
            worldCam.worldCam.position.z = -1591f;
//            (62.54196,6.64147,-306.0129)
//            this is z(-1631.7456,1500.0,-1904.8844)
        }

        else {
            worldCam.worldCam.position.x = -1690.5f;
            worldCam.worldCam.position.z = -1589.2f;
        }

    }

    private void initModelBatch() {
        batch = new ModelBatch();
    }

    private void addEntities() {
        loadShechem();
        createPlayer(posX,10,posZ);
        if(gameData.getInteger(current + " missionId") == 7 &&
                !gameData.getString(current + " findLargeStone").equals("Done")){
            loadLargeStone();
        }
        loadPortal1();
        loadPortal2();
        loadPortal3();
    }


    private void setDebug(){
        if(debug){
            debugDrawer = new DebugDrawer();
            debugDrawer.setDebugMode(btIDebugDraw.DebugDrawModes.DBG_MAX_DEBUG_DRAW_MODE);
        }
    }

    private void createPlayer(float x, float y, float z) {
        character = CharacterEntityFactory.createCharacter(bulletSystem, x, y, z);
        engine.addEntity(character);
        characterAnimation = new AnimationComponent(CharacterEntityFactory.playerComponent.instance);
        playerSystem.playerAnimation = characterAnimation;
    }

    private void loadLargeStone(){
        stone = ObjectEntityFactory.loadLargeStone(bulletSystem, -110.123825f,4.9566774f,-105.82832f);
        engine.addEntity(stone);
    }

    private void loadShechem() {
        engine.addEntity(map);
    }

    private void loadPortal1(){
        portal1Entity = ObjectEntityFactory.loadPortalRight(-13f,8f,250);
        engine.addEntity(portal1Entity);
    }

    private void loadPortal2(){
        portal2Entity = ObjectEntityFactory.loadPortalBottom(-262,7,-218);
        engine.addEntity(portal2Entity);
    }

    private void loadPortal3(){
        portal3Entity = ObjectEntityFactory.loadPortalBottom(-262,7,171);
        engine.addEntity(portal3Entity);
    }

    private void addSystems(Controller controller, ActualGameButtons actualGameButtons, ModelComponent modelComponent) {
        engine = new Engine();
        engine.addSystem(new RenderSystem(batch, environment, worldCam.worldCam, modelComponent));
        engine.addSystem(bulletSystem = new BulletSystem());
        engine.addSystem(playerSystem = new PlayerSystem(worldCam.worldCam, controller, actualGameButtons, posX, posZ, mover));
        engine.addSystem(israelitesSystem = new IsraelitesSystem(bulletSystem));
        engine.addSystem(new StatusSystem());

        if(debug) bulletSystem.collisionWorld.setDebugDrawer(this.debugDrawer);
    }

    public void render(float dt) {

        if(Gdx.input.isKeyPressed(Input.Keys.UP)){
            worldCam.worldCam.position.x += 1;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            worldCam.worldCam.position.z += 1;
        }

        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){

            worldCam.worldCam.position.x -= 1;

        }
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){

            worldCam.worldCam.position.z -= 1;

        }

        if(Gdx.input.isKeyJustPressed(Input.Keys.N)){
            System.out.println("this is z" + worldCam.worldCam.position);
        }

        if(Gdx.input.isKeyJustPressed(Input.Keys.R)){
            System.out.println(CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()));
        }

        playerPos = CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3());
        portal1Pos = portal1Entity.getComponent(ModelComponent.class).instance.transform.getTranslation(new Vector3());
        portal2Pos = portal2Entity.getComponent(ModelComponent.class).instance.transform.getTranslation(new Vector3());
        portal3Pos = portal3Entity.getComponent(ModelComponent.class).instance.transform.getTranslation(new Vector3());

        if((playerPos.x - treePosition.x) <= 10 && (playerPos.x - treePosition.x) >= -10
                && (playerPos.z - treePosition.z) <= 10 && (playerPos.z - treePosition.z) >= -10){
                nearTree = true;
        }
        else {
            nearTree = false;
        }

        if((playerPos.x - portal1Pos.x) <= 10 && (playerPos.x - portal1Pos.x) >= -10
                && (playerPos.z - portal1Pos.z) <= 10 && (playerPos.z - portal1Pos.z) >= -10){
            goToHaran = true;
        }
        else if ((playerPos.x - portal2Pos.x) <= 10 && (playerPos.x - portal2Pos.x) >= -10
                && (playerPos.z - portal2Pos.z) <= 10 && (playerPos.z - portal2Pos.z) >= -10){
            goToBethel = true;

        }
        else if ((playerPos.x - portal3Pos.x) <= 10 && (playerPos.x - portal3Pos.x) >= -10
                && (playerPos.z - portal3Pos.z) <= 10 && (playerPos.z - portal3Pos.z) >= -10){
            goToJordan = true;
        }
        else {
            goToJordan = false;
            goToHaran = false;
            goToBethel = false;
        }


        worldCam.update();
        characterAnimation.update(dt);
        renderWorld(dt);
    }

    private void renderWorld(float delta) {

        engine.update(delta);
        if(debug){
            debugDrawer.begin(worldCam.worldCam);
            bulletSystem.collisionWorld.debugDrawWorld();
            debugDrawer.end();
        }

    }

    public void resize(int width, int height) {
        worldCam.worldCam.viewportHeight = height;
        worldCam.worldCam.viewportWidth = width;
    }

    public void dispose() {
        CharacterEntityFactory.character = null;
        CharacterEntityFactory.playerModel = null;
        bulletSystem.collisionWorld.removeAction(character.getComponent(CharacterComponent.class).characterController);
        bulletSystem.collisionWorld.removeCollisionObject(character.getComponent(CharacterComponent.class).ghostObject);


        bulletSystem.dispose();

        bulletSystem = null;

        batch.dispose();

        batch = null;
        character.getComponent(CharacterComponent.class).characterController.dispose();
        character.getComponent(CharacterComponent.class).ghostObject.dispose();
        character.getComponent(CharacterComponent.class).ghostShape.dispose();

        environment.dispose();
    }

    public void remove(Entity entity) {
        engine.removeEntity(entity);
        bulletSystem.removeBody(entity);
    }
}
