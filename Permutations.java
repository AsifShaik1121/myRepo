package IMP;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	
    public static List<String> findPermutations(String str) {
        List<String> result = new ArrayList<>();
        permute(str.toCharArray(), 0, result);
        return result;
    }

    private static void permute(char[] arr, int index, List<String> result) {
        if (index == arr.length - 1) {
            result.add(new String(arr));
        } else {
            for (int i = index; i < arr.length; i++) {
                swap(arr, index, i);
                permute(arr, index + 1, result);
                swap(arr, index, i); // Backtrack to restore the original order for the next iteration.
            }
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String str = "ABC";
        List<String> permutations = findPermutations(str);
        System.out.println("All permutations of \"" + str + "\":");
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }
}

