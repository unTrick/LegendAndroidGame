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
    private Entity portalEntity1, portalEntity2, portalEntity3, portalEntity4;
    private Entity houseDoor;
    private PlayerSystem playerSystem;
    private ArmySystem armySystem;
    private IsraelitesSystem israelitesSystem;
    private AnimationComponent characterAnimation;
    private ModelComponent modelComponent;


    public Boolean goToBethel = false, goToSouth = false, goToWest = false, goToEast = false;

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



    public boolean goInside = false;

    private DebugDrawer debugDrawer;
    private static final boolean debug = false;

    private String current = gameData.getString("current");


    private float posX, posZ;
    public Vector2 mover;
    private Vector3 portal1Pos, portal2Pos, playerPos, portal3Pos, portal4Pos, doorPos;

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




    public EgyptNorthWorld(Controller controller, ActualGameButtons actualGameButtons) {
        Bullet.init();
        initCamera();
        initModelBatch();
        initEnvironment();
        setDebug();
        map = MapEntityFactory.loadEgyptNorth();
        modelComponent = map.getComponent(ModelComponent.class);
        mover = new Vector2();
        if(gameData.getInteger(current + " from") == 3){
            posX = 200;
            posZ = 26;
//            (209.36617,4.3777514,31.917057)
//            this is z(-1481.1338,1500.0,-1557.2828)
        }
        if(gameData.getInteger(current + " from") == 4){
            posX = 20;
            posZ = 200;
//            (-23.940914,4.3310714,212.46745)
//            this is z(-1714.4409,1500.0,-1376.7325)
        }
        if(gameData.getInteger(current + " from") == 6){
            posX = -191;
            posZ = 15;
//            (-216.05339,5.360526,-28.476048)
//            this is z(-1906.5533,1500.0,-1617.676)
        }
        if(gameData.getInteger(current + " from") == 7){
            posX = -18;
            posZ = -193;
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
            worldCam.worldCam.position.x = -1496f;
            worldCam.worldCam.position.z = -1567f;
//            (209.36617,4.3777514,31.917057)
//            this is z(-1481.1338,1500.0,-1557.2828)
        }
        if(gameData.getInteger(current + " from") == 4){
            worldCam.worldCam.position.x = -1676f;
            worldCam.worldCam.position.z = -1393f;
//            (-23.940914,4.3310714,212.46745)
//            this is z(-1714.4409,1500.0,-1376.7325)
        }
        if(gameData.getInteger(current + " from") == 6){
            worldCam.worldCam.position.x = -1887f;
            worldCam.worldCam.position.z = -1578f;
//            (-216.05339,5.360526,-28.476048)
//            this is z(-1906.5533,1500.0,-1617.676)
        }
        if(gameData.getInteger(current + " from") == 7){
            worldCam.worldCam.position.x = -1714f;
            worldCam.worldCam.position.z = -1786f;
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
        loadDoor(-52.5f,4,45);
        loadPortal1();
        loadPortal2();
        loadPortal3();
        loadPortal4();
//        createIsraelites();
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

    private void loadPortal1(){
        portalEntity1 = ObjectEntityFactory.loadPortalLeft(-22,4,-215);
        engine.addEntity(portalEntity1);
    }

    private void loadPortal2(){
        portalEntity2 = ObjectEntityFactory.loadPortalBottom(-213,4,12);
        engine.addEntity(portalEntity2);
    }

    private void loadPortal3(){
        portalEntity3 = ObjectEntityFactory.loadPortalRight(21,4,212);
        engine.addEntity(portalEntity3);
    }

    private void loadPortal4(){
        portalEntity4 = ObjectEntityFactory.loadPortalTop(212,4,26);
        engine.addEntity(portalEntity4);
    }

    private void addSystems(Controller controller, ActualGameButtons actualGameButtons, ModelComponent modelComponent) {
        engine = new Engine();
        engine.addSystem(new RenderSystem(batch, environment, worldCam.worldCam, modelComponent));
        engine.addSystem(bulletSystem = new BulletSystem());
        engine.addSystem(playerSystem = new PlayerSystem(worldCam.worldCam, controller, actualGameButtons, posX, posZ, mover));
        engine.addSystem(armySystem = new ArmySystem(bulletSystem));
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
        portal1Pos = ObjectEntityFactory.portalComponentLeft.instance.transform.getTranslation(new Vector3());
        portal2Pos = ObjectEntityFactory.portalComponentBottom.instance.transform.getTranslation(new Vector3());
        portal3Pos = ObjectEntityFactory.portalComponentRight.instance.transform.getTranslation(new Vector3());
        portal4Pos = ObjectEntityFactory.portalComponentTop.instance.transform.getTranslation(new Vector3());
        doorPos = ObjectEntityFactory.houseDoorComponent.instance.transform.getTranslation(new Vector3());

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


        if ((playerPos.x - portal1Pos.x) <= 10 && (playerPos.x - portal1Pos.x) >= -10
                && (playerPos.z - portal1Pos.z) <= 10 && (playerPos.z - portal1Pos.z) >= -10) {
            goToWest = true;
        }
        else if ((playerPos.x - portal2Pos.x) <= 10 && (playerPos.x - portal2Pos.x) >= -10
                && (playerPos.z - portal2Pos.z) <= 10 && (playerPos.z - portal2Pos.z) >= -10) {
            goToSouth = true;
        }
        else if ((playerPos.x - portal3Pos.x) <= 10 && (playerPos.x - portal3Pos.x) >= -10
                && (playerPos.z - portal3Pos.z) <= 10 && (playerPos.z - portal3Pos.z) >= -10) {
            goToEast = true;
        }
        else if ((playerPos.x - portal4Pos.x) <= 10 && (playerPos.x - portal4Pos.x) >= -10
                && (playerPos.z - portal4Pos.z) <= 10 && (playerPos.z - portal4Pos.z) >= -10) {
            goToBethel = true;
        }
        else if ((playerPos.x - doorPos.x) <= 10 && (playerPos.x - doorPos.x) >= -10
                && (playerPos.z - doorPos.z) <= 10 && (playerPos.z - doorPos.z) >= -10){
            goInside = true;
        }
        else {
            goToBethel = false;
            goToEast = false;
            goToSouth = false;
            goToWest = false;
            goInside = false;
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
