package com.legendandroidgame.game.GameWorlds;

import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.Family;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.model.data.ModelData;
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
 * Created by Patrick on 8/20/2017.
 */

public class BethelWorld {

    private ModelBatch batch;
    private Environment environment;
    private WorldCamera worldCam;
    private Engine engine;
    private BulletSystem bulletSystem;
    private Entity character;
    private Entity portalEntity1, portalEntity2, portalEntity3, arrow, altarEntity;
    private Entity stoneEntity1, stoneEntity2, stoneEntity3, stoneEntity4;
    private Entity map;
    private PlayerSystem playerSystem;
    private IsraelitesSystem israelitesSystem;
    private KidIsaacSystem kidIsaacSystem;
    private AnimationComponent characterAnimation;
    private AnimationComponent altarAnimation;
    private AnimationComponent arrowAnimation;
    private ModelComponent modelComponent;
    private ActualGameButtons actualGameButtons;

    private String current = gameData.getString("current");

    public Boolean bethelNPC01 = false;
    public Boolean bethelNPC02 = false;
    public Boolean bethelNPC03 = false;
    public Boolean bethelNPC04 = false;
    public Boolean bethelNPC05 = false;
    public Boolean bethelNPC06 = false;
    public Boolean bethelNPC07 = false;
    public Boolean bethelNPC08 = false;
    public Boolean bethelNPC09 = false;
    public Boolean bethelNPC10 = false;

    private Vector3 bethelNPC01position;
    private Vector3 bethelNPC02position;
    private Vector3 bethelNPC03position;
    private Vector3 bethelNPC04position;
    private Vector3 bethelNPC05position;
    private Vector3 bethelNPC06position;
    private Vector3 bethelNPC07position;
    private Vector3 bethelNPC08position;
    private Vector3 bethelNPC09position;
    private Vector3 bethelNPC10position;

    private DebugDrawer debugDrawer;
//    private boolean debug = false;
    private static final boolean debug = false;



    public boolean stone1 = false, stone2 = false, stone3 = false, stone4 = false;
    public boolean isStone1Click = false, isStone2Click = false, isStone3Click = false, isStone4Click = false;
    public boolean goLight = false;
    public boolean gotoEgypt = false;
    public boolean gotoHaran = false;
    public boolean goToMoriah = false;
    public boolean isMissionFinish = false;


    private float posX, posZ;
    public Vector2 mover;
    private Vector3 trans;

    private Vector3 portal1Pos, portal2Pos, portal3Pos, playerPos, arrowPos,
    stone1Pos, stone2Pos, stone3Pos, stone4Pos;
//    public boolean isKuha = false;

    public BethelWorld(Controller controller, ActualGameButtons actualGameButtons) {

        Bullet.init();

        setDebug();
        initCamera();
        initModelBatch();
        initEnvironment();
        map = MapEntityFactory.loadBethel();
        modelComponent = map.getComponent(ModelComponent.class);
        mover = new Vector2();
        if(gameData.getInteger(current + " from") == 2){
            posX = 119;
            posZ = 27;
//            (114.93011,4.230023,26.257488)
//            this is z(-1574.8138,1500.0,-1563.564)
        }

        if(gameData.getInteger(current + " from") == 11){
            posX = 119;
            posZ = 27;
//            (114.93011,4.230023,26.257488)
//            this is z(-1574.8138,1500.0,-1563.564)
        }

        if(gameData.getInteger(current + " from") == 5){
            posX = -120;
            posZ = -88;
//            (-18.581291,3.907349,-103.72422)
//            this is z(-1708.3252,1500.0,-1693.5457)
        }

        if(gameData.getInteger(current + " from") == 8){
            posX = 91;
            posZ = 88;
//            (-18.581291,3.907349,-103.72422)
//            this is z(-1708.3252,1500.0,-1693.5457)
        }

        addSystems(controller,actualGameButtons, modelComponent);
        addEntities();
        trans = ObjectEntityFactory.altarModelComponent.instance.transform.getTranslation(new Vector3());
        this.actualGameButtons = actualGameButtons;
    }


    private void initEnvironment() {
        environment = new Environment();

    }

    private void initCamera() {

        worldCam = new WorldCamera();

        if(gameData.getInteger(current + " from") == 2){
            worldCam.worldCam.position.x = -1569f;
            worldCam.worldCam.position.z = -1562f;
//            (114.93011,4.230023,26.257488)
//            this is z(-1574.8138,1500.0,-1563.564)
        }
        if(gameData.getInteger(current + " from") == 11){
            worldCam.worldCam.position.x = -1569f;
            worldCam.worldCam.position.z = -1562f;
//            (114.93011,4.230023,26.257488)
//            this is z(-1574.8138,1500.0,-1563.564)
        }
        if(gameData.getInteger(current + " from") == 5){
            worldCam.worldCam.position.x = -1808f;
            worldCam.worldCam.position.z = -1677f;
//            (-18.581291,3.907349,-103.72422)
//            this is z(-1708.3252,1500.0,-1693.5457)
        }

        if(gameData.getInteger(current + " from") == 8){
            worldCam.worldCam.position.x = -1597;
            worldCam.worldCam.position.z = -1500f;
//            (-18.581291,3.907349,-103.72422)
//            this is z(-1708.3252,1500.0,-1693.5457)
        }


    }

    private void initModelBatch() {
        batch = new ModelBatch();
    }
    private void addEntities() {
        loadBethel();
        createPlayer(posX,10,posZ);
        loadStone();
        loadAltar();
        loadArrow();
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

    private void loadBethel() {
        engine.addEntity(map);
    }

    private void loadStone(){
        if(gameData.getInteger(current + " missionId") == 1){
            stoneEntity1 = ObjectEntityFactory.loadFirstRedStone(bulletSystem,-18,3,58);
            stoneEntity2 = ObjectEntityFactory.loadSecondRedStone(bulletSystem,-93,3,7);
            stoneEntity3 = ObjectEntityFactory.loadThirdRedStone(bulletSystem,-30,3,-20);
            stoneEntity4 = ObjectEntityFactory.loadFourthRedStone(bulletSystem,36,3,-58);

            engine.addEntity(stoneEntity1);
            engine.addEntity(stoneEntity2);
            engine.addEntity(stoneEntity3);
            engine.addEntity(stoneEntity4);
        }
    }

    private void loadArrow(){
        if(gameData.getInteger(current + " missionId") == 1) {
            arrow = ObjectEntityFactory.loadArrow(-20.084229f, -100, -42.610023f);
            engine.addEntity(arrow);
            arrowAnimation = new AnimationComponent(ObjectEntityFactory.arrowPointerComponent.instance);
            arrowAnimation.animate("Cube|CubeAction", -1, 1);
        }
    }

    private void loadAltar(){
        altarEntity = ObjectEntityFactory.loadAltar(bulletSystem, -16.082108f,4.424149f,-61.17392f);
        engine.addEntity(altarEntity);
        altarAnimation = new AnimationComponent(ObjectEntityFactory.altarModelComponent.instance);
    }

    private void loadPortal1(){
        portalEntity1 = ObjectEntityFactory.loadPortalTop(119.35921f,4.1059613f,26.0f);
        engine.addEntity(portalEntity1);
    }

    private void loadPortal2(){
        portalEntity2 = ObjectEntityFactory.loadPortalBottom(-117f,4.508596f,-86.90345f);
        engine.addEntity(portalEntity2);
    }

    private void loadPortal3(){
        portalEntity3 = ObjectEntityFactory.loadPortalRight(91.19745f,4.0959487f,100f);
        engine.addEntity(portalEntity3);
    }

    private void addSystems(Controller controller, ActualGameButtons actualGameButtons, ModelComponent modelComponent) {
        engine = new Engine();
        engine.addSystem(new RenderSystem(batch, environment, worldCam.worldCam, modelComponent));
        engine.addSystem(bulletSystem = new BulletSystem());
        engine.addSystem(playerSystem = new PlayerSystem(worldCam.worldCam, controller, actualGameButtons, posX, posZ, mover));
        engine.addSystem(israelitesSystem = new IsraelitesSystem(bulletSystem));
        engine.addSystem(kidIsaacSystem = new KidIsaacSystem(bulletSystem));
        engine.addSystem(new StatusSystem());

        if(debug) bulletSystem.collisionWorld.setDebugDrawer(this.debugDrawer);
    }

    public void render(float dt) {


        if(Gdx.input.isKeyPressed(Input.Keys.UP)){

            worldCam.worldCam.position.x += 1;
            System.out.println("this is x" + worldCam.worldCam.position.x);

        }
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){

            worldCam.worldCam.position.z += 1;
            System.out.println("this is z" + worldCam.worldCam.position.z);

        }

        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){

            worldCam.worldCam.position.x -= 1;
            System.out.println("this is x" + worldCam.worldCam.position.x);

        }
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){

            worldCam.worldCam.position.z -= 1;
            System.out.println("this is z" + worldCam.worldCam.position.z);
        }


        if(Gdx.input.isKeyJustPressed(Input.Keys.N)){
            System.out.println("this is z" + worldCam.worldCam.position);
        }

        if(Gdx.input.isKeyJustPressed(Input.Keys.R)){
            System.out.println(CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()));
        }


        playerPos = CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3());
        portal1Pos = ObjectEntityFactory.portalComponentTop.instance.transform.getTranslation(new Vector3());
        portal2Pos = ObjectEntityFactory.portalComponentBottom.instance.transform.getTranslation(new Vector3());
        portal3Pos = ObjectEntityFactory.portalComponentRight.instance.transform.getTranslation(new Vector3());

        bethelNPC01position = CharacterEntityFactory.israelitesComponent1.instance.transform.getTranslation(new Vector3());
        bethelNPC02position = CharacterEntityFactory.israelitesComponent2.instance.transform.getTranslation(new Vector3());
        bethelNPC03position = CharacterEntityFactory.israelitesComponent3.instance.transform.getTranslation(new Vector3());
        bethelNPC04position = CharacterEntityFactory.israelitesComponent4.instance.transform.getTranslation(new Vector3());
        bethelNPC05position = CharacterEntityFactory.israelitesComponent5.instance.transform.getTranslation(new Vector3());
        bethelNPC06position = CharacterEntityFactory.israelitesComponent6.instance.transform.getTranslation(new Vector3());
        bethelNPC07position = CharacterEntityFactory.israelitesComponent7.instance.transform.getTranslation(new Vector3());
        bethelNPC08position = CharacterEntityFactory.israelitesComponent8.instance.transform.getTranslation(new Vector3());
        bethelNPC09position = CharacterEntityFactory.israelitesComponent9.instance.transform.getTranslation(new Vector3());
        bethelNPC10position = CharacterEntityFactory.israelitesComponent10.instance.transform.getTranslation(new Vector3());

        if(gameData.getInteger(current + " missionId") == 1) {
            stone1Pos = stoneEntity1.getComponent(FirstRedStone.class).stoneObject.getWorldTransform().getTranslation(new Vector3());
            stone2Pos = stoneEntity2.getComponent(SecondRedStone.class).stoneObject.getWorldTransform().getTranslation(new Vector3());
            stone3Pos = stoneEntity3.getComponent(ThirdRedStone.class).stoneObject.getWorldTransform().getTranslation(new Vector3());
            stone4Pos = stoneEntity4.getComponent(FourthRedStone.class).stoneObject.getWorldTransform().getTranslation(new Vector3());
        }

        if((playerPos.x - portal1Pos.x) <= 10 && (playerPos.x - portal1Pos.x) >= -10
                && (playerPos.z - portal1Pos.z) <= 10 && (playerPos.z - portal1Pos.z) >= -10){
                gotoHaran = true;
        }

        else if((playerPos.x - portal2Pos.x) <= 10 && (playerPos.x - portal2Pos.x) >= -10
                && (playerPos.z - portal2Pos.z) <= 10 && (playerPos.z - portal2Pos.z) >= -10){
                gotoEgypt = true;
        }

        else if((playerPos.x - portal3Pos.x) <= 10 && (playerPos.x - portal3Pos.x) >= -10
                && (playerPos.z - portal3Pos.z) <= 10 && (playerPos.z - portal3Pos.z) >= -10){
            goToMoriah = true;
        }

        else {
            gotoEgypt = false;
            gotoHaran = false;
            goToMoriah = false;
        }

        if((playerPos.x - bethelNPC01position.x) <= 10 && (playerPos.x - bethelNPC01position.x) >= -10
                && (playerPos.z - bethelNPC01position.z) <= 10 && (playerPos.z - bethelNPC01position.z) >= -10){
            bethelNPC01 = true;
        }
        else if((playerPos.x - bethelNPC02position.x) <= 10 && (playerPos.x - bethelNPC02position.x) >= -10
                && (playerPos.z - bethelNPC02position.z) <= 10 && (playerPos.z - bethelNPC02position.z) >= -10){

            bethelNPC02 =  true;
        }
        else if((playerPos.x - bethelNPC03position.x) <= 10 && (playerPos.x - bethelNPC03position.x) >= -10
                && (playerPos.z - bethelNPC03position.z) <= 10 && (playerPos.z - bethelNPC03position.z) >= -10){

            bethelNPC03 =  true;
        }
        else if((playerPos.x - bethelNPC04position.x) <= 10 && (playerPos.x - bethelNPC04position.x) >= -10
                && (playerPos.z - bethelNPC04position.z) <= 10 && (playerPos.z - bethelNPC04position.z) >= -10){

            bethelNPC04 =  true;
        }
        else if((playerPos.x - bethelNPC05position.x) <= 10 && (playerPos.x - bethelNPC05position.x) >= -10
                && (playerPos.z - bethelNPC05position.z) <= 10 && (playerPos.z - bethelNPC05position.z) >= -10){

            bethelNPC05 =  true;
        }
        else if((playerPos.x - bethelNPC06position.x) <= 10 && (playerPos.x - bethelNPC06position.x) >= -10
                && (playerPos.z - bethelNPC06position.z) <= 10 && (playerPos.z - bethelNPC06position.z) >= -10){

            bethelNPC06 =  true;
        }
        else if((playerPos.x - bethelNPC07position.x) <= 10 && (playerPos.x - bethelNPC07position.x) >= -10
                && (playerPos.z - bethelNPC07position.z) <= 10 && (playerPos.z - bethelNPC07position.z) >= -10){

            bethelNPC07 =  true;
        }
        else if((playerPos.x - bethelNPC08position.x) <= 10 && (playerPos.x - bethelNPC08position.x) >= -10
                && (playerPos.z - bethelNPC08position.z) <= 10 && (playerPos.z - bethelNPC08position.z) >= -10){

            bethelNPC08 =  true;
        }
        else if((playerPos.x - bethelNPC09position.x) <= 10 && (playerPos.x - bethelNPC09position.x) >= -10
                && (playerPos.z - bethelNPC09position.z) <= 10 && (playerPos.z - bethelNPC09position.z) >= -10){

            bethelNPC09 =  true;
        }
        else if((playerPos.x - bethelNPC10position.x) <= 10 && (playerPos.x - bethelNPC10position.x) >= -10
                && (playerPos.z - bethelNPC10position.z) <= 10 && (playerPos.z - bethelNPC10position.z) >= -10){

            bethelNPC10 =  true;
        }
        else {
            bethelNPC01 = false;
            bethelNPC02 = false;
            bethelNPC03 = false;
            bethelNPC04 = false;
            bethelNPC05 = false;
            bethelNPC06 = false;
            bethelNPC07 = false;
            bethelNPC08 = false;
            bethelNPC09 = false;
            bethelNPC10 = false;
        }


        if(gameData.getInteger(current + " missionId") == 1) {

            if(gameData.getInteger(current + " missionCount") == 4) {
                ObjectEntityFactory.arrowPointerComponent.instance.transform.setToTranslation(new Vector3(-20.084229f, 0, -42.610023f));
                arrowPos = ObjectEntityFactory.arrowPointerComponent.instance.transform.getTranslation(new Vector3());
                if ((playerPos.x - arrowPos.x) <= 3 && (playerPos.x - arrowPos.x) >= -3
                        && (playerPos.z - arrowPos.z) <= 3 && (playerPos.z - arrowPos.z) >= -3) {
                    isMissionFinish = true;
                    goLight = true;
                }
            }

            if ((playerPos.x - stone1Pos.x) <= 5 && (playerPos.x - stone1Pos.x) >= -5
                    && (playerPos.z - stone1Pos.z) <= 5 && (playerPos.z - stone1Pos.z) >= -5
                    && engine.getEntitiesFor(Family.all(FirstRedStone.class).get()).size() >= 1) {
//            System.out.println("do you wat to go inside?");
                stone1 = true;
            }

            else if ((playerPos.x - stone2Pos.x) <= 5 && (playerPos.x - stone2Pos.x) >= -5
                    && (playerPos.z - stone2Pos.z) <= 5 && (playerPos.z - stone2Pos.z) >= -5
                    && engine.getEntitiesFor(Family.all(SecondRedStone.class).get()).size() >= 1 ) {
//            System.out.println("do you wat to go inside?");
                stone2 = true;
            }

            else if ((playerPos.x - stone3Pos.x) <= 5 && (playerPos.x - stone3Pos.x) >= -5
                    && (playerPos.z - stone3Pos.z) <= 5 && (playerPos.z - stone3Pos.z) >= -5
                    && engine.getEntitiesFor(Family.all(ThirdRedStone.class).get()).size() >= 1) {
//            System.out.println("do you wat to go inside?");
                stone3 = true;
            }
            else if ((playerPos.x - stone4Pos.x) <= 5 && (playerPos.x - stone4Pos.x) >= -5
                    && (playerPos.z - stone4Pos.z) <= 5 && (playerPos.z - stone4Pos.z) >= -5
                    && engine.getEntitiesFor(Family.all(FourthRedStone.class).get()).size() >= 1) {
//            System.out.println("do you wat to go inside?");
                stone4 = true;
            }
            else {
                stone1 = false;
                stone2 = false;
                stone3 = false;
                stone4 = false;
            }

            if (actualGameButtons.btnGrab.isPressed()) {
                if (stone1) {
                    isStone1Click = true;
                    engine.removeEntity(stoneEntity1);
                    bulletSystem.collisionWorld.removeCollisionObject(stoneEntity1.getComponent(FirstRedStone.class).stoneObject);
                } else if (stone2) {
                    isStone2Click = true;
                    engine.removeEntity(stoneEntity2);
                    bulletSystem.collisionWorld.removeCollisionObject(stoneEntity2.getComponent(SecondRedStone.class).stoneObject);
                } else if (stone3) {
                    isStone3Click = true;
                    engine.removeEntity(stoneEntity3);
                    bulletSystem.collisionWorld.removeCollisionObject(stoneEntity3.getComponent(ThirdRedStone.class).stoneObject);
                } else if (stone4) {
                    isStone4Click = true;
                    engine.removeEntity(stoneEntity4);
                    bulletSystem.collisionWorld.removeCollisionObject(stoneEntity4.getComponent(FourthRedStone.class).stoneObject);
                }
            }
            else {
                isStone1Click = false;
                isStone2Click = false;
                isStone3Click = false;
                isStone4Click = false;
            }
        }

        if(gameData.getInteger(current + " missionId") > 1) {
            altarEntity.getComponent(AltarComponent.class).altarObject.getWorldTransform().setToTranslation(trans.x, trans.y, trans.z);
        }
        else {
            if (!goLight) {
                ObjectEntityFactory.altarModelComponent.instance.transform.setToTranslation(trans.x, -100, trans.z);
            } else {
                ObjectEntityFactory.altarModelComponent.instance.transform.setToTranslation(trans.x, trans.y, trans.z);
            }
        }

        if(Gdx.input.isKeyJustPressed(Input.Keys.B)){
            System.out.print(gameData.getInteger(current + "missionCount"));
        }

        worldCam.worldCam.update();
        worldCam.update();
        characterAnimation.update(dt);
//        altarAnimation.update(dt);
        if(gameData.getInteger(current + " missionId") == 1) {
            arrowAnimation.update(dt);
        }
        renderWorld(dt);


//        bulletSystem.update(dt);
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
        CharacterEntityFactory.character = null;
        CharacterEntityFactory.playerModel = null;
        if(gameData.getInteger(current + " missionId") < 2) {
            bulletSystem.collisionWorld.removeCollisionObject(stoneEntity1.getComponent(FirstRedStone.class).stoneObject);
            bulletSystem.collisionWorld.removeCollisionObject(stoneEntity2.getComponent(SecondRedStone.class).stoneObject);
            bulletSystem.collisionWorld.removeCollisionObject(stoneEntity3.getComponent(ThirdRedStone.class).stoneObject);
            bulletSystem.collisionWorld.removeCollisionObject(stoneEntity4.getComponent(FourthRedStone.class).stoneObject);
        }
        bulletSystem.collisionWorld.removeCollisionObject(altarEntity.getComponent(AltarComponent.class).altarObject);

        bulletSystem.dispose();

        bulletSystem = null;

        batch.dispose();

        batch = null;
        character.getComponent(CharacterComponent.class).characterController.dispose();
        character.getComponent(CharacterComponent.class).ghostObject.dispose();
        character.getComponent(CharacterComponent.class).ghostShape.dispose();

        if(gameData.getInteger(current + " missionId") < 2) {
            stoneEntity1.getComponent(FirstRedStone.class).stoneObject.dispose();
            stoneEntity1.getComponent(FirstRedStone.class).stoneShape.dispose();

            stoneEntity2.getComponent(SecondRedStone.class).stoneObject.dispose();
            stoneEntity2.getComponent(SecondRedStone.class).stoneShape.dispose();

            stoneEntity3.getComponent(ThirdRedStone.class).stoneObject.dispose();
            stoneEntity3.getComponent(ThirdRedStone.class).stoneShape.dispose();

            stoneEntity4.getComponent(FourthRedStone.class).stoneObject.dispose();
            stoneEntity4.getComponent(FourthRedStone.class).stoneShape.dispose();
        }
        altarEntity.getComponent(AltarComponent.class).altarObject.dispose();
        altarEntity.getComponent(AltarComponent.class).altarShape.dispose();

        environment.dispose();
    }

    public void remove(Entity entity) {
        engine.removeEntity(entity);
        bulletSystem.removeBody(entity);
    }
}
