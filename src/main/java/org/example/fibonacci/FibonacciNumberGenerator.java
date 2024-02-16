package org.example.fibonacci;

import java.util.ArrayList;
import java.util.List;

public final class FibonacciNumberGenerator {

    public static int generate(int position) {
        if(position == 0 || position == 1) {
            return position;
        }
        List<Integer> fiboNumbers = new ArrayList<>();
        fiboNumbers.add(0);
        fiboNumbers.add(1);

        for (int i = 2; i <= position; i++) {
            int fiboNumber = fiboNumbers.get(i - 1) + fiboNumbers.get(i - 2);
            fiboNumbers.add(fiboNumber);
        }
        return fiboNumbers.get(position);
    }
}
