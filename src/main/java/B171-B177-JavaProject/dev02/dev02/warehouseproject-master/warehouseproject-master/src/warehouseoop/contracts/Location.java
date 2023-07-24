package B171;
import warehouseoop.model.ProductManager;


public abstract class Location {
   ProductManager productManager;
   String info;

    public Location(ProductManager productManager, String pagesInfo) {
        this.productManager = productManager;
        this.info = pagesInfo;
    }//product manager belirleme zorunlu tutuldu
    public abstract boolean onLocation();//her sayfanın navigasyon işlemi için düşünüldü






}
