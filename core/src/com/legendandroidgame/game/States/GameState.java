package com.legendandroidgame.game.States;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Patrick on 5/2/2017.
 */
public abstract class GameState {

    protected GameStateManager gsm;

    protected GameState(GameStateManager gsm){
        this.gsm = gsm;

    }

    protected abstract void handleInput();
    public abstract void update(float dt);
    public abstract void render(SpriteBatch sb);
    public abstract void dispose();
    public abstract void resize(int width, int height);

}
