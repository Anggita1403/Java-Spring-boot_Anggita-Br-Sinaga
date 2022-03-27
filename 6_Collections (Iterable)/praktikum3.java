import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class praktikum3 {
    public static void main(String[] args) {
        System.out.println(PairSum(List.of(1, 2, 3, 4, 6), 6));
    }

    static List<Integer> PairSum(List<Integer> arr , Integer target){
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> mapper = new HashMap<>();

        for (int i = 0; i < arr.toArray().length; i++) {

            int sideResult = target - arr.get(i);

            // if sideResult is exist or not in mapper
            if (mapper.get(sideResult) != null) {
                result.add(mapper.get(sideResult));
                result.add(i);
                break;
            }

            // fill value of arr in mapper
            mapper.put(arr.get(i), i);
        }

        return result;
    }  
 }
