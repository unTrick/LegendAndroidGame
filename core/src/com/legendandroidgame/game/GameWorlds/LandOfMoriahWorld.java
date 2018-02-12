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

    public WorldCamera worldCamera;
    //    public CameraInputController cameraInputController;
    public Environment environment;

    private DebugDrawer debugDrawer;
    private static final boolean debug = false;

    private String current = gameData.getString("current");

    public boolean gotoBethel = false, goToJordan = false, goToHaran = false, isBringIsaac = false;

    private float posX , posZ ;
    public float moverX, moverY;

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
        if(!gameData.getString(current + " bringIsaac").equals("Done")) {
            arrow = ObjectEntityFactory.loadArrow(143,7,-74);
            engine.addEntity(arrow);
            arrowAnimation = new AnimationComponent(ObjectEntityFactory.arrowPointerComponent.instance);
            arrowAnimation.animate("Cube|CubeAction", -1, 1);
        }
    }

    private void loadWood(){
        wood1 = ObjectEntityFactory.loadWoodenPole(bulletSystem, -36.77983f,5.6247945f,-6.4565086f);
        engine.addEntity(wood1);
        wood1Pos = ObjectEntityFactory.woodenPoleComponent.instance.transform.getTranslation(new Vector3());

        wood2 = ObjectEntityFactory.loadWoodenPole(bulletSystem, -36.77983f,5.50677f,11.328837f);
        engine.addEntity(wood2);
        wood2Pos = ObjectEntityFactory.woodenPoleComponent.instance.transform.getTranslation(new Vector3());

        wood3 = ObjectEntityFactory.loadWoodenPole(bulletSystem, -99.9641f,5.4802322f,-93.87202f);
        engine.addEntity(wood3);
        wood3Pos = ObjectEntityFactory.woodenPoleComponent.instance.transform.getTranslation(new Vector3());

        wood4 = ObjectEntityFactory.loadWoodenPole(bulletSystem, 170.65671f,5.502753f,-156.16753f);
        engine.addEntity(wood4);
        wood4Pos = ObjectEntityFactory.woodenPoleComponent.instance.transform.getTranslation(new Vector3());

        wood5 = ObjectEntityFactory.loadWoodenPole(bulletSystem, 81.13542f,5.311686f,-39.0278f);
        engine.addEntity(wood5);
        wood5Pos = ObjectEntityFactory.woodenPoleComponent.instance.transform.getTranslation(new Vector3());
    }

    private void loadKnife(){
        knife = ObjectEntityFactory.loadFlintKnife(bulletSystem, 81.13542f,5.311686f,-39.0278f);
        engine.addEntity(knife);
    }



    private void addSystems(Controller controller, ActualGameButtons actualGameButtons, ModelComponent modelComponent) {
        engine = new Engine();
        engine.addSystem(new RenderSystem(batch, environment,  worldCamera.worldCam, modelComponent));
        engine.addSystem(bulletSystem = new BulletSystem());
        engine.addSystem(playerSystem = new PlayerSystem( worldCamera.worldCam, controller, actualGameButtons, posX, posZ, new Vector2()));
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
        knifePos = ObjectEntityFactory.flintKnifeComponent.instance.transform.getTranslation(new Vector3());
        ramPos = animalSystem.ram.getComponent(AnimalsComponent.class).ramObject.getWorldTransform().getTranslation(new Vector3());
        if(!gameData.getString(current + " bringIsaac").equals("Done")) {
            arrowPos = ObjectEntityFactory.arrowPointerComponent.instance.transform.getTranslation(new Vector3());


            if ((playerPos.x - arrowPos.x) <= 3 && (playerPos.x - arrowPos.x) >= -3
                    && (playerPos.z - arrowPos.z) <= 3 && (playerPos.z - arrowPos.z) >= -3) {
                isBringIsaac = true;
            }
            if(isBringIsaac){
                engine.removeEntity(arrow);
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

        worldCamera.worldCam.update();
//        worldCamera.update();
//        cameraInputController.update();
        if(!gameData.getString(current + " bringIsaac").equals("Done")) {
            arrowAnimation.update(dt);
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

        if(!gameData.getString(current + " bringIsaac").equals("Done") && isBringIsaac){
            if(gameData.getInteger(current + " missionId") == 2){
                gameData.putString(current + " bringIsaac", "Done");
                gameData.flush();
            }
        }
    }

    public void remove(Entity entity) {
        engine.removeEntity(entity);
        bulletSystem.removeBody(entity);
    }
}
