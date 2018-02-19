package com.legendandroidgame.game.BulletSystem;

import com.badlogic.ashley.core.ComponentMapper;
import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.EntityListener;
import com.badlogic.ashley.core.EntitySystem;
import com.badlogic.ashley.core.Family;
import com.badlogic.ashley.utils.ImmutableArray;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Timer;
import com.legendandroidgame.game.BulletComponent.AnimationComponent;
import com.legendandroidgame.game.BulletComponent.ModelComponent;
import com.legendandroidgame.game.BulletComponent.NumbersGuyCharacterComponent;
import com.legendandroidgame.game.BulletComponent.NumbersGuyComponent;
import com.legendandroidgame.game.BulletComponent.PlayerComponent;
import com.legendandroidgame.game.BulletTools.CharacterEntityFactory;

import java.util.Random;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Daniel on 19/02/2018.
 */
public class ArmySystem extends EntitySystem implements EntityListener {
    private ImmutableArray<Entity> entities;
    private Entity player;
    private Engine engine;
    public AnimationComponent playerAnimation1, playerAnimation2, playerAnimation3, playerAnimation4,
            playerAnimation5, playerAnimation6, playerAnimation7, playerAnimation8, playerAnimation9, playerAnimation10;
    private Entity army1, army2, army3, army4, army5,
            army6, army7, army8, army9, army10;
    private BulletSystem bulletSystem;
    private ModelComponent modelComponent1, modelComponent2, modelComponent3, modelComponent4, modelComponent5,
            modelComponent6, modelComponent7, modelComponent8, modelComponent9, modelComponent10;
    private NumbersGuyCharacterComponent armyCharacterComponent1, armyCharacterComponent2, armyCharacterComponent3,
            armyCharacterComponent4, armyCharacterComponent5, armyCharacterComponent6, armyCharacterComponent7,
            armyCharacterComponent8, armyCharacterComponent9, armyCharacterComponent10;

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

    public ArmySystem(BulletSystem bulletSystem) {
        this.bulletSystem = bulletSystem;

        if (gameData.getInteger(current + " currentLocation") == 4){ // EAST
            army1 = CharacterEntityFactory.createNumbersGuy1(bulletSystem, -104.86211f,7,-106.24718f);
            army2 = CharacterEntityFactory.createNumbersGuy2(bulletSystem, -104.86211f,8,-89.2838f);
            army3 = CharacterEntityFactory.createNumbersGuy3(bulletSystem,-115.18529f,7,-78.367645f);
            army4 = CharacterEntityFactory.createNumbersGuy4(bulletSystem, -104.86211f,8,-79.54163f);
            army5 = CharacterEntityFactory.createNumbersGuy5(bulletSystem, -104.86211f,8,-74.81065f);
            army6 = CharacterEntityFactory.createNumbersGuy6(bulletSystem, -104.86211f,8,-67.403336f);
            army7 = CharacterEntityFactory.createNumbersGuy7(bulletSystem, -104.86211f,8,-61.240765f);
            army8 = CharacterEntityFactory.createNumbersGuy8(bulletSystem, -115.18529f,7,-58.451454f);
            army9 = CharacterEntityFactory.createNumbersGuy9(bulletSystem, -115.18529f,7,-63.974937f);
            army10 = CharacterEntityFactory.createNumbersGuy10(bulletSystem, -115.18529f,7,-71.040276f);
        }

        if (gameData.getInteger(current + " currentLocation") == 5){ // NORTH
            army1 = CharacterEntityFactory.createNumbersGuy1(bulletSystem, -167.40393f,5,55.12362f);
            army2 = CharacterEntityFactory.createNumbersGuy2(bulletSystem, -168.34637f,5,60.71053f);
            army3 = CharacterEntityFactory.createNumbersGuy3(bulletSystem, -169.56413f,5,33.090466f);
            army4 = CharacterEntityFactory.createNumbersGuy4(bulletSystem, -170.08624f,5,20.542652f);
            army5 = CharacterEntityFactory.createNumbersGuy5(bulletSystem, -128.36897f,5,-131.13916f);
            army6 = CharacterEntityFactory.createNumbersGuy6(bulletSystem, -31.28742f,5,-204.52788f);
            army7 = CharacterEntityFactory.createNumbersGuy7(bulletSystem, -8.459428f,5,-204.14915f);
            army8 = CharacterEntityFactory.createNumbersGuy8(bulletSystem, 104.39823f,5,106.58221f);
            army9 = CharacterEntityFactory.createNumbersGuy9(bulletSystem, 103.938324f,5,152.02899f);
            army10 = CharacterEntityFactory.createNumbersGuy10(bulletSystem, -62.218933f,5,29.826256f);
        }

        if (gameData.getInteger(current + " currentLocation") == 6){ // SOUTH
            army1 = CharacterEntityFactory.createNumbersGuy1(bulletSystem, -17.45131f,5,-67.65073f);
            army2 = CharacterEntityFactory.createNumbersGuy2(bulletSystem, -33.626442f,5,-67.81189f);
            army3 = CharacterEntityFactory.createNumbersGuy3(bulletSystem, 144.42842f,5,38.606796f);
            army4 = CharacterEntityFactory.createNumbersGuy4(bulletSystem, 144.4284f,5,11.956693f);
            army5 = CharacterEntityFactory.createNumbersGuy5(bulletSystem, 26.14553f,5,141.47595f);
            army6 = CharacterEntityFactory.createNumbersGuy6(bulletSystem, 2.4312685f,5,144.20343f);
            army7 = CharacterEntityFactory.createNumbersGuy7(bulletSystem, -112.86496f,5,-144.56573f);
            army8 = CharacterEntityFactory.createNumbersGuy8(bulletSystem, -90.30623f,5,-141.83298f);
            army9 = CharacterEntityFactory.createNumbersGuy9(bulletSystem, -54.598465f,5,-24.179699f);
            army10 = CharacterEntityFactory.createNumbersGuy10(bulletSystem, -20.037838f,5,-25.713148f);
        }

        if (gameData.getInteger(current + " currentLocation") == 7){ // WEST
            army1 = CharacterEntityFactory.createNumbersGuy1(bulletSystem, 71.73817f,5,108.37013f);
            army2 = CharacterEntityFactory.createNumbersGuy2(bulletSystem, 20.795494f,5,-108.52833f);
            army3 = CharacterEntityFactory.createNumbersGuy3(bulletSystem, 71.442924f,5,80.1253f);
            army4 = CharacterEntityFactory.createNumbersGuy4(bulletSystem, 79.197845f,5,0.23461786f);
            army5 = CharacterEntityFactory.createNumbersGuy5(bulletSystem, 79.663376f,5,-34.433052f);
            army6 = CharacterEntityFactory.createNumbersGuy6(bulletSystem, 79.18112f,5,-59.0472f);
            army7 = CharacterEntityFactory.createNumbersGuy7(bulletSystem, -2.5258102f,5,-102.643234f);
            army8 = CharacterEntityFactory.createNumbersGuy8(bulletSystem, -25.681993f,5,-102.643234f);
            army9 = CharacterEntityFactory.createNumbersGuy9(bulletSystem, -37.359905f,5,-101.815125f);
            army10 = CharacterEntityFactory.createNumbersGuy10(bulletSystem, -55.913773f,5,-101.94266f);
        }

        if (gameData.getInteger(current + " currentLocation") == 13){ // Pharaoh Mansion
            army1 = CharacterEntityFactory.createNumbersGuy1(bulletSystem, -22.800688f,6,17.923752f);
            army2 = CharacterEntityFactory.createNumbersGuy2(bulletSystem,-23.210785f,6,-20.557114f);
            army3 = CharacterEntityFactory.createNumbersGuy3(bulletSystem, 35.857265f,6,-14.181902f);
            army4 = CharacterEntityFactory.createNumbersGuy4(bulletSystem, 35.995636f,6,13.391682f);
        }

        if(gameData.getInteger(current +" currentLocation") == 13){
            modelComponent1 = CharacterEntityFactory.numbersGuyComponent1;
            modelComponent2 = CharacterEntityFactory.numbersGuyComponent2;
            modelComponent3 = CharacterEntityFactory.numbersGuyComponent3;
            modelComponent4 = CharacterEntityFactory.numbersGuyComponent4;

            playerAnimation1 = new AnimationComponent(modelComponent1.instance);
            playerAnimation2 = new AnimationComponent(modelComponent2.instance);
            playerAnimation3 = new AnimationComponent(modelComponent3.instance);
            playerAnimation4 = new AnimationComponent(modelComponent4.instance);

            armyCharacterComponent1 = army1.getComponent(NumbersGuyCharacterComponent.class);
            armyCharacterComponent2 = army2.getComponent(NumbersGuyCharacterComponent.class);
            armyCharacterComponent3 = army3.getComponent(NumbersGuyCharacterComponent.class);
            armyCharacterComponent4 = army4.getComponent(NumbersGuyCharacterComponent.class);
        }
        else {
            modelComponent1 = CharacterEntityFactory.numbersGuyComponent1;
            modelComponent2 = CharacterEntityFactory.numbersGuyComponent2;
            modelComponent3 = CharacterEntityFactory.numbersGuyComponent3;
            modelComponent4 = CharacterEntityFactory.numbersGuyComponent4;
            modelComponent5 = CharacterEntityFactory.numbersGuyComponent5;
            modelComponent6 = CharacterEntityFactory.numbersGuyComponent6;
            modelComponent7 = CharacterEntityFactory.numbersGuyComponent7;
            modelComponent8 = CharacterEntityFactory.numbersGuyComponent8;
            modelComponent9 = CharacterEntityFactory.numbersGuyComponent9;
            modelComponent10 = CharacterEntityFactory.numbersGuyComponent10;

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


            armyCharacterComponent1 = army1.getComponent(NumbersGuyCharacterComponent.class);
            armyCharacterComponent2 = army2.getComponent(NumbersGuyCharacterComponent.class);
            armyCharacterComponent3 = army3.getComponent(NumbersGuyCharacterComponent.class);
            armyCharacterComponent4 = army4.getComponent(NumbersGuyCharacterComponent.class);
            armyCharacterComponent5 = army5.getComponent(NumbersGuyCharacterComponent.class);
            armyCharacterComponent6 = army6.getComponent(NumbersGuyCharacterComponent.class);
            armyCharacterComponent7 = army7.getComponent(NumbersGuyCharacterComponent.class);
            armyCharacterComponent8 = army8.getComponent(NumbersGuyCharacterComponent.class);
            armyCharacterComponent9 = army9.getComponent(NumbersGuyCharacterComponent.class);
            armyCharacterComponent10 = army10.getComponent(NumbersGuyCharacterComponent.class);
        }

    }
    @Override
    public void addedToEngine(Engine e) {
        entities = e.getEntitiesFor(Family.all(NumbersGuyComponent.class, NumbersGuyCharacterComponent.class).get());
        e.addEntityListener(Family.one(PlayerComponent.class).get(), this);
        this.engine = e;
    }
    public void update(float delta) {

        if(gameData.getInteger(current +" currentLocation") == 13){
            if (entities.size() < 4) {
                engine.addEntity(army1);
                engine.addEntity(army2);
                engine.addEntity(army3);
                engine.addEntity(army4);
            }
        }
        else {
            if (entities.size() < 10) {
                engine.addEntity(army1);
                engine.addEntity(army2);
                engine.addEntity(army3);
                engine.addEntity(army4);
                engine.addEntity(army5);
                engine.addEntity(army6);
                engine.addEntity(army7);
                engine.addEntity(army8);
                engine.addEntity(army9);
                engine.addEntity(army10);
            }
        }

        if(gameData.getInteger(current +" currentLocation") == 13){
            setIsraelites1Update(delta);
            setIsraelites2Update(delta);
            setIsraelites3Update(delta);
            setIsraelites4Update(delta);
        }
        else {
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
        }

//        System.out.println(randomNumber1 + "\n"
//                + randomNumber2 + "\n"
//                + randomNumber3 + "\n"
//                + randomNumber4 + "\n"
//                + randomNumber5 + "\n"
//                + randomNumber6 + "\n"
//                + randomNumber7 + "\n"
//                + randomNumber8 + "\n"
//                + randomNumber9 + "\n"
//                + randomNumber10 + "\n"
//        );
    }


    public void setIsraelites1Update(float delta){

        tmp1.set(0, 0, 0);
        armyCharacterComponent1.characterDirection.set(  0, 0, 0).rot(modelComponent1.instance.transform).nor();
        armyCharacterComponent1.walkDirection.set(0, 0, 0);

        if (!timerIsOn1){
            timerIsOn1 = true;
            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(40) - 20;
//                    System.out.println(randomNumber);
                    if(randomNumber >= 1){
                        if(gameData.getInteger(current + " currentLocation") == 13){
                            army1.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.IDLE));
                            skip1 = false;
                        }
                        else {
                            army1.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.WALKING));
                        }
                    }
                    else {
                        army1.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.IDLE));
                        skip1 = false;
                    }
                    timerIsOn1 = false;
                }
            }, 3);
        }

        if(army1.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.IDLE)){
            rotateX1 = 0;
            rotateY1 = -45;
            rotateZ1 = 0;
            angle1 = 90;
            playerAnimation1.animate("Armature|ArmatureAction.001",-1,1);
        }
        else if(army1.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.WALKING)){
            playerAnimation1.animate("Armature|Walk.001",-1,1);

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
                armyCharacterComponent1.walkDirection.x = 0.5f;
//                expectedDistance.x = 0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                        "expected: " + expectedDistance.x);
            }
            else if (down1){ // down
                rotateX1 = 0;
                rotateY1 = -45;
                rotateZ1 = 0;
                angle1 = 90;
                armyCharacterComponent1.walkDirection.x = -0.5f;
//                expectedDistance.x = -0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                "expected: " + expectedDistance.x);
            }
            else if(left1) {// left
                rotateX1 = 0;
                rotateY1 = 90;
                rotateZ1 = 0;
                angle1 = 180;
                armyCharacterComponent1.walkDirection.z = -0.5f;
//                expectedDistance.z = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
            else if(right1) { // right
                rotateX1 = 0;
                rotateY1 = 0;
                rotateZ1 = 0;
                angle1 = 0;
                armyCharacterComponent1.walkDirection.z = 0.5f;
//                expectedDistance.z = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
        }


//        System.out.println(transZ);


        armyCharacterComponent1.walkDirection.add(tmp1);
        armyCharacterComponent1.walkDirection.scl(10f * delta);
        armyCharacterComponent1.characterController.setWalkDirection(armyCharacterComponent1.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        armyCharacterComponent1.ghostObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX1 = translation.x;
        transY1 = translation.y;
        transZ1 = translation.z;

        modelComponent1.instance.transform.set(new Vector3(transX1,transY1,transZ1), new Quaternion( new Vector3(rotateX1, rotateY1, rotateZ1), angle1));

        modelComponent1.instance.calculateTransforms();

        if(army1.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.IDLE)){
            expectedDistance1.x = transX1;
            expectedDistance1.z = transZ1;
//            expectX = expectedDistance.x;
//            expectZ = expectedDistance.z;
        }
        else if (army1.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.WALKING)){
            expectedDistance1.z += armyCharacterComponent1.walkDirection.z;
            expectedDistance1.x += armyCharacterComponent1.walkDirection.x;
        }

        expectZ1 = transZ1 + armyCharacterComponent1.walkDirection.z;
        expectX1 = transX1 + armyCharacterComponent1.walkDirection.x;

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
        armyCharacterComponent2.characterDirection.set(  0, 0, 0).rot(modelComponent2.instance.transform).nor();
        armyCharacterComponent2.walkDirection.set(0, 0, 0);

        if (!timerIsOn2){
            timerIsOn2 = true;
            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(40) - 20;
//                    System.out.println(randomNumber);
                    if(randomNumber >= 1){
                        if(gameData.getInteger(current + " currentLocation") == 13){
                            army2.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.IDLE));
                            skip2 = false;
                        }
                        else {
                            army2.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.WALKING));
                        }
                    }
                    else {
                        army2.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.IDLE));
                        skip2 = false;
                    }
                    timerIsOn2 = false;
                }
            }, 3);
        }

        if(army2.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.IDLE)){
            rotateX2 = 0;
            rotateY2 = -45;
            rotateZ2 = 0;
            angle2 = 90;
            playerAnimation2.animate("Armature|ArmatureAction.001",-1,1);
        }
        else if(army2.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.WALKING)){
            playerAnimation2.animate("Armature|Walk.001",-1,1);

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
                armyCharacterComponent2.walkDirection.x = 0.5f;
//                expectedDistance.x = 0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                        "expected: " + expectedDistance.x);
            }
            else if (down2){ // down
                rotateX2 = 0;
                rotateY2 = -45;
                rotateZ2 = 0;
                angle2 = 90;
                armyCharacterComponent2.walkDirection.x = -0.5f;
//                expectedDistance.x = -0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                "expected: " + expectedDistance.x);
            }
            else if(left2) {// left
                rotateX2 = 0;
                rotateY2 = 90;
                rotateZ2 = 0;
                angle2 = 180;
                armyCharacterComponent2.walkDirection.z = -0.5f;
//                expectedDistance.z = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
            else if(right2) { // right
                rotateX2 = 0;
                rotateY2 = 0;
                rotateZ2 = 0;
                angle2 = 0;
                armyCharacterComponent2.walkDirection.z = 0.5f;
//                expectedDistance.z = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
        }

//        System.out.println(transZ);


        armyCharacterComponent2.walkDirection.add(tmp2);
        armyCharacterComponent2.walkDirection.scl(10f * delta);
        armyCharacterComponent2.characterController.setWalkDirection(armyCharacterComponent2.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        armyCharacterComponent2.ghostObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX2 = translation.x;
        transY2 = translation.y;
        transZ2 = translation.z;

        modelComponent2.instance.transform.set(new Vector3(transX2,transY2,transZ2), new Quaternion( new Vector3(rotateX2, rotateY2, rotateZ2), angle2));

        modelComponent2.instance.calculateTransforms();

        if(army2.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.IDLE)){
            expectedDistance2.x = transX2;
            expectedDistance2.z = transZ2;
//            expectX = expectedDistance.x;
//            expectZ = expectedDistance.z;
        }
        else if (army2.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.WALKING)){
            expectedDistance2.z += armyCharacterComponent2.walkDirection.z;
            expectedDistance2.x += armyCharacterComponent2.walkDirection.x;
        }

        expectZ2 = transZ2 + armyCharacterComponent2.walkDirection.z;
        expectX2 = transX2 + armyCharacterComponent2.walkDirection.x;

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
        armyCharacterComponent3.characterDirection.set(  0, 0, 0).rot(modelComponent3.instance.transform).nor();
        armyCharacterComponent3.walkDirection.set(0, 0, 0);

        if (!timerIsOn3){
            timerIsOn3 = true;
            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(40) - 20;
//                    System.out.println(randomNumber);
                    if(randomNumber >= 1){
                        if(gameData.getInteger(current + " currentLocation") == 13){
                            army3.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.IDLE));
                            skip3 = false;
                        }
                        else {
                            army3.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.WALKING));
                        }
                    }
                    else {
                        army3.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.IDLE));
                        skip3 = false;
                    }
                    timerIsOn3 = false;
                }
            }, 3);
        }

        if(army3.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.IDLE)){
            rotateX3 = 0;
            rotateY3 = -45;
            rotateZ3 = 0;
            angle3 = 90;
            playerAnimation3.animate("Armature|ArmatureAction.001",-1,1);
        }
        else if(army3.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.WALKING)){
            playerAnimation3.animate("Armature|Walk.001",-1,1);

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
                armyCharacterComponent3.walkDirection.x = 0.5f;
//                expectedDistance.x = 0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                        "expected: " + expectedDistance.x);
            }
            else if (down3){ // down
                rotateX3 = 0;
                rotateY3 = -45;
                rotateZ3 = 0;
                angle3 = 90;
                armyCharacterComponent3.walkDirection.x = -0.5f;
//                expectedDistance.x = -0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                "expected: " + expectedDistance.x);
            }
            else if(left3) {// left
                rotateX3 = 0;
                rotateY3 = 90;
                rotateZ3 = 0;
                angle3 = 180;
                armyCharacterComponent3.walkDirection.z = -0.5f;
//                expectedDistance.z = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
            else if(right3) { // right
                rotateX3 = 0;
                rotateY3 = 0;
                rotateZ3 = 0;
                angle3 = 0;
                armyCharacterComponent3.walkDirection.z = 0.5f;
//                expectedDistance.z = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
        }

//        System.out.println(transZ);


        armyCharacterComponent3.walkDirection.add(tmp3);
        armyCharacterComponent3.walkDirection.scl(10f * delta);
        armyCharacterComponent3.characterController.setWalkDirection(armyCharacterComponent3.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        armyCharacterComponent3.ghostObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX3 = translation.x;
        transY3 = translation.y;
        transZ3 = translation.z;

        modelComponent3.instance.transform.set(new Vector3(transX3,transY3,transZ3), new Quaternion( new Vector3(rotateX3, rotateY3, rotateZ3), angle3));

        modelComponent3.instance.calculateTransforms();

        if(army3.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.IDLE)){
            expectedDistance3.x = transX3;
            expectedDistance3.z = transZ3;
//            expectX = expectedDistance.x;
//            expectZ = expectedDistance.z;
        }
        else if (army3.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.WALKING)){
            expectedDistance3.z += armyCharacterComponent3.walkDirection.z;
            expectedDistance3.x += armyCharacterComponent3.walkDirection.x;
        }

        expectZ3 = transZ3 + armyCharacterComponent3.walkDirection.z;
        expectX3 = transX3 + armyCharacterComponent3.walkDirection.x;

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
        armyCharacterComponent4.characterDirection.set(  0, 0, 0).rot(modelComponent4.instance.transform).nor();
        armyCharacterComponent4.walkDirection.set(0, 0, 0);

        if (!timerIsOn4){
            timerIsOn4 = true;
            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(40) - 20;
//                    System.out.println(randomNumber);
                    if(randomNumber >= 1){
                        if(gameData.getInteger(current + " currentLocation") == 13){
                            army4.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.IDLE));
                            skip4 = false;
                        }
                        else {
                            army4.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.WALKING));
                        }
                    }
                    else {
                        army4.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.IDLE));
                        skip4 = false;
                    }
                    timerIsOn4 = false;
                }
            }, 3);
        }

        if(army4.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.IDLE)){
            rotateX4 = 0;
            rotateY4 = -45;
            rotateZ4 = 0;
            angle4 = 90;
            playerAnimation4.animate("Armature|ArmatureAction.001",-1,1);
        }
        else if(army4.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.WALKING)){
            playerAnimation4.animate("Armature|Walk.001",-1,1);

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
                armyCharacterComponent4.walkDirection.x = 0.5f;
//                expectedDistance.x = 0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                        "expected: " + expectedDistance.x);
            }
            else if (down4){ // down
                rotateX4 = 0;
                rotateY4 = -45;
                rotateZ4 = 0;
                angle4 = 90;
                armyCharacterComponent4.walkDirection.x = -0.5f;
//                expectedDistance.x = -0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                "expected: " + expectedDistance.x);
            }
            else if(left4) {// left
                rotateX4 = 0;
                rotateY4 = 90;
                rotateZ4 = 0;
                angle4 = 180;
                armyCharacterComponent4.walkDirection.z = -0.5f;
//                expectedDistance.z = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
            else if(right4) { // right
                rotateX4 = 0;
                rotateY4 = 0;
                rotateZ4 = 0;
                angle4 = 0;
                armyCharacterComponent4.walkDirection.z = 0.5f;
//                expectedDistance.z = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
        }

//        System.out.println(transZ);


        armyCharacterComponent4.walkDirection.add(tmp4);
        armyCharacterComponent4.walkDirection.scl(10f * delta);
        armyCharacterComponent4.characterController.setWalkDirection(armyCharacterComponent4.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        armyCharacterComponent4.ghostObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX4 = translation.x;
        transY4 = translation.y;
        transZ4 = translation.z;

        modelComponent4.instance.transform.set(new Vector3(transX4,transY4,transZ4), new Quaternion( new Vector3(rotateX4, rotateY4, rotateZ4), angle4));

        modelComponent4.instance.calculateTransforms();

        if(army4.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.IDLE)){
            expectedDistance4.x = transX4;
            expectedDistance4.z = transZ4;
//            expectX = expectedDistance.x;
//            expectZ = expectedDistance.z;
        }
        else if (army4.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.WALKING)){
            expectedDistance4.z += armyCharacterComponent4.walkDirection.z;
            expectedDistance4.x += armyCharacterComponent4.walkDirection.x;
        }

        expectZ4 = transZ4 + armyCharacterComponent4.walkDirection.z;
        expectX4 = transX4 + armyCharacterComponent4.walkDirection.x;

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
        armyCharacterComponent5.characterDirection.set(  0, 0, 0).rot(modelComponent5.instance.transform).nor();
        armyCharacterComponent5.walkDirection.set(0, 0, 0);

        if (!timerIsOn5){
            timerIsOn5 = true;
            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(40) - 20;
//                    System.out.println(randomNumber);
                    if(randomNumber >= 1){
                        army5.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.WALKING));
                    }
                    else {
                        army5.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.IDLE));
                        skip5 = false;
                    }
                    timerIsOn5 = false;
                }
            }, 3);
        }

        if(army5.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.IDLE)){
            rotateX5 = 0;
            rotateY5 = -45;
            rotateZ5 = 0;
            angle5 = 90;
            playerAnimation5.animate("Armature|ArmatureAction.001",-1,1);
        }
        else if(army5.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.WALKING)){
            playerAnimation5.animate("Armature|Walk.001",-1,1);

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
                armyCharacterComponent5.walkDirection.x = 0.5f;
//                expectedDistance.x = 0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                        "expected: " + expectedDistance.x);
            }
            else if (down5){ // down
                rotateX5 = 0;
                rotateY5 = -45;
                rotateZ5 = 0;
                angle5 = 90;
                armyCharacterComponent5.walkDirection.x = -0.5f;
//                expectedDistance.x = -0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                "expected: " + expectedDistance.x);
            }
            else if(left5) {// left
                rotateX5 = 0;
                rotateY5 = 90;
                rotateZ5 = 0;
                angle5 = 180;
                armyCharacterComponent5.walkDirection.z = -0.5f;
//                expectedDistance.z = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
            else if(right5) { // right
                rotateX5 = 0;
                rotateY5 = 0;
                rotateZ5 = 0;
                angle5 = 0;
                armyCharacterComponent5.walkDirection.z = 0.5f;
//                expectedDistance.z = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
        }
//        System.out.println(transZ);


        armyCharacterComponent5.walkDirection.add(tmp5);
        armyCharacterComponent5.walkDirection.scl(10f * delta);
        armyCharacterComponent5.characterController.setWalkDirection(armyCharacterComponent5.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        armyCharacterComponent5.ghostObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX5 = translation.x;
        transY5 = translation.y;
        transZ5 = translation.z;

        modelComponent5.instance.transform.set(new Vector3(transX5,transY5,transZ5), new Quaternion( new Vector3(rotateX5, rotateY5, rotateZ5), angle5));

        modelComponent5.instance.calculateTransforms();

        if(army5.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.IDLE)){
            expectedDistance5.x = transX5;
            expectedDistance5.z = transZ5;
//            expectX = expectedDistance.x;
//            expectZ = expectedDistance.z;
        }
        else if (army5.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.WALKING)){
            expectedDistance5.z += armyCharacterComponent5.walkDirection.z;
            expectedDistance5.x += armyCharacterComponent5.walkDirection.x;
        }

        expectZ5 = transZ5 + armyCharacterComponent5.walkDirection.z;
        expectX5 = transX5 + armyCharacterComponent5.walkDirection.x;

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
        armyCharacterComponent6.characterDirection.set(  0, 0, 0).rot(modelComponent6.instance.transform).nor();
        armyCharacterComponent6.walkDirection.set(0, 0, 0);

        if (!timerIsOn6){
            timerIsOn6 = true;
            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(40) - 20;
//                    System.out.println(randomNumber);
                    if(randomNumber >= 1){
                        army6.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.WALKING));
                    }
                    else {
                        army6.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.IDLE));
                        skip6 = false;
                    }
                    timerIsOn6 = false;
                }
            }, 3);
        }

        if(army6.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.IDLE)){
            rotateX6 = 0;
            rotateY6 = -45;
            rotateZ6 = 0;
            angle6 = 90;
            playerAnimation6.animate("Armature|ArmatureAction.001",-1,1);
        }
        else if(army6.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.WALKING)){
            playerAnimation6.animate("Armature|Walk.001",-1,1);

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
                armyCharacterComponent6.walkDirection.x = 0.5f;
//                expectedDistance.x = 0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                        "expected: " + expectedDistance.x);
            }
            else if (down6){ // down
                rotateX6 = 0;
                rotateY6 = -45;
                rotateZ6 = 0;
                angle6 = 90;
                armyCharacterComponent6.walkDirection.x = -0.5f;
//                expectedDistance.x = -0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                "expected: " + expectedDistance.x);
            }
            else if(left6) {// left
                rotateX6 = 0;
                rotateY6 = 90;
                rotateZ6 = 0;
                angle6 = 180;
                armyCharacterComponent6.walkDirection.z = -0.5f;
//                expectedDistance.z = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
            else if(right6) { // right
                rotateX6 = 0;
                rotateY6 = 0;
                rotateZ6 = 0;
                angle6 = 0;
                armyCharacterComponent6.walkDirection.z = 0.5f;
//                expectedDistance.z = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
        }

//        System.out.println(transZ);


        armyCharacterComponent6.walkDirection.add(tmp6);
        armyCharacterComponent6.walkDirection.scl(10f * delta);
        armyCharacterComponent6.characterController.setWalkDirection(armyCharacterComponent6.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        armyCharacterComponent6.ghostObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX6 = translation.x;
        transY6 = translation.y;
        transZ6 = translation.z;

        modelComponent6.instance.transform.set(new Vector3(transX6,transY6,transZ6), new Quaternion( new Vector3(rotateX6, rotateY6, rotateZ6), angle6));

        modelComponent6.instance.calculateTransforms();

        if(army6.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.IDLE)){
            expectedDistance6.x = transX6;
            expectedDistance6.z = transZ6;
//            expectX = expectedDistance.x;
//            expectZ = expectedDistance.z;
        }
        else if (army6.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.WALKING)){
            expectedDistance6.z += armyCharacterComponent6.walkDirection.z;
            expectedDistance6.x += armyCharacterComponent6.walkDirection.x;
        }

        expectZ6 = transZ6 + armyCharacterComponent6.walkDirection.z;
        expectX6 = transX6 + armyCharacterComponent6.walkDirection.x;

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
        armyCharacterComponent7.characterDirection.set(  0, 0, 0).rot(modelComponent7.instance.transform).nor();
        armyCharacterComponent7.walkDirection.set(0, 0, 0);

        if (!timerIsOn7){
            timerIsOn7 = true;
            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(40) - 20;
//                    System.out.println(randomNumber);
                    if(randomNumber >= 1){
                        army7.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.WALKING));
                    }
                    else {
                        army7.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.IDLE));
                        skip7 = false;
                    }
                    timerIsOn7 = false;
                }
            }, 3);
        }

        if(army7.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.IDLE)){
            rotateX7 = 0;
            rotateY7 = -45;
            rotateZ7 = 0;
            angle7 = 90;
            playerAnimation7.animate("Armature|ArmatureAction.001",-1,1);
        }
        else if(army7.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.WALKING)){
            playerAnimation7.animate("Armature|Walk.001",-1,1);

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
                armyCharacterComponent7.walkDirection.x = 0.5f;
//                expectedDistance.x = 0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                        "expected: " + expectedDistance.x);
            }
            else if (down7){ // down
                rotateX7 = 0;
                rotateY7 = -45;
                rotateZ7 = 0;
                angle7 = 90;
                armyCharacterComponent7.walkDirection.x = -0.5f;
//                expectedDistance.x = -0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                "expected: " + expectedDistance.x);
            }
            else if(left7) {// left
                rotateX7 = 0;
                rotateY7 = 90;
                rotateZ7 = 0;
                angle7 = 180;
                armyCharacterComponent7.walkDirection.z = -0.5f;
//                expectedDistance.z = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
            else if(right7) { // right
                rotateX7 = 0;
                rotateY7 = 0;
                rotateZ7 = 0;
                angle7 = 0;
                armyCharacterComponent7.walkDirection.z = 0.5f;
//                expectedDistance.z = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
        }

//        System.out.println(transZ);


        armyCharacterComponent7.walkDirection.add(tmp7);
        armyCharacterComponent7.walkDirection.scl(10f * delta);
        armyCharacterComponent7.characterController.setWalkDirection(armyCharacterComponent7.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        armyCharacterComponent7.ghostObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX7 = translation.x;
        transY7 = translation.y;
        transZ7 = translation.z;

        modelComponent7.instance.transform.set(new Vector3(transX7,transY7,transZ7), new Quaternion( new Vector3(rotateX7, rotateY7, rotateZ7), angle7));

        modelComponent7.instance.calculateTransforms();

        if(army7.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.IDLE)){
            expectedDistance7.x = transX7;
            expectedDistance7.z = transZ7;
//            expectX = expectedDistance.x;
//            expectZ = expectedDistance.z;
        }
        else if (army7.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.WALKING)){
            expectedDistance7.z += armyCharacterComponent7.walkDirection.z;
            expectedDistance7.x += armyCharacterComponent7.walkDirection.x;
        }

        expectZ7 = transZ7 + armyCharacterComponent7.walkDirection.z;
        expectX7 = transX7 + armyCharacterComponent7.walkDirection.x;

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
        armyCharacterComponent8.characterDirection.set(  0, 0, 0).rot(modelComponent8.instance.transform).nor();
        armyCharacterComponent8.walkDirection.set(0, 0, 0);

        if (!timerIsOn8){
            timerIsOn8 = true;
            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(40) - 20;
//                    System.out.println(randomNumber);
                    if(randomNumber >= 1){
                        army8.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.WALKING));
                    }
                    else {
                        army8.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.IDLE));
                        skip8 = false;
                    }
                    timerIsOn8 = false;
                }
            }, 3);
        }

        if(army8.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.IDLE)){
            rotateX8 = 0;
            rotateY8 = -45;
            rotateZ8 = 0;
            angle8 = 90;
            playerAnimation8.animate("Armature|ArmatureAction.001",-1,1);
        }
        else if(army8.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.WALKING)){
            playerAnimation8.animate("Armature|Walk.001",-1,1);

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
                armyCharacterComponent8.walkDirection.x = 0.5f;
//                expectedDistance.x = 0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                        "expected: " + expectedDistance.x);
            }
            else if (down8){ // down
                rotateX8 = 0;
                rotateY8 = -45;
                rotateZ8 = 0;
                angle8 = 90;
                armyCharacterComponent8.walkDirection.x = -0.5f;
//                expectedDistance.x = -0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                "expected: " + expectedDistance.x);
            }
            else if(left8) {// left
                rotateX8 = 0;
                rotateY8 = 90;
                rotateZ8 = 0;
                angle8 = 180;
                armyCharacterComponent8.walkDirection.z = -0.5f;
//                expectedDistance.z = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
            else if(right8) { // right
                rotateX8 = 0;
                rotateY8 = 0;
                rotateZ8 = 0;
                angle8 = 0;
                armyCharacterComponent8.walkDirection.z = 0.5f;
//                expectedDistance.z = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
        }

//        System.out.println(transZ);


        armyCharacterComponent8.walkDirection.add(tmp8);
        armyCharacterComponent8.walkDirection.scl(10f * delta);
        armyCharacterComponent8.characterController.setWalkDirection(armyCharacterComponent8.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        armyCharacterComponent8.ghostObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX8 = translation.x;
        transY8 = translation.y;
        transZ8 = translation.z;

        modelComponent8.instance.transform.set(new Vector3(transX8,transY8,transZ8), new Quaternion( new Vector3(rotateX8, rotateY8, rotateZ8), angle8));

        modelComponent8.instance.calculateTransforms();

        if(army8.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.IDLE)){
            expectedDistance8.x = transX8;
            expectedDistance8.z = transZ8;
//            expectX = expectedDistance.x;
//            expectZ = expectedDistance.z;
        }
        else if (army8.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.WALKING)){
            expectedDistance8.z += armyCharacterComponent8.walkDirection.z;
            expectedDistance8.x += armyCharacterComponent8.walkDirection.x;
        }

        expectZ8 = transZ8 + armyCharacterComponent8.walkDirection.z;
        expectX8 = transX8 + armyCharacterComponent8.walkDirection.x;

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
        armyCharacterComponent9.characterDirection.set(  0, 0, 0).rot(modelComponent9.instance.transform).nor();
        armyCharacterComponent9.walkDirection.set(0, 0, 0);

        if (!timerIsOn9){
            timerIsOn9 = true;
            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(40) - 20;
//                    System.out.println(randomNumber);
                    if(randomNumber >= 1){
                        army9.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.WALKING));
                    }
                    else {
                        army9.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.IDLE));
                        skip9 = false;
                    }
                    timerIsOn9 = false;
                }
            }, 3);
        }

        if(army9.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.IDLE)){
            rotateX9 = 0;
            rotateY9 = -45;
            rotateZ9 = 0;
            angle9 = 90;
            playerAnimation9.animate("Armature|ArmatureAction.001",-1,1);
        }
        else if(army9.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.WALKING)){
            playerAnimation9.animate("Armature|Walk.001",-1,1);

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
                armyCharacterComponent9.walkDirection.x = 0.5f;
//                expectedDistance.x = 0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                        "expected: " + expectedDistance.x);
            }
            else if (down9){ // down
                rotateX9 = 0;
                rotateY9 = -45;
                rotateZ9 = 0;
                angle9 = 90;
                armyCharacterComponent9.walkDirection.x = -0.5f;
//                expectedDistance.x = -0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                "expected: " + expectedDistance.x);
            }
            else if(left9) {// left
                rotateX9 = 0;
                rotateY9 = 90;
                rotateZ9 = 0;
                angle9 = 180;
                armyCharacterComponent9.walkDirection.z = -0.5f;
//                expectedDistance.z = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
            else if(right9) { // right
                rotateX9 = 0;
                rotateY9 = 0;
                rotateZ9 = 0;
                angle9 = 0;
                armyCharacterComponent9.walkDirection.z = 0.5f;
//                expectedDistance.z = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
        }

//        System.out.println(transZ);


        armyCharacterComponent9.walkDirection.add(tmp9);
        armyCharacterComponent9.walkDirection.scl(10f * delta);
        armyCharacterComponent9.characterController.setWalkDirection(armyCharacterComponent9.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        armyCharacterComponent9.ghostObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX9 = translation.x;
        transY9 = translation.y;
        transZ9 = translation.z;

        modelComponent9.instance.transform.set(new Vector3(transX9,transY9,transZ9), new Quaternion( new Vector3(rotateX9, rotateY9, rotateZ9), angle9));

        modelComponent9.instance.calculateTransforms();

        if(army9.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.IDLE)){
            expectedDistance9.x = transX9;
            expectedDistance9.z = transZ9;
//            expectX = expectedDistance.x;
//            expectZ = expectedDistance.z;
        }
        else if (army9.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.WALKING)){
            expectedDistance9.z += armyCharacterComponent9.walkDirection.z;
            expectedDistance9.x += armyCharacterComponent9.walkDirection.x;
        }

        expectZ9 = transZ9 + armyCharacterComponent9.walkDirection.z;
        expectX9 = transX9 + armyCharacterComponent9.walkDirection.x;

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
        armyCharacterComponent10.characterDirection.set(  0, 0, 0).rot(modelComponent10.instance.transform).nor();
        armyCharacterComponent10.walkDirection.set(0, 0, 0);

        if (!timerIsOn10){
            timerIsOn10 = true;
            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(40) - 20;
//                    System.out.println(randomNumber);
                    if(randomNumber >= 1){
                        army10.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.WALKING));
                    }
                    else {
                        army10.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.IDLE));
                        skip10 = false;
                    }
                    timerIsOn10 = false;
                }
            }, 3);
        }

        if(army10.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.IDLE)){
            rotateX10 = 0;
            rotateY10 = -45;
            rotateZ10 = 0;
            angle10 = 90;
            playerAnimation10.animate("Armature|ArmatureAction.001",-1,1);
        }
        else if(army10.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.WALKING)){
            playerAnimation10.animate("Armature|Walk.001",-1,1);

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
                armyCharacterComponent10.walkDirection.x = 0.5f;
//                expectedDistance.x = 0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                        "expected: " + expectedDistance.x);
            }
            else if (down10){ // down
                rotateX10 = 0;
                rotateY10 = -45;
                rotateZ10 = 0;
                angle10 = 90;
                armyCharacterComponent10.walkDirection.x = -0.5f;
//                expectedDistance.x = -0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                "expected: " + expectedDistance.x);
            }
            else if(left10) {// left
                rotateX10 = 0;
                rotateY10 = 90;
                rotateZ10 = 0;
                angle10 = 180;
                armyCharacterComponent10.walkDirection.z = -0.5f;
//                expectedDistance.z = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
            else if(right10) { // right
                rotateX10 = 0;
                rotateY10 = 0;
                rotateZ10 = 0;
                angle10 = 0;
                armyCharacterComponent10.walkDirection.z = 0.5f;
//                expectedDistance.z = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
        }

//        System.out.println(transZ);


        armyCharacterComponent10.walkDirection.add(tmp10);
        armyCharacterComponent10.walkDirection.scl(10f * delta);
        armyCharacterComponent10.characterController.setWalkDirection(armyCharacterComponent10.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        armyCharacterComponent10.ghostObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX10 = translation.x;
        transY10 = translation.y;
        transZ10 = translation.z;

        modelComponent10.instance.transform.set(new Vector3(transX10,transY10,transZ10), new Quaternion( new Vector3(rotateX10, rotateY10, rotateZ10), angle10));

        modelComponent10.instance.calculateTransforms();

        if(army10.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.IDLE)){
            expectedDistance10.x = transX10;
            expectedDistance10.z = transZ10;
//            expectX = expectedDistance.x;
//            expectZ = expectedDistance.z;
        }
        else if (army10.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.WALKING)){
            expectedDistance10.z += armyCharacterComponent10.walkDirection.z;
            expectedDistance10.x += armyCharacterComponent10.walkDirection.x;
        }

        expectZ10 = transZ10 + armyCharacterComponent10.walkDirection.z;
        expectX10 = transX10 + armyCharacterComponent10.walkDirection.x;

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
        bulletSystem.collisionWorld.removeCollisionObject(army1.getComponent(NumbersGuyCharacterComponent.class).ghostObject);
        army1.getComponent(NumbersGuyCharacterComponent.class).ghostObject.dispose();
        army1.getComponent(NumbersGuyCharacterComponent.class).ghostShape.dispose();

        bulletSystem.collisionWorld.removeCollisionObject(army2.getComponent(NumbersGuyCharacterComponent.class).ghostObject);
        army2.getComponent(NumbersGuyCharacterComponent.class).ghostObject.dispose();
        army2.getComponent(NumbersGuyCharacterComponent.class).ghostShape.dispose();

        bulletSystem.collisionWorld.removeCollisionObject(army3.getComponent(NumbersGuyCharacterComponent.class).ghostObject);
        army3.getComponent(NumbersGuyCharacterComponent.class).ghostObject.dispose();
        army3.getComponent(NumbersGuyCharacterComponent.class).ghostShape.dispose();

        bulletSystem.collisionWorld.removeCollisionObject(army4.getComponent(NumbersGuyCharacterComponent.class).ghostObject);
        army4.getComponent(NumbersGuyCharacterComponent.class).ghostObject.dispose();
        army4.getComponent(NumbersGuyCharacterComponent.class).ghostShape.dispose();

        bulletSystem.collisionWorld.removeCollisionObject(army5.getComponent(NumbersGuyCharacterComponent.class).ghostObject);
        army5.getComponent(NumbersGuyCharacterComponent.class).ghostObject.dispose();
        army5.getComponent(NumbersGuyCharacterComponent.class).ghostShape.dispose();

        bulletSystem.collisionWorld.removeCollisionObject(army6.getComponent(NumbersGuyCharacterComponent.class).ghostObject);
        army6.getComponent(NumbersGuyCharacterComponent.class).ghostObject.dispose();
        army6.getComponent(NumbersGuyCharacterComponent.class).ghostShape.dispose();

        bulletSystem.collisionWorld.removeCollisionObject(army7.getComponent(NumbersGuyCharacterComponent.class).ghostObject);
        army7.getComponent(NumbersGuyCharacterComponent.class).ghostObject.dispose();
        army7.getComponent(NumbersGuyCharacterComponent.class).ghostShape.dispose();

        bulletSystem.collisionWorld.removeCollisionObject(army8.getComponent(NumbersGuyCharacterComponent.class).ghostObject);
        army8.getComponent(NumbersGuyCharacterComponent.class).ghostObject.dispose();
        army8.getComponent(NumbersGuyCharacterComponent.class).ghostShape.dispose();

        bulletSystem.collisionWorld.removeCollisionObject(army9.getComponent(NumbersGuyCharacterComponent.class).ghostObject);
        army9.getComponent(NumbersGuyCharacterComponent.class).ghostObject.dispose();
        army9.getComponent(NumbersGuyCharacterComponent.class).ghostShape.dispose();

        bulletSystem.collisionWorld.removeCollisionObject(army10.getComponent(NumbersGuyCharacterComponent.class).ghostObject);
        army10.getComponent(NumbersGuyCharacterComponent.class).ghostObject.dispose();
        army10.getComponent(NumbersGuyCharacterComponent.class).ghostShape.dispose();

    }
}
