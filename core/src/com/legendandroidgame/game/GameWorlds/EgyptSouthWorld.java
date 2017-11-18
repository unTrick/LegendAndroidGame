package com.legendandroidgame.game.GameWorlds;

import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.environment.DirectionalLight;
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
    private Entity character;
    private Entity map;
    private Entity aaron;
    private Entity  houseDoor;
    private PlayerSystem playerSystem;
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
    public boolean goInside = false;


    public class MyContactListener extends ContactListener {
        @Override
        public void onContactStarted(btCollisionObject colObj0, btCollisionObject colObj1){
            if (colObj0.userData instanceof Entity && colObj1.userData instanceof Entity) {
                Entity entity0 = (Entity) colObj0.userData;
                Entity entity1 = (Entity) colObj1.userData;

                if(entity0.getComponent(CharacterComponent.class) != null && entity1.getComponent(DoorComponent.class) != null){
                    if(entity1.getComponent(DoorComponent.class) != null){
                        goInside = true;
                    }
                    goInside = true;
                }
                if(entity0.getComponent(CharacterComponent.class) == null || entity1.getComponent(DoorComponent.class) == null){
                    goInside = false;
                }

            }
        }
    }

    public EgyptSouthWorld(Controller controller, ActualGameButtons actualGameButtons) {
        Bullet.init();

        this.actualGameButtons = actualGameButtons;

        initCamera();
        initModelBatch();
        initEnvironment();
        setDebug();
        map = MapEntityFactory.loadEgyptSouth();
        modelComponent = map.getComponent(ModelComponent.class);
        if(gameData.getInteger(current + " from") == 4){
            posX = 40;
            posZ = 149;
//            (40.335564,4.156165,149.30467)
//            this is z(-1650.1644,1500.0,-1439.8953)
        }
        if(gameData.getInteger(current + " from") == 5){
            posX = 148;
            posZ = 4;
//            this is z(-1541.6311,1500.0,-1589.2)
//            (148.86893,4.115683,0.0)
        }
        if(gameData.getInteger(current + " from") == 7){
            posX = 7;
            posZ = -150;
//            (6.962594,4.1296353,-150.007)
//            this is z(-1683.5374,1500.0,-1739.2069)
        }
        if(gameData.getInteger(current + " from") == 21){
            posX = 21;
            posZ = -81;
        }
        if(gameData.getInteger(current + " from") == 22){
            posX = 21;
            posZ = -81;
        }

        if(gameData.getInteger(current + " from") == 12){
            posX = 21;
            posZ = -81;
        }
        addSystems(controller, actualGameButtons, modelComponent);
        MyContactListener myContactListener = new MyContactListener();
        myContactListener.enable();
        addEntities();
    }


    private void initEnvironment() {
        environment = new Environment();
    }

    private void initCamera() {

        worldCam = new WorldCamera();

        if(gameData.getInteger(current + " from") == 4){
            worldCam.worldCam.position.x = -1650f;
            worldCam.worldCam.position.z = -1439f;
//            (40.335564,4.156165,149.30467)
//            this is z(-1650.1644,1500.0,-1439.8953)
        }
        if(gameData.getInteger(current + " from") == 5){
            worldCam.worldCam.position.x = -1541f;
            worldCam.worldCam.position.z = -1589f;
//            this is z(-1541.6311,1500.0,-1589.2)
//            (148.86893,4.115683,0.0)
        }
        if(gameData.getInteger(current + " from") == 7){
            worldCam.worldCam.position.x = -1683f;
            worldCam.worldCam.position.z = -1739f;
//            (6.962594,4.1296353,-150.007)
//            this is z(-1683.5374,1500.0,-1739.2069)
        }
        if(gameData.getInteger(current + " from") == 21){
            worldCam.worldCam.position.x = -1668f;
            worldCam.worldCam.position.z = -1674f;
        }
        if(gameData.getInteger(current + " from") == 22){
            worldCam.worldCam.position.x = -1668f;
            worldCam.worldCam.position.z = -1674f;
        }

        if(gameData.getInteger(current + " from") == 12){
            worldCam.worldCam.position.x = -1668f;
            worldCam.worldCam.position.z = -1674f;
        }

    }

    private void initModelBatch() {
        batch = new ModelBatch();
    }

    private void addEntities() {
        loadEgypt();
        createPlayer(posX,10,posZ);
        if(gameData.getInteger(current + " missionId") >= 3){
            loadAaron(-34f,5,-26f);
        }

        loadHouseDoor(33, 5, -77.5f);
//        loadJarOfWater();
//        loadCap();
//        loadCoat();
//        loadSash();
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


    private void addSystems(Controller controller, ActualGameButtons actualGameButtons, ModelComponent modelComponent) {
        engine = new Engine();
        engine.addSystem(new RenderSystem(batch, environment, worldCam.worldCam, modelComponent));
        engine.addSystem(bulletSystem = new BulletSystem());
        engine.addSystem(playerSystem = new PlayerSystem(worldCam.worldCam, controller, actualGameButtons, posX, posZ));
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

        if (CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()).z < -156) {
            goToWest = true;
        }
        if (CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()).z > 153) {
            goToEast = true;
        }
        if (CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()).x > 154) {
            goToNorth = true;
        }

        if(gameData.getInteger(current + " missionId") == 3){
            if(aaronSystem.canTalk){
                canTalkToAaron = true;
            }
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
        bulletSystem.collisionWorld.removeAction(character.getComponent(CharacterComponent.class).characterController);
        bulletSystem.collisionWorld.removeCollisionObject(character.getComponent(CharacterComponent.class).ghostObject);
        if(gameData.getInteger(current + " missionId") >= 3) {
            bulletSystem.collisionWorld.removeAction(aaron.getComponent(AaronCharacterComponent.class).characterController);
            bulletSystem.collisionWorld.removeCollisionObject(aaron.getComponent(AaronCharacterComponent.class).ghostObject);
        }
        bulletSystem.dispose();

        bulletSystem = null;

        batch.dispose();

        batch = null;
        character.getComponent(CharacterComponent.class).characterController.dispose();
        character.getComponent(CharacterComponent.class).ghostObject.dispose();
        character.getComponent(CharacterComponent.class).ghostShape.dispose();

        if(gameData.getInteger(current + " missionId") >= 3) {
            aaron.getComponent(AaronCharacterComponent.class).characterController.dispose();
            aaron.getComponent(AaronCharacterComponent.class).ghostObject.dispose();
            aaron.getComponent(AaronCharacterComponent.class).ghostShape.dispose();
        }

        environment.dispose();
    }

    public void remove(Entity entity) {
        engine.removeEntity(entity);
        bulletSystem.removeBody(entity);
    }


}
