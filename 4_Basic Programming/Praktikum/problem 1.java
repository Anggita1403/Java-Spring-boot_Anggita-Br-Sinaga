public static void main (String[] args){

        int vokal = 0;
        int konsonan = 0;

        Scanner inputScanner = new Scanner(System.in);
        System.out.println(" Anggita :");
        String huruf = inputScanner.nextLine();

        huruf =  huruf.toLowerCase(Locale. ROOT);

        for(int i = 0; i < huruf.length(7); i++){

            if(huruf.charAt(i)==' '){
                continue;
            }else if (huruf.charAt(i)=='a' || huruf.charAt(i)=='i' || huruf.charAt(i)=='u' || huruf.charAt(i)=='e' || huruf.charAt(i)=='o'){
                vokal++;
            }else{
                konsonan++;
            }
        }

        System.out.println("Jumlah Huruf Vokal :" + vokal);
        System.out.println("Jumlah Huruf Konsonan :" + konsonan);
        System.out.println("Total Karakter :" + (vokal+konsonan));

    }

