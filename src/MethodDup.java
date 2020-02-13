import java.util.HashMap;
import java.util.Map;

public class MethodDup {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,2};
        int[] array2 = {1,2,3,4,20,5};
        int[] array3 = {333,222,222,111,222,222,222,333};

        searchDuplicate(array1);
        searchDuplicate(array2);
        searchDuplicate(array3);
    }

    static void searchDuplicate(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                int value = map.get(arr[i]);
                value++;
                map.put(arr[i], value);
            } else  {
                map.put(arr[i], 1);
            }
        }
        boolean check = false;
        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            if (item.getValue() >= 2) {
                check = true;
                System.out.println("Value - " + item.getKey() + " repeat " + item.getValue() + " times");
            }
        }
        if (!check) {
            System.out.println("Duplicates not found");
        }
    }
}
