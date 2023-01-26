package GenericMethod;

import GenericClass.Ogrenci;

public class Main {
    public static void main(String[] args) {
        //generic method sayesinde birden fazla method u bir method ile yazarak halledebiliriz

        Character[] characters={'J','A','V','A'};
        Integer[] integers={1,2,3,4,5};
        String[] strings={"Java","Python","C++","Php"};
        Ogrenci[] ogrencis={new Ogrenci("Mustafa"),new Ogrenci("Mehmet"),new Ogrenci("Ayse")};

        yazdir(characters);
        System.out.println("**************************");
        yazdir(strings);
        System.out.println("**************************");
        yazdir(integers);
        System.out.println("**************************");
        yazdir(ogrencis);
    }
    public static <E> void yazdir(E[] dizi){

        for (E e:dizi) {
            System.out.println(e);
        }
    }
}
