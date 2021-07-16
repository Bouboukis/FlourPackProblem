package com.georgioskachrimanis.javacourse;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int total = (bigCount * 5) + smallCount;

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if (total < goal){
            return false;
        }

        return (goal % 5 <= smallCount);
    }
}