package com.legendandroidgame.game.BulletSystem;

import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.EntitySystem;
import com.badlogic.ashley.core.Family;
import com.badlogic.ashley.utils.ImmutableArray;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.Ray;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Timer;
import com.legendandroidgame.game.AddonTools.Environment;
import com.legendandroidgame.game.BulletComponent.CharacterComponent;
import com.legendandroidgame.game.BulletComponent.ModelComponent;
import com.legendandroidgame.game.BulletComponent.PlayerComponent;
import com.legendandroidgame.game.DirectionalShadowLight;

import static com.legendandroidgame.game.LegendAndroidGame.gameCam;
import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 9/4/2017.
 */
public class RenderSystem extends EntitySystem {
    private ImmutableArray<Entity> entities;
    private ModelBatch batch;
    private Environment environment;

    private DirectionalShadowLight shadowLight;
    private OrthographicCamera orthographicCamera;
    private ModelComponent mod;
    private Vector3 position;
    private ModelComponent modelComponent;

    private AssetManager assetManager;
    private Model tiles;
    private ModelInstance tilesIns;
    private Array<ModelInstance> instances = new Array<ModelInstance>();
    private String current = gameData.getString("current");

    private boolean isTimerOn = false;

    public RenderSystem(ModelBatch batch, Environment environment, OrthographicCamera camera, ModelComponent model) {
        this.batch = batch;
        this.environment = environment;
        this.orthographicCamera = camera;
        this.modelComponent = model;
        position = new Vector3();
//        System.out.println(model);

//        orthographicCamera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
//        orthographicCamera.setToOrtho(false,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
//        orthographicCamera.position.set(0f,1500f,0f);
//        orthographicCamera.lookAt(956,657,899);
//        worldCam.lookAt(0,0,0);
//        orthographicCamera.near = 1f;
//        orthographicCamera.far = 5000f;
//        orthographicCamera.position.x = -1700.5f;
//        orthographicCamera.position.z = -1599.2f;
//        orthographicCamera.zoom = 0.5f;
//        shadowLight = new DirectionalShadowLight(1024 * 5, 1024 * 5,
//                200f, 200f, 1f, 300f);
//        shadowLight.set(0.8f, 0.8f, 0.8f, 0, -0.1f, 0.1f);
//        environment.add(shadowLight);
//        environment.shadowMap = shadowLight;

        assetManager = new AssetManager();
        assetManager.load("blender/boxPop.g3dj", Model.class);
        assetManager.load("blender/arrow.g3dj", Model.class);

        assetManager.finishLoading();

        tiles = assetManager.get("blender/boxPop.g3dj", Model.class);

        for (float x = -1000f; x <= 1000f; x += 5f) {
            for (float z = -1000f; z <= 1000f; z += 5f) {
                tilesIns = new ModelInstance(tiles);
                tilesIns.transform.setToTranslation(x, -10, z);
//                instances.add(tilesIns);
            }
        }

    }
    public void addedToEngine(Engine e) {
        entities = e.getEntitiesFor(Family.all(ModelComponent.class).get());
    }

    private boolean isVisible(OrthographicCamera cam, final ModelInstance instance) {

        return cam.frustum.pointInFrustum(instance.transform.getTranslation(position));
    }


    public void update(float delta) {

        if(gameData.getInteger(current + " missionId") == 1){
            if(gameData.getInteger(current + " currentLocation") == 3){
//                instances.add(arrowIns);
            }
        }

        batch.begin(orthographicCamera);
//        drawShadows(delta);
//        drawModels();
//        int size = entities.size();

        for (ModelInstance instance : instances) {
            if (isVisible(orthographicCamera, instance)) {
//                batch.render(instance, environment.environment);
            }
        }

        for (int i = 0; i < entities.size(); i++) {
            mod = entities.get(i).getComponent(ModelComponent.class);
            if (isVisible(orthographicCamera, mod.instance)){
//                batch.render(mod.instance, environment.environment);
            }
        }


        if (modelComponent.instance != null){
//            batch.render(modelComponent.instance, environment.environment);
        }
//        System.out.println(modelComponent);
//        actionPlayer.getComponent(AnimationComponent.class).update(delta);
        batch.end();
//        System.out.println(Gdx.graphics.getFramesPerSecond());

    }

    private void drawShadows(float delta) {
        shadowLight.begin(Vector3.Zero, orthographicCamera.direction);

        for (int x = 0; x < entities.size(); x++) {
            if (entities.get(x).getComponent(PlayerComponent.class)
                    != null || entities.get(x).getComponent(PlayerComponent.class) != null) {
                ModelComponent mod =entities.get(x).getComponent(ModelComponent.class);
                batch.render(mod.instance);
            }
//            if (entities.get(x).getComponent
//                    (AnimationComponent.class) != null & Settings.Paused
//                    == false)
//                entities.get(x).getComponent
//                        (AnimationComponent.class).update(delta);
        }

//        shadowLight.end();
    }

    private void drawModels() {
//        batch.begin(orthographicCamera);
        for (int i = 0; i < entities.size(); i++) {
            if (entities.get(i).getComponent(CharacterComponent.class) ==
                    null) {
                ModelComponent mod = entities.get(i).getComponent
                        (ModelComponent.class);
                batch.render(mod.instance, environment.environment);
            }
        }
//        batch.end();

    }


}
