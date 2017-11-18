package com.legendandroidgame.game.GameWorlds;

import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.environment.DirectionalLight;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.Bullet;
import com.badlogic.gdx.physics.bullet.DebugDrawer;
import com.badlogic.gdx.physics.bullet.collision.ContactListener;
import com.badlogic.gdx.physics.bullet.collision.btCollisionObject;
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
import com.legendandroidgame.game.DirectionalShadowLight;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 10/20/2017.
 */
public class EgyptNorthWorld {
    private ModelBatch batch;
    private Environment environment;
    private WorldCamera worldCam;
    private Engine engine;
    private BulletSystem bulletSystem;
    private Entity character;
    private Entity map;
    private Entity houseDoor;
    private PlayerSystem playerSystem;
    private AnimationComponent characterAnimation;
    private ModelComponent modelComponent;


    public Boolean goToBethel = false, goToSouth = false, goToWest = false, goToEast = false;
    public boolean goInside = false;

    private DebugDrawer debugDrawer;
    private static final boolean debug = false;

    private String current = gameData.getString("current");


    private float posX, posZ;


    public EgyptNorthWorld(Controller controller, ActualGameButtons actualGameButtons) {
        Bullet.init();
        initCamera();
        initModelBatch();
        initEnvironment();
        setDebug();
        map = MapEntityFactory.loadEgyptNorth();
        modelComponent = map.getComponent(ModelComponent.class);
        if(gameData.getInteger(current + " from") == 3){
            posX = 209;
            posZ = 31;
//            (209.36617,4.3777514,31.917057)
//            this is z(-1481.1338,1500.0,-1557.2828)
        }
        if(gameData.getInteger(current + " from") == 4){
            posX = -23;
            posZ = 212;
//            (-23.940914,4.3310714,212.46745)
//            this is z(-1714.4409,1500.0,-1376.7325)
        }
        if(gameData.getInteger(current + " from") == 6){
            posX = -216;
            posZ = -28;
//            (-216.05339,5.360526,-28.476048)
//            this is z(-1906.5533,1500.0,-1617.676)
        }
        if(gameData.getInteger(current + " from") == 7){
            posX = -23;
            posZ = -215;
//            (-23.002138,4.1868215,-215.44429)
//            this is z(-1713.5022,1500.0,-1804.6443)
        }

        if(gameData.getInteger(current + " from") == 13){
            posX = -61;
            posZ = 42;
        }

        addSystems(controller, actualGameButtons, modelComponent);
        addEntities();
    }


    private void initEnvironment() {
        environment = new Environment();

    }

    private void initCamera() {

        worldCam = new WorldCamera();
        if(gameData.getInteger(current + " from") == 3){
            worldCam.worldCam.position.x = -1481f;
            worldCam.worldCam.position.z = -1557f;
//            (209.36617,4.3777514,31.917057)
//            this is z(-1481.1338,1500.0,-1557.2828)
        }
        if(gameData.getInteger(current + " from") == 4){
            worldCam.worldCam.position.x = -1714f;
            worldCam.worldCam.position.z = -1376f;
//            (-23.940914,4.3310714,212.46745)
//            this is z(-1714.4409,1500.0,-1376.7325)
        }
        if(gameData.getInteger(current + " from") == 6){
            worldCam.worldCam.position.x = -1906f;
            worldCam.worldCam.position.z = -1617f;
//            (-216.05339,5.360526,-28.476048)
//            this is z(-1906.5533,1500.0,-1617.676)
        }
        if(gameData.getInteger(current + " from") == 7){
            worldCam.worldCam.position.x = -1713f;
            worldCam.worldCam.position.z = -1804f;
//            (-23.002138,4.1868215,-215.44429)
//            this is z(-1713.5022,1500.0,-1804.6443)
        }
        if(gameData.getInteger(current + " from") == 13){
            worldCam.worldCam.position.x = -1751f;
            worldCam.worldCam.position.z = -1547f;
        }

    }

    private void initModelBatch() {
        batch = new ModelBatch();
    }

    private void addEntities() {
        loadEgypt();
        createPlayer(posX,10,posZ);
        loadDoor(-53,4,45);
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



    private void loadEgypt() {
        engine.addEntity(map);
    }

    private void loadDoor(float x, float y, float z){
        houseDoor = ObjectEntityFactory.loadHouseDoor(bulletSystem, x, y, z);
        engine.addEntity(houseDoor);
    }

    private void addSystems(Controller controller, ActualGameButtons actualGameButtons, ModelComponent modelComponent) {
        engine = new Engine();
        engine.addSystem(new RenderSystem(batch, environment, worldCam.worldCam, modelComponent));
        engine.addSystem(bulletSystem = new BulletSystem());
        engine.addSystem(playerSystem = new PlayerSystem(worldCam.worldCam, controller, actualGameButtons, posX, posZ));
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

        if (CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()).x > 214) {
            goToBethel = true;
        }
        if (CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()).z < -217) {
            goToWest = true;
        }
        if (CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()).x < -217) {
            goToSouth = true;
        }
        if (CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()).z > 215) {
            goToEast = true;
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
