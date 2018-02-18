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
public class LandOfMoriahWorld {

    private ModelBatch batch;
    private Engine engine;
    private BulletSystem bulletSystem;
    private Entity character;
    private Entity portalEntity1, portalEntity2, portalEntity3, landOfMoriah, wood1, wood2, arrow,
            wood3, wood4, wood5, knife;
    private PlayerSystem playerSystem;
    private KidIsaacSystem kidIsaacSystem;
    private AnimalSystem animalSystem;
    private IsraelitesSystem israelitesSystem;
    private AnimationComponent characterAnimation;
    private ModelComponent modelComponent;
    private AnimationComponent arrowAnimation;
    private ActualGameButtons actualGameButtons;

    public WorldCamera worldCamera;
    //    public CameraInputController cameraInputController;
    public Environment environment;

    private DebugDrawer debugDrawer;
    private static final boolean debug = false;

    private String current = gameData.getString("current");

    public boolean gotoBethel = false, goToJordan = false, goToHaran = false, touchArrow = false;
    public boolean woodItem1, woodItem2, woodItem3, woodItem4, woodItem5, knifeItem;
    public boolean wood1Click, wood2Click, wood3Click, wood4Click, wood5Click, knifeClick;
    public boolean ramPickUp = false, ramReady = false;


    private float posX , posZ ;
    public Vector2 moverx;

    private Vector3 portal1Pos, portal2Pos, portal3Pos, playerPos, wood1Pos,
            wood2Pos, wood3Pos, wood4Pos, wood5Pos, knifePos, ramPos, arrowPos;



    public LandOfMoriahWorld(Controller controller, ActualGameButtons actualGameButtons) {
        Bullet.init();

        setDebug();
        initCamera();
        initModelBatch();
        initEnvironment();
        landOfMoriah = MapEntityFactory.loadLandOfMoriah();
        modelComponent = landOfMoriah.getComponent(ModelComponent.class);
        moverx = new Vector2();
        if(gameData.getInteger(current + " from") == 2){
            posX = 170;
            posZ = 17;
        }
        if(gameData.getInteger(current + " from") == 3){
            posX = 102;
            posZ = -150;
//            (23.299538,3.6052663,-109.526855)
//            this is z(-1668.3046,1500.0,-1701.7246)
        }
        if(gameData.getInteger(current + " from") == 9){
            posX = -161;
            posZ = 5;
//            (23.299538,3.6052663,-109.526855)
//            this is z(-1668.3046,1500.0,-1701.7246)
        }

        addSystems(controller, actualGameButtons, modelComponent);
        addEntities();
        this.actualGameButtons = actualGameButtons;
    }

    private void initEnvironment() {
        environment = new Environment();
    }

    private void initCamera() {

        worldCamera = new WorldCamera();
//        cameraInputController = new CameraInputController(worldCamera.worldCam);


        if(gameData.getInteger(current + " from") == 2){
            worldCamera.worldCam.position.x = -1524f;
            worldCamera.worldCam.position.z = -1575f;
//            (23.299538,3.6052663,-109.526855)
//            this is z(-1668.3046,1500.0,-1701.7246)
        }

        if(gameData.getInteger(current + " from") == 3){
            worldCamera.worldCam.position.x = -1591f;
            worldCamera.worldCam.position.z = -1742f;
//            (23.299538,3.6052663,-109.526855)
//            this is z(-1668.3046,1500.0,-1701.7246)
        }
        if(gameData.getInteger(current + " from") == 9){
            worldCamera.worldCam.position.x = -1854f;
            worldCamera.worldCam.position.z = -1587f;
//            (23.299538,3.6052663,-109.526855)
//            this is z(-1668.3046,1500.0,-1701.7246)
        }
    }

    private void initModelBatch() {
        batch = new ModelBatch();
    }

    private void addEntities() {
        loadLandOfMoriah();
        createPlayer(posX,10,posZ);
        loadPortal1();
        loadPortal2();
        loadPortal3();
        loadWood();
        loadKnife();
        loadArrow();
    }

    private void setDebug(){
        if(debug){
            debugDrawer = new DebugDrawer();
            debugDrawer.setDebugMode(btIDebugDraw.DebugDrawModes.DBG_MAX_DEBUG_DRAW_MODE);
        }
    }

    private void loadLandOfMoriah() {

        engine.addEntity(landOfMoriah);
    }

    private void createPlayer(float x, float y, float z) {
        character = CharacterEntityFactory.createCharacter(bulletSystem, x, y, z);
        engine.addEntity(character);
        characterAnimation = new AnimationComponent(CharacterEntityFactory.playerComponent.instance);
        playerSystem.playerAnimation = characterAnimation;
    }

    private void loadPortal1(){
        portalEntity1 = ObjectEntityFactory.loadPortalLeft(99,5f,-170);
        engine.addEntity(portalEntity1);
    }

    private void loadPortal2(){
        portalEntity2 = ObjectEntityFactory.loadPortalBottom(-183f,5f,1);
        engine.addEntity(portalEntity2);
    }

    private void loadPortal3(){
        portalEntity3 = ObjectEntityFactory.loadPortalTop(180f,5f,18f);
        engine.addEntity(portalEntity3);
    }

    private void loadArrow(){
        if(gameData.getInteger(current + " missionId") == 2) {
            if (!gameData.getString(current + " bringIsaac").equals("Done")
                    || ( gameData.getString(current + " findKnife").equals("Done") &&
                    gameData.getInteger(current + " missionCount") == 5)
                    && !gameData.getString(current + " mission2").equals("Done")) {
                arrow = ObjectEntityFactory.loadArrow(136, 7, -78);
                engine.addEntity(arrow);
                arrowAnimation = new AnimationComponent(ObjectEntityFactory.arrowPointerComponent.instance);
                arrowAnimation.animate("Cube|CubeAction", -1, 1);
            }
        }
    }

    private void loadWood(){
        if(gameData.getInteger(current + " missionId") == 2
                && gameData.getInteger(current + " missionCount") != 5) {
            wood1 = ObjectEntityFactory.loadWoodenPole(bulletSystem, -36.77983f, 5.6247945f, -6.4565086f);
            engine.addEntity(wood1);
            wood1Pos = ObjectEntityFactory.woodenPoleComponent.instance.transform.getTranslation(new Vector3());

            wood2 = ObjectEntityFactory.loadWoodenPole(bulletSystem, -36.77983f, 5.50677f, 11.328837f);
            engine.addEntity(wood2);
            wood2Pos = ObjectEntityFactory.woodenPoleComponent.instance.transform.getTranslation(new Vector3());

            wood3 = ObjectEntityFactory.loadWoodenPole(bulletSystem, -99.9641f, 5.4802322f, -93.87202f);
            engine.addEntity(wood3);
            wood3Pos = ObjectEntityFactory.woodenPoleComponent.instance.transform.getTranslation(new Vector3());

            wood4 = ObjectEntityFactory.loadWoodenPole(bulletSystem, 170.65671f, 5.502753f, -156.16753f);
            engine.addEntity(wood4);
            wood4Pos = ObjectEntityFactory.woodenPoleComponent.instance.transform.getTranslation(new Vector3());

            wood5 = ObjectEntityFactory.loadWoodenPole(bulletSystem, 81.13542f, 5.311686f, -39.0278f);
            engine.addEntity(wood5);
            wood5Pos = ObjectEntityFactory.woodenPoleComponent.instance.transform.getTranslation(new Vector3());
        }
    }

    private void loadKnife(){
        if(gameData.getInteger(current + " missionId") == 2
                && !gameData.getString(current + " findKnife").equals("Done")) {
            knife = ObjectEntityFactory.loadFlintKnife(bulletSystem, 155,6.4126554f,-74);
            engine.addEntity(knife);
            knifePos = ObjectEntityFactory.flintKnifeComponent.instance.transform.getTranslation(new Vector3());
        }
    }

    private void addSystems(Controller controller, ActualGameButtons actualGameButtons, ModelComponent modelComponent) {
        engine = new Engine();
        engine.addSystem(new RenderSystem(batch, environment,  worldCamera.worldCam, modelComponent));
        engine.addSystem(bulletSystem = new BulletSystem());
        engine.addSystem(playerSystem = new PlayerSystem( worldCamera.worldCam, controller, actualGameButtons, posX, posZ, moverx));
        engine.addSystem(israelitesSystem = new IsraelitesSystem(bulletSystem));
        engine.addSystem(kidIsaacSystem = new KidIsaacSystem(bulletSystem));
        engine.addSystem(animalSystem = new AnimalSystem(bulletSystem));
        engine.addSystem(new StatusSystem());

        if(debug) bulletSystem.collisionWorld.setDebugDrawer(this.debugDrawer);
    }

    public void render(float dt) {

        if(Gdx.input.isKeyPressed(Input.Keys.UP)){

            worldCamera.worldCam.position.x += 1;
//            System.out.println("this is x" +  worldCamera.worldCam.position.x);

        }
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){

            worldCamera.worldCam.position.z += 1;
//            System.out.println("this is z" +  worldCamera.worldCam.position.z);

        }

        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){

            worldCamera.worldCam.position.x -= 1;
//            System.out.println("this is x" +  worldCamera.worldCam.position.x);

        }
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){

            worldCamera.worldCam.position.z -= 1;
//            System.out.println("this is z" +  worldCamera.worldCam.position.z);
        }

        //        System.out.println(Gdx.graphics.getFramesPerSecond());

        if(Gdx.input.isKeyJustPressed(Input.Keys.N)){
            System.out.println("\n");
            System.out.println("this is camera pos\t" +  worldCamera.worldCam.position);
            System.out.println("this is camera look\t" +  worldCamera.worldCam.direction);
            /*
            System.out.println("this is camera field of view\t" +  worldCamera.worldCam.fieldOfView);
            System.out.println("this is camera frustum\t" +  worldCamera.worldCam.frustum);
            System.out.println("this is camera invProjectionView\t" +  worldCamera.worldCam.invProjectionView);
            System.out.println("this is camera view\t" +  worldCamera.worldCam.view);
            */
            System.out.println("\n");

        }

        if(Gdx.input.isKeyJustPressed(Input.Keys.R)){
            System.out.println(CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()));
        }

        playerPos = CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3());
        portal1Pos = ObjectEntityFactory.portalComponentLeft.instance.transform.getTranslation(new Vector3());
        portal2Pos = ObjectEntityFactory.portalComponentBottom.instance.transform.getTranslation(new Vector3());
        portal3Pos = ObjectEntityFactory.portalComponentTop.instance.transform.getTranslation(new Vector3());
        ramPos = animalSystem.ram.getComponent(AnimalsComponent.class).ramObject.getWorldTransform().getTranslation(new Vector3());

        if(gameData.getInteger(current + " missionId") == 2) {

//            wood1Pos = wood1.getComponent(WoodenPoleComponent.class).woodenPoleObject.getWorldTransform().getTranslation(new Vector3());
//            wood2Pos = wood2.getComponent(WoodenPoleComponent.class).woodenPoleObject.getWorldTransform().getTranslation(new Vector3());
//            wood3Pos = wood3.getComponent(WoodenPoleComponent.class).woodenPoleObject.getWorldTransform().getTranslation(new Vector3());
//            wood4Pos = wood4.getComponent(WoodenPoleComponent.class).woodenPoleObject.getWorldTransform().getTranslation(new Vector3());
//            wood5Pos = wood5.getComponent(WoodenPoleComponent.class).woodenPoleObject.getWorldTransform().getTranslation(new Vector3());
//            knifePos = ObjectEntityFactory.flintKnifeComponent.instance.transform.getTranslation(new Vector3());

            if (!gameData.getString(current + " bringIsaac").equals("Done")
                    || ( gameData.getString(current + " findKnife").equals("Done") &&
                    gameData.getInteger(current + " missionCount") == 5
                    && !gameData.getString(current + " mission2").equals("Done"))) {

//                System.out.println("true");

                if(!engine.getEntities().contains(arrow, true)){
                    arrow = ObjectEntityFactory.loadArrow(136, 7, -78);
                    engine.addEntity(arrow);
                    arrowAnimation = new AnimationComponent(ObjectEntityFactory.arrowPointerComponent.instance);
                    arrowAnimation.animate("Cube|CubeAction", -1, 1);
                }

                arrowPos = ObjectEntityFactory.arrowPointerComponent.instance.transform.getTranslation(new Vector3());

                if ((playerPos.x - arrowPos.x) <= 3 && (playerPos.x - arrowPos.x) >= -3
                        && (playerPos.z - arrowPos.z) <= 3 && (playerPos.z - arrowPos.z) >= -3) {

                    if (kidIsaacSystem.kidIsaac.getComponent(KidIsaacComponent.class).state.equals(KidIsaacComponent.STATE.IDLE)) {
                        touchArrow = true;
                    }
                }
                else {
                    touchArrow = false;
                }

                if (touchArrow) {
                    if (!gameData.getString(current + " bringIsaac").equals("Done")) {
                        engine.removeEntity(arrow);
                        gameData.putString(current + " bringIsaac", "Done");
                        gameData.flush();
                    }
                    else if( gameData.getString(current + " findKnife").equals("Done") &&
                            gameData.getInteger(current + " missionCount") == 5){
                        engine.removeEntity(arrow);
                        gameData.putString(current + " mission2", "Done");
                        gameData.putInteger(current + " missionId", 3);
                        gameData.flush();
                    }
                }
            }
        }

        if((playerPos.x - portal1Pos.x) <= 10 && (playerPos.x - portal1Pos.x) >= -10
                && (playerPos.z - portal1Pos.z) <= 10 && (playerPos.z - portal1Pos.z) >= -10){
//            System.out.println("do you wat to go inside?");
            gotoBethel = true;
        }
        else if((playerPos.x - portal2Pos.x) <= 10 && (playerPos.x - portal2Pos.x) >= -10
                && (playerPos.z - portal2Pos.z) <= 10 && (playerPos.z - portal2Pos.z) >= -10){
//            System.out.println("do you wat to go inside?");
            goToJordan = true;
        }
        else if((playerPos.x - portal3Pos.x) <= 10 && (playerPos.x - portal3Pos.x) >= -10
                && (playerPos.z - portal3Pos.z) <= 10 && (playerPos.z - portal3Pos.z) >= -10){
//            System.out.println("do you wat to go inside?");
            goToHaran = true;
        }
        else {
            goToJordan = false;
            goToHaran = false;
            gotoBethel = false;
        }

        if(gameData.getInteger(current + " missionId") == 2
                && !gameData.getString(current + " findKnife").equals("Done")) {

            if ((playerPos.x - knifePos.x) <= 5 && (playerPos.x - knifePos.x) >= -5
                    && (playerPos.z - knifePos.z) <= 5 && (playerPos.z - knifePos.z) >= -5
                    && knife != null) {
                knifeItem = true;
            } else {
                knifeItem = false;
                knifeClick = false;
            }
        }
        if (knifeClick && knife != null) {
            engine.removeEntity(knife);
            bulletSystem.collisionWorld.removeCollisionObject(knife.getComponent(ObjectComponents.class).flintKnifeObject);
            knife = null;
        }



        if(gameData.getInteger(current + " missionId") == 2
                && gameData.getInteger(current + " missionCount") != 5 ) {
            if ((playerPos.x - wood1Pos.x) <= 5 && (playerPos.x - wood1Pos.x) >= -5
                    && (playerPos.z - wood1Pos.z) <= 5 && (playerPos.z - wood1Pos.z) >= -5
                    && wood1 != null) {
//            System.out.println("do you wat to go inside?");
                woodItem1 = true;
            } else if ((playerPos.x - wood2Pos.x) <= 5 && (playerPos.x - wood2Pos.x) >= -5
                    && (playerPos.z - wood2Pos.z) <= 5 && (playerPos.z - wood2Pos.z) >= -5
                    && wood2 != null) {
//            System.out.println("do you wat to go inside?");
                woodItem2 = true;
            } else if ((playerPos.x - wood3Pos.x) <= 5 && (playerPos.x - wood3Pos.x) >= -5
                    && (playerPos.z - wood3Pos.z) <= 5 && (playerPos.z - wood3Pos.z) >= -5
                    && wood3 != null) {
//            System.out.println("do you wat to go inside?");
                woodItem3 = true;
            } else if ((playerPos.x - wood4Pos.x) <= 5 && (playerPos.x - wood4Pos.x) >= -5
                    && (playerPos.z - wood4Pos.z) <= 5 && (playerPos.z - wood4Pos.z) >= -5
                    && wood4 != null) {
//            System.out.println("do you wat to go inside?");
                woodItem4 = true;
            } else if ((playerPos.x - wood5Pos.x) <= 5 && (playerPos.x - wood5Pos.x) >= -5
                    && (playerPos.z - wood5Pos.z) <= 5 && (playerPos.z - wood5Pos.z) >= -5
                    && wood5 != null) {
                woodItem5 = true;
            } else {
                woodItem1 = false;
                woodItem2 = false;
                woodItem3 = false;
                woodItem4 = false;
                woodItem5 = false;

                wood1Click = false;
                wood2Click = false;
                wood3Click = false;
                wood4Click = false;
                wood5Click = false;
            }
        }

        if (wood1Click && wood1 != null) {
            engine.removeEntity(wood1);
            bulletSystem.collisionWorld.removeCollisionObject(wood1.getComponent(WoodenPoleComponent.class).woodenPoleObject);
            wood1 = null;
        } else if (wood2Click && wood2 != null) {
            engine.removeEntity(wood2);
            bulletSystem.collisionWorld.removeCollisionObject(wood2.getComponent(WoodenPoleComponent.class).woodenPoleObject);
            wood2 = null;
        } else if (wood3Click && wood3 != null) {
            engine.removeEntity(wood3);
            bulletSystem.collisionWorld.removeCollisionObject(wood3.getComponent(WoodenPoleComponent.class).woodenPoleObject);
            wood3 = null;
        } else if (wood4Click && wood4 != null) {
            engine.removeEntity(wood4);
            bulletSystem.collisionWorld.removeCollisionObject(wood4.getComponent(WoodenPoleComponent.class).woodenPoleObject);
            wood4 = null;
        } else if (wood5Click && wood5 != null) {
            engine.removeEntity(wood5);
            bulletSystem.collisionWorld.removeCollisionObject(wood5.getComponent(WoodenPoleComponent.class).woodenPoleObject);
            wood5 = null;
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
        }x
        */

        // mission 3
        if (gameData.getInteger(current + " missionId") == 3) {

            animalSystem.pickup = ramPickUp;

            if(ramPickUp && !gameData.getString(current + " bringRam").equals("Done")){
                if(!engine.getEntities().contains(arrow, true)){
                    arrow = ObjectEntityFactory.loadArrow(136, 7, -78);
                    engine.addEntity(arrow);
                    arrowAnimation = new AnimationComponent(ObjectEntityFactory.arrowPointerComponent.instance);
                    arrowAnimation.animate("Cube|CubeAction", -1, 1);
                    arrowPos = ObjectEntityFactory.arrowPointerComponent.instance.transform.getTranslation(new Vector3());
                }
//                System.out.println("true");
                if ((playerPos.x - arrowPos.x) <= 3 && (playerPos.x - arrowPos.x) >= -3
                        && (playerPos.z - arrowPos.z) <= 3 && (playerPos.z - arrowPos.z) >= -3) {

                    if (animalSystem.ram.getComponent(AnimalComponent.class).state.equals(AnimalComponent.STATE.IDLE)) {
                        touchArrow = true;
                    }
                }

                else {
                    touchArrow = false;
                }
            }

            if ((playerPos.x - ramPos.x) <= 10 && (playerPos.x - ramPos.x) >= -10
                    && (playerPos.z - ramPos.z) <= 10 && (playerPos.z - ramPos.z) >= -10) {
                ramReady = true;
            }
            else {
                ramReady = false;
            }

            if (touchArrow && ramPickUp ) {
                if (!gameData.getString(current + " bringRam").equals("Done")) {
                    engine.removeEntity(arrow);
                    gameData.putString(current + " bringRam", "Done");

                    gameData.flush();
                }
            }
        }

        worldCamera.worldCam.update();
        worldCamera.update();
//        worldCamera.update();
//        cameraInputController.update();
        if(gameData.getInteger(current + " missionId") == 2) {
            if (!gameData.getString(current + " bringIsaac").equals("Done")
                    || ( gameData.getString(current + " findKnife").equals("Done") &&
                    gameData.getInteger(current + " missionCount") == 5
                   && !gameData.getString(current + " mission2").equals("Done"))) {
                arrowAnimation.update(dt);
            }
        }
        if(gameData.getInteger(current + " missionId") == 3
                && !gameData.getString(current + " bringRam").equals("Done")) {
            if (ramPickUp){
                arrowAnimation.update(dt);
            }
        }

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
//        animalSystem.dispose();
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
