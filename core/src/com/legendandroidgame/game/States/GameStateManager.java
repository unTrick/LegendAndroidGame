package com.legendandroidgame.game.States;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;
/**
 * Created by Patrick on 5/2/2017.
 */
public class GameStateManager {

    private Stack<GameState> states;

    public GameStateManager(){
        states = new Stack<GameState>();
    }

    public void push(GameState state){
        states.push(state);
    }

    public void pop(){
        states.pop();
    }

    public void set(GameState state){
        states.pop();
        states.push(state);
    }

    public void update(float dt){
        states.peek().update(dt);
    }

    public void render(SpriteBatch sb){
        states.peek().render(sb);
    }
}
