package B171;

import warehouseoop.contracts.IDescriptionAndLocation;
import warehouseoop.contracts.Location;
import warehouseoop.model.ProductManager;
import warehouseoop.productpojo.Product;
import warehouseoop.style.Utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TreeMap;

import static warehouseoop.model.ProductManager.productsMap;


public class ShowProductList extends Location implements IDescriptionAndLocation {



    public ShowProductList(ProductManager productManager) {
        super(productManager, "ÜRÜN LİSTELEME SAYFASI");

    }
ProductManager pm=new ProductManager();


    public static LocalDateTime tarih = LocalDateTime.now();
    public static DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public static String tarihFormat = tarih.format(format);


    public  void showProducList() {//ürün listeleme metodu



        Utils.headerTable(tarihFormat);//------------------header-----------------------
        Map<Integer, Product> mapTreeMap = new TreeMap<Integer, Product>(productsMap);//treeMap' e dönüştürülereke alfabetik olarak sıralandı
        for (Map.Entry<Integer, Product> products : mapTreeMap.entrySet()) {//--------------body------------
            Utils.bodyTable(products.getValue().getProductId(), products.getValue().getProduct(),
                    products.getValue().getProducer(), products.getValue().getUnit(),
                    products.getValue().getAmount(),products.getValue().getSelf());        }
        Utils.footerTable();//----------------------------footer-------------------------
        System.out.println();
        System.out.println();


    }

    public static void showList() {//ürün listeleme metodu
        Utils.headerTable(tarihFormat);//------------------header-----------------------
        Map<Integer, Product> mapTreeMap = new TreeMap<Integer, Product>(productsMap);//treeMap' e dönüştürülereke alfabetik olarak sıralandı
        for (Map.Entry<Integer, Product> products : mapTreeMap.entrySet()) {//--------------body------------
            Utils.bodyTable(products.getValue().getProductId(), products.getValue().getProduct(),
                    products.getValue().getProducer(), products.getValue().getUnit(),
                    products.getValue().getAmount(),products.getValue().getSelf());        }
        Utils.footerTable();//----------------------------footer-------------------------
        System.out.println();
        System.out.println();


    }




    @Override
    public boolean onLocation() {
        System.out.println("\n");
        String s=" ";
        String setPage="\n";
        System.out.println(setPage.repeat(5));
        Utils.versionText(
                s.repeat(5)+pageDescription()+"\n"
                        +s.repeat(65)+pm.getName().toUpperCase()+"\n"
                        +s.repeat(29) +info());
        System.out.println(setPage.repeat(2));
        showProducList();
        Utils.menu();
        return true;
    }



    @Override
    public String info() {
        String s=" ";
        String str= Utils.ANSI_CYAN+s.repeat(7)+"Ürün Listeleme sayfasındasınız Uygulama bu lokasyonda; tanımladığınız tüm ürünleri\n" +
                s.repeat(38)+"başlık bölümünde bir zaman damgası ile listeleyip ekrana yansıtacaktır.";

        return str;
    }

    @Override
    public String pageDescription() {

        String s=" ";
        String str=s.repeat(13)+"\uD83D\uDED2"+"\uD83E\uDDC0"+"\uD83C\uDF56"
                +"\uD83E\uDDC2"+"\uD83E\uDDC8"+"\uD83C\uDF57"
                +"\uD83E\uDD6B"+"\uD83E\uDDC3"+"\uD83C\uDF7C"
                +s.repeat(2)+"ÜRÜN LİSTELEME SAYFASI"+s.repeat(1)
                +"\uD83D\uDED2"+"\uD83E\uDDC0"+"\uD83C\uDF56"
                +"\uD83E\uDDC2"+"\uD83E\uDDC8"+"\uD83C\uDF57"
                +"\uD83E\uDD6B"+"\uD83E\uDDC3"+"\uD83C\uDF7C";
                   return str;
    }

}
