package com.legendandroidgame.game.CutScenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.legendandroidgame.game.Buttons.CutSceneButtons;
import com.legendandroidgame.game.LegendAndroidGame;
import com.legendandroidgame.game.States.GameState;
import com.legendandroidgame.game.States.GameStateManager;
import com.legendandroidgame.game.States.LoadScreen;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 10/23/2017.
 */
public class Ending extends GameState {
    private Stage stage;
    private CutSceneButtons cutSceneButtons;
    private FileHandle fontFile;
    private String current = gameData.getString("current");
    private Label triv1lbl, triv2lbl;
    private String msg1, msg2;

    private int counter = 1;

    public Ending(final GameStateManager gsm) {
        super(gsm);

        fontFile = Gdx.files.internal("font/Candarab.ttf");
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(fontFile);
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 30;
        BitmapFont font = generator.generateFont(parameter);

        stage = new Stage(LegendAndroidGame.gameView);
        cutSceneButtons = new CutSceneButtons(stage);
        Gdx.input.setInputProcessor(stage);

        msg1 = "Joshua 19:49-50 When they had finished distributing the several territories \n" +
                "of the land as inheritances, the people of Israel gave an inheritance among \n" +
                " them to Joshua the son of Nun. By command of the LORD they gave him the city \n" +
                "that he asked, Timnath-serah in the hill country of Ephraim. And he rebuilt the \n" +
                "city and settled in it";
        msg2 = "Joshua 24: 29-31 After these things Joshua the son of Nun, the servant of the LORD, \n" +
                " died, being 110 years old. And they buried him in his own inheritance at Timnath-serah,\n" +
                " which is in the hill country of Ephraim, north of the mountain of Gaash. Israel served\n" +
                " the LORD all the days of Joshua, and all the days of the elders who outlived Joshua and\n" +
                " had known all the work that the LORD did for Israel.";

        triv1lbl = new Label(msg1, new Label.LabelStyle(font, Color.WHITE));
        triv2lbl = new Label(msg2, new Label.LabelStyle(font, Color.WHITE));


        triv1lbl.setPosition(Gdx.graphics.getWidth() / 2 - triv1lbl.getWidth() / 2 ,
                Gdx.graphics.getHeight() / 2 - triv1lbl.getHeight() / 2);
        triv2lbl.setPosition(Gdx.graphics.getWidth() / 2 - triv2lbl.getWidth() / 2 ,
                Gdx.graphics.getHeight() / 2 - triv2lbl.getHeight() / 2);

        cutSceneButtons.continueBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                if (counter >= 2){
                    gameData.putInteger(current + " missionId", 0);
                    gameData.putInteger(current + " from", 6);
                    gameData.flush();
                    gsm.set(new LoadScreen(gsm,12));
                    dispose();
                }
                else {
                    counter += 1;
                }

                return false;
            }

        });


        cutSceneButtons.skipBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){
                gameData.putInteger(current + " missionId", 0);
                gameData.putInteger(current + " from", 6);
                gsm.set(new LoadScreen(gsm,12));
                dispose();

                return false;
            }

        });
    }

    @Override
    protected void handleInput() {
        switch (counter){
            case 1: stage.addActor(triv1lbl);
                stage.addActor(cutSceneButtons.skipBtn);
                stage.addActor(cutSceneButtons.continueBtn);
                break;
            case 2: triv1lbl.remove();
                cutSceneButtons.skipBtn.remove();
                cutSceneButtons.continueBtn.remove();
                stage.addActor(triv2lbl);
                stage.addActor(cutSceneButtons.continueBtn);
                break;
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    public void remove(){
        cutSceneButtons.continueBtn.remove();
    }

    @Override
    public void render(SpriteBatch sb) {
        stage.draw();
    }

    @Override
    public void dispose() {
        stage.dispose();
        cutSceneButtons.dispose();
    }

    @Override
    public void resize(int width, int height) {

    }
}
