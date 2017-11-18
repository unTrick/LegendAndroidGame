package com.legendandroidgame.game.GameWorlds;

import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.environment.DirectionalLight;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.Bullet;
import com.badlogic.gdx.physics.bullet.DebugDrawer;
import com.badlogic.gdx.physics.bullet.linearmath.btIDebugDraw;
import com.legendandroidgame.game.BulletComponent.AnimationComponent;
import com.legendandroidgame.game.BulletComponent.CharacterComponent;
import com.legendandroidgame.game.BulletComponent.ModelComponent;
import com.legendandroidgame.game.BulletSystem.BulletSystem;
import com.legendandroidgame.game.BulletSystem.PlayerSystem;
import com.legendandroidgame.game.BulletSystem.RenderSystem;
import com.legendandroidgame.game.BulletSystem.StatusSystem;
import com.legendandroidgame.game.BulletTools.CharacterEntityFactory;
import com.legendandroidgame.game.BulletTools.MapEntityFactory;
import com.legendandroidgame.game.Buttons.ActualGameButtons;
import com.legendandroidgame.game.Buttons.Controller;
import com.legendandroidgame.game.DirectionalShadowLight;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 8/20/2017.
 */
public class EgyptEastWorld {
    private ModelBatch batch;
    private Environment environment;
    private OrthographicCamera worldCam;
    private Engine engine;
    private BulletSystem bulletSystem;
    private Entity character;
    private PlayerSystem playerSystem;
    private AnimationComponent characterAnimation;
    private ModelComponent modelComponent;

    public Boolean goToNorth = false, goToSouth = false, goToWest = false, goToEdom = false;

    private Entity map;

    private DebugDrawer debugDrawer;
    private static final boolean debug = false;

    private String current = gameData.getString("current");

    private float posX, posZ;


    public EgyptEastWorld(Controller controller, ActualGameButtons actualGameButtons) {
        Bullet.init();
        initCamera();
        initModelBatch();
        initEnvironment();
        setDebug();
        map = MapEntityFactory.loadEgyptEast();
        modelComponent = map.getComponent(ModelComponent.class);
        if(gameData.getInteger(current + " from") == 5){
            posX = 275;
            posZ = 201;
//            (275.20697,6.101687,201.14828)
//            this is z(-1419.0806,1500.0,-1397.7231)
        }
        if(gameData.getInteger(current + " from") == 6){
            posX = -31;
            posZ = -306;
//            (-693.1684,7.3171496,295.76648)
//            this is z(-2387.456,1500.0,-1303.105)
        }
        if(gameData.getInteger(current + " from") == 7){
            posX = 62;
            posZ = -306;
//            (62.54196,6.64147,-306.0129)
//            this is z(-1631.7456,1500.0,-1904.8844)
        }
        if(gameData.getInteger(current + " from") == 8){
            posX = 155;
            posZ = 754;
//            (62.54196,6.64147,-306.0129)
//            this is z(-1631.7456,1500.0,-1904.8844)
        }
        addSystems(controller, actualGameButtons, modelComponent);
        addEntities();
    }


    private void initEnvironment() {
//        shadowLight = new DirectionalShadowLight(1024 * 5, 1024 * 5,200f, 200f, 1f, 300f);
        environment = new Environment();
//        environment.set(new ColorAttribute(ColorAttribute.AmbientLight, 0.5f, 0.5f, 0.5f, 1f));
////        environment.add(new SpotLight().setColor(Color.WHITE));
////        environment.add(new SpotLight().setDirection(new Vector3(-1f, -0.8f, -0.2f)));
//        shadowLight.set(0.8f,0.8f,0.8f, 0.1f, -0.3f, -0.1f);
//        environment.add(shadowLight);
//        environment.shadowMap = shadowLight;
//        environment.add(new DirectionalLight().set(0.8f, 0.8f, 0.8f, -1f, -0.1f, -0.2f));

        environment.set(new ColorAttribute(ColorAttribute.AmbientLight, 0.4f, 0.4f, 0.4f, 1.f));
//        environment.set(new ColorAttribute(ColorAttribute.Fog, .3f, .55f, 1, 1));
        environment.add(new DirectionalLight().set(.3f, .3f, .3f, -2f, 0.6f, .8f));
        environment.add(new DirectionalLight().set(1f, 1f, 1f, .2f, -0.6f, -.8f));
//        environment.add(new PointLight().set(0.5f,0.5f,0.5f,0,5,0,3));
    }

    private void initCamera() {

        worldCam = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        worldCam.setToOrtho(false,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        worldCam.position.set(0f,1500,0f);
        worldCam.lookAt(956,657,899);
//        worldCam.lookAt(0,0,0);
        worldCam.near = 1f;
        worldCam.far = 2850f;
        if(gameData.getInteger(current + " from") == 5){
            worldCam.position.x = -1419f;
            worldCam.position.z = -1397f;
//            (275.20697,6.101687,201.14828)
//            this is z(-1419.0806,1500.0,-1397.7231)
        }
        if(gameData.getInteger(current + " from") == 6){
            worldCam.position.x = -1725f;
            worldCam.position.z = -1904f;
//            (-693.1684,7.3171496,295.76648)
//            this is z(-2387.456,1500.0,-1303.105)
        }
        if(gameData.getInteger(current + " from") == 7){
            worldCam.position.x = -1631f;
            worldCam.position.z = -1904f;
//            (62.54196,6.64147,-306.0129)
//            this is z(-1631.7456,1500.0,-1904.8844)
        }

        if(gameData.getInteger(current + " from") == 8){
            worldCam.position.x = -1538f;
            worldCam.position.z = -844f;
//            (62.54196,6.64147,-306.0129)
//            this is z(-1631.7456,1500.0,-1904.8844)
        }

        worldCam.zoom = 0.08f;
//        worldCam.zoom = 1;
    }

    private void initModelBatch() {
        batch = new ModelBatch();
    }

    private void addEntities() {
        loadEgypt();
        createPlayer(posX,10,posZ);
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

    private void addSystems(Controller controller, ActualGameButtons actualGameButtons, ModelComponent modelComponent) {
        engine = new Engine();
//        engine.addSystem(new RenderSystem(batch, environment, worldCam, modelComponent));
        engine.addSystem(bulletSystem = new BulletSystem());
//        engine.addSystem(playerSystem = new PlayerSystem(worldCam, controller, actualGameButtons, posX, posZ));
        engine.addSystem(new StatusSystem());

        if(debug) bulletSystem.collisionWorld.setDebugDrawer(this.debugDrawer);
    }

    public void render(float dt) {

        if(Gdx.input.isKeyPressed(Input.Keys.UP)){
            worldCam.position.x += 1;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            worldCam.position.z += 1;
        }

        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
            worldCam.position.x -= 1;

        }
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            worldCam.position.z -= 1;

        }

        if(Gdx.input.isKeyJustPressed(Input.Keys.N)){
            System.out.println("this is z" + worldCam.position);
        }

        if(Gdx.input.isKeyJustPressed(Input.Keys.R)){
            System.out.println(CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()));
        }

        if (CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()).z < -308) {
            goToWest = true;
        }
        if (CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()).x > 280) {
            goToNorth = true;
        }
        if (CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()).x < -697) {
            goToSouth = true;
        }

        if(CharacterEntityFactory.playerComponent.instance.transform.getTranslation(new Vector3()).z > 758) {
            goToEdom = true;
        }

        worldCam.update();
        characterAnimation.update(dt);
        renderWorld(dt);
    }

    private void renderWorld(float delta) {
        engine.update(delta);
        if(debug){
            debugDrawer.begin(worldCam);
            bulletSystem.collisionWorld.debugDrawWorld();
            debugDrawer.end();
        }
    }

    public void resize(int width, int height) {
        worldCam.viewportHeight = height;
        worldCam.viewportWidth = width;
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
    }

    public void remove(Entity entity) {
        engine.removeEntity(entity);
        bulletSystem.removeBody(entity);
    }
}
