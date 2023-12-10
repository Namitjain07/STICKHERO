package com.example.stckhero;

// AvatarFlyweightFactory.java
import java.util.HashMap;
import java.util.Map;

public class AvatarFlyweightFactory {
    private static final Map<String, AvatarFlyweight> flyweights = new HashMap<>();

    public static AvatarFlyweight getAvatarFlyweight(String imagePath) {
        if (!flyweights.containsKey(imagePath)) {
            flyweights.put(imagePath, new AvatarFlyweightImpl(imagePath));
        }
        return flyweights.get(imagePath);
    }
}

