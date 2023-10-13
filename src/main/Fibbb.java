package main;


public class Fibbb {
    public int[] Fibbbi(int numbers) {
        int[] actualSequence = new int[numbers];

        if (numbers >= 1) {
            actualSequence[0] = 0;
        }
        if (numbers >= 2) {
            actualSequence[1] = 1;
        }

        for (int i = 2; i < numbers; i++) {
            actualSequence[i] = actualSequence[i - 1] + actualSequence[i - 2];
        }

        return actualSequence;
    }

}

