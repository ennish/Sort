package app;

import java.util.Random;

/**
 * NumsArrayGenerator
 */
public class NumsArrayGenerator {

    private int[] NUMS;

    public NumsArrayGenerator() {

    }

    public int[] generateNums(int n) {
        Random random = new Random();
        NUMS = new int[random.nextInt(100)];
        for (int i = 0; i < NUMS.length; i++) {

        }
        return null;
    }
}