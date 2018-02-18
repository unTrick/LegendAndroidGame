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
 * Created by Patrick on 1/17/2018.
 */
public class SinaiWorld {

    private ModelBatch batch;
    private Engine engine;
    private BulletSystem bulletSystem;
    private Entity character;
    private Entity sinai, portalEntity1, portalEntity2, portalEntity3;
    private Entity gold, silver, bronze, scarletYarn, twinedLinen, oil, spices, incense, onyxStone, stone,
            goatHair, acaciaWood;
    private PlayerSystem playerSystem;
    private IsraelitesSystem israelitesSystem;
    private AnimationComponent characterAnimation;
    private ModelComponent modelComponent;

    public WorldCamera worldCamera;
    public Environment environment;

    private DebugDrawer debugDrawer;
    private static final boolean debug = false;

    private String current = gameData.getString("current");

    public boolean gotoBethel = false, goToJordan = false, goToEastEgypt;

    private float posX , posZ ;
    public Vector2 mover;

    private Vector3 portal1Pos, portal2Pos, portal3Pos, playerPos;

    public Boolean SinaiNPC01 = false;
    public Boolean SinaiNPC02 = false;
    public Boolean SinaiNPC03 = false;
    public Boolean SinaiNPC04 = false;
    public Boolean SinaiNPC05 = false;
    public Boolean SinaiNPC06 = false;
    public Boolean SinaiNPC07 = false;
    public Boolean SinaiNPC08 = false;
    public Boolean SinaiNPC09 = false;
    public Boolean SinaiNPC10 = false;


    private Vector3 SinaiNPC01position;
    private Vector3 SinaiNPC02position;
    private Vector3 SinaiNPC03position;
    private Vector3 SinaiNPC04position;
    private Vector3 SinaiNPC05position;
    private Vector3 SinaiNPC06position;
    private Vector3 SinaiNPC07position;
    private Vector3 SinaiNPC08position;
    private Vector3 SinaiNPC09position;
    private Vector3 SinaiNPC10position;

    public SinaiWorld(Controller controller, ActualGameButtons actualGameButtons) {
        Bullet.init();

        setDebug();
        initCamera();
        initModelBatch();
        initEnvironment();
        sinai = MapEntityFactory.loadMtSinai();
        modelComponent = sinai.getComponent(ModelComponent.class);
        mover = new Vector2(517,	392);
        if(gameData.getInteger(current + " from") == 3){
            posX = 172;
            posZ = -23;
//            (23.299538,3.6052663,-109.526855)
//            this is z(-1668.3046,1500.0,-1701.7246)
        }
        if(gameData.getInteger(current + " from") == 9){
            posX = 94;
            posZ = 174;
//            (23.299538,3.6052663,-109.526855)
//            this is z(-1668.3046,1500.0,-1701.7246)
        }
        if(gameData.getInteger(current + " from") == 4){
            posX = -42;
            posZ = -164.4f;
        }
        addSystems(controller, actualGameButtons, modelComponent);
        addEntities();
    }

    private void initEnvironment() {
        environment = new Environment();
    }

    private void initCamera() {

        worldCamera = new WorldCamera();
//        cameraInputController = new CameraInputController(worldCamera.worldCam);

        if(gameData.getInteger(current + " from") == 3){
            worldCamera.worldCam.position.x = -1519f;
            worldCamera.worldCam.position.z = -1613f;
//            (23.299538,3.6052663,-109.526855)
//            this is z(-1668.3046,1500.0,-1701.7246)
        }
        if(gameData.getInteger(current + " from") == 9){
            worldCamera.worldCam.position.x = -1597f;
            worldCamera.worldCam.position.z = -1416f;
//            (23.299538,3.6052663,-109.526855)
//            this is z(-1668.3046,1500.0,-1701.7246)
        }

        if(gameData.getInteger(current + " from") == 4){
            worldCamera.worldCam.position.x = -1733f;
            worldCamera.worldCam.position.z = -1754.5f;
//            (23.299538,3.6052663,-109.526855)
//            this is z(-1668.3046,1500.0,-1701.7246)
        }
    }

    private void initModelBatch() {
        batch = new ModelBatch();
    }

    private void addEntities() {
        loadSinai();
        createPlayer(posX,10,posZ);
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

    private void loadSinai() {

        engine.addEntity(sinai);
    }

    private void createPlayer(float x, float y, float z) {
        character = CharacterEntityFactory.createCharacter(bulletSystem, x, y, z);
        engine.addEntity(character);
        characterAnimation = new AnimationComponent(CharacterEntityFactory.playerComponent.instance);
        playerSystem.playerAnimation = characterAnimation;
    }

    private void loadPortal1(){
        portalEntity1 = ObjectEntityFactory.loadPortalTop(182,9,-25);
        engine.addEntity(portalEntity1);
    }

    private void loadPortal2(){
        portalEntity2 = ObjectEntityFactory.loadPortalLeft(-47,9,-188);
        engine.addEntity(portalEntity2);
    }

    private void loadPortal3(){
        portalEntity3 = ObjectEntityFactory.loadPortalRight(94,9,184);
        engine.addEntity(portalEntity3);
    }

    private void objects(){
//        gold;
//        silver;
//        bronze;
//        scarletYarn;
//        twinedLinen;
//        oil;
//        spices;
//        incense;
//        onyxStone;
//        stone;
//        goatHair;
//        acaciaWood;
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
            worldCamera.worldCam.position.x += .5f;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            worldCamera.worldCam.position.z += .5f;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
            worldCamera.worldCam.position.x -= .5f;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            worldCamera.worldCam.position.z -= .5f;
        }

        if(Gdx.input.isKeyJustPressed(Input.Keys.N)){
            System.out.println("\n");
            System.out.println("this is camera pos\t" +  worldCamera.worldCam.position);
            System.out.println("this is camera look\t" +  worldCamera.worldCam.direction);
            System.out.println("\n");
        }

        if(Gdx.input.isKeyJustPressed(Input.Keys.R)){
            System.out.println(CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()));
        }

        playerPos = CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3());
        portal1Pos = ObjectEntityFactory.portalComponentTop.instance.transform.getTranslation(new Vector3());
        portal2Pos = ObjectEntityFactory.portalComponentLeft.instance.transform.getTranslation(new Vector3());
        portal3Pos = ObjectEntityFactory.portalComponentRight.instance.transform.getTranslation(new Vector3());

        SinaiNPC01position = CharacterEntityFactory.israelitesComponent1.instance.transform.getTranslation(new Vector3());
        SinaiNPC02position = CharacterEntityFactory.israelitesComponent2.instance.transform.getTranslation(new Vector3());
        SinaiNPC03position = CharacterEntityFactory.israelitesComponent3.instance.transform.getTranslation(new Vector3());
        SinaiNPC04position = CharacterEntityFactory.israelitesComponent4.instance.transform.getTranslation(new Vector3());
        SinaiNPC05position = CharacterEntityFactory.israelitesComponent5.instance.transform.getTranslation(new Vector3());
        SinaiNPC06position = CharacterEntityFactory.israelitesComponent6.instance.transform.getTranslation(new Vector3());
        SinaiNPC07position = CharacterEntityFactory.israelitesComponent7.instance.transform.getTranslation(new Vector3());
        SinaiNPC08position = CharacterEntityFactory.israelitesComponent8.instance.transform.getTranslation(new Vector3());
        SinaiNPC09position = CharacterEntityFactory.israelitesComponent9.instance.transform.getTranslation(new Vector3());
        SinaiNPC10position = CharacterEntityFactory.israelitesComponent10.instance.transform.getTranslation(new Vector3());

        if((playerPos.x - portal1Pos.x) <= 10 && (playerPos.x - portal1Pos.x) >= -10
                && (playerPos.z - portal1Pos.z) <= 10 && (playerPos.z - portal1Pos.z) >= -10){
//            System.out.println("do you wat to go inside?");
            gotoBethel = true;
        }
        else if((playerPos.x - portal2Pos.x) <= 10 && (playerPos.x - portal2Pos.x) >= -10
                && (playerPos.z - portal2Pos.z) <= 10 && (playerPos.z - portal2Pos.z) >= -10){
//            System.out.println("do you wat to go inside?");
            goToEastEgypt = true;
        }
        else if((playerPos.x - portal3Pos.x) <= 10 && (playerPos.x - portal3Pos.x) >= -10
                && (playerPos.z - portal3Pos.z) <= 10 && (playerPos.z - portal3Pos.z) >= -10){
//            System.out.println("do you wat to go inside?");
            goToJordan = true;
        }
        else {
            goToJordan = false;
            goToEastEgypt = false;
            gotoBethel = false;
        }

//        if(!((playerPos.x - wellInstructorPos.x) <= 10) && !((playerPos.x - wellInstructorPos.x) >= -10)
//                && !((playerPos.z - wellInstructorPos.z) <= 10) && !((playerPos.z - wellInstructorPos.z) >= -10)) {
//            if(!gameData.getString(current + " isWellInstructDone").equals("done")){
//                CharacterEntityFactory.playerComponent.instance.transform.set
//                        (new Vector3(wellInstructorPos.x, wellInstructorPos.y, wellInstructorPos.z), new Quaternion());
//                CharacterEntityFactory.playerComponent.instance.calculateTransforms();
//            }
//        }

//        System.out.println(wellInstructorPos);

/*
        if(sarai.getComponent(SaraiComponent.class).state.equals(SaraiComponent.STATE.WALKING)){
            saraiAnimation.animate("Armature|Walk",-1,1);
        }
        else if(sarai.getComponent(SaraiComponent.class).state.equals(SaraiComponent.STATE.IDLE)){
            saraiAnimation.animate("Armature|Stand",-1,1);
        }
        else {
            saraiAnimation.animate("Armature|Stand",-1,1);
        }

        if(lot.getComponent(LotComponent.class).state.equals(LotComponent.STATE.WALKING)){
            lotAnimation.animate("Armature|Walk",-1,1);
        }
        else if(lot.getComponent(LotComponent.class).state.equals(LotComponent.STATE.IDLE)){
            lotAnimation.animate("Armature|Stand",-1,1);
        }
        else {
            lotAnimation.animate("Armature|Stand",-1,1);
        }
        */

        if((playerPos.x - SinaiNPC01position.x) <= 10 && (playerPos.x - SinaiNPC01position.x) >= -10
                && (playerPos.z - SinaiNPC01position.z) <= 10 && (playerPos.z - SinaiNPC01position.z) >= -10){
            SinaiNPC01 = true;
        }
        else if((playerPos.x - SinaiNPC02position.x) <= 10 && (playerPos.x - SinaiNPC02position.x) >= -10
                && (playerPos.z - SinaiNPC02position.z) <= 10 && (playerPos.z - SinaiNPC02position.z) >= -10){

            SinaiNPC02 =  true;
        }
        else if((playerPos.x - SinaiNPC03position.x) <= 10 && (playerPos.x - SinaiNPC03position.x) >= -10
                && (playerPos.z - SinaiNPC03position.z) <= 10 && (playerPos.z - SinaiNPC03position.z) >= -10){

            SinaiNPC03 =  true;
        }
        else if((playerPos.x - SinaiNPC04position.x) <= 10 && (playerPos.x - SinaiNPC04position.x) >= -10
                && (playerPos.z - SinaiNPC04position.z) <= 10 && (playerPos.z - SinaiNPC04position.z) >= -10){

            SinaiNPC04 =  true;
        }
        else if((playerPos.x - SinaiNPC05position.x) <= 10 && (playerPos.x - SinaiNPC05position.x) >= -10
                && (playerPos.z - SinaiNPC05position.z) <= 10 && (playerPos.z - SinaiNPC05position.z) >= -10){

            SinaiNPC05 =  true;
        }
        else if((playerPos.x - SinaiNPC06position.x) <= 10 && (playerPos.x - SinaiNPC06position.x) >= -10
                && (playerPos.z - SinaiNPC06position.z) <= 10 && (playerPos.z - SinaiNPC06position.z) >= -10){

            SinaiNPC06 =  true;
        }
        else if((playerPos.x - SinaiNPC07position.x) <= 10 && (playerPos.x - SinaiNPC07position.x) >= -10
                && (playerPos.z - SinaiNPC07position.z) <= 10 && (playerPos.z - SinaiNPC07position.z) >= -10){

            SinaiNPC07 =  true;
        }
        else if((playerPos.x - SinaiNPC08position.x) <= 10 && (playerPos.x - SinaiNPC08position.x) >= -10
                && (playerPos.z - SinaiNPC08position.z) <= 10 && (playerPos.z - SinaiNPC08position.z) >= -10){

            SinaiNPC08 =  true;
        }
        else if((playerPos.x - SinaiNPC09position.x) <= 10 && (playerPos.x - SinaiNPC09position.x) >= -10
                && (playerPos.z - SinaiNPC09position.z) <= 10 && (playerPos.z - SinaiNPC09position.z) >= -10){

            SinaiNPC09 =  true;
        }
        else if((playerPos.x - SinaiNPC10position.x) <= 10 && (playerPos.x - SinaiNPC10position.x) >= -10
                && (playerPos.z - SinaiNPC10position.z) <= 10 && (playerPos.z - SinaiNPC10position.z) >= -10){

            SinaiNPC10 =  true;
        }
        else {
            SinaiNPC01 = false;
            SinaiNPC02 = false;
            SinaiNPC03 = false;
            SinaiNPC04 = false;
            SinaiNPC05 = false;
            SinaiNPC06 = false;
            SinaiNPC07 = false;
            SinaiNPC08 = false;
            SinaiNPC09 = false;
            SinaiNPC10 = false;
        }


        worldCamera.worldCam.update();
        worldCamera.update();
        characterAnimation.update(dt);
        renderWorld(dt);

    }

    private void renderWorld(float delta) {
        engine.update(delta);
        if(debug){
            debugDrawer.begin( worldCamera.worldCam);
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

        environment.dispose();
    }

    public void remove(Entity entity) {
        engine.removeEntity(entity);
        bulletSystem.removeBody(entity);
    }
}
