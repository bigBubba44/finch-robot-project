package com.lnlhbbq;

import com.birdbrain.Finch;

public class FinchFinal {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

        //Get moving
        myFinch.setMove("F", 10, 100);
        myFinch.setTurn("R", 90, 100);
        myFinch.setMove("F", 10, 100);
        myFinch.setTurn("R", 160, 100);
        myFinch.setMove("F", 15, 100);
        myFinch.setTurn("R", 160, 100);
        myFinch.setMove("F", 15, 100);
        myFinch.setTurn("R", 160, 100);
        myFinch.setMove("F", 16, 100);
        myFinch.setTail(1,0,100,0);
        myFinch.setBeak(0,100,0);

    }
}
