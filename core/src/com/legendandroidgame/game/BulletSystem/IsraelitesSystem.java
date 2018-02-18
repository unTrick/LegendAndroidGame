package com.legendandroidgame.game.BulletSystem;

import com.badlogic.ashley.core.*;
import com.badlogic.ashley.utils.ImmutableArray;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Timer;
import com.legendandroidgame.game.BulletComponent.*;
import com.legendandroidgame.game.BulletTools.CharacterEntityFactory;

import java.util.Random;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;


/**
 * Created by Patrick on 1/21/2018.
 */
public class IsraelitesSystem extends EntitySystem implements EntityListener {

    private ImmutableArray<Entity> entities;
    private Entity player;
    private Engine engine;
    public AnimationComponent playerAnimation1, playerAnimation2, playerAnimation3, playerAnimation4,
            playerAnimation5, playerAnimation6, playerAnimation7, playerAnimation8, playerAnimation9, playerAnimation10;
    private Entity israelites1, israelites2, israelites3, israelites4, israelites5,
            israelites6, israelites7, israelites8, israelites9, israelites10;
    private BulletSystem bulletSystem;
    private ModelComponent modelComponent1, modelComponent2, modelComponent3, modelComponent4, modelComponent5,
            modelComponent6, modelComponent7, modelComponent8, modelComponent9, modelComponent10;
    private IsraelitesCharacterComponent israelitesCharacterComponent1, israelitesCharacterComponent2, israelitesCharacterComponent3,
            israelitesCharacterComponent4, israelitesCharacterComponent5, israelitesCharacterComponent6, israelitesCharacterComponent7,
            israelitesCharacterComponent8, israelitesCharacterComponent9, israelitesCharacterComponent10;

    private String current = gameData.getString("current");

    private boolean timerIsOn1 = false, left1 = false ,right1 = false,up1 = false,down1 = false, startWalking1 = false, skip1 = false;
    private boolean timerIsOn2 = false, left2 = false ,right2 = false,up2 = false,down2 = false, startWalking2 = false, skip2 = false;
    private boolean timerIsOn3 = false, left3 = false ,right3 = false,up3 = false,down3 = false, startWalking3 = false, skip3 = false;
    private boolean timerIsOn4 = false, left4 = false ,right4 = false,up4 = false,down4 = false, startWalking4 = false, skip4 = false;
    private boolean timerIsOn5 = false, left5 = false ,right5 = false,up5 = false,down5 = false, startWalking5 = false, skip5 = false;
    private boolean timerIsOn6 = false, left6 = false ,right6 = false,up6 = false,down6 = false, startWalking6 = false, skip6 = false;
    private boolean timerIsOn7 = false, left7 = false ,right7 = false,up7 = false,down7 = false, startWalking7 = false, skip7 = false;
    private boolean timerIsOn8 = false, left8 = false ,right8 = false,up8 = false,down8 = false, startWalking8 = false, skip8 = false;
    private boolean timerIsOn9 = false, left9 = false ,right9 = false,up9 = false,down9 = false, startWalking9 = false, skip9 = false;
    private boolean timerIsOn10 = false, left10 = false ,right10 = false,up10 = false,down10 = false, startWalking10 = false, skip10 = false;

    private float transX1, transY1, transZ1, rotateX1, rotateY1, rotateZ1, angle1, expectX1, expectZ1;
    private float transX2, transY2, transZ2, rotateX2, rotateY2, rotateZ2, angle2, expectX2, expectZ2;
    private float transX3, transY3, transZ3, rotateX3, rotateY3, rotateZ3, angle3, expectX3, expectZ3;
    private float transX4, transY4, transZ4, rotateX4, rotateY4, rotateZ4, angle4, expectX4, expectZ4;
    private float transX5, transY5, transZ5, rotateX5, rotateY5, rotateZ5, angle5, expectX5, expectZ5;
    private float transX6, transY6, transZ6, rotateX6, rotateY6, rotateZ6, angle6, expectX6, expectZ6;
    private float transX7, transY7, transZ7, rotateX7, rotateY7, rotateZ7, angle7, expectX7, expectZ7;
    private float transX8, transY8, transZ8, rotateX8, rotateY8, rotateZ8, angle8, expectX8, expectZ8;
    private float transX9, transY9, transZ9, rotateX9, rotateY9, rotateZ9, angle9, expectX9, expectZ9;
    private float transX10, transY10, transZ10, rotateX10, rotateY10, rotateZ10, angle10, expectX10, expectZ10;


    private Vector3 tmp1 = new Vector3();
    private Vector3 tmp2 = new Vector3();
    private Vector3 tmp3 = new Vector3();
    private Vector3 tmp4 = new Vector3();
    private Vector3 tmp5 = new Vector3();
    private Vector3 tmp6 = new Vector3();
    private Vector3 tmp7 = new Vector3();
    private Vector3 tmp8 = new Vector3();
    private Vector3 tmp9 = new Vector3();
    private Vector3 tmp10 = new Vector3();

    private Vector3 expectedDistance1 = new Vector3();
    private Vector3 expectedDistance2 = new Vector3();
    private Vector3 expectedDistance3 = new Vector3();
    private Vector3 expectedDistance4 = new Vector3();
    private Vector3 expectedDistance5 = new Vector3();
    private Vector3 expectedDistance6 = new Vector3();
    private Vector3 expectedDistance7 = new Vector3();
    private Vector3 expectedDistance8 = new Vector3();
    private Vector3 expectedDistance9 = new Vector3();
    private Vector3 expectedDistance10 = new Vector3();

    private Random rand1 = new Random();
    private Random rand2 = new Random();
    private Random rand3 = new Random();
    private Random rand4 = new Random();
    private Random rand5 = new Random();
    private Random rand6 = new Random();
    private Random rand7 = new Random();
    private Random rand8 = new Random();
    private Random rand9 = new Random();
    private Random rand10 = new Random();

    private int randomNumber1 = 0, randomNumber2 = 0, randomNumber3 = 0, randomNumber4 = 0, randomNumber5 = 0, randomNumber6 = 0,
            randomNumber7 = 0, randomNumber8 = 0, randomNumber9 = 0, randomNumber10 = 0;

    ComponentMapper<IsraelitesCharacterComponent> cm = ComponentMapper.getFor(IsraelitesCharacterComponent.class);

    public IsraelitesSystem(BulletSystem bulletSystem) {
        this.bulletSystem = bulletSystem;

        if (gameData.getInteger(current + " currentLocation") == 4){ // EAST
            israelites1 = CharacterEntityFactory.createIsraelites1(bulletSystem, -14.746119f,10,73.648415f);
            israelites2 = CharacterEntityFactory.createIsraelites2(bulletSystem, -38.088387f,10,73.64842f);
            israelites3 = CharacterEntityFactory.createIsraelites3(bulletSystem, 137.35437f,10,46.3052f);
            israelites4 = CharacterEntityFactory.createIsraelites4(bulletSystem, 116.61874f,10,46.3052f);
            israelites5 = CharacterEntityFactory.createIsraelites5(bulletSystem, 52.518867f,10,-118.12671f);
            israelites6 = CharacterEntityFactory.createIsraelites6(bulletSystem, 34.482513f,10,-118.12671f);
            israelites7 = CharacterEntityFactory.createIsraelites7(bulletSystem, -593.8565f,10,515.32404f);
            israelites8 = CharacterEntityFactory.createIsraelites8(bulletSystem, -609.8268f,10,515.32404f);
            israelites9 = CharacterEntityFactory.createIsraelites9(bulletSystem, -583.03955f,10,661.2908f);
            israelites10 = CharacterEntityFactory.createIsraelites10(bulletSystem, -612.166f,10,661.2908f);
        }

        if (gameData.getInteger(current + " currentLocation") == 5){ // NORTH
            israelites1 = CharacterEntityFactory.createIsraelites1(bulletSystem, -201.62808f,5,-175.05746f);
            israelites2 = CharacterEntityFactory.createIsraelites2(bulletSystem, -81.16305f,5,-126.230515f);
            israelites3 = CharacterEntityFactory.createIsraelites3(bulletSystem, -106.40015f,5,-126.21083f);
            israelites4 = CharacterEntityFactory.createIsraelites4(bulletSystem, -72.57149f,5,-160.46767f);
            israelites5 = CharacterEntityFactory.createIsraelites5(bulletSystem, -2.835537f,5,-185.35071f);
            israelites6 = CharacterEntityFactory.createIsraelites6(bulletSystem, 4.2161703f,5,-152.00662f);
            israelites7 = CharacterEntityFactory.createIsraelites7(bulletSystem, -118.79758f,5,-169.31825f);
            israelites8 = CharacterEntityFactory.createIsraelites8(bulletSystem, -138.11804f,5,-147.86076f);
            israelites9 = CharacterEntityFactory.createIsraelites9(bulletSystem, 138.8323f,5,96.09549f);
            israelites10 = CharacterEntityFactory.createIsraelites10(bulletSystem, 112.568054f,5,93.414696f);
        }

        if (gameData.getInteger(current + " currentLocation") == 6){ // SOUTH
            israelites1 = CharacterEntityFactory.createIsraelites1(bulletSystem, -35.83347f,5,-21.07899f);
            israelites2 = CharacterEntityFactory.createIsraelites2(bulletSystem, -6.7293367f,5,-29.496891f);
            israelites3 = CharacterEntityFactory.createIsraelites3(bulletSystem, -67.671616f,5,-29.496891f);
            israelites4 = CharacterEntityFactory.createIsraelites4(bulletSystem, 20.229404f,5,-75.26405f);
            israelites5 = CharacterEntityFactory.createIsraelites5(bulletSystem, -13.095523f,5,-91.40549f);
            israelites6 = CharacterEntityFactory.createIsraelites6(bulletSystem, -39.99694f,5,-91.40549f);
            israelites7 = CharacterEntityFactory.createIsraelites7(bulletSystem, -73.096054f,5,-69.96461f);
            israelites8 = CharacterEntityFactory.createIsraelites8(bulletSystem, 107.50258f,5,-138.9793f);
            israelites9 = CharacterEntityFactory.createIsraelites9(bulletSystem, 36.024124f,5,-13.308756f);
            israelites10 = CharacterEntityFactory.createIsraelites10(bulletSystem, 73.55419f,5,-134.27017f);
        }

        if (gameData.getInteger(current + " currentLocation") == 7){ // WEST
            israelites1 = CharacterEntityFactory.createIsraelites1(bulletSystem, -101.38668f,7,-160.04893f);
            israelites2 = CharacterEntityFactory.createIsraelites2(bulletSystem, -67.38026f,6,-20.729492f);
            israelites3 = CharacterEntityFactory.createIsraelites3(bulletSystem, -22.612219f,6,38.26319f);
            israelites4 = CharacterEntityFactory.createIsraelites4(bulletSystem, 26.154413f,6,174.86859f);
            israelites5 = CharacterEntityFactory.createIsraelites5(bulletSystem, 214.95657f,6,175.87662f);
            israelites6 = CharacterEntityFactory.createIsraelites6(bulletSystem, 157.14236f,6,-128.64975f);
            israelites7 = CharacterEntityFactory.createIsraelites7(bulletSystem, 121.6457f,6,-128.64975f);
            israelites8 = CharacterEntityFactory.createIsraelites8(bulletSystem, 63.23465f,6,-86.648224f);
            israelites9 = CharacterEntityFactory.createIsraelites9(bulletSystem, 43.046364f,6,1.4122283f);
            israelites10 = CharacterEntityFactory.createIsraelites10(bulletSystem, -54.921555f,6,-130.0947f);
        }

        if (gameData.getInteger(current + " currentLocation") == 14){ // Sinai
            israelites1 = CharacterEntityFactory.createIsraelites1(bulletSystem, 27.32312f,9,144.07858f);
            israelites2 = CharacterEntityFactory.createIsraelites2(bulletSystem, -0.40524453f,9,144.07858f);
            israelites3 = CharacterEntityFactory.createIsraelites3(bulletSystem, -35.39197f,9,144.07858f);
            israelites4 = CharacterEntityFactory.createIsraelites4(bulletSystem, -20.222069f,9,117.05815f);
            israelites5 = CharacterEntityFactory.createIsraelites5(bulletSystem, 8.986702f,9,117.05815f);
            israelites6 = CharacterEntityFactory.createIsraelites6(bulletSystem, -106.95736f,8,-66.20291f);
            israelites7 = CharacterEntityFactory.createIsraelites7(bulletSystem, -106.95737f,9,-81.76835f);
            israelites8 = CharacterEntityFactory.createIsraelites8(bulletSystem, -81.91424f,8,-51.982903f);
            israelites9 = CharacterEntityFactory.createIsraelites9(bulletSystem, -77.23802f,9,-91.56343f);
            israelites10 = CharacterEntityFactory.createIsraelites10(bulletSystem, -56.2759f,8,-71.735115f);
        }

        if (gameData.getInteger(current + " currentLocation") == 9){ // Jordan
            israelites1 = CharacterEntityFactory.createIsraelites1(bulletSystem, 322.185f,10,-6.33556f);
            israelites2 = CharacterEntityFactory.createIsraelites2(bulletSystem, 355.34668f,9,-17.271439f);
            israelites3 = CharacterEntityFactory.createIsraelites3(bulletSystem, 355.34668f,9,-40.061806f);
            israelites4 = CharacterEntityFactory.createIsraelites4(bulletSystem, 322.42413f,8,-55.798546f);
            israelites5 = CharacterEntityFactory.createIsraelites5(bulletSystem, 348.10934f,8,67.313934f);
            israelites6 = CharacterEntityFactory.createIsraelites6(bulletSystem, 73.28812f,9,318.60718f);
            israelites7 = CharacterEntityFactory.createIsraelites7(bulletSystem, 47.232845f,8,318.60718f);
            israelites8 = CharacterEntityFactory.createIsraelites8(bulletSystem, 4.3229284f,8,314.1911f);
            israelites9 = CharacterEntityFactory.createIsraelites9(bulletSystem, 16.987387f,9,260.5102f);
            israelites10 = CharacterEntityFactory.createIsraelites10(bulletSystem, 57.706963f,9,252.00972f);
        }

        if (gameData.getInteger(current + " currentLocation") == 11){ // Shechem
            israelites1 = CharacterEntityFactory.createIsraelites1(bulletSystem, 12.176994f,8,21.162502f);
            israelites2 = CharacterEntityFactory.createIsraelites2(bulletSystem, -6.776054f,7,34.15395f);
            israelites3 = CharacterEntityFactory.createIsraelites3(bulletSystem, -29.987087f,8,113.745384f);
            israelites4 = CharacterEntityFactory.createIsraelites4(bulletSystem, -47.38255f,7,136.56651f);
            israelites5 = CharacterEntityFactory.createIsraelites5(bulletSystem, -59.569008f,8,170.66501f);
            israelites6 = CharacterEntityFactory.createIsraelites6(bulletSystem, -126.25552f,7,173.09233f);
            israelites7 = CharacterEntityFactory.createIsraelites7(bulletSystem, -194.70567f,7,140.54813f);
            israelites8 = CharacterEntityFactory.createIsraelites8(bulletSystem, -160.20512f,8,46.884094f);
            israelites9 = CharacterEntityFactory.createIsraelites9(bulletSystem, -193.47876f,8,91.3575f);
            israelites10 = CharacterEntityFactory.createIsraelites10(bulletSystem, -142.18423f,7,17.876696f);
        }
        if (gameData.getInteger(current + " currentLocation") == 3){ // Bethel
            israelites1 = CharacterEntityFactory.createIsraelites1(bulletSystem, 84.23551f, 6,76.66142f);
            israelites2 = CharacterEntityFactory.createIsraelites2(bulletSystem, 57.073933f,6,40.32486f);
            israelites3 = CharacterEntityFactory.createIsraelites3(bulletSystem, -13.3164425f,6,78.48619f);
            israelites4 = CharacterEntityFactory.createIsraelites4(bulletSystem, -89.5995f,6,71.7184f);
            israelites5 = CharacterEntityFactory.createIsraelites5(bulletSystem, -66.06005f,6,54.578396f);
            israelites6 = CharacterEntityFactory.createIsraelites6(bulletSystem, -67.69326f,6,-64.179504f);
            israelites7 = CharacterEntityFactory.createIsraelites7(bulletSystem, 47.15113f,6,-75.953384f);
            israelites8 = CharacterEntityFactory.createIsraelites8(bulletSystem, 90.30858f,6,-85.12809f);
            israelites9 = CharacterEntityFactory.createIsraelites9(bulletSystem, -9.6849375f,6,-61.848343f);
            israelites10 = CharacterEntityFactory.createIsraelites10(bulletSystem, -62.58716f,5,27.981432f);
        }
        if (gameData.getInteger(current + " currentLocation") == 8){ // Land of Moriah
            israelites1 = CharacterEntityFactory.createIsraelites1(bulletSystem, 21.598385f,7,-107.534904f);
            israelites2 = CharacterEntityFactory.createIsraelites2(bulletSystem, -166.71472f,7,147.70377f);
            israelites3 = CharacterEntityFactory.createIsraelites3(bulletSystem, -18.40033f,7,91.54741f);
            israelites4 = CharacterEntityFactory.createIsraelites4(bulletSystem, -8.843723f,7,131.54001f);
            israelites5 = CharacterEntityFactory.createIsraelites5(bulletSystem, 94.05694f,7,149.49007f);
            israelites6 = CharacterEntityFactory.createIsraelites6(bulletSystem, 147.61887f,7,92.65036f);
            israelites7 = CharacterEntityFactory.createIsraelites7(bulletSystem, 57.194656f,7,-58.61751f);
            israelites8 = CharacterEntityFactory.createIsraelites8(bulletSystem, 57.194656f,7,-26.722649f);
            israelites9 = CharacterEntityFactory.createIsraelites9(bulletSystem, 67.90971f,7,94.78648f);
            israelites10 = CharacterEntityFactory.createIsraelites10(bulletSystem, -62.58716f,7,27.981432f);
        }

        if (gameData.getInteger(current + " currentLocation") == 2){ // HARAN
            israelites1 = CharacterEntityFactory.createIsraelites1(bulletSystem, -8.247004f,7,-35.9064f);
            israelites2 = CharacterEntityFactory.createIsraelites2(bulletSystem, -44.786545f,7,-56.624752f);
            israelites3 = CharacterEntityFactory.createIsraelites3(bulletSystem, 68.80595f,7,-108.66547f);
            israelites4 = CharacterEntityFactory.createIsraelites4(bulletSystem, 48.220192f,7,-43.188274f);
            israelites5 = CharacterEntityFactory.createIsraelites5(bulletSystem, -77.5894f,7,-91.70316f);
            israelites6 = CharacterEntityFactory.createIsraelites6(bulletSystem, -41.929565f,7,3.6486053f);
            israelites7 = CharacterEntityFactory.createIsraelites7(bulletSystem, -0.3891179f,7,62.33569f);
            israelites8 = CharacterEntityFactory.createIsraelites8(bulletSystem, 77.26265f,7,55.4955f);
            israelites9 = CharacterEntityFactory.createIsraelites9(bulletSystem, 73.843025f,7,-24.225368f);
            israelites10 = CharacterEntityFactory.createIsraelites10(bulletSystem, -5.8213596f,7,-4.8830333f);
        }



        modelComponent1 = CharacterEntityFactory.israelitesComponent1;
        modelComponent2 = CharacterEntityFactory.israelitesComponent2;
        modelComponent3 = CharacterEntityFactory.israelitesComponent3;
        modelComponent4 = CharacterEntityFactory.israelitesComponent4;
        modelComponent5 = CharacterEntityFactory.israelitesComponent5;
        modelComponent6 = CharacterEntityFactory.israelitesComponent6;
        modelComponent7 = CharacterEntityFactory.israelitesComponent7;
        modelComponent8 = CharacterEntityFactory.israelitesComponent8;
        modelComponent9 = CharacterEntityFactory.israelitesComponent9;
        modelComponent10 = CharacterEntityFactory.israelitesComponent10;

        playerAnimation1 = new AnimationComponent(modelComponent1.instance);
        playerAnimation2 = new AnimationComponent(modelComponent2.instance);
        playerAnimation3 = new AnimationComponent(modelComponent3.instance);
        playerAnimation4 = new AnimationComponent(modelComponent4.instance);
        playerAnimation5 = new AnimationComponent(modelComponent5.instance);
        playerAnimation6 = new AnimationComponent(modelComponent6.instance);
        playerAnimation7 = new AnimationComponent(modelComponent7.instance);
        playerAnimation8 = new AnimationComponent(modelComponent8.instance);
        playerAnimation9 = new AnimationComponent(modelComponent9.instance);
        playerAnimation10 = new AnimationComponent(modelComponent10.instance);


        israelitesCharacterComponent1 = israelites1.getComponent(IsraelitesCharacterComponent.class);
        israelitesCharacterComponent2 = israelites2.getComponent(IsraelitesCharacterComponent.class);
        israelitesCharacterComponent3 = israelites3.getComponent(IsraelitesCharacterComponent.class);
        israelitesCharacterComponent4 = israelites4.getComponent(IsraelitesCharacterComponent.class);
        israelitesCharacterComponent5 = israelites5.getComponent(IsraelitesCharacterComponent.class);
        israelitesCharacterComponent6 = israelites6.getComponent(IsraelitesCharacterComponent.class);
        israelitesCharacterComponent7 = israelites7.getComponent(IsraelitesCharacterComponent.class);
        israelitesCharacterComponent8 = israelites8.getComponent(IsraelitesCharacterComponent.class);
        israelitesCharacterComponent9 = israelites9.getComponent(IsraelitesCharacterComponent.class);
        israelitesCharacterComponent10 = israelites10.getComponent(IsraelitesCharacterComponent.class);


    }
    @Override
    public void addedToEngine(Engine e) {
        entities = e.getEntitiesFor(Family.all(IsraelitesComponent.class, IsraelitesCharacterComponent.class).get());
        e.addEntityListener(Family.one(PlayerComponent.class).get(), this);
        this.engine = e;
    }
    public void update(float delta) {

        if (entities.size() < 10) {
            engine.addEntity(israelites1);
            engine.addEntity(israelites2);
            engine.addEntity(israelites3);
            engine.addEntity(israelites4);
            engine.addEntity(israelites5);
            engine.addEntity(israelites6);
            engine.addEntity(israelites7);
            engine.addEntity(israelites8);
            engine.addEntity(israelites9);
            engine.addEntity(israelites10);
        }

        setIsraelites1Update(delta);
        setIsraelites2Update(delta);
        setIsraelites3Update(delta);
        setIsraelites4Update(delta);
        setIsraelites5Update(delta);
        setIsraelites6Update(delta);
        setIsraelites7Update(delta);
        setIsraelites8Update(delta);
        setIsraelites9Update(delta);
        setIsraelites10Update(delta);

        System.out.println(randomNumber1 + "\n"
               + randomNumber2 + "\n"
                + randomNumber3 + "\n"
                + randomNumber4 + "\n"
                + randomNumber5 + "\n"
                + randomNumber6 + "\n"
                + randomNumber7 + "\n"
                + randomNumber8 + "\n"
                + randomNumber9 + "\n"
                + randomNumber10 + "\n"
        );
    }


    public void setIsraelites1Update(float delta){

        tmp1.set(0, 0, 0);
        israelitesCharacterComponent1.characterDirection.set(  0, 0, 0).rot(modelComponent1.instance.transform).nor();
        israelitesCharacterComponent1.walkDirection.set(0, 0, 0);

        if (!timerIsOn1){
            timerIsOn1 = true;
            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(40) - 20;
//                    System.out.println(randomNumber);
                    if(randomNumber >= 1){
                        israelites1.add(new IsraelitesComponent(IsraelitesComponent.STATE.WALKING));
                    }
                    else {
                        israelites1.add(new IsraelitesComponent(IsraelitesComponent.STATE.IDLE));
                        skip1 = false;
                    }
                    timerIsOn1 = false;
                }
            }, 3);
        }

        if(israelites1.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.IDLE)){
            rotateX1 = 0;
            rotateY1 = -45;
            rotateZ1 = 0;
            angle1 = 90;
            playerAnimation1.animate("Armature|ArmatureAction",-1,1);
        }
        else if(israelites1.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.WALKING)){
            playerAnimation1.animate("Armature|Walk",-1,1);

            if (!startWalking1){
                startWalking1 = true;
                Timer.schedule(new Timer.Task() {
                    @Override
                    public void run() {
                        randomNumber1 = rand1.nextInt(100);
                        startWalking1 = false;
                    }
                }, 5);
            }
//                        System.out.println(randomNumber);
            if(!skip1) {
                if (randomNumber1 > 50 && randomNumber1 <= 75) { // up
                    up1 = true;
                } else if (randomNumber1 > 75) { // down
                    down1 = true;
                } else if (randomNumber1 >= 25 && randomNumber1 <= 50) {// left
                    left1 = true;
                } else { // right
                    right1 = true;
                }
            }

            if(up1){ // up
                rotateX1 = 0;
                rotateY1 = 45;
                rotateZ1 = 0;
                angle1 = 90;
                israelitesCharacterComponent1.walkDirection.x = 0.5f;
//                expectedDistance.x = 0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                        "expected: " + expectedDistance.x);
            }
            else if (down1){ // down
                rotateX1 = 0;
                rotateY1 = -45;
                rotateZ1 = 0;
                angle1 = 90;
                israelitesCharacterComponent1.walkDirection.x = -0.5f;
//                expectedDistance.x = -0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                "expected: " + expectedDistance.x);
            }
            else if(left1) {// left
                rotateX1 = 0;
                rotateY1 = 90;
                rotateZ1 = 0;
                angle1 = 180;
                israelitesCharacterComponent1.walkDirection.z = -0.5f;
//                expectedDistance.z = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
            else if(right1) { // right
                rotateX1 = 0;
                rotateY1 = 0;
                rotateZ1 = 0;
                angle1 = 0;
                israelitesCharacterComponent1.walkDirection.z = 0.5f;
//                expectedDistance.z = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
        }


//        System.out.println(transZ);


        israelitesCharacterComponent1.walkDirection.add(tmp1);
        israelitesCharacterComponent1.walkDirection.scl(10f * delta);
        israelitesCharacterComponent1.characterController.setWalkDirection(israelitesCharacterComponent1.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        israelitesCharacterComponent1.israelitestObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX1 = translation.x;
        transY1 = translation.y;
        transZ1 = translation.z;

        modelComponent1.instance.transform.set(new Vector3(transX1,transY1,transZ1), new Quaternion( new Vector3(rotateX1, rotateY1, rotateZ1), angle1));

        modelComponent1.instance.calculateTransforms();

        if(israelites1.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.IDLE)){
            expectedDistance1.x = transX1;
            expectedDistance1.z = transZ1;
//            expectX = expectedDistance.x;
//            expectZ = expectedDistance.z;
        }
        else if (israelites1.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.WALKING)){
            expectedDistance1.z += israelitesCharacterComponent1.walkDirection.z;
            expectedDistance1.x += israelitesCharacterComponent1.walkDirection.x;
        }

        expectZ1 = transZ1 + israelitesCharacterComponent1.walkDirection.z;
        expectX1 = transX1 + israelitesCharacterComponent1.walkDirection.x;

        if(right1){
            if(Math.round(expectZ1) != Math.round(expectedDistance1.z)){
                expectedDistance1.z = expectZ1;
                skip1 = true;
                left1 = true;
                right1 = false;
            }
        }
        if(left1){
            if(Math.round(expectZ1) != Math.round(expectedDistance1.z)){
                expectedDistance1.x = expectX1;
                skip1 = true;
                up1 = true;
                left1 = false;
            }
        }
        if (up1){
            if(Math.round(expectX1) != Math.round(expectedDistance1.x)){
                expectedDistance1.x = expectX1;
                skip1 = true;
                down1 = true;
                up1 = false;
            }
        }
        if(down1){
            if(Math.round(expectX1) != Math.round(expectedDistance1.x)){
                expectedDistance1.z = expectZ1;
                skip1 = true;
                right1 = true;
                down1 = false;
            }
        }

//        System.out.println(skip);


        playerAnimation1.update(delta);
    }

    public void setIsraelites2Update(float delta){

        tmp2.set(0, 0, 0);
        israelitesCharacterComponent2.characterDirection.set(  0, 0, 0).rot(modelComponent2.instance.transform).nor();
        israelitesCharacterComponent2.walkDirection.set(0, 0, 0);

        if (!timerIsOn2){
            timerIsOn2 = true;
            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(40) - 20;
//                    System.out.println(randomNumber);
                    if(randomNumber >= 1){
                        israelites2.add(new IsraelitesComponent(IsraelitesComponent.STATE.WALKING));
                    }
                    else {
                        israelites2.add(new IsraelitesComponent(IsraelitesComponent.STATE.IDLE));
                        skip2 = false;
                    }
                    timerIsOn2 = false;
                }
            }, 3);
        }

        if(israelites2.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.IDLE)){
            rotateX2 = 0;
            rotateY2 = -45;
            rotateZ2 = 0;
            angle2 = 90;
            playerAnimation2.animate("Armature|ArmatureAction",-1,1);
        }
        else if(israelites2.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.WALKING)){
            playerAnimation2.animate("Armature|Walk",-1,1);

            if (!startWalking2){
                startWalking2 = true;
                Timer.schedule(new Timer.Task() {
                    @Override
                    public void run() {
                        randomNumber2 = rand2.nextInt(100);
                        startWalking2 = false;
                    }
                }, 5);
            }
//                        System.out.println(randomNumber);
            if(!skip2) {
                if (randomNumber2 > 50 && randomNumber2 <= 75) { // up
                    up2 = true;
                } else if (randomNumber2 > 75) { // down
                    down2 = true;
                } else if (randomNumber2 >= 25 && randomNumber2 <= 50) {// left
                    left2 = true;
                } else { // right
                    right2 = true;
                }
            }

            if(up2){ // up
                rotateX2 = 0;
                rotateY2 = 45;
                rotateZ2 = 0;
                angle2 = 90;
                israelitesCharacterComponent2.walkDirection.x = 0.5f;
//                expectedDistance.x = 0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                        "expected: " + expectedDistance.x);
            }
            else if (down2){ // down
                rotateX2 = 0;
                rotateY2 = -45;
                rotateZ2 = 0;
                angle2 = 90;
                israelitesCharacterComponent2.walkDirection.x = -0.5f;
//                expectedDistance.x = -0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                "expected: " + expectedDistance.x);
            }
            else if(left2) {// left
                rotateX2 = 0;
                rotateY2 = 90;
                rotateZ2 = 0;
                angle2 = 180;
                israelitesCharacterComponent2.walkDirection.z = -0.5f;
//                expectedDistance.z = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
            else if(right2) { // right
                rotateX2 = 0;
                rotateY2 = 0;
                rotateZ2 = 0;
                angle2 = 0;
                israelitesCharacterComponent2.walkDirection.z = 0.5f;
//                expectedDistance.z = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
        }

//        System.out.println(transZ);


        israelitesCharacterComponent2.walkDirection.add(tmp2);
        israelitesCharacterComponent2.walkDirection.scl(10f * delta);
        israelitesCharacterComponent2.characterController.setWalkDirection(israelitesCharacterComponent2.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        israelitesCharacterComponent2.israelitestObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX2 = translation.x;
        transY2 = translation.y;
        transZ2 = translation.z;

        modelComponent2.instance.transform.set(new Vector3(transX2,transY2,transZ2), new Quaternion( new Vector3(rotateX2, rotateY2, rotateZ2), angle2));

        modelComponent2.instance.calculateTransforms();

        if(israelites2.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.IDLE)){
            expectedDistance2.x = transX2;
            expectedDistance2.z = transZ2;
//            expectX = expectedDistance.x;
//            expectZ = expectedDistance.z;
        }
        else if (israelites2.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.WALKING)){
            expectedDistance2.z += israelitesCharacterComponent2.walkDirection.z;
            expectedDistance2.x += israelitesCharacterComponent2.walkDirection.x;
        }

        expectZ2 = transZ2 + israelitesCharacterComponent2.walkDirection.z;
        expectX2 = transX2 + israelitesCharacterComponent2.walkDirection.x;

        if(right2){
            if(Math.round(expectZ2) != Math.round(expectedDistance2.z)){
                expectedDistance2.z = expectZ2;
                skip2 = true;
                left2 = true;
                right2 = false;
            }
        }
        if(left2){
            if(Math.round(expectZ2) != Math.round(expectedDistance2.z)){
                expectedDistance2.x = expectX2;
                skip2 = true;
                up2 = true;
                left2 = false;
            }
        }
        if (up2){
            if(Math.round(expectX2) != Math.round(expectedDistance2.x)){
                expectedDistance2.x = expectX2;
                skip2 = true;
                down2 = true;
                up2 = false;
            }
        }
        if(down2){
            if(Math.round(expectX2) != Math.round(expectedDistance2.x)){
                expectedDistance2.z = expectZ2;
                skip2 = true;
                right2 = true;
                down2 = false;
            }
        }

//        System.out.println(skip);


        playerAnimation2.update(delta);
    }

    public void setIsraelites3Update(float delta){

        tmp3.set(0, 0, 0);
        israelitesCharacterComponent3.characterDirection.set(  0, 0, 0).rot(modelComponent3.instance.transform).nor();
        israelitesCharacterComponent3.walkDirection.set(0, 0, 0);

        if (!timerIsOn3){
            timerIsOn3 = true;
            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(40) - 20;
//                    System.out.println(randomNumber);
                    if(randomNumber >= 1){
                        israelites3.add(new IsraelitesComponent(IsraelitesComponent.STATE.WALKING));
                    }
                    else {
                        israelites3.add(new IsraelitesComponent(IsraelitesComponent.STATE.IDLE));
                        skip3 = false;
                    }
                    timerIsOn3 = false;
                }
            }, 3);
        }

        if(israelites3.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.IDLE)){
            rotateX3 = 0;
            rotateY3 = -45;
            rotateZ3 = 0;
            angle3 = 90;
            playerAnimation3.animate("Armature|ArmatureAction",-1,1);
        }
        else if(israelites3.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.WALKING)){
            playerAnimation3.animate("Armature|Walk",-1,1);

            if (!startWalking3){
                startWalking3 = true;
                Timer.schedule(new Timer.Task() {
                    @Override
                    public void run() {
                        randomNumber3 = rand3.nextInt(100);
                        startWalking3 = false;
                    }
                }, 5);
            }
//                        System.out.println(randomNumber);
            if(!skip3) {
                if (randomNumber3 > 50 && randomNumber3 <= 75) { // up
                    up3 = true;
                } else if (randomNumber3 > 75) { // down
                    down3 = true;
                } else if (randomNumber3 >= 25 && randomNumber3 <= 50) {// left
                    left3 = true;
                } else { // right
                    right3 = true;
                }
            }

            if(up3){ // up
                rotateX3 = 0;
                rotateY3 = 45;
                rotateZ3 = 0;
                angle3 = 90;
                israelitesCharacterComponent3.walkDirection.x = 0.5f;
//                expectedDistance.x = 0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                        "expected: " + expectedDistance.x);
            }
            else if (down3){ // down
                rotateX3 = 0;
                rotateY3 = -45;
                rotateZ3 = 0;
                angle3 = 90;
                israelitesCharacterComponent3.walkDirection.x = -0.5f;
//                expectedDistance.x = -0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                "expected: " + expectedDistance.x);
            }
            else if(left3) {// left
                rotateX3 = 0;
                rotateY3 = 90;
                rotateZ3 = 0;
                angle3 = 180;
                israelitesCharacterComponent3.walkDirection.z = -0.5f;
//                expectedDistance.z = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
            else if(right3) { // right
                rotateX3 = 0;
                rotateY3 = 0;
                rotateZ3 = 0;
                angle3 = 0;
                israelitesCharacterComponent3.walkDirection.z = 0.5f;
//                expectedDistance.z = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
        }

//        System.out.println(transZ);


        israelitesCharacterComponent3.walkDirection.add(tmp3);
        israelitesCharacterComponent3.walkDirection.scl(10f * delta);
        israelitesCharacterComponent3.characterController.setWalkDirection(israelitesCharacterComponent3.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        israelitesCharacterComponent3.israelitestObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX3 = translation.x;
        transY3 = translation.y;
        transZ3 = translation.z;

        modelComponent3.instance.transform.set(new Vector3(transX3,transY3,transZ3), new Quaternion( new Vector3(rotateX3, rotateY3, rotateZ3), angle3));

        modelComponent3.instance.calculateTransforms();

        if(israelites3.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.IDLE)){
            expectedDistance3.x = transX3;
            expectedDistance3.z = transZ3;
//            expectX = expectedDistance.x;
//            expectZ = expectedDistance.z;
        }
        else if (israelites3.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.WALKING)){
            expectedDistance3.z += israelitesCharacterComponent3.walkDirection.z;
            expectedDistance3.x += israelitesCharacterComponent3.walkDirection.x;
        }

        expectZ3 = transZ3 + israelitesCharacterComponent3.walkDirection.z;
        expectX3 = transX3 + israelitesCharacterComponent3.walkDirection.x;

        if(right3){
            if(Math.round(expectZ3) != Math.round(expectedDistance3.z)){
                expectedDistance3.z = expectZ3;
                skip3 = true;
                left3 = true;
                right3 = false;
            }
        }
        if(left3){
            if(Math.round(expectZ3) != Math.round(expectedDistance3.z)){
                expectedDistance3.x = expectX3;
                skip3 = true;
                up3 = true;
                left3 = false;
            }
        }
        if (up3){
            if(Math.round(expectX3) != Math.round(expectedDistance3.x)){
                expectedDistance3.x = expectX3;
                skip3 = true;
                down3 = true;
                up3 = false;
            }
        }
        if(down3){
            if(Math.round(expectX3) != Math.round(expectedDistance3.x)){
                expectedDistance3.z = expectZ3;
                skip3 = true;
                right3 = true;
                down3 = false;
            }
        }

//        System.out.println(skip);


        playerAnimation3.update(delta);
    }

    public void setIsraelites4Update(float delta){

        tmp4.set(0, 0, 0);
        israelitesCharacterComponent4.characterDirection.set(  0, 0, 0).rot(modelComponent4.instance.transform).nor();
        israelitesCharacterComponent4.walkDirection.set(0, 0, 0);

        if (!timerIsOn4){
            timerIsOn4 = true;
            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(40) - 20;
//                    System.out.println(randomNumber);
                    if(randomNumber >= 1){
                        israelites4.add(new IsraelitesComponent(IsraelitesComponent.STATE.WALKING));
                    }
                    else {
                        israelites4.add(new IsraelitesComponent(IsraelitesComponent.STATE.IDLE));
                        skip4 = false;
                    }
                    timerIsOn4 = false;
                }
            }, 3);
        }

        if(israelites4.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.IDLE)){
            rotateX4 = 0;
            rotateY4 = -45;
            rotateZ4 = 0;
            angle4 = 90;
            playerAnimation4.animate("Armature|ArmatureAction",-1,1);
        }
        else if(israelites4.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.WALKING)){
            playerAnimation4.animate("Armature|Walk",-1,1);

            if (!startWalking4){
                startWalking4 = true;
                Timer.schedule(new Timer.Task() {
                    @Override
                    public void run() {
                        randomNumber4 = rand4.nextInt(100);
                        startWalking4 = false;
                    }
                }, 5);
            }
//                        System.out.println(randomNumber);
            if(!skip4) {
                if (randomNumber4 > 50 && randomNumber4 <= 75) { // up
                    up4 = true;
                } else if (randomNumber4 > 75) { // down
                    down4 = true;
                } else if (randomNumber4 >= 25 && randomNumber4 <= 50) {// left
                    left4 = true;
                } else { // right
                    right4 = true;
                }
            }

            if(up4){ // up
                rotateX4 = 0;
                rotateY4 = 45;
                rotateZ4 = 0;
                angle4 = 90;
                israelitesCharacterComponent4.walkDirection.x = 0.5f;
//                expectedDistance.x = 0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                        "expected: " + expectedDistance.x);
            }
            else if (down4){ // down
                rotateX4 = 0;
                rotateY4 = -45;
                rotateZ4 = 0;
                angle4 = 90;
                israelitesCharacterComponent4.walkDirection.x = -0.5f;
//                expectedDistance.x = -0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                "expected: " + expectedDistance.x);
            }
            else if(left4) {// left
                rotateX4 = 0;
                rotateY4 = 90;
                rotateZ4 = 0;
                angle4 = 180;
                israelitesCharacterComponent4.walkDirection.z = -0.5f;
//                expectedDistance.z = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
            else if(right4) { // right
                rotateX4 = 0;
                rotateY4 = 0;
                rotateZ4 = 0;
                angle4 = 0;
                israelitesCharacterComponent4.walkDirection.z = 0.5f;
//                expectedDistance.z = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
        }

//        System.out.println(transZ);


        israelitesCharacterComponent4.walkDirection.add(tmp4);
        israelitesCharacterComponent4.walkDirection.scl(10f * delta);
        israelitesCharacterComponent4.characterController.setWalkDirection(israelitesCharacterComponent4.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        israelitesCharacterComponent4.israelitestObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX4 = translation.x;
        transY4 = translation.y;
        transZ4 = translation.z;

        modelComponent4.instance.transform.set(new Vector3(transX4,transY4,transZ4), new Quaternion( new Vector3(rotateX4, rotateY4, rotateZ4), angle4));

        modelComponent4.instance.calculateTransforms();

        if(israelites4.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.IDLE)){
            expectedDistance4.x = transX4;
            expectedDistance4.z = transZ4;
//            expectX = expectedDistance.x;
//            expectZ = expectedDistance.z;
        }
        else if (israelites4.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.WALKING)){
            expectedDistance4.z += israelitesCharacterComponent4.walkDirection.z;
            expectedDistance4.x += israelitesCharacterComponent4.walkDirection.x;
        }

        expectZ4 = transZ4 + israelitesCharacterComponent4.walkDirection.z;
        expectX4 = transX4 + israelitesCharacterComponent4.walkDirection.x;

        if(right4){
            if(Math.round(expectZ4) != Math.round(expectedDistance4.z)){
                expectedDistance4.z = expectZ4;
                skip4 = true;
                left4 = true;
                right4 = false;
            }
        }
        if(left4){
            if(Math.round(expectZ4) != Math.round(expectedDistance4.z)){
                expectedDistance4.x = expectX4;
                skip4 = true;
                up4 = true;
                left4 = false;
            }
        }
        if (up4){
            if(Math.round(expectX4) != Math.round(expectedDistance4.x)){
                expectedDistance4.x = expectX4;
                skip4 = true;
                down4 = true;
                up4 = false;
            }
        }
        if(down4){
            if(Math.round(expectX4) != Math.round(expectedDistance4.x)){
                expectedDistance4.z = expectZ4;
                skip4 = true;
                right4 = true;
                down4 = false;
            }
        }

//        System.out.println(skip);


        playerAnimation4.update(delta);
    }

    public void setIsraelites5Update(float delta){

        tmp5.set(0, 0, 0);
        israelitesCharacterComponent5.characterDirection.set(  0, 0, 0).rot(modelComponent5.instance.transform).nor();
        israelitesCharacterComponent5.walkDirection.set(0, 0, 0);

        if (!timerIsOn5){
            timerIsOn5 = true;
            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(40) - 20;
//                    System.out.println(randomNumber);
                    if(randomNumber >= 1){
                        israelites5.add(new IsraelitesComponent(IsraelitesComponent.STATE.WALKING));
                    }
                    else {
                        israelites5.add(new IsraelitesComponent(IsraelitesComponent.STATE.IDLE));
                        skip5 = false;
                    }
                    timerIsOn5 = false;
                }
            }, 3);
        }

        if(israelites5.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.IDLE)){
            rotateX5 = 0;
            rotateY5 = -45;
            rotateZ5 = 0;
            angle5 = 90;
            playerAnimation5.animate("Armature|ArmatureAction",-1,1);
        }
        else if(israelites5.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.WALKING)){
            playerAnimation5.animate("Armature|Walk",-1,1);

            if (!startWalking5){
                startWalking5 = true;
                Timer.schedule(new Timer.Task() {
                    @Override
                    public void run() {
                        randomNumber5 = rand5.nextInt(100);
                        startWalking5 = false;
                    }
                }, 5);
            }
//                        System.out.println(randomNumber);
            if(!skip5) {
                if (randomNumber5 > 50 && randomNumber5 <= 75) { // up
                    up5 = true;
                } else if (randomNumber5 > 75) { // down
                    down5 = true;
                } else if (randomNumber5 >= 25 && randomNumber5 <= 50) {// left
                    left5 = true;
                } else { // right
                    right5 = true;
                }
            }

            if(up5){ // up
                rotateX5 = 0;
                rotateY5 = 45;
                rotateZ5 = 0;
                angle5 = 90;
                israelitesCharacterComponent5.walkDirection.x = 0.5f;
//                expectedDistance.x = 0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                        "expected: " + expectedDistance.x);
            }
            else if (down5){ // down
                rotateX5 = 0;
                rotateY5 = -45;
                rotateZ5 = 0;
                angle5 = 90;
                israelitesCharacterComponent5.walkDirection.x = -0.5f;
//                expectedDistance.x = -0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                "expected: " + expectedDistance.x);
            }
            else if(left5) {// left
                rotateX5 = 0;
                rotateY5 = 90;
                rotateZ5 = 0;
                angle5 = 180;
                israelitesCharacterComponent5.walkDirection.z = -0.5f;
//                expectedDistance.z = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
            else if(right5) { // right
                rotateX5 = 0;
                rotateY5 = 0;
                rotateZ5 = 0;
                angle5 = 0;
                israelitesCharacterComponent5.walkDirection.z = 0.5f;
//                expectedDistance.z = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
        }
//        System.out.println(transZ);


        israelitesCharacterComponent5.walkDirection.add(tmp5);
        israelitesCharacterComponent5.walkDirection.scl(10f * delta);
        israelitesCharacterComponent5.characterController.setWalkDirection(israelitesCharacterComponent5.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        israelitesCharacterComponent5.israelitestObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX5 = translation.x;
        transY5 = translation.y;
        transZ5 = translation.z;

        modelComponent5.instance.transform.set(new Vector3(transX5,transY5,transZ5), new Quaternion( new Vector3(rotateX5, rotateY5, rotateZ5), angle5));

        modelComponent5.instance.calculateTransforms();

        if(israelites5.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.IDLE)){
            expectedDistance5.x = transX5;
            expectedDistance5.z = transZ5;
//            expectX = expectedDistance.x;
//            expectZ = expectedDistance.z;
        }
        else if (israelites5.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.WALKING)){
            expectedDistance5.z += israelitesCharacterComponent5.walkDirection.z;
            expectedDistance5.x += israelitesCharacterComponent5.walkDirection.x;
        }

        expectZ5 = transZ5 + israelitesCharacterComponent5.walkDirection.z;
        expectX5 = transX5 + israelitesCharacterComponent5.walkDirection.x;

        if(right5){
            if(Math.round(expectZ5) != Math.round(expectedDistance5.z)){
                expectedDistance5.z = expectZ5;
                skip5 = true;
                left5 = true;
                right5 = false;
            }
        }
        if(left5){
            if(Math.round(expectZ5) != Math.round(expectedDistance5.z)){
                expectedDistance5.x = expectX5;
                skip5 = true;
                up5 = true;
                left5 = false;
            }
        }
        if (up5){
            if(Math.round(expectX5) != Math.round(expectedDistance5.x)){
                expectedDistance5.x = expectX5;
                skip5 = true;
                down5 = true;
                up5 = false;
            }
        }
        if(down5){
            if(Math.round(expectX5) != Math.round(expectedDistance5.x)){
                expectedDistance5.z = expectZ5;
                skip5 = true;
                right5 = true;
                down5 = false;
            }
        }

//        System.out.println(skip);


        playerAnimation5.update(delta);
    }

    public void setIsraelites6Update(float delta){


        tmp6.set(0, 0, 0);
        israelitesCharacterComponent6.characterDirection.set(  0, 0, 0).rot(modelComponent6.instance.transform).nor();
        israelitesCharacterComponent6.walkDirection.set(0, 0, 0);

        if (!timerIsOn6){
            timerIsOn6 = true;
            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(40) - 20;
//                    System.out.println(randomNumber);
                    if(randomNumber >= 1){
                        israelites6.add(new IsraelitesComponent(IsraelitesComponent.STATE.WALKING));
                    }
                    else {
                        israelites6.add(new IsraelitesComponent(IsraelitesComponent.STATE.IDLE));
                        skip6 = false;
                    }
                    timerIsOn6 = false;
                }
            }, 3);
        }

        if(israelites6.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.IDLE)){
            rotateX6 = 0;
            rotateY6 = -45;
            rotateZ6 = 0;
            angle6 = 90;
            playerAnimation6.animate("Armature|ArmatureAction",-1,1);
        }
        else if(israelites6.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.WALKING)){
            playerAnimation6.animate("Armature|Walk",-1,1);

            if (!startWalking6){
                startWalking6 = true;
                Timer.schedule(new Timer.Task() {
                    @Override
                    public void run() {
                        randomNumber6 = rand6.nextInt(100);
                        startWalking6 = false;
                    }
                }, 5);
            }
//                        System.out.println(randomNumber);
            if(!skip6) {
                if (randomNumber6 > 50 && randomNumber6 <= 75) { // up
                    up6 = true;
                } else if (randomNumber6 > 75) { // down
                    down6 = true;
                } else if (randomNumber6 >= 25 && randomNumber6 <= 50) {// left
                    left6 = true;
                } else { // right
                    right6 = true;
                }
            }

            if(up6){ // up
                rotateX6 = 0;
                rotateY6 = 45;
                rotateZ6 = 0;
                angle6 = 90;
                israelitesCharacterComponent6.walkDirection.x = 0.5f;
//                expectedDistance.x = 0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                        "expected: " + expectedDistance.x);
            }
            else if (down6){ // down
                rotateX6 = 0;
                rotateY6 = -45;
                rotateZ6 = 0;
                angle6 = 90;
                israelitesCharacterComponent6.walkDirection.x = -0.5f;
//                expectedDistance.x = -0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                "expected: " + expectedDistance.x);
            }
            else if(left6) {// left
                rotateX6 = 0;
                rotateY6 = 90;
                rotateZ6 = 0;
                angle6 = 180;
                israelitesCharacterComponent6.walkDirection.z = -0.5f;
//                expectedDistance.z = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
            else if(right6) { // right
                rotateX6 = 0;
                rotateY6 = 0;
                rotateZ6 = 0;
                angle6 = 0;
                israelitesCharacterComponent6.walkDirection.z = 0.5f;
//                expectedDistance.z = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
        }

//        System.out.println(transZ);


        israelitesCharacterComponent6.walkDirection.add(tmp6);
        israelitesCharacterComponent6.walkDirection.scl(10f * delta);
        israelitesCharacterComponent6.characterController.setWalkDirection(israelitesCharacterComponent6.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        israelitesCharacterComponent6.israelitestObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX6 = translation.x;
        transY6 = translation.y;
        transZ6 = translation.z;

        modelComponent6.instance.transform.set(new Vector3(transX6,transY6,transZ6), new Quaternion( new Vector3(rotateX6, rotateY6, rotateZ6), angle6));

        modelComponent6.instance.calculateTransforms();

        if(israelites6.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.IDLE)){
            expectedDistance6.x = transX6;
            expectedDistance6.z = transZ6;
//            expectX = expectedDistance.x;
//            expectZ = expectedDistance.z;
        }
        else if (israelites6.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.WALKING)){
            expectedDistance6.z += israelitesCharacterComponent6.walkDirection.z;
            expectedDistance6.x += israelitesCharacterComponent6.walkDirection.x;
        }

        expectZ6 = transZ6 + israelitesCharacterComponent6.walkDirection.z;
        expectX6 = transX6 + israelitesCharacterComponent6.walkDirection.x;

        if(right6){
            if(Math.round(expectZ6) != Math.round(expectedDistance6.z)){
                expectedDistance6.z = expectZ6;
                skip6 = true;
                left6 = true;
                right6 = false;
            }
        }
        if(left6){
            if(Math.round(expectZ6) != Math.round(expectedDistance6.z)){
                expectedDistance6.x = expectX6;
                skip6 = true;
                up6 = true;
                left6 = false;
            }
        }
        if (up6){
            if(Math.round(expectX6) != Math.round(expectedDistance6.x)){
                expectedDistance6.x = expectX6;
                skip6 = true;
                down6 = true;
                up6 = false;
            }
        }
        if(down6){
            if(Math.round(expectX6) != Math.round(expectedDistance6.x)){
                expectedDistance6.z = expectZ6;
                skip6 = true;
                right6 = true;
                down6 = false;
            }
        }

//        System.out.println(skip);


        playerAnimation6.update(delta);
    }

    public void setIsraelites7Update(float delta){


        tmp7.set(0, 0, 0);
        israelitesCharacterComponent7.characterDirection.set(  0, 0, 0).rot(modelComponent7.instance.transform).nor();
        israelitesCharacterComponent7.walkDirection.set(0, 0, 0);

        if (!timerIsOn7){
            timerIsOn7 = true;
            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(40) - 20;
//                    System.out.println(randomNumber);
                    if(randomNumber >= 1){
                        israelites7.add(new IsraelitesComponent(IsraelitesComponent.STATE.WALKING));
                    }
                    else {
                        israelites7.add(new IsraelitesComponent(IsraelitesComponent.STATE.IDLE));
                        skip7 = false;
                    }
                    timerIsOn7 = false;
                }
            }, 3);
        }

        if(israelites7.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.IDLE)){
            rotateX7 = 0;
            rotateY7 = -45;
            rotateZ7 = 0;
            angle7 = 90;
            playerAnimation7.animate("Armature|ArmatureAction",-1,1);
        }
        else if(israelites7.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.WALKING)){
            playerAnimation7.animate("Armature|Walk",-1,1);

            if (!startWalking7){
                startWalking7 = true;
                Timer.schedule(new Timer.Task() {
                    @Override
                    public void run() {
                        randomNumber7 = rand7.nextInt(100);
                        startWalking7 = false;
                    }
                }, 5);
            }
//                        System.out.println(randomNumber);
            if(!skip7) {
                if (randomNumber7 > 50 && randomNumber7 <= 75) { // up
                    up7 = true;
                } else if (randomNumber7 > 75) { // down
                    down7 = true;
                } else if (randomNumber7 >= 25 && randomNumber7 <= 50) {// left
                    left7 = true;
                } else { // right
                    right7 = true;
                }
            }

            if(up7){ // up
                rotateX7 = 0;
                rotateY7 = 45;
                rotateZ7 = 0;
                angle7 = 90;
                israelitesCharacterComponent7.walkDirection.x = 0.5f;
//                expectedDistance.x = 0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                        "expected: " + expectedDistance.x);
            }
            else if (down7){ // down
                rotateX7 = 0;
                rotateY7 = -45;
                rotateZ7 = 0;
                angle7 = 90;
                israelitesCharacterComponent7.walkDirection.x = -0.5f;
//                expectedDistance.x = -0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                "expected: " + expectedDistance.x);
            }
            else if(left7) {// left
                rotateX7 = 0;
                rotateY7 = 90;
                rotateZ7 = 0;
                angle7 = 180;
                israelitesCharacterComponent7.walkDirection.z = -0.5f;
//                expectedDistance.z = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
            else if(right7) { // right
                rotateX7 = 0;
                rotateY7 = 0;
                rotateZ7 = 0;
                angle7 = 0;
                israelitesCharacterComponent7.walkDirection.z = 0.5f;
//                expectedDistance.z = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
        }

//        System.out.println(transZ);


        israelitesCharacterComponent7.walkDirection.add(tmp7);
        israelitesCharacterComponent7.walkDirection.scl(10f * delta);
        israelitesCharacterComponent7.characterController.setWalkDirection(israelitesCharacterComponent7.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        israelitesCharacterComponent7.israelitestObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX7 = translation.x;
        transY7 = translation.y;
        transZ7 = translation.z;

        modelComponent7.instance.transform.set(new Vector3(transX7,transY7,transZ7), new Quaternion( new Vector3(rotateX7, rotateY7, rotateZ7), angle7));

        modelComponent7.instance.calculateTransforms();

        if(israelites7.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.IDLE)){
            expectedDistance7.x = transX7;
            expectedDistance7.z = transZ7;
//            expectX = expectedDistance.x;
//            expectZ = expectedDistance.z;
        }
        else if (israelites7.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.WALKING)){
            expectedDistance7.z += israelitesCharacterComponent7.walkDirection.z;
            expectedDistance7.x += israelitesCharacterComponent7.walkDirection.x;
        }

        expectZ7 = transZ7 + israelitesCharacterComponent7.walkDirection.z;
        expectX7 = transX7 + israelitesCharacterComponent7.walkDirection.x;

        if(right7){
            if(Math.round(expectZ7) != Math.round(expectedDistance7.z)){
                expectedDistance7.z = expectZ7;
                skip7 = true;
                left7 = true;
                right7 = false;
            }
        }
        if(left7){
            if(Math.round(expectZ7) != Math.round(expectedDistance7.z)){
                expectedDistance7.x = expectX7;
                skip7 = true;
                up7 = true;
                left7 = false;
            }
        }
        if (up7){
            if(Math.round(expectX7) != Math.round(expectedDistance7.x)){
                expectedDistance7.x = expectX7;
                skip7 = true;
                down7 = true;
                up7 = false;
            }
        }
        if(down7){
            if(Math.round(expectX7) != Math.round(expectedDistance7.x)){
                expectedDistance7.z = expectZ7;
                skip7 = true;
                right7 = true;
                down7 = false;
            }
        }

//        System.out.println(skip);


        playerAnimation7.update(delta);
    }

    public void setIsraelites8Update(float delta){

        tmp8.set(0, 0, 0);
        israelitesCharacterComponent8.characterDirection.set(  0, 0, 0).rot(modelComponent8.instance.transform).nor();
        israelitesCharacterComponent8.walkDirection.set(0, 0, 0);

        if (!timerIsOn8){
            timerIsOn8 = true;
            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(40) - 20;
//                    System.out.println(randomNumber);
                    if(randomNumber >= 1){
                        israelites8.add(new IsraelitesComponent(IsraelitesComponent.STATE.WALKING));
                    }
                    else {
                        israelites8.add(new IsraelitesComponent(IsraelitesComponent.STATE.IDLE));
                        skip8 = false;
                    }
                    timerIsOn8 = false;
                }
            }, 3);
        }

        if(israelites8.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.IDLE)){
            rotateX8 = 0;
            rotateY8 = -45;
            rotateZ8 = 0;
            angle8 = 90;
            playerAnimation8.animate("Armature|ArmatureAction",-1,1);
        }
        else if(israelites8.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.WALKING)){
            playerAnimation8.animate("Armature|Walk",-1,1);

            if (!startWalking8){
                startWalking8 = true;
                Timer.schedule(new Timer.Task() {
                    @Override
                    public void run() {
                        randomNumber8 = rand8.nextInt(100);
                        startWalking8 = false;
                    }
                }, 5);
            }
//                        System.out.println(randomNumber);
            if(!skip8) {
                if (randomNumber8 > 50 && randomNumber8 <= 75) { // up
                    up8 = true;
                } else if (randomNumber8 > 75) { // down
                    down8 = true;
                } else if (randomNumber8 >= 25 && randomNumber8 <= 50) {// left
                    left8 = true;
                } else { // right
                    right8 = true;
                }
            }

            if(up8){ // up
                rotateX8 = 0;
                rotateY8 = 45;
                rotateZ8 = 0;
                angle8 = 90;
                israelitesCharacterComponent8.walkDirection.x = 0.5f;
//                expectedDistance.x = 0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                        "expected: " + expectedDistance.x);
            }
            else if (down8){ // down
                rotateX8 = 0;
                rotateY8 = -45;
                rotateZ8 = 0;
                angle8 = 90;
                israelitesCharacterComponent8.walkDirection.x = -0.5f;
//                expectedDistance.x = -0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                "expected: " + expectedDistance.x);
            }
            else if(left8) {// left
                rotateX8 = 0;
                rotateY8 = 90;
                rotateZ8 = 0;
                angle8 = 180;
                israelitesCharacterComponent8.walkDirection.z = -0.5f;
//                expectedDistance.z = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
            else if(right8) { // right
                rotateX8 = 0;
                rotateY8 = 0;
                rotateZ8 = 0;
                angle8 = 0;
                israelitesCharacterComponent8.walkDirection.z = 0.5f;
//                expectedDistance.z = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
        }

//        System.out.println(transZ);


        israelitesCharacterComponent8.walkDirection.add(tmp8);
        israelitesCharacterComponent8.walkDirection.scl(10f * delta);
        israelitesCharacterComponent8.characterController.setWalkDirection(israelitesCharacterComponent8.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        israelitesCharacterComponent8.israelitestObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX8 = translation.x;
        transY8 = translation.y;
        transZ8 = translation.z;

        modelComponent8.instance.transform.set(new Vector3(transX8,transY8,transZ8), new Quaternion( new Vector3(rotateX8, rotateY8, rotateZ8), angle8));

        modelComponent8.instance.calculateTransforms();

        if(israelites8.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.IDLE)){
            expectedDistance8.x = transX8;
            expectedDistance8.z = transZ8;
//            expectX = expectedDistance.x;
//            expectZ = expectedDistance.z;
        }
        else if (israelites8.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.WALKING)){
            expectedDistance8.z += israelitesCharacterComponent8.walkDirection.z;
            expectedDistance8.x += israelitesCharacterComponent8.walkDirection.x;
        }

        expectZ8 = transZ8 + israelitesCharacterComponent8.walkDirection.z;
        expectX8 = transX8 + israelitesCharacterComponent8.walkDirection.x;

        if(right8){
            if(Math.round(expectZ8) != Math.round(expectedDistance8.z)){
                expectedDistance8.z = expectZ8;
                skip8 = true;
                left8 = true;
                right8 = false;
            }
        }
        if(left8){
            if(Math.round(expectZ8) != Math.round(expectedDistance8.z)){
                expectedDistance8.x = expectX8;
                skip8 = true;
                up8 = true;
                left8 = false;
            }
        }
        if (up8){
            if(Math.round(expectX8) != Math.round(expectedDistance8.x)){
                expectedDistance8.x = expectX8;
                skip8 = true;
                down8 = true;
                up8 = false;
            }
        }
        if(down8){
            if(Math.round(expectX8) != Math.round(expectedDistance8.x)){
                expectedDistance8.z = expectZ8;
                skip8 = true;
                right8 = true;
                down8 = false;
            }
        }

//        System.out.println(skip);


        playerAnimation8.update(delta);
    }

    public void setIsraelites9Update(float delta){

        tmp9.set(0, 0, 0);
        israelitesCharacterComponent9.characterDirection.set(  0, 0, 0).rot(modelComponent9.instance.transform).nor();
        israelitesCharacterComponent9.walkDirection.set(0, 0, 0);

        if (!timerIsOn9){
            timerIsOn9 = true;
            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(40) - 20;
//                    System.out.println(randomNumber);
                    if(randomNumber >= 1){
                        israelites9.add(new IsraelitesComponent(IsraelitesComponent.STATE.WALKING));
                    }
                    else {
                        israelites9.add(new IsraelitesComponent(IsraelitesComponent.STATE.IDLE));
                        skip9 = false;
                    }
                    timerIsOn9 = false;
                }
            }, 3);
        }

        if(israelites9.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.IDLE)){
            rotateX9 = 0;
            rotateY9 = -45;
            rotateZ9 = 0;
            angle9 = 90;
            playerAnimation9.animate("Armature|ArmatureAction",-1,1);
        }
        else if(israelites9.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.WALKING)){
            playerAnimation9.animate("Armature|Walk",-1,1);

            if (!startWalking9){
                startWalking9 = true;
                Timer.schedule(new Timer.Task() {
                    @Override
                    public void run() {
                        randomNumber9 = rand9.nextInt(100);
                        startWalking9 = false;
                    }
                }, 5);
            }
//                        System.out.println(randomNumber);
            if(!skip9) {
                if (randomNumber9 > 50 && randomNumber9 <= 75) { // up
                    up9 = true;
                } else if (randomNumber9 > 75) { // down
                    down9 = true;
                } else if (randomNumber9 >= 25 && randomNumber9 <= 50) {// left
                    left9 = true;
                } else { // right
                    right9 = true;
                }
            }

            if(up9){ // up
                rotateX9 = 0;
                rotateY9 = 45;
                rotateZ9 = 0;
                angle9 = 90;
                israelitesCharacterComponent9.walkDirection.x = 0.5f;
//                expectedDistance.x = 0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                        "expected: " + expectedDistance.x);
            }
            else if (down9){ // down
                rotateX9 = 0;
                rotateY9 = -45;
                rotateZ9 = 0;
                angle9 = 90;
                israelitesCharacterComponent9.walkDirection.x = -0.5f;
//                expectedDistance.x = -0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                "expected: " + expectedDistance.x);
            }
            else if(left9) {// left
                rotateX9 = 0;
                rotateY9 = 90;
                rotateZ9 = 0;
                angle9 = 180;
                israelitesCharacterComponent9.walkDirection.z = -0.5f;
//                expectedDistance.z = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
            else if(right9) { // right
                rotateX9 = 0;
                rotateY9 = 0;
                rotateZ9 = 0;
                angle9 = 0;
                israelitesCharacterComponent9.walkDirection.z = 0.5f;
//                expectedDistance.z = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
        }

//        System.out.println(transZ);


        israelitesCharacterComponent9.walkDirection.add(tmp9);
        israelitesCharacterComponent9.walkDirection.scl(10f * delta);
        israelitesCharacterComponent9.characterController.setWalkDirection(israelitesCharacterComponent9.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        israelitesCharacterComponent9.israelitestObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX9 = translation.x;
        transY9 = translation.y;
        transZ9 = translation.z;

        modelComponent9.instance.transform.set(new Vector3(transX9,transY9,transZ9), new Quaternion( new Vector3(rotateX9, rotateY9, rotateZ9), angle9));

        modelComponent9.instance.calculateTransforms();

        if(israelites9.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.IDLE)){
            expectedDistance9.x = transX9;
            expectedDistance9.z = transZ9;
//            expectX = expectedDistance.x;
//            expectZ = expectedDistance.z;
        }
        else if (israelites9.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.WALKING)){
            expectedDistance9.z += israelitesCharacterComponent9.walkDirection.z;
            expectedDistance9.x += israelitesCharacterComponent9.walkDirection.x;
        }

        expectZ9 = transZ9 + israelitesCharacterComponent9.walkDirection.z;
        expectX9 = transX9 + israelitesCharacterComponent9.walkDirection.x;

        if(right9){
            if(Math.round(expectZ9) != Math.round(expectedDistance9.z)){
                expectedDistance9.z = expectZ9;
                skip9 = true;
                left9 = true;
                right9 = false;
            }
        }
        if(left9){
            if(Math.round(expectZ9) != Math.round(expectedDistance9.z)){
                expectedDistance9.x = expectX9;
                skip9 = true;
                up9 = true;
                left9 = false;
            }
        }
        if (up9){
            if(Math.round(expectX9) != Math.round(expectedDistance9.x)){
                expectedDistance9.x = expectX9;
                skip9 = true;
                down9 = true;
                up9 = false;
            }
        }
        if(down9){
            if(Math.round(expectX9) != Math.round(expectedDistance9.x)){
                expectedDistance9.z = expectZ9;
                skip9 = true;
                right9 = true;
                down9 = false;
            }
        }

//        System.out.println(skip);


        playerAnimation9.update(delta);
    }

    public void setIsraelites10Update(float delta){

        tmp10.set(0, 0, 0);
        israelitesCharacterComponent10.characterDirection.set(  0, 0, 0).rot(modelComponent10.instance.transform).nor();
        israelitesCharacterComponent10.walkDirection.set(0, 0, 0);

        if (!timerIsOn10){
            timerIsOn10 = true;
            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(40) - 20;
//                    System.out.println(randomNumber);
                    if(randomNumber >= 1){
                        israelites10.add(new IsraelitesComponent(IsraelitesComponent.STATE.WALKING));
                    }
                    else {
                        israelites10.add(new IsraelitesComponent(IsraelitesComponent.STATE.IDLE));
                        skip10 = false;
                    }
                    timerIsOn10 = false;
                }
            }, 3);
        }

        if(israelites10.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.IDLE)){
            rotateX10 = 0;
            rotateY10 = -45;
            rotateZ10 = 0;
            angle10 = 90;
            playerAnimation10.animate("Armature|ArmatureAction",-1,1);
        }
        else if(israelites10.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.WALKING)){
            playerAnimation10.animate("Armature|Walk",-1,1);

            if (!startWalking10){
                startWalking10 = true;
                Timer.schedule(new Timer.Task() {
                    @Override
                    public void run() {
                        randomNumber10 = rand10.nextInt(100);
                        startWalking10 = false;
                    }
                }, 5);
            }
//                        System.out.println(randomNumber);
            if(!skip10) {
                if (randomNumber10 > 50 && randomNumber10 <= 75) { // up
                    up10 = true;
                } else if (randomNumber10 > 75) { // down
                    down10 = true;
                } else if (randomNumber10 > 25 && randomNumber10 <= 50) {// left
                    left10 = true;
                } else { // right
                    right10 = true;
                }
            }

            if(up10){ // up
                rotateX10 = 0;
                rotateY10 = 45;
                rotateZ10 = 0;
                angle10 = 90;
                israelitesCharacterComponent10.walkDirection.x = 0.5f;
//                expectedDistance.x = 0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                        "expected: " + expectedDistance.x);
            }
            else if (down10){ // down
                rotateX10 = 0;
                rotateY10 = -45;
                rotateZ10 = 0;
                angle10 = 90;
                israelitesCharacterComponent10.walkDirection.x = -0.5f;
//                expectedDistance.x = -0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                "expected: " + expectedDistance.x);
            }
            else if(left10) {// left
                rotateX10 = 0;
                rotateY10 = 90;
                rotateZ10 = 0;
                angle10 = 180;
                israelitesCharacterComponent10.walkDirection.z = -0.5f;
//                expectedDistance.z = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
            else if(right10) { // right
                rotateX10 = 0;
                rotateY10 = 0;
                rotateZ10 = 0;
                angle10 = 0;
                israelitesCharacterComponent10.walkDirection.z = 0.5f;
//                expectedDistance.z = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
        }

//        System.out.println(transZ);


        israelitesCharacterComponent10.walkDirection.add(tmp10);
        israelitesCharacterComponent10.walkDirection.scl(10f * delta);
        israelitesCharacterComponent10.characterController.setWalkDirection(israelitesCharacterComponent10.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        israelitesCharacterComponent10.israelitestObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX10 = translation.x;
        transY10 = translation.y;
        transZ10 = translation.z;

        modelComponent10.instance.transform.set(new Vector3(transX10,transY10,transZ10), new Quaternion( new Vector3(rotateX10, rotateY10, rotateZ10), angle10));

        modelComponent10.instance.calculateTransforms();

        if(israelites10.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.IDLE)){
            expectedDistance10.x = transX10;
            expectedDistance10.z = transZ10;
//            expectX = expectedDistance.x;
//            expectZ = expectedDistance.z;
        }
        else if (israelites10.getComponent(IsraelitesComponent.class).state.equals(IsraelitesComponent.STATE.WALKING)){
            expectedDistance10.z += israelitesCharacterComponent10.walkDirection.z;
            expectedDistance10.x += israelitesCharacterComponent10.walkDirection.x;
        }

        expectZ10 = transZ10 + israelitesCharacterComponent10.walkDirection.z;
        expectX10 = transX10 + israelitesCharacterComponent10.walkDirection.x;

        if(right10){
            if(Math.round(expectZ10) != Math.round(expectedDistance10.z)){
                expectedDistance10.z = expectZ10;
                skip10 = true;
                left10 = true;
                right10 = false;
            }
        }
        if(left10){
            if(Math.round(expectZ10) != Math.round(expectedDistance10.z)){
                expectedDistance10.x = expectX10;
                skip10 = true;
                up10 = true;
                left10 = false;
            }
        }
        if (up10){
            if(Math.round(expectX10) != Math.round(expectedDistance10.x)){
                expectedDistance10.x = expectX10;
                skip10 = true;
                down10 = true;
                up10 = false;
            }
        }
        if(down10){
            if(Math.round(expectX10) != Math.round(expectedDistance10.x)){
                expectedDistance10.z = expectZ10;
                skip10 = true;
                right10 = true;
                down10 = false;
            }
        }

//        System.out.println(skip);


        playerAnimation10.update(delta);
    }

    @Override
    public void entityAdded(Entity entity) {
        player = entity;
    }
    @Override
    public void entityRemoved(Entity entity) {
    }

    public void dispose(){
        bulletSystem.collisionWorld.removeCollisionObject(israelites1.getComponent(IsraelitesCharacterComponent.class).israelitestObject);
        israelites1.getComponent(IsraelitesCharacterComponent.class).israelitestObject.dispose();
        israelites1.getComponent(IsraelitesCharacterComponent.class).israelitesShape.dispose();

        bulletSystem.collisionWorld.removeCollisionObject(israelites2.getComponent(IsraelitesCharacterComponent.class).israelitestObject);
        israelites2.getComponent(IsraelitesCharacterComponent.class).israelitestObject.dispose();
        israelites2.getComponent(IsraelitesCharacterComponent.class).israelitesShape.dispose();

        bulletSystem.collisionWorld.removeCollisionObject(israelites3.getComponent(IsraelitesCharacterComponent.class).israelitestObject);
        israelites3.getComponent(IsraelitesCharacterComponent.class).israelitestObject.dispose();
        israelites3.getComponent(IsraelitesCharacterComponent.class).israelitesShape.dispose();

        bulletSystem.collisionWorld.removeCollisionObject(israelites4.getComponent(IsraelitesCharacterComponent.class).israelitestObject);
        israelites4.getComponent(IsraelitesCharacterComponent.class).israelitestObject.dispose();
        israelites4.getComponent(IsraelitesCharacterComponent.class).israelitesShape.dispose();

        bulletSystem.collisionWorld.removeCollisionObject(israelites5.getComponent(IsraelitesCharacterComponent.class).israelitestObject);
        israelites5.getComponent(IsraelitesCharacterComponent.class).israelitestObject.dispose();
        israelites5.getComponent(IsraelitesCharacterComponent.class).israelitesShape.dispose();

        bulletSystem.collisionWorld.removeCollisionObject(israelites6.getComponent(IsraelitesCharacterComponent.class).israelitestObject);
        israelites6.getComponent(IsraelitesCharacterComponent.class).israelitestObject.dispose();
        israelites6.getComponent(IsraelitesCharacterComponent.class).israelitesShape.dispose();

        bulletSystem.collisionWorld.removeCollisionObject(israelites7.getComponent(IsraelitesCharacterComponent.class).israelitestObject);
        israelites7.getComponent(IsraelitesCharacterComponent.class).israelitestObject.dispose();
        israelites7.getComponent(IsraelitesCharacterComponent.class).israelitesShape.dispose();

        bulletSystem.collisionWorld.removeCollisionObject(israelites8.getComponent(IsraelitesCharacterComponent.class).israelitestObject);
        israelites8.getComponent(IsraelitesCharacterComponent.class).israelitestObject.dispose();
        israelites8.getComponent(IsraelitesCharacterComponent.class).israelitesShape.dispose();

        bulletSystem.collisionWorld.removeCollisionObject(israelites9.getComponent(IsraelitesCharacterComponent.class).israelitestObject);
        israelites9.getComponent(IsraelitesCharacterComponent.class).israelitestObject.dispose();
        israelites9.getComponent(IsraelitesCharacterComponent.class).israelitesShape.dispose();

        bulletSystem.collisionWorld.removeCollisionObject(israelites10.getComponent(IsraelitesCharacterComponent.class).israelitestObject);
        israelites10.getComponent(IsraelitesCharacterComponent.class).israelitestObject.dispose();
        israelites10.getComponent(IsraelitesCharacterComponent.class).israelitesShape.dispose();

    }
}
