package GenericMethod;

import GenericClass.Ogrenci;

public class Main {
    public static void main(String[] args) {
        //generic method sayesinde birden fazla method u bir method ile yazarak halledebiliriz

      /*  Character[] characters={'J','A','V','A'};
        Integer[] integers={1,2,3,4,5};
        String[] strings={"Java","Python","C++","Php"};
        Ogrenci[] ogrencis={new Ogrenci("Mustafa"),new Ogrenci("Mehmet"),new Ogrenci("Ayse")};

        yazdir(characters);
        System.out.println("**************************");
        yazdir(strings);
        System.out.println("**************************");
        yazdir(integers);
        System.out.println("**************************");
        yazdir(ogrencis); */
        Sayisal sayisal1=new Sayisal(30,40,20,30);
        Sayisal sayisal2=new Sayisal(40,45,2,25);

        Sayisal birinci=birinci(sayisal1,sayisal2);
        System.out.println("Birinci öğrencinin puanı : "+birinci.puanHesapla());

        EsitAgirlik esitAgirlik1=new EsitAgirlik(30,40,20,2);
        EsitAgirlik esitAgirlik2=new EsitAgirlik(35,10,15,6);

        EsitAgirlik birinci2=birinci(esitAgirlik1,esitAgirlik2);
        System.out.println("Eşitağırlık birinci öğrenci puanı : "+birinci2.puanHesapla());
    }


    public static <Object extends Aday> Object birinci(Object e1,Object e2){
        if (e1.puanHesapla()>e2.puanHesapla()){
            return e1;
        }else return e2;
    }


   /* public static <E> void yazdir(E[] dizi){

        for (E e:dizi) {
            System.out.println(e);
        }
    }*/
}
