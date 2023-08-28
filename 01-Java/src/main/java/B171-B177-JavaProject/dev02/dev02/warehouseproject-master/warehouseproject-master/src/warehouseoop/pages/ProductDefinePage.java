package B171;

import warehouseoop.contracts.IDescriptionAndLocation;
import warehouseoop.contracts.Location;
import warehouseoop.controller.EntryValidation;
import warehouseoop.model.ProductManager;
import warehouseoop.productpojo.Product;
import warehouseoop.style.Utils;

import static warehouseoop.model.ProductManager.productsMap;


public class ProductDefinePage extends Location implements IDescriptionAndLocation {

    private  HomePage homePage;
    private  ShowProductList showProductList;

    public ProductDefinePage(ProductManager productManager) {
        super(productManager, "ÜRÜN TANIMLAMA SAYFASI");
    }

    ProductManager pm = new ProductManager();


    public void productDefine(Product urun)  {//ürün tanımlama metodu test edildi


        int counter=100;
        int miktar=0, raf=0;
        int i = 0;


        String newProduct = EntryValidation.productEntry();//ürün ismini kullanıcıdan ister
        System.out.println();
        urun.setProduct(newProduct);
        System.out.println();
        String newCompany = EntryValidation.producerEntry();
        System.out.println();
        urun.setProducer(newCompany);
        System.out.println();
        String newUnit = EntryValidation.unitEntry();
        System.out.println();
        urun.setUnit(newUnit);
        urun.setSelf(raf);
        System.out.println();
        if(productsMap.size()!=0){

            counter=100+(productsMap.size()*counter);
        }else{
            counter=100;
        }


        urun.setProductId(counter);//test ederken
        productsMap.put(urun.getProductId(), urun);


        Utils.onePruductTable(urun.getProductId(), urun.getProduct(), urun.getProducer(), urun.getUnit(), urun.getAmount(), urun.getSelf());

    }

    public HomePage getHomePage() {
        return homePage;
    }

    public void setHomePage(HomePage homePage) {
        this.homePage = homePage;
    }

    public ShowProductList getShowProductList() {
        return showProductList;
    }

    public void setShowProductList(ShowProductList showProductList) {
        this.showProductList = showProductList;
    }

    @Override
    public boolean onLocation() {
        String setPage="\n";
        Utils.infoPage(pm.getName().toUpperCase());
        System.out.println(setPage.repeat(1));
        Utils.versionText(pageDescription()+"\n"+info());
        System.out.println(setPage.repeat(8));
        productDefine(new Product());
        Utils.menu();
        return true;

    }


    @Override
    public String info() {
        String s=" ";

        String str= Utils.ANSI_CYAN
                +s.repeat(40)+"Ürün tanımlama lokasyonundasınız Uygulama bu lokasyonda; ürüneleri tanımlamanızı\n"
                +s.repeat(45)+"bekler sizden işlenen bilgileri adım adım kayıt altına alacaktır.\n";

        return str;

    }

    @Override
    public String pageDescription() {
        String s=" ";
        String str=s.repeat(13)+"\uD83D\uDED2"+"\uD83E\uDDC0"+"\uD83C\uDF56"
                +"\uD83E\uDDC2"+"\uD83E\uDDC8"+"\uD83C\uDF57"
                +"\uD83E\uDD6B"+"\uD83E\uDDC3"+"\uD83C\uDF7C"
                +s.repeat(2)+"ÜRÜN TANIMLAMA SAYFASI"+s.repeat(2)
                +"\uD83D\uDED2"+"\uD83E\uDDC0"+"\uD83C\uDF56"
                +"\uD83E\uDDC2"+"\uD83E\uDDC8"+"\uD83C\uDF57"
                +"\uD83E\uDD6B"+"\uD83E\uDDC3"+"\uD83C\uDF7C";
        return str;
    }
}
