package leetcode._2411;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _2231main {
    public int largestInteger(int num) {
        List<Integer> evenNumber = new ArrayList<>();
        List<Integer> oddNumber = new ArrayList<>();
        List<Integer> originalNumber = new ArrayList<>();

        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            originalNumber.add(digit);
            if (digit % 2 == 0) {
                evenNumber.add(digit);
            } else {
                oddNumber.add(digit);
            }
            temp /= 10;
        }

        Collections.reverse(originalNumber);

        Collections.sort(evenNumber, Collections.reverseOrder());
        Collections.sort(oddNumber, Collections.reverseOrder());

        StringBuilder result = new StringBuilder();
        int evenIndex = 0, oddIndex = 0;

        for (int digit : originalNumber) {
            if (digit % 2 == 0) {
                result.append(evenNumber.get(evenIndex++));
            } else {
                result.append(oddNumber.get(oddIndex++));
            }
        }

        return Integer.parseInt(result.toString());
    }
}
