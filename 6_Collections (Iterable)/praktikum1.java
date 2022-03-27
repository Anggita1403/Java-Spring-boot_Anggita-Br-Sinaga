import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class praktikumsec6 {
    public static void main(String[] args) {
        System.out.println(ArrayMerge(
                List.of("lee", "jin"),
                List.of("panda", "kazuya")));
    }

    static List<String> ArrayMerge(List<String> arrayA, List<String> arrayB) {

        HashSet<String> mapper = new HashSet<>();

        for (var arrA : arrayA) {
            mapper.add(arrA);
        }

        for (var arrB : arrayB) {
            mapper.add(arrB);
        }

        List<String> hasil = new ArrayList<>(mapper);
        return hasil;
    }

}
