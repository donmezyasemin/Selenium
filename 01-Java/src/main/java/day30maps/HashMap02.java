package day30maps;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

        HashMap<String, Integer > stdAges = new HashMap<>();
        stdAges.put("Suat",36);
        stdAges.put("Yusuf",33);
        stdAges.put("Serkant",26);
        stdAges.put("Emin",19);
        stdAges.put("Alparslan",30);
        stdAges.put("Alparslan",33);

        //key'i tekrarli kullandigimizda hata vermez, en son verilen entry nin degerini kabul eder
        //Bu yontem value guncellemede kullanilabilir. Buna "overwrite" denir
        System.out.println(stdAges);//{Suat=36, Yusuf=33, Alparslan=30, Serkant=26, Emin=19}

        //replace() methodu value lari keyleri kullanarak update etmeye yarar
        stdAges.replace("Alparslan",19);
        System.out.println(stdAges);

        //replace("Serkant",26,23); methodu mapin icinde Key ve Value kismi eslesirse gunceller
        stdAges.replace("Serkant",26,23);
        System.out.println(stdAges);

        //putIfAbsent("Ali",30); methodu Mapde Ali key olarak yoksa Ali key ini 30 valuesu ile ekler varsa eklemez
        stdAges.putIfAbsent("Ali",30);
        System.out.println(stdAges);//{Suat=36, Yusuf=33, Alparslan=19, Serkant=23, Emin=19, Ali=30}

        System.out.println(stdAges.get("Yusuf"));//33
        System.out.println(stdAges.getOrDefault("Yusuf", 0));//33

        //eger eleman mapte yoksa get() method null verir
        //getOrDefault() methodu ise sizin belirttiginiz degeri verir
        System.out.println(stdAges.get("Fatih"));//null
        System.out.println(stdAges.getOrDefault("Fatih", 0));//0

        //containsValue(313) methodu value larin icinde 313 un olup olmadigini kontrol eder
        System.out.println(stdAges.containsValue(313));//false

        //containsKey("Yusuf") methodu key lerin icinde Yusuf un olup olmadigini kontrol eder
        System.out.println(stdAges.containsKey("Yusuf"));//true

        //remove("Emin") methodu key kullanarak entry i silemeye yarar
        stdAges.remove("Emin");
        System.out.println(stdAges);

        //remove("Suat",36); methodu hem key hem value kismini kontrol eder, eslesirse siler
        stdAges.remove("Suat",36);
        System.out.println(stdAges);

    }
}
