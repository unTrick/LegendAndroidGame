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
 * Created by Patrick on 10/20/2017.
 */
public class EgyptWestWorld {
    private ModelBatch batch;
    private Environment environment;
    private WorldCamera worldCam;
    private Engine engine;
    private BulletSystem bulletSystem;
    private Entity character, entityPortal1, entityPortal2, entityPortal3;
    private Entity map;
    private PlayerSystem playerSystem;
    private IsraelitesSystem israelitesSystem;
    private AnimationComponent characterAnimation;
    private ModelComponent modelComponent;

    private String current = gameData.getString("current");


    private DebugDrawer debugDrawer;
    private static final boolean debug = false;

    public Boolean goToSouth = false, goToNorth = false, goToEast = false;
    private Vector3 portal1Pos, portal2Pos, portal3Pos, playerPos;

    private float posX, posZ;
    public Vector2 mover;


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

    public EgyptWestWorld(Controller controller, ActualGameButtons actualGameButtons) {
        Bullet.init();
        initCamera();
        initModelBatch();
        initEnvironment();
        setDebug();
        map = MapEntityFactory.loadEgyptWest();
        modelComponent = map.getComponent(ModelComponent.class);
        mover = new Vector2();
        if(gameData.getInteger(current + " from") == 4){
            posX = 15;
            posZ = 229;
//            (-75.01445,4.46197,249.1945)
//            this is z(-1765.5144,1500.0,-1340.0055)
        }
        if(gameData.getInteger(current + " from") == 5){
            posX = 232;
            posZ = 27;
//            (249.16187,4.3365674,32.411964)
//            this is z(-1441.3381,1500.0,-1556.788)
        }
        if(gameData.getInteger(current + " from") == 6){
            posX = -218;
            posZ = -10;
//            (-250.89944,4.5845942,-11.06472)
//            this is z(-1941.3994,1500.0,-1600.2646)
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
            worldCam.worldCam.position.x = -1679;
            worldCam.worldCam.position.z = -1365;
//            (-75.01445,4.46197,249.1945)
//            this is z(-1765.5144,1500.0,-1340.0055)
        }
        if(gameData.getInteger(current + " from") == 5){
            worldCam.worldCam.position.x = -1463;
            worldCam.worldCam.position.z = -1566;
//            (249.16187,4.3365674,32.411964)
//            this is z(-1441.3381,1500.0,-1556.788)
        }
        if(gameData.getInteger(current + " from") == 6){
            worldCam.worldCam.position.x = -1914;
            worldCam.worldCam.position.z = -1604;
//            (-250.89944,4.5845942,-11.06472)
//            this is z(-1941.3994,1500.0,-1600.2646)
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

    private void loadPortal1(){

        entityPortal1 = ObjectEntityFactory.loadPortalTop(241,4,29);
        engine.addEntity(entityPortal1);

    }

    private void loadPortal2(){

        entityPortal2 = ObjectEntityFactory.loadPortalBottom(-242,4.5735564f,-14);
        engine.addEntity(entityPortal2);

    }

    private void loadPortal3(){

        entityPortal3 = ObjectEntityFactory.loadPortalRight(17,4,245);
        engine.addEntity(entityPortal3);

    }


    private void addSystems(Controller controller, ActualGameButtons actualGameButtons, ModelComponent modelComponent) {
        engine = new Engine();
        engine.addSystem(new RenderSystem(batch, environment, worldCam.worldCam, modelComponent));
        engine.addSystem(bulletSystem = new BulletSystem());
        engine.addSystem(playerSystem = new PlayerSystem(worldCam.worldCam, controller, actualGameButtons, posX, posZ, mover));
        engine.addSystem(israelitesSystem = new IsraelitesSystem(bulletSystem));
        engine.addSystem(new StatusSystem());

        if(debug) bulletSystem.collisionWorld.setDebugDrawer(this.debugDrawer);
    }

    public void render(float dt) {

        if(Gdx.input.isKeyPressed(Input.Keys.I)){
            worldCam.worldCam.position.x += 1;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.J)){
            worldCam.worldCam.position.z += 1;
        }

        if(Gdx.input.isKeyPressed(Input.Keys.K)){

            worldCam.worldCam.position.x -= 1;

        }
        if(Gdx.input.isKeyPressed(Input.Keys.L)){

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
        portal2Pos = ObjectEntityFactory.portalComponentBottom.instance.transform.getTranslation(new Vector3());
        portal3Pos = ObjectEntityFactory.portalComponentRight.instance.transform.getTranslation(new Vector3());

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
            goToSouth = true;
        }
        else if((playerPos.x - portal3Pos.x) <= 10 && (playerPos.x - portal3Pos.x) >= -10
                && (playerPos.z - portal3Pos.z) <= 10 && (playerPos.z - portal3Pos.z) >= -10){
//            System.out.println("do you wat to go inside?");
            goToEast = true;
        }
        else {
            goToSouth = false;
            goToEast = false;
            goToNorth = false;
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
