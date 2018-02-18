package com.legendandroidgame.game.BulletTools;

import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.loaders.ModelLoader;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.loader.G3dModelLoader;
import com.badlogic.gdx.graphics.g3d.model.Node;
import com.badlogic.gdx.graphics.g3d.model.data.ModelData;
import com.badlogic.gdx.graphics.g3d.utils.TextureProvider;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.Bullet;
import com.badlogic.gdx.physics.bullet.collision.btCollisionShape;
import com.badlogic.gdx.physics.bullet.dynamics.btRigidBody;
import com.badlogic.gdx.utils.JsonReader;
import com.legendandroidgame.game.BulletComponent.BulletComponent;
import com.legendandroidgame.game.BulletComponent.ModelComponent;

/**
 * Created by Patrick on 9/27/2017.
 */
public class MapEntityFactory {

    public static ModelComponent abrahamHouse;
    public static ModelComponent mosesHouse;
    public static ModelComponent pharaohHouse;
    public static ModelComponent maze;

    public static ModelComponent haran;
    public static ModelComponent bethel;
    public static ModelComponent egyptEast;
    public static ModelComponent egyptWest;
    public static ModelComponent egyptSouth;
    public static ModelComponent egyptNorth;
    public static ModelComponent landOfMoriah;
    public static ModelComponent beersheba;
    public static ModelComponent caveAtMachpelah;
    public static ModelComponent mtSinai;
    public static ModelComponent landOfEdom;
    public static ModelComponent landOfMoab;
    public static ModelComponent jordan;
    public static ModelComponent gilgal;
    public static ModelComponent jericho;
    public static ModelComponent shechem;
    public static ModelComponent beerlahairoi;


    public static Entity loadAbrahamHouse(){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/abrahamshouse.g3dj"));
        Model model = new Model(modelData, new
                TextureProvider.FileTextureProvider());
        model.calculateTransforms();

        abrahamHouse = new ModelComponent(model, 0,0,0);
        entity.add(abrahamHouse);


        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(abrahamHouse.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;

    }

    public static Entity loadMosesHouse(){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/MosesHouse.g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        for (Node node : model.nodes) node.rotation.set(new Vector3(0,90,0), 180);

        model.calculateTransforms();

        mosesHouse = new ModelComponent(model, 0,0,0);
        entity.add(mosesHouse);


        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(mosesHouse.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;

    }

    public static Entity loadPharaohHouse(){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/PharaohsHouse.g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        for (Node node : model.nodes) node.rotation.set(new Vector3(0,90,0), 180);

        model.calculateTransforms();

        pharaohHouse = new ModelComponent(model, 0,0,0);
        entity.add(pharaohHouse);


        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(pharaohHouse.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;

    }

    public static Entity loadMaze(){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/maze.g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        for (Node node : model.nodes) node.rotation.set(new Vector3(0,90,0), 180);

        model.calculateTransforms();

        maze = new ModelComponent(model, 0,0,0);
        entity.add(maze);

        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(maze.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;

    }


    public static Entity loadHaran(){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/Haran.g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        for (Node node : model.nodes) node.rotation.set(new Vector3(0,90,0), 180);
        model.calculateTransforms();

        haran = new ModelComponent(model,0,0,0);
        entity.add(haran);

        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(haran.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;

    }


    public static Entity loadBethel(){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/Bethel.g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        for (Node node : model.nodes) node.rotation.set(new Vector3(0,90,0), 180);
        model.calculateTransforms();

        bethel = new ModelComponent(model,0,0,0 );
        entity.add(bethel);

        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(bethel.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;

    }


    public static Entity loadEgyptEast(){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/Egypt_EastFinal.g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        for (Node node : model.nodes) node.rotation.set(new Vector3(0,90,0), 180);
        model.calculateTransforms();

        egyptEast = new ModelComponent(model,0,0,0 );
        entity.add(egyptEast);

        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(egyptEast.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;

    }

    public static Entity loadEgyptWest(){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/Egypt_West.g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        for (Node node : model.nodes) node.rotation.set(new Vector3(0,90,0), 180);
        model.calculateTransforms();

        egyptWest = new ModelComponent(model,0,0,0 );
        entity.add(egyptWest);

        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(egyptWest.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;

    }

    public static Entity loadEgyptNorth(){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/Egypt_North.g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        for (Node node : model.nodes) node.rotation.set(new Vector3(0,90,0), 180);
        model.calculateTransforms();

        egyptNorth = new ModelComponent(model,0,0,0 );
        entity.add(egyptNorth);

        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(egyptNorth.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;

    }

    public static Entity loadEgyptSouth(){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/Egypt_South.g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        for (Node node : model.nodes) node.rotation.set(new Vector3(0,90,0), 180);
        model.calculateTransforms();

        egyptSouth = new ModelComponent(model,0,0,0 );
        entity.add(egyptSouth);

        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(egyptSouth.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;

    }


    public static Entity loadLandOfMoriah(){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/Land_of_Moriah.g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        model.calculateTransforms();

        landOfMoriah = new ModelComponent(model,0,0,0 );
        entity.add(landOfMoriah);

        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(landOfMoriah.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;

    }

    public static Entity loadBeersheba(){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/Beersheba.g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        model.calculateTransforms();

        beersheba = new ModelComponent(model,0,0,0);
        entity.add(beersheba);

        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(beersheba.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;

    }


    public static Entity loadCaveAtMachpelah(){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/CaveatMachpelah.g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        for (Node node : model.nodes) node.rotation.set(new Vector3(0,90,0), 180);
        model.calculateTransforms();

        caveAtMachpelah = new ModelComponent(model,0,0,0);
        entity.add(caveAtMachpelah);

        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(caveAtMachpelah.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;

    }


    public static Entity loadMtSinai(){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/Sinai.g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        model.calculateTransforms();

        mtSinai = new ModelComponent(model, 0,0,0 );
        entity.add(mtSinai);

        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(mtSinai.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;

    }



    public static Entity loadLandOfEdom (){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/Land_of_Edom.g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        for (Node node : model.nodes) node.rotation.set(new Vector3(0,90,0), 180);
        model.calculateTransforms();

        landOfEdom = new ModelComponent(model,0,0,0 );
        entity.add(landOfEdom);

        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(landOfEdom.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;

    }


    public static Entity loadLandOfMoab(){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/LandofMoab.g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        model.calculateTransforms();

        landOfMoab = new ModelComponent(model, 0,0,0 );
        entity.add(landOfMoab);

        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(landOfMoab.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;

    }


    public static Entity loadJordan(){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/Jordan.g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        for (Node node : model.nodes) node.rotation.set(new Vector3(0,90,0), 180);
        model.calculateTransforms();

        jordan = new ModelComponent(model, 0,0,0 );
        entity.add(jordan);

        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(jordan.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;

    }


    public static Entity loadGilgal(){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/Gibeathhaaraloth(Gilgal).g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        model.calculateTransforms();

        gilgal = new ModelComponent(model,0,0,0 );
        entity.add(gilgal);

        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(gilgal.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;

    }


    public static Entity loadJericho(){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/Jericho.g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        model.calculateTransforms();

        jericho = new ModelComponent(model, 0,0,0 );
        entity.add(jericho);

        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(jericho.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;

    }

    public static Entity loadShechem(){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/Shechem.g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        for (Node node : model.nodes) node.rotation.set(new Vector3(0,90,0), 180);
        model.calculateTransforms();

        shechem = new ModelComponent(model, 0,0,0 );
        entity.add(shechem);

        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(shechem.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;
    }

    public static Entity loadBeerlahairoi(){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/beerlahairoi.g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        model.calculateTransforms();

        beerlahairoi = new ModelComponent(model, 0,0,0 );
        entity.add(beerlahairoi);

        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(beerlahairoi.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;
    }

}

