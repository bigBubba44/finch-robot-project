package com.lnlhbbq;

import com.birdbrain.Finch;

public class PracticeFinch {
    public static void main(String[] args) {
        Finch bird = new Finch();
        bird.setMotors(-50,50);
        bird.setTurn("R",90,50);
        bird.stop();
        bird.disconnect();
    }
}
