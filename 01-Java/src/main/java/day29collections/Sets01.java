package day29collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
    public static void main(String[] args) {
        /*
            1) Set ler tekrarsiz eleman (unique) depolamak icin kullanilir
            2) 3 tane Set class vardir
                a)HashSet Class:
                    "Hash" benzersiz bir id olusturma teknigidir. Bu teknige "Hashing Technique" denir.
                    "HashSet" elemanlari rastgele siralar
                    "HashSet" elemanlari siralamadigindan cok hizli calisir
                    "HashSetler" null i eleman olarak kabul eder

                b)LinkedHashSet Class:
                    "LinkedHashSet"ler elemanlari sizin verdiginiz siraya gore (insertion order) dizdiklerinden
                    "HashSet"lere gore yavastirlar
                    "LinkedHashSet" ler tekrarsiz eleman depolamak icindir

                c)TreeSet Class:
                    "TreeSet" ler elemanlari natural order(kucukten buyuge yada alfabetik sira) a gore dizerler
                    En yavas Set "TreeSet"tir
            3) TreeSet coook yavas oldugundan mumkun oldugu kadar TreeSet kullanmamaya calisiriz
         */

        HashSet<String> hs = new HashSet<>();
        hs.add("Mustafa");
        hs.add("Suat");
        hs.add("Saadet");
        hs.add("Fevzi");
        hs.add("Ali");
        hs.add("Veli");
        hs.add("Can");
        hs.add(null);
        System.out.println(hs);//[[null, Can, Mustafa, Suat, Veli, Saadet, Fevzi, Ali]

        hs.add("Mustafa");//Tekrarli eleman eklediginizde hata vermez ama tekrarli elemani sadece bir kere ekler
        System.out.println(hs);//[null, Can, Mustafa, Suat, Veli, Saadet, Fevzi, Ali]
        System.out.println(hs.hashCode());

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(7);
        lhs.add(19);
        lhs.add(13);
        lhs.add(-35);
        lhs.add(null);
        lhs.add(null);
        System.out.println(lhs);//[7, 19, 13, -35, null]

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(7);
        ls.add(119);
        ls.add(13);
        ls.add(353);
        ls.add(313);

        lhs.retainAll(ls);
        System.out.println(lhs);//[7, 13]
        System.out.println(ls);//[7, 119, 13, 353, 313]


        TreeSet<Character> ts = new TreeSet<>();

        ts.add('E');
        ts.add('G');
        ts.add('B');
        ts.add('A');
        ts.add('L');
        ts.add('T');
        ts.add('Z');
       // ts.add(null);//TreeSet lere null eklenemez
        System.out.println(ts);//[A, B, E, G, L, T, Z]

        System.out.println(ts.first());//A
        System.out.println(ts.last());//Z


        System.out.println(ts.lower('E'));//B ==> Verilen eleman olan E den bir onceki elemani verir
        System.out.println(ts.lower('F'));//E
        System.out.println(ts.lower('A'));//null


        System.out.println(ts.higher('L'));//T ==> Verilen eleman olan L den bir sonraki elemani verir
        System.out.println(ts.higher('N'));//T ==> Verilen eleman olan L den bir sonraki elemani verir

        System.out.println(ts.headSet('G'));//[A, B, E]
        System.out.println(ts.headSet('G',true));//[A, B, E, G]

        System.out.println(ts.tailSet('L'));//[L, T, Z]
        System.out.println(ts.tailSet('L',false));//[T, Z]

        System.out.println(ts.ceiling('T'));//T
        System.out.println(ts.ceiling('O'));//T

        System.out.println(ts.floor('B'));//B
        System.out.println(ts.floor('D'));//B

        System.out.println(ts.subSet('B', 'L'));//[B, E, G]
        System.out.println(ts.subSet('B',false, 'L',true));//[E, G, L]

    }
}
