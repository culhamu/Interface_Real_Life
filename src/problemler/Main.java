package problemler;

import java.util.Scanner;

public class Main {
    //Basit Matematik ve Fizik problemleri
    //Dairenin alani
    //Ucgenin cevresi
    //3 boyutlu Vektorun ic carpimi
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Matematik ve Fizik Problemleri programına hoşgeldiniz...");
        String islemler="İşlemler...\n"+
                        "1-Daire alanı hesaplama\n"+
                        "2-Üçgenin çevresini hesaplama\n"+
                        "3-İki Vektörün iç çarpımını hesaplama\n"+
                        "Çıkış: Q";
        while (true){
            System.out.println(islemler);
            System.out.print("İşlemi seçiniz : ");
            String islem=scan.nextLine();

            if (islem.equalsIgnoreCase("q")){
                System.out.println("Sistemden çıkılıyor...");
                System.exit(0);
            }else if(islem.equals("1")) {
            System.out.println("Dairenin yarıçapı : ");
            int yaricap=scan.nextInt();
            scan.nextLine();
            Problem.Matematik.daireAlan(yaricap);
            } else if (islem.equals("2")) {
                System.out.print("Kenar 1 : ");
                int kenar1=scan.nextInt();
                System.out.print("Kenar 2 : ");
                int kenar2=scan.nextInt();
                System.out.print("Kenar 3 : ");
                int kenar3=scan.nextInt();
                scan.nextLine();
                Problem.Matematik.ucgenCevresi(kenar1,kenar2,kenar3);
            } else if (islem.equals("3")) {
                Vec vec1=new Vec("Vektör1");
                Vec vec2=new Vec("Vektör2");

                Problem.Fizik.icCarpim(vec1,vec2);

            }else {
                System.out.println("Geçersiz işlem...");
            }



        }
    }
}
