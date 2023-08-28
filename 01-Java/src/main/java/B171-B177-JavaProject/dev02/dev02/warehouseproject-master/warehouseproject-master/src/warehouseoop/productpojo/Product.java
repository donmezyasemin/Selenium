package B171;

import warehouseoop.model.ProductManager;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Product extends ProductManager {

    private int productId;
    private String product;
    private  String producer;
    private String unit;
    private int amount;
    private int self;

    public static Map<Integer, Product> productsMap = new HashMap<>();
    public static Set<Map.Entry<Integer, Product>> productsDetail = productsMap.entrySet();
    public static Set<Integer> idNumber = productsMap.keySet();
  public Product(){}
    public Product(int productId, String product, String producer, String unit, int amount, int self) {
        this.productId = productId;
        this.product = product;
        this.producer = producer;
        this.unit = unit;
        this.amount = amount;
        this.self = self;

      }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getSelf() {
        return self;
    }

    public void setSelf(int self) {
        this.self = self;
    }
}










