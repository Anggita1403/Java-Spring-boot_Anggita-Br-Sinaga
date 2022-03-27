import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class praktikum5 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(List.of(2, 3, 3, 3, 6, 9, 9)));
        System.out.println(removeDuplicates(List.of(2, 2, 2, 11)));
    }

    public static int removeDuplicates(List<Integer> data) {
        Set<Integer> result = new HashSet<>();
        for (int v : data) {
            result.add(v);
        }
        return result.toArray().length;
    }
}
