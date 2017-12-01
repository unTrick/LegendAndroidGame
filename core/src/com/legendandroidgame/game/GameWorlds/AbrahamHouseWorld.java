package com.legendandroidgame.game.GameWorlds;

import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.environment.DirectionalLight;
import com.badlogic.gdx.graphics.g3d.utils.CameraInputController;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.Bullet;
import com.badlogic.gdx.physics.bullet.DebugDrawer;
import com.badlogic.gdx.physics.bullet.collision.ContactListener;
import com.badlogic.gdx.physics.bullet.collision.btCollisionObject;
import com.badlogic.gdx.physics.bullet.linearmath.btIDebugDraw;
import com.legendandroidgame.game.AddonTools.Environment;
import com.legendandroidgame.game.AddonTools.WorldCamera;
import com.legendandroidgame.game.BulletComponent.AnimationComponent;
import com.legendandroidgame.game.BulletComponent.CharacterComponent;
import com.legendandroidgame.game.BulletComponent.DoorComponent;
import com.legendandroidgame.game.BulletComponent.ModelComponent;
import com.legendandroidgame.game.BulletSystem.*;
import com.legendandroidgame.game.BulletTools.CharacterEntityFactory;
import com.legendandroidgame.game.BulletTools.MapEntityFactory;
import com.legendandroidgame.game.BulletTools.ObjectEntityFactory;
import com.legendandroidgame.game.Buttons.ActualGameButtons;
import com.legendandroidgame.game.Buttons.Controller;

/**
 * Created by Patrick on 8/20/2017.
 */
public class AbrahamHouseWorld {


    private ModelBatch batch;
    private Environment environment;
    private WorldCamera worldCam;
    private Engine engine;
    private BulletSystem bulletSystem;
    private Entity character;
    private Entity doorEntity;
    private Entity abramHouse;
    private PlayerSystem playerSystem;
    private AnimationComponent characterAnimation;
    private ModelComponent modelComponent;

//    public CameraInputController cameraInputController;

    private DebugDrawer debugDrawer;
    private static final boolean debug = false;


    public Boolean goOutside = false;

    private float posX = 0, posZ = 0;

    public class MyContactListener extends ContactListener {
        @Override
        public void onContactStarted(btCollisionObject colObj0, btCollisionObject colObj1){
            if (colObj0.userData instanceof Entity && colObj1.userData instanceof Entity) {
                Entity entity0 = (Entity) colObj0.userData;
                Entity entity1 = (Entity) colObj1.userData;
                if (entity0.getComponent(CharacterComponent.class) != null && entity1.getComponent(DoorComponent.class) != null) {
                    if(entity1.getComponent(DoorComponent.class) != null){
                        goOutside = true;
                    }
//                    System.out.println("Collide");
                }
                if(entity0.getComponent(CharacterComponent.class) == null || entity1.getComponent(DoorComponent.class) == null){
                    goOutside = false;
//                    System.out.println("no co");
                }
            }
        }

    }

    public AbrahamHouseWorld(Controller controller, ActualGameButtons actualGameButtons) {
        Bullet.init();
        initCamera();
        initModelBatch();
        initEnvironment();
        setDebug();
        abramHouse = MapEntityFactory.loadAbrahamHouse();
        modelComponent = abramHouse.getComponent(ModelComponent.class);
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
        worldCam.worldCam.position.x = -1690.5f;
        worldCam.worldCam.position.z = -1589.2f;

    }

    private void initModelBatch() {
        batch = new ModelBatch();
    }

    private void addEntities() {
        loadAbrahamHouse();
        createPlayer(posX,10,posZ);
        loadDoor();
    }

    private void setDebug(){
        if(debug){
            debugDrawer = new DebugDrawer();
            debugDrawer.setDebugMode(btIDebugDraw.DebugDrawModes.DBG_MAX_DEBUG_DRAW_MODE);
        }
    }

    private void loadAbrahamHouse() {
        engine.addEntity(abramHouse);
    }


    private void createPlayer(float x, float y, float z) {
        character = CharacterEntityFactory.createCharacter(bulletSystem, x, y, z);
        engine.addEntity(character);
        characterAnimation = new AnimationComponent(CharacterEntityFactory.playerComponent.instance);
        playerSystem.playerAnimation = characterAnimation;
    }

    private void loadDoor(){
        doorEntity = ObjectEntityFactory.loadDoor(bulletSystem,-10,8,20.5f);
        engine.addEntity(doorEntity);
    }


    private void addSystems(Controller controller, ActualGameButtons actualGameButtons, ModelComponent modelComponent) {
        engine = new Engine();
        engine.addSystem(new RenderSystem(batch, environment, worldCam.worldCam, modelComponent));
        engine.addSystem(bulletSystem = new BulletSystem());
        engine.addSystem(playerSystem = new PlayerSystem(worldCam.worldCam, controller, actualGameButtons, posX, posZ));
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
            System.out.println(worldCam.worldCam.position);
//            System.out.println(worldCam.direction);
        }

//        if((EntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()).x > -17.448143) &&
//                (EntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()).x < -11.99502)){
//            if(EntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()).z > 20){
//                goOutside = true;
//            }
//        }

        if(Gdx.input.isKeyJustPressed(Input.Keys.BACK)){
            System.out.println("Back key is click");
        }

//        System.out.println(goOutside);
//        System.out.println(character.getComponent(CharacterComponent.class).ghostObject.checkCollideWith
//                (doorEntity.getComponent(DoorComponent.class).doorObject));

        worldCam.update();
        characterAnimation.update(dt);
//        cameraInputController.update();
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
        bulletSystem.dispose();

        bulletSystem = null;

        batch.dispose();

        batch = null;
        character.getComponent(CharacterComponent.class).characterController.dispose();
        character.getComponent(CharacterComponent.class).ghostObject.dispose();
        character.getComponent(CharacterComponent.class).ghostShape.dispose();

        doorEntity.getComponent(DoorComponent.class).doorObject.dispose();
        doorEntity.getComponent(DoorComponent.class).doorShape.dispose();

        environment.dispose();
    }

    public void remove(Entity entity) {
        engine.removeEntity(entity);
        bulletSystem.removeBody(entity);
    }

}
