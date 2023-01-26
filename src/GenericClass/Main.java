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

        YazdirmaSinifi<Character> yazdir_char=new YazdirmaSinifi<>();
        YazdirmaSinifi<Integer> yazdir_int=new YazdirmaSinifi<>();
        YazdirmaSinifi<String> yazdir_string=new YazdirmaSinifi<>();
        YazdirmaSinifi<Ogrenci> yazdir_ogrnc=new YazdirmaSinifi<>();

        yazdir_char.yazdir(characters);
        System.out.println("*********************************");
        yazdir_string.yazdir(strings);
        System.out.println("*********************************");
        yazdir_int.yazdir(integers);
        System.out.println("*********************************");
        yazdir_ogrnc.yazdir(ogrencis);
    }
}
