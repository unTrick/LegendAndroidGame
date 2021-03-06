package com.legendandroidgame.game.GameWorlds;

import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.environment.DirectionalLight;
import com.badlogic.gdx.math.Vector2;
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


import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 10/20/2017.
 */
public class EgyptSouthWorld {
    private ModelBatch batch;
    private Environment environment;
    private WorldCamera worldCam;
    private Engine engine;
    private BulletSystem bulletSystem;
    private Entity character, entityPortal1, entityPortal2, entityPortal3;
    private Entity map;
    private Entity aaron;
    private Entity  houseDoor;
    private PlayerSystem playerSystem;
    private ArmySystem armySystem;
    private IsraelitesSystem israelitesSystem;
    private AnimationComponent characterAnimation;
    private ModelComponent modelComponent;
    private AaronSystem aaronSystem;

    public Boolean canTalkToAaron = false;

    public Boolean goToNorth = false, goToWest = false, goToEast = false;

    private DebugDrawer debugDrawer;
    private static final boolean debug = false;

    private ActualGameButtons actualGameButtons;

    private String current = gameData.getString("current");

    private float posX, posZ;
    public Vector2 mover;
    public boolean goInside = false;

    private Vector3 portal1Pos, portal2Pos, portal3Pos, playerPos, doorPos;

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


    public EgyptSouthWorld(Controller controller, ActualGameButtons actualGameButtons) {
        Bullet.init();

        this.actualGameButtons = actualGameButtons;

        initCamera();
        initModelBatch();
        initEnvironment();
        setDebug();
        map = MapEntityFactory.loadEgyptSouth();
        modelComponent = map.getComponent(ModelComponent.class);
        mover = new Vector2();
        if(gameData.getInteger(current + " from") == 4){
            posX = 14;
            posZ = 140;
//            (40.335564,4.156165,149.30467)
//            this is z(-1650.1644,1500.0,-1439.8953)
        }
        if(gameData.getInteger(current + " from") == 5){
            posX = 138;
            posZ = 25;
//            this is z(-1541.6311,1500.0,-1589.2)
//            (148.86893,4.115683,0.0)
        }
        if(gameData.getInteger(current + " from") == 7){
            posX = -103;
            posZ = -134;
//            (6.962594,4.1296353,-150.007)
//            this is z(-1683.5374,1500.0,-1739.2069)
        }
        if(gameData.getInteger(current + " from") == 21){
            posX = 138;
            posZ = 25;
        }
        if(gameData.getInteger(current + " from") == 22){
            posX = 138;
            posZ = 25;
        }

        if(gameData.getInteger(current + " from") == 12){
            posX = 15;
            posZ = -76;
        }
        addSystems(controller, actualGameButtons, modelComponent);
        addEntities();
    }


    private void initEnvironment() {
        environment = new Environment();
    }

    private void initCamera() {

        worldCam = new WorldCamera();

        if(gameData.getInteger(current + " from") == 4){
            worldCam.worldCam.position.x = -1682f;
            worldCam.worldCam.position.z = -1454f;
//            (40.335564,4.156165,149.30467)
//            this is z(-1650.1644,1500.0,-1439.8953)
        }
        if(gameData.getInteger(current + " from") == 5){
            worldCam.worldCam.position.x = -1558f;
            worldCam.worldCam.position.z = -1569f;
//            this is z(-1541.6311,1500.0,-1589.2)
//            (148.86893,4.115683,0.0)
        }
        if(gameData.getInteger(current + " from") == 7){
            worldCam.worldCam.position.x = -1799f;
            worldCam.worldCam.position.z = -1728f;
//            (6.962594,4.1296353,-150.007)
//            this is z(-1683.5374,1500.0,-1739.2069)
        }
        if(gameData.getInteger(current + " from") == 21){
            worldCam.worldCam.position.x = -1558f;
            worldCam.worldCam.position.z = -1569f;
        }
        if(gameData.getInteger(current + " from") == 22){
            worldCam.worldCam.position.x = -1558f;
            worldCam.worldCam.position.z = -1569f;
        }

        if(gameData.getInteger(current + " from") == 12){
            worldCam.worldCam.position.x = -1681f;
            worldCam.worldCam.position.z = -1670f;
        }

    }

    private void initModelBatch() {
        batch = new ModelBatch();
    }

    private void addEntities() {
        loadEgypt();
        createPlayer(posX,10,posZ);
        if(gameData.getInteger(current + " missionId") >= 3){
//            loadAaron(-34f,5,-26f);
        }

        loadHouseDoor(28, 5, -72.5f);
//        loadJarOfWater();
//        loadCap();
//        loadCoat();
//        loadSash();
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

    private void loadAaron(float x, float y, float z){
        aaron = CharacterEntityFactory.createAaronCharacter(bulletSystem, x, y, z);
        engine.addEntity(aaron);
    }

    private void loadEgypt() {
        engine.addEntity(map);
    }

    private void loadHouseDoor(float x, float y ,float z){

        houseDoor = ObjectEntityFactory.loadHouseDoor(bulletSystem, x, y, z);
        engine.addEntity(houseDoor);
    }

    private void loadPortal1(){
        entityPortal1 = ObjectEntityFactory.loadPortalTop(150,4.0549912f,26);
        engine.addEntity(entityPortal1);
    }
    private void loadPortal2(){
        entityPortal2 = ObjectEntityFactory.loadPortalRight(-101,4.272112f,-151);
        engine.addEntity(entityPortal2);
    }
    private void loadPortal3(){
        entityPortal3 = ObjectEntityFactory.loadPortalLeft(15,4.4908504f,150);
        engine.addEntity(entityPortal3);
    }


    private void addSystems(Controller controller, ActualGameButtons actualGameButtons, ModelComponent modelComponent) {
        engine = new Engine();
        engine.addSystem(new RenderSystem(batch, environment, worldCam.worldCam, modelComponent));
        engine.addSystem(bulletSystem = new BulletSystem());
        engine.addSystem(playerSystem = new PlayerSystem(worldCam.worldCam, controller, actualGameButtons, posX, posZ, mover));
        engine.addSystem(armySystem = new ArmySystem(bulletSystem));
        engine.addSystem(israelitesSystem = new IsraelitesSystem(bulletSystem));

        if(gameData.getInteger(current + " missionId") >= 3) {
            engine.addSystem(aaronSystem = new AaronSystem(bulletSystem));
        }
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
        portal1Pos = ObjectEntityFactory.portalComponentTop.instance.transform.getTranslation(new Vector3());
        portal2Pos = ObjectEntityFactory.portalComponentRight.instance.transform.getTranslation(new Vector3());
        portal3Pos = ObjectEntityFactory.portalComponentLeft.instance.transform.getTranslation(new Vector3());
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

        if((playerPos.x - portal1Pos.x) <= 10 && (playerPos.x - portal1Pos.x) >= -10
                && (playerPos.z - portal1Pos.z) <= 10 && (playerPos.z - portal1Pos.z) >= -10){
//            System.out.println("do you wat to go inside?");
            goToNorth = true;
        }
        else if((playerPos.x - portal2Pos.x) <= 10 && (playerPos.x - portal2Pos.x) >= -10
                && (playerPos.z - portal2Pos.z) <= 10 && (playerPos.z - portal2Pos.z) >= -10){
//            System.out.println("do you wat to go inside?");
            goToWest = true;
        }
        else if((playerPos.x - portal3Pos.x) <= 10 && (playerPos.x - portal3Pos.x) >= -10
                && (playerPos.z - portal3Pos.z) <= 10 && (playerPos.z - portal3Pos.z) >= -10){
//            System.out.println("do you wat to go inside?");
            goToEast = true;
        }
        else if((playerPos.x - doorPos.x) <= 10 && (playerPos.x - doorPos.x) >= -10
                && (playerPos.z - doorPos.z) <= 10 && (playerPos.z - doorPos.z) >= -10){
//            System.out.println("do you wat to go inside?");
            goInside = true;
        }
        else {
            goToNorth = false;
            goToWest = false;
            goToEast = false;
            goInside = false;
        }

        if(gameData.getInteger(current + " missionId") == 3){
            if(aaronSystem.canTalk){
                canTalkToAaron = true;
            }
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

        worldCam.worldCam.update();
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
        if(gameData.getInteger(current + " missionId") >= 3) {
//            bulletSystem.collisionWorld.removeAction(aaron.getComponent(AaronCharacterComponent.class).characterController);
//            bulletSystem.collisionWorld.removeCollisionObject(aaron.getComponent(AaronCharacterComponent.class).ghostObject);
        }
        bulletSystem.dispose();

        bulletSystem = null;

        batch.dispose();

        batch = null;
        character.getComponent(CharacterComponent.class).characterController.dispose();
        character.getComponent(CharacterComponent.class).ghostObject.dispose();
        character.getComponent(CharacterComponent.class).ghostShape.dispose();

        if(gameData.getInteger(current + " missionId") >= 3) {
//            aaron.getComponent(AaronCharacterComponent.class).characterController.dispose();
//            aaron.getComponent(AaronCharacterComponent.class).ghostObject.dispose();
//            aaron.getComponent(AaronCharacterComponent.class).ghostShape.dispose();
        }

        environment.dispose();
    }

    public void remove(Entity entity) {
        engine.removeEntity(entity);
        bulletSystem.removeBody(entity);
    }


}
