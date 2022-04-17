import java.util.Scanner;
public class Menampilkan_bilangan_prima {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int bil, awal, akhir;
        
         System.out.println("PROGRAM JAVA MENAMPILKAN DERET BILANGAN PRIMA");
         System.out.print("Mulai dari : 2 ");
         awal=input.nextInt();
         System.out.print("Sampai : 29 ");
         akhir=input.nextInt();
         System.out.println("----------------------------------------------");
        for (int i=awal; i<=akhir; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                System.out.print(i+" ");
            }             
        }    
   }
}