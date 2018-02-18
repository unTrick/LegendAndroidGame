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
public class MosesHouseWorld {
    private ModelBatch batch;
    private Engine engine;
    private BulletSystem bulletSystem;
    private Entity character;
    private Entity map;
    private Entity staff;
    private Entity houseDoor,jarOfWater, cap, coat, sash;
    private Entity woodenpole;
    private PlayerSystem playerSystem;
    private AnimationComponent characterAnimation;
    private ModelComponent modelComponent;
    private Environment environment;
    private WorldCamera worldCamera;

    private DebugDrawer debugDrawer;
    private static final boolean debug = false;

    private String current = gameData.getString("current");

    public boolean goOutside = false;
    public boolean woodenPoleCollide = false, staffCollide = false, staffClick = false;
    private boolean jarOfWaterB = false, capB = false, coatB = false, sashB = false;

    private float posX = -14, posZ = -1;

    private Vector3 doorPos, playerPos, staffPos;


    public MosesHouseWorld(Controller controller, ActualGameButtons actualGameButtons) {
        Bullet.init();
        initCamera();
        initModelBatch();
        initEnvironment();
        setDebug();
        map = MapEntityFactory.loadMosesHouse();
        modelComponent = map.getComponent(ModelComponent.class);
        addSystems(controller, actualGameButtons, modelComponent);
        addEntities();
    }


    private void initEnvironment() {
        environment = new Environment();
    }

    private void initCamera() {

        worldCamera = new WorldCamera();

        worldCamera.worldCam.position.x = -1704f;
        worldCamera.worldCam.position.z = -1590f;
    }

    private void initModelBatch() {
        batch = new ModelBatch();
    }

    private void addEntities() {
        loadHouse();
        createPlayer(posX,10,posZ);
        loadDoor(-27.8f, 7, -1);

        if(!gameData.getString(current + " findStaff").equals("Done")){
            loadStaff(25.232033f,4.21978f,11.937138f);
        }
        if(!gameData.getString(current + " findWoodenPole").equals("Done")){
            loadWoodenPole(6.6646442f,4.2181706f,32.966846f);
        }

        if(!gameData.getString(current + " findJarOfWater").equals("Done")){
            loadJarOfWater();
        }
        if(!gameData.getString(current + " findCap").equals("Done")){
            loadCap();
        }

        if(!gameData.getString(current + " findSash").equals("Done")){
            loadSash();
        }
        if(!gameData.getString(current + " findCoat").equals("Done")){
            loadCoat();
        }


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

    private void loadHouse() {
        engine.addEntity(map);
    }

    private void loadDoor(float x, float y, float z){
        houseDoor = ObjectEntityFactory.loadHouseDoor(bulletSystem, x, y, z);
        engine.addEntity(houseDoor);
    }

    private void loadStaff(float x, float y, float z){
        staff = ObjectEntityFactory.loadStaff(bulletSystem, x, y, z);
        engine.addEntity(staff);
    }

    private void loadWoodenPole(float x, float y, float z){
        woodenpole = ObjectEntityFactory.loadWoodenPole(bulletSystem, x, y, z);
        engine.addEntity(woodenpole);
    }

    private void loadJarOfWater(){

        jarOfWater = ObjectEntityFactory.loadJarOfWater(bulletSystem, 0.88810897f,4.21879f,-9.258998f);
        engine.addEntity(jarOfWater);
    }
    private void loadCap(){

        cap = ObjectEntityFactory.loadCap(bulletSystem, -9.778605f,4.2167554f,32.72996f);
        engine.addEntity(cap);
    }
    private void loadSash(){

        sash = ObjectEntityFactory.loadSash(bulletSystem, 0.41647974f,4.219888f,-34.012127f);
        engine.addEntity(sash);
    }
    private void loadCoat(){

        coat = ObjectEntityFactory.loadCoat(bulletSystem, -23.7405f,4.219724f,-34.01213f);
        engine.addEntity(coat);
    }


    private void addSystems(Controller controller, ActualGameButtons actualGameButtons, ModelComponent modelComponent) {
        engine = new Engine();
        engine.addSystem(new RenderSystem(batch, environment, worldCamera.worldCam, modelComponent));
        engine.addSystem(bulletSystem = new BulletSystem());
        engine.addSystem(playerSystem = new PlayerSystem(worldCamera.worldCam, controller, actualGameButtons, posX, posZ,new Vector2()));
        engine.addSystem(new StatusSystem());

        if(debug) bulletSystem.collisionWorld.setDebugDrawer(this.debugDrawer);
    }

    public void render(float dt) {

        if(Gdx.input.isKeyPressed(Input.Keys.UP)){
            worldCamera.worldCam.position.x += 1;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            worldCamera.worldCam.position.z += 1;
        }

        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){

            worldCamera.worldCam.position.x -= 1;

        }
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){

            worldCamera.worldCam.position.z -= 1;

        }

        if(Gdx.input.isKeyJustPressed(Input.Keys.N)){
            System.out.println("this is z" + worldCamera.worldCam.position);
        }

        if(Gdx.input.isKeyJustPressed(Input.Keys.R)){
            System.out.println(CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()));
        }


        playerPos = CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3());
        doorPos = ObjectEntityFactory.houseDoorComponent.instance.transform.getTranslation(new Vector3());
        if(!gameData.getString(current + " findStaff").equals("Done")){
            staffPos = staff.getComponent(StaffComponent.class).staffObject.getWorldTransform().getTranslation(new Vector3());

            if ((playerPos.x - staffPos.x) <= 5 && (playerPos.x - staffPos.x) >= -5
                    && (playerPos.z - staffPos.z) <= 5 && (playerPos.z - staffPos.z) >= -5
                    && staff != null) {
                staffCollide = true;
            } else {
                staffCollide = false;
                staffClick = false;
            }
            if (staffClick && staff != null) {
                engine.removeEntity(staff);
                bulletSystem.collisionWorld.removeCollisionObject(staff.getComponent(StaffComponent.class).staffObject);
                staff = null;
            }

        }

        if((playerPos.x - doorPos.x) <= 5 && (playerPos.x - doorPos.x) >= -5
                && (playerPos.z - doorPos.z) <= 5 && (playerPos.z - doorPos.z) >= -5){
//            System.out.println("do you wat to go inside?");
            goOutside = true;
        }
        else {
            goOutside = false;
        }


        if(gameData.getInteger(current + " missionId") == 5){

            if(woodenPoleCollide){
                if(Gdx.input.justTouched()){
                        engine.removeEntity(woodenpole);
                        bulletSystem.collisionWorld.removeCollisionObject(woodenpole.getComponent(WoodenPoleComponent.class).woodenPoleObject);
                        gameData.putString(current + " findWoodenPole", "Done");
                        gameData.flush();
                }
            }
        }


        if(gameData.getInteger(current + " missionId") == 3){
            if(jarOfWaterB){
                if(Gdx.input.justTouched()){
                        engine.removeEntity(jarOfWater);
                        bulletSystem.collisionWorld.removeCollisionObject(jarOfWater.getComponent(JarOfWaterComponent.class).jarOfWaterObject);
                        gameData.putString(current + " findJarOfWater", "Done");
                        gameData.flush();

                }
            }
            if(capB){
                if(Gdx.input.justTouched()){
                        engine.removeEntity(cap);
                        bulletSystem.collisionWorld.removeCollisionObject(cap.getComponent(CapComponent.class).capObject);
                        gameData.putString(current + " findCap", "Done");
                        gameData.flush();

                }
            }
            if(sashB){
                if(Gdx.input.justTouched()){
                        engine.removeEntity(sash);
                        bulletSystem.collisionWorld.removeCollisionObject(sash.getComponent(SashComponent.class).sashObject);
                        gameData.putString(current + " findSash", "Done");
                        gameData.flush();

                }
            }
            if(coatB){
                if(Gdx.input.justTouched()){
                        engine.removeEntity(coat);
                        bulletSystem.collisionWorld.removeCollisionObject(coat.getComponent(CoatComponent.class).coatObject);
                        gameData.putString(current + " findCoat", "Done");
                        gameData.flush();

                }
            }

        }


        worldCamera.worldCam.update();
        worldCamera.update();
        characterAnimation.update(dt);
        renderWorld(dt);
    }

    private void renderWorld(float delta) {

        engine.update(delta);
        if(debug){
            debugDrawer.begin(worldCamera.worldCam);
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
    }

    public void remove(Entity entity) {
        engine.removeEntity(entity);
        bulletSystem.removeBody(entity);
    }
}
