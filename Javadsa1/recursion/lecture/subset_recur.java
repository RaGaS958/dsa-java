import java.util.ArrayList;
import java.util.List;

public class subset_recur {

    public static void main(String[] args) {
        int [] nums={1,2,3};
        List<List<Integer>> list=subsets(nums);
        System.out.println(list);
    }
    public static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, arr, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int index, int[] arr, List<Integer> current, List<List<Integer>> result)
    {
        result.add(new ArrayList<>(current));
        for (int i = index; i < arr.length; i++) {
            current.add(arr[i]);
            backtrack(i + 1, arr, current, result);
            current.remove(current.size() - 1);
        }
    }


}
