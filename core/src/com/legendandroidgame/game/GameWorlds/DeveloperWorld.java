package com.legendandroidgame.game.GameWorlds;

import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.Entity;
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
import com.legendandroidgame.game.Buttons.ActualGameButtons;
import com.legendandroidgame.game.Buttons.Controller;


/**
 * Created by Patrick on 2/3/2018.
 */
public class DeveloperWorld {

    private ModelBatch batch;
    private Environment environment;
    private WorldCamera worldCam;
    private Engine engine;
    private BulletSystem bulletSystem;
    private Entity character;
    private Entity abramHouse;
    private PlayerSystem playerSystem;
    private NumbersGuySystem sampleAICharacter;
    private AnimationComponent characterAnimation, sampleAnimation;
    private ModelComponent modelComponent;

    public Vector3 expectedLocation, curLocation;

    float posX = 0, posZ = 0;

    private DebugDrawer debugDrawer;
    private static final boolean debug = false;

    public DeveloperWorld(Controller controller, ActualGameButtons actualGameButtons) {
        Bullet.init();

        expectedLocation = new Vector3();
        curLocation = new Vector3();

        initCamera();
        initModelBatch();
        initEnvironment();
        setDebug();
        abramHouse = MapEntityFactory.loadAbrahamHouse();
        modelComponent = abramHouse.getComponent(ModelComponent.class);
        addSystems(controller, actualGameButtons, modelComponent);
        addEntities();
    }

    public void initCamera(){
        worldCam = new WorldCamera();
        worldCam.worldCam.position.x = -1690.5f;
        worldCam.worldCam.position.z = -1589.2f;
    }

    public void initModelBatch(){
        batch = new ModelBatch();
    }

    public void initEnvironment(){
        environment = new Environment();
    }

    private void setDebug(){
        if(debug){
            debugDrawer = new DebugDrawer();
            debugDrawer.setDebugMode(btIDebugDraw.DebugDrawModes.DBG_MAX_DEBUG_DRAW_MODE);
        }
    }

    public void addSystems(Controller controller, ActualGameButtons actualGameButtons, ModelComponent modelComponent){
        engine = new Engine();
        engine.addSystem(new RenderSystem(batch, environment, worldCam.worldCam, modelComponent));
        engine.addSystem(bulletSystem = new BulletSystem());
        engine.addSystem(playerSystem = new PlayerSystem(worldCam.worldCam, controller, actualGameButtons, posX, posZ, new Vector2()));
        engine.addSystem(sampleAICharacter = new NumbersGuySystem(bulletSystem));
        engine.addSystem(new StatusSystem());

        if(debug) bulletSystem.collisionWorld.setDebugDrawer(this.debugDrawer);
    }

    public void addEntities(){
        engine.addEntity(abramHouse);
        character = CharacterEntityFactory.createCharacter(bulletSystem, posX,10,posZ);
        engine.addEntity(character);
        characterAnimation = new AnimationComponent(CharacterEntityFactory.playerComponent.instance);
        playerSystem.playerAnimation = characterAnimation;
    }

    public void render(float delta){

        expectedLocation = sampleAICharacter.expectedDistance;
        curLocation = sampleAICharacter.modelComponent.instance.transform.getTranslation(new Vector3());

        worldCam.update();
        characterAnimation.update(delta);
        renderWorld(delta);
    }

    private void renderWorld(float delta) {
        engine.update(delta);
        if(debug){
            debugDrawer.begin(worldCam.worldCam);
            bulletSystem.collisionWorld.debugDrawWorld();
            debugDrawer.end();
        }
    }

    public void dispose(){
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

    public void resize(int width, int height) {
        worldCam.worldCam.viewportHeight = height;
        worldCam.worldCam.viewportWidth = width;
    }

    public void remove(Entity entity) {
        engine.removeEntity(entity);
        bulletSystem.removeBody(entity);
    }
}
