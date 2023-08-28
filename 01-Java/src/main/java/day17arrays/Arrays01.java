package day17arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //Array leri kisa yoldan nasil olusturabiliriz?
        int arr [] = {63,7,312,8,4};
        System.out.println(Arrays.toString(arr));//[63, 7, 313, 8, 4]

        //Ornek 1: Verilen array de kac tane cift sayi kac tane tek sayi oldugunu bulan kodu yaziniz.

        int sayac=0;

        for( int w : arr){
            if(w%2==0){
                sayac++;
            }
        }
        System.out.println("Array de " + sayac+ " adet cift sayi "+(arr.length-sayac)+" adet tek sayi kullanilmistir" );

        // Ornek 2: Size verilen bir string array deki isimlerden 5 character den az character icerenleri console a yazdiriniz

        String stdNames [] = new String[5];

        stdNames [0]="Ajda";
        stdNames [1]="Ayhan";
        stdNames [2]="Tom";
        stdNames [3]="Cuneyt";
        stdNames [4]="Filiz";

                            //Ajda , Ayhan, Tom, Cuneyt, Filiz
        for (String w: stdNames) {
            if(w.length()<5){
                System.out.println(w);

            }
        }

        //Ornek 3: Size verilen bir string array deki isimleri alfabetik siraya koyduktan sonra
        // "F" ile baslayan isimler haric diger isimleri console a yazdiriniz.

        //Note 1: sort() methodu sayisal data type larini kucukten buyuge siralar (ascending order)
        //Note 2: sort() methodu string data typelarini alfabetik olarak siralar (alphabetical order)
        //Note 3: ascending order + alphabetical order ==> Natural Order
        //Note 4: sort() methodu array elemanlarini Natural order a gore siralar

        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));//[Ajda, Ayhan, Cuneyt, Filiz, Tom]

                                //[Ajda, Ayhan, Cuneyt, Filiz, Tom]
        for(String w : stdNames){

          if(w.startsWith("F")){
                continue;
            }
            System.out.println(w);

        }


    }
}
