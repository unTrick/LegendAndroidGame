package com.legendandroidgame.game.Maps;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.legendandroidgame.game.Buttons.ActualGameButtons;
import com.legendandroidgame.game.Buttons.Controller;
import com.legendandroidgame.game.GameWorlds.DeveloperWorld;
import com.legendandroidgame.game.HUD.HUD;
import com.legendandroidgame.game.LegendAndroidGame;
import com.legendandroidgame.game.PopupBox.*;
import com.legendandroidgame.game.States.GameState;
import com.legendandroidgame.game.States.GameStateManager;

/**
 * Created by Patrick on 2/3/2018.
 */
public class DeveloperMap extends GameState {

    private Stage stage;
    private float delta;
    private HUD hud;
    private ActualGameButtons actualGameButtons;
    private Controller controller;
    private InsideGameMenu insideGameMenu;

    private DeveloperWorld developerWorld;

    public DeveloperMap(GameStateManager gsm) {
        super(gsm);

        stage = new Stage(LegendAndroidGame.gameView);
        hud = new HUD(stage);
        actualGameButtons = new ActualGameButtons(stage);
        controller = new Controller(stage);
        insideGameMenu = new InsideGameMenu(stage);

        developerWorld = new DeveloperWorld(controller, actualGameButtons);
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {
        handleInput();
        delta = dt;
//        gameCam.update();
        hud.getMapName().setText("DEVELOPER");

        hud.curLocation = developerWorld.curLocation;
        hud.expectedLocation = developerWorld.expectedLocation;

        hud.updated(dt);
        actualGameButtons.update();
    }

    @Override
    public void render(SpriteBatch sb) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        developerWorld.render(delta);
        stage.draw();
    }

    @Override
    public void dispose() {
        developerWorld.dispose();

        hud.dispose();
        actualGameButtons.dispose();
        controller.dispose();
        insideGameMenu.dispose();
        stage.dispose();
    }

    @Override
    public void resize(int width, int height) {
        developerWorld.resize(width, height);
    }
}
