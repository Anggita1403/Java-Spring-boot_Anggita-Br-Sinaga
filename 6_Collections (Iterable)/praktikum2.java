import java.util.ArrayList;
import java.util.Arrays;

public class praktikum2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {7, 6, 5, 2, 3, 7, 5, 2};
        Arrays.sort(arr);
        int max = Arrays.stream(arr).max().getAsInt();
        int [] freq = new int[max+1];
        for (int i=0; i<arr.length; i++)
            ++freq[ arr[i] ];
        for (int e : arr)
            if (freq[ e ] == 1)
                list.add( e );
        System.out.println(list);
            }
}
