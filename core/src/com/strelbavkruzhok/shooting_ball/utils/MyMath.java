package com.strelbavkruzhok.shooting_ball.utils;

import com.badlogic.gdx.math.MathUtils;

public class MyMath {
    public static boolean calculateProbability(int percentage) {
        return MathUtils.random(0, 100) <= percentage;
    }
}
