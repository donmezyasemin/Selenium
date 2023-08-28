package B171;

import warehouseoop.productpojo.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductList extends Product {



    public static Map<Integer, Product> productsMap = new HashMap<>();

    public static void ProductList(Product product) {

        productsMap.put(product.getProductId(), product);
    }
    public static void productList() {


//        products(new Product(100, "Un", "Tariş", "Çuval",9 , 1));
//        products(new Product(200, "Peynir", "Eker", "Teneke",25 , 2));
//        products(new Product(300, "Makarna", "Ankara", "Koli",100 , 3));
//        products(new Product(400, "Ayçiçek Yağı", "Orkide", "Teneke",500,4));
//        products(new Product(500, "Tuz", "Billur", "Koli",20, 5));
//        products(new Product(600, "Kırmızı Mercimek", "Besler A.Ş.", "Koli",10,5));
//        products(new Product(700, "Şeker", "Besler A.Ş.", "Çuval", 20, 6));
//        products(new Product(800, "Bulgur", "Yıldızlar Gıda A.Ş","Çuval",5,7));
//        products(new Product(900, "Domates Salçası", "Ekin A.Ş", "Teneke",60,8));
//        products(new Product(1000, "Türk Kahvesi", "Kahve Dünyası", "Koli",15,9));
    }


}
