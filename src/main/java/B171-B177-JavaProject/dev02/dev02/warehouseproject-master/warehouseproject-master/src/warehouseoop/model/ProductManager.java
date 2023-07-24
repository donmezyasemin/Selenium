package B171;
import warehouseoop.productpojo.Product;
import warehouseoop.productpojo.ProductList;
import java.util.*;



public  class ProductManager {

    private String name;

    public ProductManager() {
        this.name = "Full-Stack Developer team Dev-02";
    }

    public static Map<Integer, Product> productsMap = new HashMap<>();


    public static void products(Product product) {

        productsMap.put(product.getProductId(), product);
    }
    public void listFill() {
        ProductList.productList();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}