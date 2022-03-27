import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class praktikum4 {
    public static void main(String[] args) {
        System.out.println(ArrayUnique(List.of(1, 2, 3, 4), List.of(1, 3, 5, 10, 16)));
        System.out.println(ArrayUnique(List.of(3, 8), List.of(2, 8)));

    }

    public static List<Integer> ArrayUnique(List<Integer> arrA, List<Integer> arrB) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Boolean> mapArrB = new HashMap<>();
        for (int v : arrB) {
            mapArrB.put(v, true);
        }
        for (int v : arrA) {
            if (mapArrB.get(v) == null) {
                result.add(v);
            }
        }
        return result;
    }
}
