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
import com.legendandroidgame.game.BulletSystem.*;
import com.legendandroidgame.game.BulletTools.CharacterEntityFactory;
import com.legendandroidgame.game.BulletTools.MapEntityFactory;
import com.legendandroidgame.game.Buttons.ActualGameButtons;
import com.legendandroidgame.game.Buttons.Controller;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 8/20/2017.
 */
public class LandOfEdomWorld {
    private ModelBatch batch;
    private Environment environment;
    private WorldCamera worldCam;
    private Engine engine;
    private BulletSystem bulletSystem;
    private Entity character;
    private Entity numbersGuy;
    private Entity peopleOfEdom1;
    private Entity peopleOfEdom2;
    private Entity peopleOfEdom3;
    private Entity peopleOfEdom4;
    private Entity peopleOfEdom5;
    private Entity map;
    private PlayerSystem playerSystem;
    private NumbersGuySystem numbersGuySystem;
    private AnimationComponent characterAnimation;
    private ModelComponent modelComponent;


    private DebugDrawer debugDrawer;
    private static final boolean debug = false;

    public boolean canTalkToGuy = false;

    private String current = gameData.getString("current");

    private float posX, posZ;
    public float moverX, moverY;

    public boolean goToEast = false, goToCave = false, goToJordan = false;


    public LandOfEdomWorld(Controller controller, ActualGameButtons actualGameButtons) {
        Bullet.init();
        initCamera();
        initModelBatch();
        initEnvironment();
        setDebug();
        map = MapEntityFactory.loadLandOfEdom();
        modelComponent = map.getComponent(ModelComponent.class);
        if(gameData.getInteger(current + " from") == 4){
            posX = 31;
            posZ = -200;
//            (275.20697,6.101687,201.14828)
//            this is z(-1419.0806,1500.0,-1397.7231)
        }
        if(gameData.getInteger(current + " from") == 9){
            posX = -210;
            posZ = -134;
//            (-693.1684,7.3171496,295.76648)
//            this is z(-2387.456,1500.0,-1303.105)
        }
        if(gameData.getInteger(current + " from") == 10){
            posX = -40;
            posZ = 195;
//            (62.54196,6.64147,-306.0129)
//            this is z(-1631.7456,1500.0,-1904.8844)
        }
        if(gameData.getInteger(current + " from") == 23){
            posX = 31;
            posZ = -200;
//            (62.54196,6.64147,-306.0129)
//            this is z(-1631.7456,1500.0,-1904.8844)
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
            worldCam.worldCam.position.x = -1660f;
            worldCam.worldCam.position.z = -1790f;
//            (62.54196,6.64147,-306.0129)
//            this is z(-1631.7456,1500.0,-1904.8844)
        }
        if(gameData.getInteger(current + " from") == 9){
            worldCam.worldCam.position.x = -1480f;
            worldCam.worldCam.position.z = -1456f;
//            (62.54196,6.64147,-306.0129)
//            this is z(-1631.7456,1500.0,-1904.8844)
        }
        if(gameData.getInteger(current + " from") == 10){
            worldCam.worldCam.position.x = -1731f;
            worldCam.worldCam.position.z = -1395f;
//            (62.54196,6.64147,-306.0129)
//            this is z(-1631.7456,1500.0,-1904.8844)
        }
        if(gameData.getInteger(current + " from") == 23){
            worldCam.worldCam.position.x = -1660f;
            worldCam.worldCam.position.z = -1790f;
//            (62.54196,6.64147,-306.0129)
//            this is z(-1631.7456,1500.0,-1904.8844)
        }

        worldCam.worldCam.zoom = 0.08f;
    }

    private void initModelBatch() {
        batch = new ModelBatch();
    }

    private void addEntities() {
        loadEgypt();
        createPlayer(posX,10,posZ);
        createNumbersGuy(-101.10542f,4.5f,-70.45975f);
        createPeopleOfEdom();
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

    private void createNumbersGuy(float x, float y, float z){
        numbersGuy = CharacterEntityFactory.createNumbersGuy(bulletSystem, x , y, z);
        engine.addEntity(numbersGuy);
    }

    private void createPeopleOfEdom(){
        peopleOfEdom1 = CharacterEntityFactory.createPeopleOfEdom(bulletSystem, -140.01044f,4.7668123f,-63.695545f);
        peopleOfEdom2 = CharacterEntityFactory.createPeopleOfEdom(bulletSystem, -152.2703f,4.8896847f,-64.36152f);
        peopleOfEdom3 = CharacterEntityFactory.createPeopleOfEdom(bulletSystem, -162.27002f,5.2822585f,-67.465675f);
        peopleOfEdom4 = CharacterEntityFactory.createPeopleOfEdom(bulletSystem, -170.16714f,4.390119f,-75.123955f);
        peopleOfEdom5 = CharacterEntityFactory.createPeopleOfEdom(bulletSystem, -152.04108f,4.696223f,-79.10271f);

        engine.addEntity(peopleOfEdom1);
        engine.addEntity(peopleOfEdom2);
        engine.addEntity(peopleOfEdom3);
        engine.addEntity(peopleOfEdom4);
        engine.addEntity(peopleOfEdom5);

    }

    private void loadEgypt() {
        engine.addEntity(map);
    }

    private void addSystems(Controller controller, ActualGameButtons actualGameButtons, ModelComponent modelComponent) {
        engine = new Engine();
        engine.addSystem(new RenderSystem(batch, environment, worldCam.worldCam, modelComponent));
        engine.addSystem(bulletSystem = new BulletSystem());
        engine.addSystem(playerSystem = new PlayerSystem(worldCam.worldCam, controller, actualGameButtons, posX, posZ,new Vector2()));
        engine.addSystem(numbersGuySystem = new NumbersGuySystem(bulletSystem));

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

        if(CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()).z < -201){
//            goToEast = true;
        }

        if(CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()).z > 200){
//            goToJordan = true;
        }

        if(CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()).x > 213){
//            goToCave = true;
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

        bulletSystem.collisionWorld.removeAction(numbersGuy.getComponent(NumbersGuyCharacterComponent.class).characterController);
        bulletSystem.collisionWorld.removeCollisionObject(numbersGuy.getComponent(NumbersGuyCharacterComponent.class).ghostObject);

        bulletSystem.collisionWorld.removeAction(peopleOfEdom1.getComponent(PeopleOfEdomChararacterComponent.class).characterController);
        bulletSystem.collisionWorld.removeCollisionObject(peopleOfEdom1.getComponent(PeopleOfEdomChararacterComponent.class).ghostObject);

        bulletSystem.collisionWorld.removeAction(peopleOfEdom2.getComponent(PeopleOfEdomChararacterComponent.class).characterController);
        bulletSystem.collisionWorld.removeCollisionObject(peopleOfEdom2.getComponent(PeopleOfEdomChararacterComponent.class).ghostObject);

        bulletSystem.collisionWorld.removeAction(peopleOfEdom3.getComponent(PeopleOfEdomChararacterComponent.class).characterController);
        bulletSystem.collisionWorld.removeCollisionObject(peopleOfEdom3.getComponent(PeopleOfEdomChararacterComponent.class).ghostObject);

        bulletSystem.collisionWorld.removeAction(peopleOfEdom4.getComponent(PeopleOfEdomChararacterComponent.class).characterController);
        bulletSystem.collisionWorld.removeCollisionObject(peopleOfEdom4.getComponent(PeopleOfEdomChararacterComponent.class).ghostObject);

        bulletSystem.collisionWorld.removeAction(peopleOfEdom5.getComponent(PeopleOfEdomChararacterComponent.class).characterController);
        bulletSystem.collisionWorld.removeCollisionObject(peopleOfEdom5.getComponent(PeopleOfEdomChararacterComponent.class).ghostObject);

        bulletSystem.dispose();

        bulletSystem = null;

        batch.dispose();

        batch = null;
        character.getComponent(CharacterComponent.class).characterController.dispose();
        character.getComponent(CharacterComponent.class).ghostObject.dispose();
        character.getComponent(CharacterComponent.class).ghostShape.dispose();

        numbersGuy.getComponent(NumbersGuyCharacterComponent.class).characterController.dispose();
        numbersGuy.getComponent(NumbersGuyCharacterComponent.class).ghostObject.dispose();
        numbersGuy.getComponent(NumbersGuyCharacterComponent.class).ghostShape.dispose();

        peopleOfEdom1.getComponent(PeopleOfEdomChararacterComponent.class).characterController.dispose();
        peopleOfEdom1.getComponent(PeopleOfEdomChararacterComponent.class).ghostObject.dispose();
        peopleOfEdom1.getComponent(PeopleOfEdomChararacterComponent.class).ghostShape.dispose();

        peopleOfEdom2.getComponent(PeopleOfEdomChararacterComponent.class).characterController.dispose();
        peopleOfEdom2.getComponent(PeopleOfEdomChararacterComponent.class).ghostObject.dispose();
        peopleOfEdom2.getComponent(PeopleOfEdomChararacterComponent.class).ghostShape.dispose();

        peopleOfEdom3.getComponent(PeopleOfEdomChararacterComponent.class).characterController.dispose();
        peopleOfEdom3.getComponent(PeopleOfEdomChararacterComponent.class).ghostObject.dispose();
        peopleOfEdom3.getComponent(PeopleOfEdomChararacterComponent.class).ghostShape.dispose();

        peopleOfEdom4.getComponent(PeopleOfEdomChararacterComponent.class).characterController.dispose();
        peopleOfEdom4.getComponent(PeopleOfEdomChararacterComponent.class).ghostObject.dispose();
        peopleOfEdom4.getComponent(PeopleOfEdomChararacterComponent.class).ghostShape.dispose();

        peopleOfEdom5.getComponent(PeopleOfEdomChararacterComponent.class).characterController.dispose();
        peopleOfEdom5.getComponent(PeopleOfEdomChararacterComponent.class).ghostObject.dispose();
        peopleOfEdom5.getComponent(PeopleOfEdomChararacterComponent.class).ghostShape.dispose();

        environment.dispose();
    }

    public void remove(Entity entity) {
        engine.removeEntity(entity);
        bulletSystem.removeBody(entity);
    }
}
