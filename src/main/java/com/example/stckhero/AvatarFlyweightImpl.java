package com.example.stckhero;


import javafx.scene.image.Image;

public class AvatarFlyweightImpl implements AvatarFlyweight {
    private Image image;

    public AvatarFlyweightImpl(String imagePath) {
        this.image = new Image(getClass().getResourceAsStream(imagePath));
    }

    @Override
    public Image getImage() {
        return image;
    }
}

