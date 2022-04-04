import java.util.Locale;
import java.util.Scanner;

public class Tes2 {
    public static void main(String[] args) {

        int o = 0;
        int x = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Input: ");
        String huruf = input.nextLine();

        huruf = huruf.toLowerCase(Locale.ROOT);

        for(int i = 0; i<huruf.length(); i++){

            if (huruf.charAt(i)=='x'){
                x++;
            }else if (huruf.charAt(i)=='o'){
                o++;
            }
        }

        if (x==o){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

}
