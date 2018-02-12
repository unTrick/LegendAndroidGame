package com.legendandroidgame.game.GameWorlds;
import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.BoundingBox;
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
public class HaranWorld {

    private ModelBatch batch;
    private Engine engine;
    private BulletSystem bulletSystem;
    private Entity character;
    private Entity lot, sarai, haran, houseDoor, portalEntity1, portalEntity2, campFire, well;
    private PlayerSystem playerSystem;
    private SaraiSystem saraiSystem;
    private LotSystem lotSystem;
    private IsraelitesSystem israelitesSystem;
    private KidIsaacSystem kidIsaacSystem;
    private InstructorCharSystem instructorCharSystem;
    private AnimationComponent characterAnimation;
    private AnimationComponent lotAnimation;
    private AnimationComponent saraiAnimation;
    private ModelComponent modelComponent;

    public WorldCamera worldCamera;
//    public CameraInputController cameraInputController;
    public Environment environment;

    public boolean lotBounds = false, saraiBounds = false, wellInstructorBounds = false;

    private DebugDrawer debugDrawer;
    private static final boolean debug = false;

    private String current = gameData.getString("current");


    public boolean gotoAbrahamsHouse = false;
    public boolean gotoBethel = false, goToMoriah = false;
    public boolean isWellTouch = false;

    private float posX , posZ ;
    public Vector2 mover;

    private Vector3 portal1Pos, portal2Pos, playerPos, wellPos, wellInstructorPos, houseDoorPos;

    public Boolean haranNPC01 = false;
    public Boolean haranNPC02 = false;
    public Boolean haranNPC03 = false;
    public Boolean haranNPC04 = false;
    public Boolean haranNPC05 = false;
    public Boolean haranNPC06 = false;
    public Boolean haranNPC07 = false;
    public Boolean haranNPC08 = false;
    public Boolean haranNPC09 = false;
    public Boolean haranNPC10 = false;

    private Vector3 haranNPC01position;
    private Vector3 haranNPC02position;
    private Vector3 haranNPC03position;
    private Vector3 haranNPC04position;
    private Vector3 haranNPC05position;
    private Vector3 haranNPC06position;
    private Vector3 haranNPC07position;
    private Vector3 haranNPC08position;
    private Vector3 haranNPC09position;
    private Vector3 haranNPC10position;


    public HaranWorld(Controller controller, ActualGameButtons actualGameButtons) {
        Bullet.init();

        setDebug();
        initCamera();
        initModelBatch();
        initEnvironment();
        haran = MapEntityFactory.loadHaran();
        modelComponent = haran.getComponent(ModelComponent.class);
        mover = new Vector2(517,	392);
        if(gameData.getInteger(current + " from") == 1){
            posX = 47;
            posZ = -74;
//            (46.35008,3.9726622,-65.48449)
//            this is z(-1645.254,1500.0,-1657.6821)
        }
        if(gameData.getInteger(current + " from") == 3){
            posX = 31;
            posZ = -104;
//            (23.299538,3.6052663,-109.526855)
//            this is z(-1668.3046,1500.0,-1701.7246)
        }
        if(gameData.getInteger(current + " from") == 8){
            posX = -66;
            posZ = 66;
//            (23.299538,3.6052663,-109.526855)
//            this is z(-1668.3046,1500.0,-1701.7246)
        }
        if(gameData.getInteger(current + " from") == 11){
            posX = 31;
            posZ = -104;
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

        if(gameData.getInteger(current + " from") == 1){
            worldCamera.worldCam.position.x = -1644f;
            worldCamera.worldCam.position.z = -1667f;
//            (46.35008,3.9726622,-65.48449)
//            this is z(-1645.254,1500.0,-1657.6821)
        }
        if(gameData.getInteger(current + " from") == 3){
            worldCamera.worldCam.position.x = -1660f;
            worldCamera.worldCam.position.z = -1697f;
//            (23.299538,3.6052663,-109.526855)
//            this is z(-1668.3046,1500.0,-1701.7246)
        }
        if(gameData.getInteger(current + " from") == 8){
            worldCamera.worldCam.position.x = -1757f;
            worldCamera.worldCam.position.z = -1527f;
//            (23.299538,3.6052663,-109.526855)
//            this is z(-1668.3046,1500.0,-1701.7246)
        }

        if(gameData.getInteger(current + " from") == 11){
            worldCamera.worldCam.position.x = -1660f;
            worldCamera.worldCam.position.z = -1697f;
//            (23.299538,3.6052663,-109.526855)
//            this is z(-1668.3046,1500.0,-1701.7246)
        }
    }

    private void initModelBatch() {
        batch = new ModelBatch();
    }

    private void addEntities() {
        loadHaran();
        createPlayer(posX,10,posZ);
        loadHouseDoor(53,6,-73);
        lotModel(-73,10,-26);
        saraiModel(30,10,-44);
//        loadCampFire(30,4,-61);
        loadWell();
        loadPortal1();
        loadPortal2();
    }

    private void setDebug(){
        if(debug){
            debugDrawer = new DebugDrawer();
            debugDrawer.setDebugMode(btIDebugDraw.DebugDrawModes.DBG_MAX_DEBUG_DRAW_MODE);
        }
    }

    private void loadHaran() {

        engine.addEntity(haran);
    }

    private void loadHouseDoor(float x, float y, float z){

        houseDoor = ObjectEntityFactory.loadHouseDoor(bulletSystem, x, y, z);
        engine.addEntity(houseDoor);
    }

    private void loadCampFire(float x, float y, float z){
        campFire = ObjectEntityFactory.loadCampFire(bulletSystem, x, y ,z);
        engine.addEntity(campFire);
    }

    private void createPlayer(float x, float y, float z) {
        character = CharacterEntityFactory.createCharacter(bulletSystem, x, y, z);
        engine.addEntity(character);
        characterAnimation = new AnimationComponent(CharacterEntityFactory.playerComponent.instance);
        playerSystem.playerAnimation = characterAnimation;
    }

    private void lotModel(float x, float y, float z){
       lot = CharacterEntityFactory.createLotCharacter(bulletSystem, x, y, z);
       engine.addEntity(lot);
        lotAnimation = new AnimationComponent(CharacterEntityFactory.lotComponent.instance);
        lotSystem.playerAnimation = lotAnimation;
    }

    private void saraiModel(float x, float y, float z){
        sarai = CharacterEntityFactory.createSaraiCharacter(bulletSystem, x, y, z);
        engine.addEntity(sarai);
        saraiAnimation = new AnimationComponent(CharacterEntityFactory.saraiComponent.instance);
        saraiSystem.playerAnimation = saraiAnimation;
    }

    private void loadWell(){
        well = ObjectEntityFactory.loadWell(bulletSystem, 7f,5.485676f,63f);
        engine.addEntity(well);
    }

    private void loadPortal1(){
        portalEntity1 = ObjectEntityFactory.loadPortalLeft(28,3.7098236f,-116);
        engine.addEntity(portalEntity1);
    }

    private void loadPortal2(){
        portalEntity2 = ObjectEntityFactory.loadPortalBottom(-84f,3.6057749f,66.86713f);
        engine.addEntity(portalEntity2);
    }

    private void addSystems(Controller controller, ActualGameButtons actualGameButtons, ModelComponent modelComponent) {
        engine = new Engine();
        engine.addSystem(new RenderSystem(batch, environment,  worldCamera.worldCam, modelComponent));
        engine.addSystem(bulletSystem = new BulletSystem());
        engine.addSystem(playerSystem = new PlayerSystem( worldCamera.worldCam, controller, actualGameButtons, posX, posZ, mover));
        engine.addSystem(saraiSystem = new SaraiSystem(bulletSystem));
        engine.addSystem(lotSystem = new LotSystem(bulletSystem));
        engine.addSystem(instructorCharSystem = new InstructorCharSystem(bulletSystem));
        engine.addSystem(kidIsaacSystem = new KidIsaacSystem(bulletSystem));
        engine.addSystem(israelitesSystem = new IsraelitesSystem(bulletSystem));
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
            System.out.println("this is camera pos\t" +  worldCamera.worldCam.position);
            System.out.println("this is camera look\t" +  worldCamera.worldCam.direction);
            /*
            System.out.println("this is camera field of view\t" +  worldCamera.worldCam.fieldOfView);
            System.out.println("this is camera frustum\t" +  worldCamera.worldCam.frustum);
            System.out.println("this is camera invProjectionView\t" +  worldCamera.worldCam.invProjectionView);
            System.out.println("this is camera view\t" +  worldCamera.worldCam.view);
            */
        }

        if(Gdx.input.isKeyJustPressed(Input.Keys.R)){
            System.out.println(CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()));
        }

        playerPos = CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3());
        wellInstructorPos = instructorCharSystem.instructor.getComponent(InstructorCharacterComponent.class)
                .ghostObject.getWorldTransform().getTranslation(new Vector3());
        portal1Pos = ObjectEntityFactory.portalComponentLeft.instance.transform.getTranslation(new Vector3());
        portal2Pos = ObjectEntityFactory.portalComponentBottom.instance.transform.getTranslation(new Vector3());
        houseDoorPos = ObjectEntityFactory.houseDoorComponent.instance.transform.getTranslation(new Vector3());
        wellPos = well.getComponent(WellComponent.class).wellObject.getWorldTransform().getTranslation(new Vector3());

        haranNPC01position = CharacterEntityFactory.israelitesComponent1.instance.transform.getTranslation(new Vector3());
        haranNPC02position = CharacterEntityFactory.israelitesComponent2.instance.transform.getTranslation(new Vector3());
        haranNPC03position = CharacterEntityFactory.israelitesComponent3.instance.transform.getTranslation(new Vector3());
        haranNPC04position = CharacterEntityFactory.israelitesComponent4.instance.transform.getTranslation(new Vector3());
        haranNPC05position = CharacterEntityFactory.israelitesComponent5.instance.transform.getTranslation(new Vector3());
        haranNPC06position = CharacterEntityFactory.israelitesComponent6.instance.transform.getTranslation(new Vector3());
        haranNPC07position = CharacterEntityFactory.israelitesComponent7.instance.transform.getTranslation(new Vector3());
        haranNPC08position = CharacterEntityFactory.israelitesComponent8.instance.transform.getTranslation(new Vector3());
        haranNPC09position = CharacterEntityFactory.israelitesComponent9.instance.transform.getTranslation(new Vector3());
        haranNPC10position = CharacterEntityFactory.israelitesComponent10.instance.transform.getTranslation(new Vector3());


        if((playerPos.x - portal1Pos.x) <= 10 && (playerPos.x - portal1Pos.x) >= -10
                && (playerPos.z - portal1Pos.z) <= 10 && (playerPos.z - portal1Pos.z) >= -10){
//            System.out.println("do you wat to go inside?");
                gotoBethel = true;
        }
        else {
            gotoBethel = false;
        }

        if((playerPos.x - portal2Pos.x) <= 10 && (playerPos.x - portal2Pos.x) >= -10
                && (playerPos.z - portal2Pos.z) <= 10 && (playerPos.z - portal2Pos.z) >= -10){
//            System.out.println("do you wat to go inside?");
            goToMoriah = true;
        }
        else {
            goToMoriah = false;
        }


        if((playerPos.x - wellPos.x) <= 10 && (playerPos.x - wellPos.x) >= -10
                && (playerPos.z - wellPos.z) <= 10 && (playerPos.z - wellPos.z) >= -10){
            isWellTouch = true;
        }
        else {
            isWellTouch = false;
        }

        if((playerPos.x - houseDoorPos.x) <= 5 && (playerPos.x - houseDoorPos.x) >= -5
                && (playerPos.z - houseDoorPos.z) <= 5 && (playerPos.z - houseDoorPos.z) >= -5){
            gotoAbrahamsHouse = true;
        }
        else {
            gotoAbrahamsHouse = false;
        }

        if((playerPos.x - wellInstructorPos.x) <= 10 && (playerPos.x - wellInstructorPos.x) >= -10
                && (playerPos.z - wellInstructorPos.z) <= 10 && (playerPos.z - wellInstructorPos.z) >= -10){
            wellInstructorBounds = true;
        }
        else {
            wellInstructorBounds = false;
        }


        if (Gdx.input.isKeyJustPressed(Input.Keys.M)){
//            System.out.println(haran.getComponent(ModelComponent.class).instance.calculateBoundingBox(new BoundingBox()));
        }

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

        if((playerPos.x - haranNPC01position.x) <= 10 && (playerPos.x - haranNPC01position.x) >= -10
                && (playerPos.z - haranNPC01position.z) <= 10 && (playerPos.z - haranNPC01position.z) >= -10){
            haranNPC01 = true;
        }
        else if((playerPos.x - haranNPC02position.x) <= 10 && (playerPos.x - haranNPC02position.x) >= -10
                && (playerPos.z - haranNPC02position.z) <= 10 && (playerPos.z - haranNPC02position.z) >= -10){

            haranNPC02 =  true;
        }
        else if((playerPos.x - haranNPC03position.x) <= 10 && (playerPos.x - haranNPC03position.x) >= -10
                && (playerPos.z - haranNPC03position.z) <= 10 && (playerPos.z - haranNPC03position.z) >= -10){

            haranNPC03 =  true;
        }
        else if((playerPos.x - haranNPC04position.x) <= 10 && (playerPos.x - haranNPC04position.x) >= -10
                && (playerPos.z - haranNPC04position.z) <= 10 && (playerPos.z - haranNPC04position.z) >= -10){

            haranNPC04 =  true;
        }
        else if((playerPos.x - haranNPC05position.x) <= 10 && (playerPos.x - haranNPC05position.x) >= -10
                && (playerPos.z - haranNPC05position.z) <= 10 && (playerPos.z - haranNPC05position.z) >= -10){

            haranNPC05 =  true;
        }
        else if((playerPos.x - haranNPC06position.x) <= 10 && (playerPos.x - haranNPC06position.x) >= -10
                && (playerPos.z - haranNPC06position.z) <= 10 && (playerPos.z - haranNPC06position.z) >= -10){

            haranNPC06 =  true;
        }
        else if((playerPos.x - haranNPC07position.x) <= 10 && (playerPos.x - haranNPC07position.x) >= -10
                && (playerPos.z - haranNPC07position.z) <= 10 && (playerPos.z - haranNPC07position.z) >= -10){

            haranNPC07 =  true;
        }
        else if((playerPos.x - haranNPC08position.x) <= 10 && (playerPos.x - haranNPC08position.x) >= -10
                && (playerPos.z - haranNPC08position.z) <= 10 && (playerPos.z - haranNPC08position.z) >= -10){

            haranNPC08 =  true;
        }
        else if((playerPos.x - haranNPC09position.x) <= 10 && (playerPos.x - haranNPC09position.x) >= -10
                && (playerPos.z - haranNPC09position.z) <= 10 && (playerPos.z - haranNPC09position.z) >= -10){

            haranNPC09 =  true;
        }
        else if((playerPos.x - haranNPC10position.x) <= 10 && (playerPos.x - haranNPC10position.x) >= -10
                && (playerPos.z - haranNPC10position.z) <= 10 && (playerPos.z - haranNPC10position.z) >= -10){

            haranNPC10 =  true;
        }
        else {
            haranNPC01 = false;
            haranNPC02 = false;
            haranNPC03 = false;
            haranNPC04 = false;
            haranNPC05 = false;
            haranNPC06 = false;
            haranNPC07 = false;
            haranNPC08 = false;
            haranNPC09 = false;
            haranNPC10 = false;
        }

        worldCamera.worldCam.update();
//        worldCamera.update();
//        cameraInputController.update();
        characterAnimation.update(dt);
        saraiAnimation.update(dt);
        lotAnimation.update(dt);

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
        instructorCharSystem.dispose();
        kidIsaacSystem.dispose();
        CharacterEntityFactory.character = null;
        CharacterEntityFactory.playerModel = null;
        bulletSystem.collisionWorld.removeAction(character.getComponent(CharacterComponent.class).characterController);
        bulletSystem.collisionWorld.removeCollisionObject(character.getComponent(CharacterComponent.class).ghostObject);
        bulletSystem.collisionWorld.removeCollisionObject(lot.getComponent(LotCharacterComponent.class).ghostObject);
        bulletSystem.collisionWorld.removeCollisionObject(sarai.getComponent(SaraiCharacterComponent.class).ghostObject);

        bulletSystem.dispose();

        bulletSystem = null;

        batch.dispose();

        batch = null;
        character.getComponent(CharacterComponent.class).characterController.dispose();
        character.getComponent(CharacterComponent.class).ghostObject.dispose();
        character.getComponent(CharacterComponent.class).ghostShape.dispose();

        lot.getComponent(LotCharacterComponent.class).ghostShape.dispose();
        lot.getComponent(LotCharacterComponent.class).ghostObject.dispose();

        sarai.getComponent(SaraiCharacterComponent.class).ghostShape.dispose();
        sarai.getComponent(SaraiCharacterComponent.class).ghostObject.dispose();

        houseDoor.getComponent(DoorComponent.class).doorShape.dispose();
        houseDoor.getComponent(DoorComponent.class).doorObject.dispose();


        environment.dispose();
    }

    public void remove(Entity entity) {
        engine.removeEntity(entity);
        bulletSystem.removeBody(entity);
    }
}