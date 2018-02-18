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
import com.badlogic.gdx.physics.bullet.linearmath.btIDebugDraw;
import com.legendandroidgame.game.AddonTools.Environment;
import com.legendandroidgame.game.AddonTools.WorldCamera;
import com.legendandroidgame.game.BulletComponent.*;
import com.legendandroidgame.game.BulletSystem.BulletSystem;
import com.legendandroidgame.game.BulletSystem.PlayerSystem;
import com.legendandroidgame.game.BulletSystem.RenderSystem;
import com.legendandroidgame.game.BulletSystem.StatusSystem;
import com.legendandroidgame.game.BulletTools.CharacterEntityFactory;
import com.legendandroidgame.game.BulletTools.MapEntityFactory;
import com.legendandroidgame.game.BulletTools.ObjectEntityFactory;
import com.legendandroidgame.game.Buttons.ActualGameButtons;
import com.legendandroidgame.game.Buttons.Controller;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 10/22/2017.
 */
public class JordanWorld {
    private ModelBatch batch;
    private Environment environment;
    private WorldCamera worldCam;
    private Engine engine;
    private BulletSystem bulletSystem;
    private Entity character;
    private Entity map, plaster, stoneOne, stoneTwo, portal1Entity, portal2Entity;
    private PlayerSystem playerSystem;
    private AnimationComponent characterAnimation;
    private ModelComponent modelComponent;

    private ActualGameButtons actualGameButtons;

    private String current = gameData.getString("current");

    public Boolean jordanNPC01 = false;
    public Boolean jordanNPC02 = false;
    public Boolean jordanNPC03 = false;
    public Boolean jordanNPC04 = false;
    public Boolean jordanNPC05 = false;
    public Boolean jordanNPC06 = false;
    public Boolean jordanNPC07 = false;
    public Boolean jordanNPC08 = false;
    public Boolean jordanNPC09 = false;
    public Boolean jordanNPC10 = false;

    private Vector3 jordanNPC01position;
    private Vector3 jordanNPC02position;
    private Vector3 jordanNPC03position;
    private Vector3 jordanNPC04position;
    private Vector3 jordanNPC05position;
    private Vector3 jordanNPC06position;
    private Vector3 jordanNPC07position;
    private Vector3 jordanNPC08position;
    private Vector3 jordanNPC09position;
    private Vector3 jordanNPC10position;


    private DebugDrawer debugDrawer;
    private static final boolean debug = false;

    public boolean goToMoriah = false, goToSinai = false;
    private boolean stone1Collide = false, stone2Collide = false, plasterCollide = false;

    private Vector3 portal1Pos, portal2Pos, playerPos;

    private float posX, posZ;
    public Vector2 mover;

    public JordanWorld(Controller controller, ActualGameButtons actualGameButtons) {
        Bullet.init();
        this.actualGameButtons = actualGameButtons;
        initCamera();
        initModelBatch();
        initEnvironment();
        setDebug();
        map = MapEntityFactory.loadJordan();
        modelComponent = map.getComponent(ModelComponent.class);
        mover = new Vector2();

        if(gameData.getInteger(current + " from") == 3){
            posX = 362;
            posZ = 25;
        }
        if(gameData.getInteger(current + " from") == 8){
            posX = 43;
            posZ = -343;
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
            worldCam.worldCam.position.x = -1328f;
            worldCam.worldCam.position.z = -1564f;
        }
        if(gameData.getInteger(current + " from") == 8){
            worldCam.worldCam.position.x = -1648f;
            worldCam.worldCam.position.z = -1933f;
        }
    }

    private void initModelBatch() {
        batch = new ModelBatch();
    }

    private void addEntities() {
        loadEgypt();
        createPlayer(posX,10,posZ);
        if(gameData.getInteger(current + " missionId") == 6){
            loadLargeStonesOne();
            loadLargeStonesTwo();
            loadPlaster();
        }
        loadPortal1();
        loadPortal2();
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

    private void loadLargeStonesOne(){
        stoneOne = ObjectEntityFactory.loadLargeStonesOne(bulletSystem,25.813969f,4.1599135f,-106.604324f);
        engine.addEntity(stoneOne);
    }

    private void loadLargeStonesTwo(){
        stoneTwo = ObjectEntityFactory.loadLargeStonesTwo(bulletSystem,80.384796f,5.148994f,30.667126f);
        engine.addEntity(stoneTwo);
    }

    private void loadPlaster(){
        plaster = ObjectEntityFactory.loadPlaster(bulletSystem,282.85217f,6.8819404f,-49.414143f);
        engine.addEntity(plaster);
    }

    private void loadPortal1() {
        portal1Entity = ObjectEntityFactory.loadPortalTop(389f,7f, -92f);
        engine.addEntity(portal1Entity);
    }

    void loadPortal2(){
        portal2Entity = ObjectEntityFactory.loadPortalLeft(101,7.5f,-342);
        engine.addEntity(portal2Entity);
    }

    private void addSystems(Controller controller, ActualGameButtons actualGameButtons, ModelComponent modelComponent) {
        engine = new Engine();
        engine.addSystem(new RenderSystem(batch, environment, worldCam.worldCam, modelComponent));
        engine.addSystem(bulletSystem = new BulletSystem());
        engine.addSystem(playerSystem = new PlayerSystem(worldCam.worldCam, controller, actualGameButtons, posX, posZ, mover));
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

        portal1Pos = portal1Entity.getComponent(ModelComponent.class).instance.transform.getTranslation(new Vector3());
        portal2Pos = portal2Entity.getComponent(ModelComponent.class).instance.transform.getTranslation(new Vector3());
        playerPos = CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3());

        jordanNPC01position = CharacterEntityFactory.israelitesComponent1.instance.transform.getTranslation(new Vector3());
        jordanNPC02position = CharacterEntityFactory.israelitesComponent2.instance.transform.getTranslation(new Vector3());
        jordanNPC03position = CharacterEntityFactory.israelitesComponent3.instance.transform.getTranslation(new Vector3());
        jordanNPC04position = CharacterEntityFactory.israelitesComponent4.instance.transform.getTranslation(new Vector3());
        jordanNPC05position = CharacterEntityFactory.israelitesComponent5.instance.transform.getTranslation(new Vector3());
        jordanNPC06position = CharacterEntityFactory.israelitesComponent6.instance.transform.getTranslation(new Vector3());
        jordanNPC07position = CharacterEntityFactory.israelitesComponent7.instance.transform.getTranslation(new Vector3());
        jordanNPC08position = CharacterEntityFactory.israelitesComponent8.instance.transform.getTranslation(new Vector3());
        jordanNPC09position = CharacterEntityFactory.israelitesComponent9.instance.transform.getTranslation(new Vector3());
        jordanNPC10position = CharacterEntityFactory.israelitesComponent10.instance.transform.getTranslation(new Vector3());

        if((playerPos.x - portal1Pos.x) <= 10 && (playerPos.x - portal1Pos.x) >= -10
                && (playerPos.z - portal1Pos.z) <= 10 && (playerPos.z - portal1Pos.z) >= -10){
            goToMoriah = true;
        }
        else if((playerPos.x - portal2Pos.x) <= 10 && (playerPos.x - portal2Pos.x) >= -10
                && (playerPos.z - portal2Pos.z) <= 10 && (playerPos.z - portal2Pos.z) >= -10) {
            goToSinai = true;
        }
        else {
            goToMoriah = false;
            goToSinai = false;
        }


        if((playerPos.x - jordanNPC01position.x) <= 10 && (playerPos.x - jordanNPC01position.x) >= -10
                && (playerPos.z - jordanNPC01position.z) <= 10 && (playerPos.z - jordanNPC01position.z) >= -10){
            jordanNPC01 = true;
        }
        else if((playerPos.x - jordanNPC02position.x) <= 10 && (playerPos.x - jordanNPC02position.x) >= -10
                && (playerPos.z - jordanNPC02position.z) <= 10 && (playerPos.z - jordanNPC02position.z) >= -10){

            jordanNPC02 =  true;
        }
        else if((playerPos.x - jordanNPC03position.x) <= 10 && (playerPos.x - jordanNPC03position.x) >= -10
                && (playerPos.z - jordanNPC03position.z) <= 10 && (playerPos.z - jordanNPC03position.z) >= -10){

            jordanNPC03 =  true;
        }
        else if((playerPos.x - jordanNPC04position.x) <= 10 && (playerPos.x - jordanNPC04position.x) >= -10
                && (playerPos.z - jordanNPC04position.z) <= 10 && (playerPos.z - jordanNPC04position.z) >= -10){

            jordanNPC04 =  true;
        }
        else if((playerPos.x - jordanNPC05position.x) <= 10 && (playerPos.x - jordanNPC05position.x) >= -10
                && (playerPos.z - jordanNPC05position.z) <= 10 && (playerPos.z - jordanNPC05position.z) >= -10){

            jordanNPC05 =  true;
        }
        else if((playerPos.x - jordanNPC06position.x) <= 10 && (playerPos.x - jordanNPC06position.x) >= -10
                && (playerPos.z - jordanNPC06position.z) <= 10 && (playerPos.z - jordanNPC06position.z) >= -10){

            jordanNPC06 =  true;
        }
        else if((playerPos.x - jordanNPC07position.x) <= 10 && (playerPos.x - jordanNPC07position.x) >= -10
                && (playerPos.z - jordanNPC07position.z) <= 10 && (playerPos.z - jordanNPC07position.z) >= -10){

            jordanNPC07 =  true;
        }
        else if((playerPos.x - jordanNPC08position.x) <= 10 && (playerPos.x - jordanNPC08position.x) >= -10
                && (playerPos.z - jordanNPC08position.z) <= 10 && (playerPos.z - jordanNPC08position.z) >= -10){

            jordanNPC08 =  true;
        }
        else if((playerPos.x - jordanNPC09position.x) <= 10 && (playerPos.x - jordanNPC09position.x) >= -10
                && (playerPos.z - jordanNPC09position.z) <= 10 && (playerPos.z - jordanNPC09position.z) >= -10){

            jordanNPC09 =  true;
        }
        else if((playerPos.x - jordanNPC10position.x) <= 10 && (playerPos.x - jordanNPC10position.x) >= -10
                && (playerPos.z - jordanNPC10position.z) <= 10 && (playerPos.z - jordanNPC10position.z) >= -10){

            jordanNPC10 =  true;
        }
        else {
            jordanNPC01 = false;
            jordanNPC02 = false;
            jordanNPC03 = false;
            jordanNPC04 = false;
            jordanNPC05 = false;
            jordanNPC06 = false;
            jordanNPC07 = false;
            jordanNPC08 = false;
            jordanNPC09 = false;
            jordanNPC10 = false;
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

        if (gameData.getInteger(current + " missionId") == 6){
            bulletSystem.collisionWorld.removeCollisionObject(plaster.getComponent(PlasterComponent.class).plasterObject);

            bulletSystem.collisionWorld.removeCollisionObject(stoneOne.getComponent(LargeStonesOneComponent.class).stoneObject);

            bulletSystem.collisionWorld.removeCollisionObject(stoneTwo.getComponent(LargeStonesTwoComponent.class).stoneObject);
        }
        bulletSystem.dispose();

        bulletSystem = null;

        batch.dispose();

        batch = null;
        character.getComponent(CharacterComponent.class).characterController.dispose();
        character.getComponent(CharacterComponent.class).ghostObject.dispose();
        character.getComponent(CharacterComponent.class).ghostShape.dispose();

        if (gameData.getInteger(current + " missionId") == 6){
            plaster.getComponent(PlasterComponent.class).plasterObject.dispose();
            plaster.getComponent(PlasterComponent.class).plasterShape.dispose();

            stoneOne.getComponent(LargeStonesOneComponent.class).stoneObject.dispose();
            stoneOne.getComponent(LargeStonesOneComponent.class).stoneShape.dispose();

            stoneTwo.getComponent(LargeStonesTwoComponent.class).stoneObject.dispose();
            stoneTwo.getComponent(LargeStonesTwoComponent.class).stoneShape.dispose();

        }

        environment.dispose();
    }

    public void remove(Entity entity) {
        engine.removeEntity(entity);
        bulletSystem.removeBody(entity);
    }
}
