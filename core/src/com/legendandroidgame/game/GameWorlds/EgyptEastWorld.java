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
import com.legendandroidgame.game.BulletComponent.AnimationComponent;
import com.legendandroidgame.game.BulletComponent.CharacterComponent;
import com.legendandroidgame.game.BulletComponent.ModelComponent;
import com.legendandroidgame.game.BulletSystem.*;
import com.legendandroidgame.game.BulletTools.CharacterEntityFactory;
import com.legendandroidgame.game.BulletTools.MapEntityFactory;
import com.legendandroidgame.game.BulletTools.ObjectEntityFactory;
import com.legendandroidgame.game.Buttons.ActualGameButtons;
import com.legendandroidgame.game.Buttons.Controller;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 8/20/2017.
 */
public class EgyptEastWorld {
    private ModelBatch batch;
    private Engine engine;
    private BulletSystem bulletSystem;
    private Entity character, portalEntity1, portalEntity2, portalEntity3, portalEntity4, arrow;
    private PlayerSystem playerSystem;
    private IsraelitesSystem israelitesSystem;
    private AnimationComponent characterAnimation, arrowAnimation;
    private ModelComponent modelComponent;
    public WorldCamera worldCamera;
    //    public CameraInputController cameraInputController;
    public Environment environment;

    public boolean goToNorth = false, goToSouth = false, goToWest = false, goToEdom = false;
    private boolean arrowTouch;
    private Vector3 portal1Pos, portal2Pos, portal3Pos, portal4Pos, playerPos, arrowPos;

    public Boolean israelitesNPC01 = false;
    public Boolean israelitesNPC02 = false;
    public Boolean israelitesNPC03 = false;
    public Boolean israelitesNPC04 = false;
    public Boolean israelitesNPC05 = false;
    public Boolean israelitesNPC06 = false;
    public Boolean israelitesNPC07 = false;
    public Boolean israelitesNPC08 = false;
    public Boolean israelitesNPC09 = false;
    public Boolean israelitesNPC10 = false;


    private Vector3 israelitesNPC01position;
    private Vector3 israelitesNPC02position;
    private Vector3 israelitesNPC03position;
    private Vector3 israelitesNPC04position;
    private Vector3 israelitesNPC05position;
    private Vector3 israelitesNPC06position;
    private Vector3 israelitesNPC07position;
    private Vector3 israelitesNPC08position;
    private Vector3 israelitesNPC09position;
    private Vector3 israelitesNPC10position;

    private Entity map;

    private DebugDrawer debugDrawer;
    private static final boolean debug = false;

    private String current = gameData.getString("current");

    private float posX, posZ;
    public Vector2 mover;

    public EgyptEastWorld(Controller controller, ActualGameButtons actualGameButtons) {
        Bullet.init();
        initCamera();
        initModelBatch();
        initEnvironment();
        setDebug();
        map = MapEntityFactory.loadEgyptEast();
        modelComponent = map.getComponent(ModelComponent.class);
        mover = new Vector2();
        if(gameData.getInteger(current + " from") == 5){
            posX = 263;
            posZ = 296;
//            (275.20697,6.101687,201.14828)
//            this is z(-1419.0806,1500.0,-1397.7231)
        }
        if(gameData.getInteger(current + " from") == 6){
            posX = -662;
            posZ = 305;
//            (-693.1684,7.3171496,295.76648)
//            this is z(-2387.456,1500.0,-1303.105)
        }
        if(gameData.getInteger(current + " from") == 7){
            posX = -207;
            posZ = -281;
//            (62.54196,6.64147,-306.0129)
//            this is z(-1631.7456,1500.0,-1904.8844)
        }
        if(gameData.getInteger(current + " from") == 8){
            posX = 112;
            posZ = 749;
//            (62.54196,6.64147,-306.0129)
//            this is z(-1631.7456,1500.0,-1904.8844)
        }
        addSystems(controller, actualGameButtons, modelComponent);
        addEntities();
    }


    private void initEnvironment() {
        environment = new Environment();
    }


    private void initCamera() {

        worldCamera = new WorldCamera();

        if(gameData.getInteger(current + " from") == 5){
            worldCamera.worldCam.position.x = -1431f;
            worldCamera.worldCam.position.z = -1302f;
//            (275.20697,6.101687,201.14828)
//            this is z(-1419.0806,1500.0,-1397.7231)
        }
        if(gameData.getInteger(current + " from") == 6){
            worldCamera.worldCam.position.x = -2356f;
            worldCamera.worldCam.position.z = -1293f;
//            (-693.1684,7.3171496,295.76648)
//            this is z(-2387.456,1500.0,-1303.105)
        }
        if(gameData.getInteger(current + " from") == 7){
            worldCamera.worldCam.position.x = -1901f;
            worldCamera.worldCam.position.z = -1879f;
//            (62.54196,6.64147,-306.0129)
//            this is z(-1631.7456,1500.0,-1904.8844)
        }

        if(gameData.getInteger(current + " from") == 8){
            worldCamera.worldCam.position.x = -1582f;
            worldCamera.worldCam.position.z = -849f;
//            (62.54196,6.64147,-306.0129)
//            this is z(-1631.7456,1500.0,-1904.8844)
        }
    }

    private void initModelBatch() {
        batch = new ModelBatch();
    }

    private void addEntities() {
        loadEgypt();
        createPlayer(posX,10,posZ);
        loadPortal1();
        loadPortal2();
        loadPortal3();
        loadPortal4();
        loadArrow();
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

    private void loadArrow(){
        if(gameData.getInteger(current + " missionId") == 5
                && gameData.getString(current + " findStaff").equals("Done")) {
            arrow = ObjectEntityFactory.loadArrow(-161,7,272);
            engine.addEntity(arrow);
            arrowAnimation = new AnimationComponent(ObjectEntityFactory.arrowPointerComponent.instance);
            arrowAnimation.animate("Cube|CubeAction", -1, 1);
        }
    }

    private void loadPortal1(){
        portalEntity1 = ObjectEntityFactory.loadPortalTop(277,7,295);
        engine.addEntity(portalEntity1);
    }

    private void loadPortal2(){
        portalEntity2 = ObjectEntityFactory.loadPortalBottom(-690,7,299);
        engine.addEntity(portalEntity2);
    }

    private void loadPortal3(){
        portalEntity3 = ObjectEntityFactory.loadPortalLeft(-208,7,-303);
        engine.addEntity(portalEntity3);
    }

    private void loadPortal4(){
        portalEntity4 = ObjectEntityFactory.loadPortalRight(115,6,760);
        engine.addEntity(portalEntity4);
    }



    private void addSystems(Controller controller, ActualGameButtons actualGameButtons, ModelComponent modelComponent) {
        engine = new Engine();
        engine.addSystem(new RenderSystem(batch, environment,  worldCamera.worldCam, modelComponent));
        engine.addSystem(bulletSystem = new BulletSystem());
        engine.addSystem(playerSystem = new PlayerSystem( worldCamera.worldCam, controller, actualGameButtons, posX, posZ, mover));
        engine.addSystem(israelitesSystem = new IsraelitesSystem(bulletSystem));
        engine.addSystem(new StatusSystem());

        if(debug) bulletSystem.collisionWorld.setDebugDrawer(this.debugDrawer);
    }

    public void render(float dt) {

        if(Gdx.input.isKeyPressed(Input.Keys.UP)){
            worldCamera.worldCam.position.x += 1;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            worldCamera.worldCam.position.z += 1;
        }

        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
            worldCamera.worldCam.position.x -= 1;

        }
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            worldCamera.worldCam.position.z -= 1;

        }

        if(Gdx.input.isKeyJustPressed(Input.Keys.N)){
            System.out.println("this is z" + worldCamera.worldCam.position);
        }

        if(Gdx.input.isKeyJustPressed(Input.Keys.R)){
            System.out.println(CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()));
        }

        playerPos = CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3());
        portal1Pos = ObjectEntityFactory.portalComponentTop.instance.transform.getTranslation(new Vector3());
        portal2Pos = ObjectEntityFactory.portalComponentBottom.instance.transform.getTranslation(new Vector3());
        portal3Pos = ObjectEntityFactory.portalComponentLeft.instance.transform.getTranslation(new Vector3());
        portal4Pos = ObjectEntityFactory.portalComponentRight.instance.transform.getTranslation(new Vector3());

        if(gameData.getInteger(current + " missionId") == 5
                && gameData.getString(current + " findStaff").equals("Done")
                && !gameData.getString(current + " splitTheSea").equals("Done")){
            arrowPos = ObjectEntityFactory.arrowPointerComponent.instance.transform.getTranslation(new Vector3());

            if((playerPos.x - arrowPos.x) <= 5 && (playerPos.x - arrowPos.x) >= -5
                    && (playerPos.z - arrowPos.z) <= 5 && (playerPos.z - arrowPos.z) >= -5){
                arrowTouch = true;
            }
            else {
                arrowTouch = false;
            }

            if(arrowTouch){
                engine.removeEntity(arrow);
                gameData.putString(current + " splitTheSea", "Done");
                gameData.flush();
            }
        }

        israelitesNPC01position = CharacterEntityFactory.israelitesComponent1.instance.transform.getTranslation(new Vector3());
        israelitesNPC02position = CharacterEntityFactory.israelitesComponent2.instance.transform.getTranslation(new Vector3());
        israelitesNPC03position = CharacterEntityFactory.israelitesComponent3.instance.transform.getTranslation(new Vector3());
        israelitesNPC04position = CharacterEntityFactory.israelitesComponent4.instance.transform.getTranslation(new Vector3());
        israelitesNPC05position = CharacterEntityFactory.israelitesComponent5.instance.transform.getTranslation(new Vector3());
        israelitesNPC06position = CharacterEntityFactory.israelitesComponent6.instance.transform.getTranslation(new Vector3());
        israelitesNPC07position = CharacterEntityFactory.israelitesComponent7.instance.transform.getTranslation(new Vector3());
        israelitesNPC08position = CharacterEntityFactory.israelitesComponent8.instance.transform.getTranslation(new Vector3());
        israelitesNPC09position = CharacterEntityFactory.israelitesComponent9.instance.transform.getTranslation(new Vector3());
        israelitesNPC10position = CharacterEntityFactory.israelitesComponent10.instance.transform.getTranslation(new Vector3());

        if((playerPos.x - portal1Pos.x) <= 10 && (playerPos.x - portal1Pos.x) >= -10
                && (playerPos.z - portal1Pos.z) <= 10 && (playerPos.z - portal1Pos.z) >= -10){
            goToNorth = true;
        }
        else if((playerPos.x - portal2Pos.x) <= 10 && (playerPos.x - portal2Pos.x) >= -10
                && (playerPos.z - portal2Pos.z) <= 10 && (playerPos.z - portal2Pos.z) >= -10){
            goToSouth = true;
        }
        else if((playerPos.x - portal3Pos.x) <= 10 && (playerPos.x - portal3Pos.x) >= -10
                && (playerPos.z - portal3Pos.z) <= 10 && (playerPos.z - portal3Pos.z) >= -10){
            goToWest = true;
        }
        else if((playerPos.x - portal4Pos.x) <= 10 && (playerPos.x - portal4Pos.x) >= -10
                && (playerPos.z - portal4Pos.z) <= 10 && (playerPos.z - portal4Pos.z) >= -10){
            goToEdom = true;
        }
        else {
            goToNorth = false;
            goToSouth = false;
            goToWest = false;
            goToEdom = false;
        }

        if((playerPos.x - israelitesNPC01position.x) <= 10 && (playerPos.x - israelitesNPC01position.x) >= -10
                && (playerPos.z - israelitesNPC01position.z) <= 10 && (playerPos.z - israelitesNPC01position.z) >= -10){
            israelitesNPC01 = true;
        }
        else if((playerPos.x - israelitesNPC02position.x) <= 10 && (playerPos.x - israelitesNPC02position.x) >= -10
                && (playerPos.z - israelitesNPC02position.z) <= 10 && (playerPos.z - israelitesNPC02position.z) >= -10){

            israelitesNPC02 =  true;
        }
        else if((playerPos.x - israelitesNPC03position.x) <= 10 && (playerPos.x - israelitesNPC03position.x) >= -10
                && (playerPos.z - israelitesNPC03position.z) <= 10 && (playerPos.z - israelitesNPC03position.z) >= -10){

            israelitesNPC03 =  true;
        }
        else if((playerPos.x - israelitesNPC04position.x) <= 10 && (playerPos.x - israelitesNPC04position.x) >= -10
                && (playerPos.z - israelitesNPC04position.z) <= 10 && (playerPos.z - israelitesNPC04position.z) >= -10){

            israelitesNPC04 =  true;
        }
        else if((playerPos.x - israelitesNPC05position.x) <= 10 && (playerPos.x - israelitesNPC05position.x) >= -10
                && (playerPos.z - israelitesNPC05position.z) <= 10 && (playerPos.z - israelitesNPC05position.z) >= -10){

            israelitesNPC05 =  true;
        }
        else if((playerPos.x - israelitesNPC06position.x) <= 10 && (playerPos.x - israelitesNPC06position.x) >= -10
                && (playerPos.z - israelitesNPC06position.z) <= 10 && (playerPos.z - israelitesNPC06position.z) >= -10){

            israelitesNPC06 =  true;
        }
        else if((playerPos.x - israelitesNPC07position.x) <= 10 && (playerPos.x - israelitesNPC07position.x) >= -10
                && (playerPos.z - israelitesNPC07position.z) <= 10 && (playerPos.z - israelitesNPC07position.z) >= -10){

            israelitesNPC07 =  true;
        }
        else if((playerPos.x - israelitesNPC08position.x) <= 10 && (playerPos.x - israelitesNPC08position.x) >= -10
                && (playerPos.z - israelitesNPC08position.z) <= 10 && (playerPos.z - israelitesNPC08position.z) >= -10){

            israelitesNPC08 =  true;
        }
        else if((playerPos.x - israelitesNPC09position.x) <= 10 && (playerPos.x - israelitesNPC09position.x) >= -10
                && (playerPos.z - israelitesNPC09position.z) <= 10 && (playerPos.z - israelitesNPC09position.z) >= -10){

            israelitesNPC09 =  true;
        }
        else if((playerPos.x - israelitesNPC10position.x) <= 10 && (playerPos.x - israelitesNPC10position.x) >= -10
                && (playerPos.z - israelitesNPC10position.z) <= 10 && (playerPos.z - israelitesNPC10position.z) >= -10){

            israelitesNPC10 =  true;
        }
        else {
            israelitesNPC01 = false;
            israelitesNPC02 = false;
            israelitesNPC03 = false;
            israelitesNPC04 = false;
            israelitesNPC05 = false;
            israelitesNPC06 = false;
            israelitesNPC07 = false;
            israelitesNPC08 = false;
            israelitesNPC09 = false;
            israelitesNPC10 = false;
        }

        if(gameData.getInteger(current + " missionId") == 5
                && gameData.getString(current + " findStaff").equals("Done")
                && !gameData.getString(current + " splitTheSea").equals("Done")) {
            arrowAnimation.update(dt);
        }

        worldCamera.worldCam.update();
        worldCamera.update();
        characterAnimation.update(dt);
        renderWorld(dt);
    }





    private void renderWorld(float delta) {
        engine.update(delta);
        if(debug){
            debugDrawer.begin(worldCamera.worldCam);
            bulletSystem.collisionWorld.debugDrawWorld();
            debugDrawer.end();
        }
    }

    public void resize(int width, int height) {
        worldCamera.worldCam.viewportHeight = height;
        worldCamera.worldCam.viewportWidth = width;
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
    }

    public void remove(Entity entity) {
        engine.removeEntity(entity);
        bulletSystem.removeBody(entity);
    }
}
