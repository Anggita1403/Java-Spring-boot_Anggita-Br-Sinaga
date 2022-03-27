import java.util.List;

public class praktikum6 {
    public static void main(String[] args) {
        System.out.println(maximumSubArray(List.of(2, 1, 5, 1, 3, 2), 3));
        System.out.println(maximumSubArray(List.of(2, 3, 4, 1, 5), 2));

    }

    public static int maximumSubArray(List<Integer> data, int max) {
        int result = 0;
        int tempResult = 0;
        // ambil max terdepan
        for (int j = 0; j < max; j++) {
            result += data.get(j);
        }
        tempResult = result;
        if (data.toArray().length > max) {
            // setiap iterasi dikurangi dengan data yang paling awal dan ditambahkan data paling akhir
            for (int i = max; i < data.toArray().length; i++) {
                tempResult -= data.get(i - (max));
                tempResult += data.get(i);
                if (tempResult > result) {
                    result = tempResult;
                }
            }
        }
        return  result;
    }
}
