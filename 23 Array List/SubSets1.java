import java.util.ArrayList;
import java.util.List;

public class SubSets1 {

    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        List<List<Integer>> subsets = subsets(num);

        // Print the generated subsets
        System.out.println(subsets);
    }

    public static List<List<Integer>> subsets(int[] nums) {
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
            current.add(nums[i]);
            generateSubsets(nums, length - 1, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}
