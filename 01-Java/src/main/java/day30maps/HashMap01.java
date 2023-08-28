package day30maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {

        /*
        1) Map lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir
        2) Key kismi tekrarsiz, value kismi tekrarli olabilir
        3) Maplerdeki her bir elemana Entry denilir, tamamina ise EntrySet denir
        4) Entry ler tekrarsiz oldugu icin EntrySet denir
        5) Key ve value lar ayri ayri data typelarinda olabilirler
        6) Map ler collection degildir farkli bir yapidir
        7) HashMap ler entryleri rastgele siralar, bu yuzden en hizli map dir
         */
        //Map nasil olusturulur?
        HashMap<String, Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkey", 83000000);
        countryPopulation.put("Netherland", 18000000);
        System.out.println(countryPopulation);//{Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000}

        //get() methodu "key" ile calisir ve value kismini verir.
        int usaPopulation = countryPopulation.get("Turkey");
        System.out.println(usaPopulation);//83000000

        //Butun keyleri nasil alabiliriz?
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);//[Netherland, USA, Turkey, Germany, Albania]

        //Butun valuelari nasil alabiliriz?
        Collection<Integer> value = countryPopulation.values();
        System.out.println(value);//[18000000, 400000000, 83000000, 83000000, 3000000]

        //Ornek : CountryPopulation mepindeki ulkelerin nufuslarinin ortalamasi nedir?
        Collection<Integer> values = countryPopulation.values();

        int sum = 0;
        for (Integer w : values) {
            sum = sum + w;
        }
        System.out.println(sum / values.size());//117400000


        //Loop lar mapler ile kullanilamaz, bunun icin entrySet methodunu kullaniriz
        //entrySet() mapteki entry leri kalip halinde alip bize Set in icine koyarak verir
        Set<Map.Entry<String, Integer>> entries = countryPopulation.entrySet();
        System.out.println(entries);//[Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000]


        //Ornek 2 : countryPopulation Map indeki ulkelerin isimlerinin character sayisi ile nufuslarin toplamini bulunuz

        int toplam = 0;
                                            //[Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000]
        for (Map.Entry<String, Integer> w : entries) {

            toplam = toplam + w.getKey().length() + w.getValue();

        }
        System.out.println(toplam);//587000033


    }
}
