package com.legendandroidgame.game.BibleBooks;

import com.badlogic.gdx.scenes.scene2d.Stage;

import static com.legendandroidgame.game.LegendAndroidGame.genesisChOne;
import static com.legendandroidgame.game.LegendAndroidGame.genesisChThree;
import static com.legendandroidgame.game.LegendAndroidGame.genesisChTwo;

/**
 * Created by Patrick on 7/28/2017.
 */
public class BibleStacks {

    private Stage stage;
    private float time;
    private float minute = 60;

    private GenesisStack genesisStack;
    private ExodusStack exodusStack;
    private LeviticusStack leviticusStack;
    private NumbersStack numbersStack;
    private DeuteronomyStack deuteronomyStack;
    private JoshuaStack joshuaStack;


    public BibleStacks(String biblename, int chapter, int verse) {

        genesisStack = new GenesisStack();
        exodusStack = new ExodusStack();
        leviticusStack = new LeviticusStack();
        numbersStack = new NumbersStack();
        deuteronomyStack = new DeuteronomyStack();
        joshuaStack = new JoshuaStack();


        // ito yung patern
        // the 2 represents the minutes, then the 30 represents the seconds. change mo lang yan. verse 16 chapter 1 yan ng genesis.
        // thanks ! .\m/
        // time =  (2 * minute) + 30; // verse 16 chapter 1 genesis

        timePicker(biblename, chapter, verse);
    }

    public void timePicker(String biblename, int chapter, int verse){
        if(biblename.equals("genesis")){
            genesisStack.genSwitch(chapter, verse);
        }
        else if(biblename.equals("exodus")){
            exodusStack.exoSwitch(chapter, verse);
        }
        else if(biblename.equals("leviticus")){
            leviticusStack.levSwitch(chapter, verse);
        }
        else if(biblename.equals("numbers")){
            numbersStack.numSwitch(chapter, verse);
        }
        else if(biblename.equals("deuteronomy")){
            deuteronomyStack.deuSwitch(chapter, verse);
        }
        else if(biblename.equals("joshua")){
            joshuaStack.josSwitch(chapter, verse);
        }

    }

    public void play(String biblename, int chapter){
        if(biblename.equals("genesis")){
            switch (chapter){
                case 1: genesisChOne.play();
                    genesisChOne.setPosition(time);
                break;
                case 2: genesisChTwo.play();
                    genesisChTwo.setPosition(time);
                break;
                case 3: genesisChThree.play();
                    genesisChThree.setPosition(time);
                break;
            }

        }
        else if(biblename.equals("exodus")){
        }
        else if(biblename.equals("exodus")){

        }
        else if(biblename.equals("exodus")){

        }
        else if(biblename.equals("exodus")){

        }
        else if(biblename.equals("exodus")){

        }

        else {
            genesisChTwo.play();
        }
    }


    public void render(){
        genesisStack.render();
        exodusStack.render();
        deuteronomyStack.render();
        leviticusStack.render();
        numbersStack.render();
        joshuaStack.render();
    }

    public void dispose(){
        deuteronomyStack.dispose();
    }
}
