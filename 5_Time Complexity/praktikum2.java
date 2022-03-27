public class coba2 {public static void main(String[] args)
    {
       Scanner input=new Scanner(System.in);

            System.out.print("Masukkan Bilangan berpangkat:");

            int x=input.nextInt();

            System.out.print("Masukkan Banyak pangkat:");

            int n= input.nextInt();
            System.out.printf("%d", power(3, 2));
            
          
          }
      static int power(int x, int n)
      {int hasil = 1;
      for (int i=0; i<n ; i++ ) 
      { hasil *= x ; } 
        return hasil;    
      }
    


}
