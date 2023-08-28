package day31mapsexceptions;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {

        //HashMap arkasinda calisan mekanizma nasil?
        HashMap<String, String> captials = new HashMap<>();
        captials.put("USA", "Washington");
        captials.get("USA");
        captials.put("Italy","Roma");
        captials.put("Turkiye","Ankara");
        captials.get("Turkiye");
        captials.put("Italy","Floransa");
        System.out.println(captials.hashCode());

    }

}
