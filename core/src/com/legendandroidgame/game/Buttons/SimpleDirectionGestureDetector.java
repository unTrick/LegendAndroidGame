package com.legendandroidgame.game.Buttons;

import com.badlogic.gdx.input.GestureDetector;

/**
 * Created by Patrick on 5/2/2017.
 */
public class SimpleDirectionGestureDetector extends GestureDetector{

	 public interface DirectionListener {
        void onLeft();

        void onRight();

        void onUp();

        void onDown();
    }

    public SimpleDirectionGestureDetector(DirectionListener directionListener) {
        super(new DirectionGestureListener(directionListener));
    }

    private static class DirectionGestureListener extends GestureAdapter{
        DirectionListener directionListener;

        public DirectionGestureListener(DirectionListener directionListener){
            this.directionListener = directionListener;
        }

        @Override
        public boolean pan(float x, float y, float deltaX, float deltaY) {
            if(Math.abs(deltaX)>Math.abs(deltaY)){
                if(deltaX>0){
                    directionListener.onRight();
                }else{
                    directionListener.onLeft();
                }
            }else{
                if(deltaY>0){
                    directionListener.onDown();
                }else{
                    directionListener.onUp();
                }
            }
            return super.pan( x,  y,  deltaX,  deltaY);
        }

    }

}

