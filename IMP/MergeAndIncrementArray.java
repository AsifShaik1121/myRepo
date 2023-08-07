package IMP;

import java.util.Arrays;

public class MergeAndIncrementArray {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 7};
        int[] resultArray = mergeIncrementAndSplit(inputArray);
        System.out.println("Input Array: " + Arrays.toString(inputArray));
        System.out.println("Result Array: " + Arrays.toString(resultArray));
    }

    public static int[] mergeIncrementAndSplit(int[] inputArray) {
        // Step 1: Merge all array values into a single integer
        int mergedValue = 0;
        for (int num : inputArray) {
            mergedValue = mergedValue * 10 + num;
        }

        // Step 2: Increment the merged value by 1
        mergedValue++;

        // Step 3: Split the incremented value back into an array
        int[] resultArray = new int[inputArray.length];
        for (int i = inputArray.length - 1; i >= 0; i--) {
            resultArray[i] = mergedValue % 10;
            mergedValue /= 10;
        }

        return resultArray;
    }
}

