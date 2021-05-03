package com.senla.dataprocessor;

import java.util.Random;

public class Generator {
    public static int getRandomID() {
        Random random = new Random();
        return    (random.nextInt(8000)  + 1000)
                + (random.nextInt(1000)  + 100 ) * 2
                + (random.nextInt(100)   + 10  ) * 3
                + (random.nextInt(10)    + 1   ) * 5;
    }
}
