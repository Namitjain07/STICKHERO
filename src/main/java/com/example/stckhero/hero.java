package com.example.stckhero;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class hero {
    private hero(){};
    public static hero newhero=null;
    public static hero getInstance(){
        if (newhero==null){
            newhero=new hero();
        }
        return newhero;
    }
    private ImageView staic_walk;
    private ImageView walk1;
    private ImageView walk2;
    private ImageView walk3;
    private double X_Position;
    private double Y_Position;
    private boolean is_up;
    private boolean is_walking;

    public void setIs_up(boolean is_up) {
        this.is_up = is_up;
    }

    public void setIs_walking(boolean is_walking) {
        this.is_walking = is_walking;
    }
    public boolean getIs_up(){

        return is_up;
    }

    public boolean getIs_walking() {
        return is_walking;
    }
}
