import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNum {


    public int getMissing(int[] nums, int maxNum) {
        int expectedSum = 0;
        for (int i = 1; i <= maxNum; i += 1) {
            expectedSum += i;
        }

        int actualSum = Arrays.stream(nums).sum();

        return expectedSum - actualSum;
    }
}
