package GenericClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Generic class lar data türünden bağımsız işlemler yapabildiğimiz class lardır.

        Character[] characters={'J','A','V','A'};
        Integer[] integers={1,2,3,4,5};
        String[] strings={"Java","Python","C++","Php"};
        Ogrenci[] ogrencis={new Ogrenci("Mustafa"),new Ogrenci("Mehmet"),new Ogrenci("Ayse")};

        CharYazdir.yazdir(characters);
        System.out.println("*********************************");
        IntegerYazdir.yazdir(integers);
        System.out.println("*********************************");
        StringYazdir.yazdir(strings);
        System.out.println("*********************************");
        OgrenciYazdir.yazdir(ogrencis);
    }
}
