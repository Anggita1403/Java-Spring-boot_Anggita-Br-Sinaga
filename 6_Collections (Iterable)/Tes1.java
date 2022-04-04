import java.util.Locale;
import java.util.Scanner;

public class Tes1 {
    public static void main(String[] args) {

        int vokal = 0;
        int konsonan = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Kalimat: ");
        String huruf = input.nextLine();

        huruf = huruf.toLowerCase(Locale.ROOT);

        for(int i = 0; i<huruf.length(); i++){

            if (huruf.charAt(i)==' '){
                continue;
            }else if (huruf.charAt(i)=='a' || huruf.charAt(i)=='i' || huruf.charAt(i)=='u' || huruf.charAt(i)=='e' || huruf.charAt(i)=='o'){
                vokal++;
            }else {
                konsonan++;
            }
        }

        System.out.println("Jumlah Vokal : " + vokal);
        System.out.println("Jumlah Konsonan : " + konsonan);
        System.out.println("Total Karakter : " + (konsonan+vokal));
    }

}
