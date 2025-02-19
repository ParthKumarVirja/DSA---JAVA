import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets2 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> subsets = subsetsWithDup(nums);

        // Print the generated subsets
        System.out.println(subsets);
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // Sort the array to handle duplicates
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i <= nums.length; i++) {
            generateSubsets(nums, i, 0, new ArrayList<>(), result);
        }
        
        return result;
    }
    
    private static void generateSubsets(int[] nums, int length, int index, List<Integer> current, List<List<Integer>> result) {
        if (length == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = index; i <= nums.length - length; i++) {
            // Skip duplicates
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            current.add(nums[i]);
            generateSubsets(nums, length - 1, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}
