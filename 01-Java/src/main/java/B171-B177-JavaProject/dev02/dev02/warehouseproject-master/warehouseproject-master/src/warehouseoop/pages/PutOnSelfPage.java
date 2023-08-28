package B171;

import warehouseoop.contracts.IDescriptionAndLocation;
import warehouseoop.contracts.Location;
import warehouseoop.controller.EntryValidation;
import warehouseoop.model.ProductManager;
import warehouseoop.productpojo.Product;

import warehouseoop.style.Utils;

import java.util.Map;

import static warehouseoop.model.ProductManager.productsMap;

import static warehouseoop.style.Utils.input;

public class PutOnSelfPage extends Location implements IDescriptionAndLocation {

    private  HomePage homePage;
    private  ShowProductList showProductList;
    private String pageName;
    public PutOnSelfPage(ProductManager productManager) {
        super(productManager, "ÜRÜN RAFA YERLEŞTİRME SAYFASI");






    }

    ProductManager pm=new ProductManager();

    public void putOnSelf() {



        int result = 1, miktar = 0, id = 0;
        String selectMiktar;
        for (Map.Entry<Integer, Product> w : productsMap.entrySet()) {
            id = EntryValidation.productIdEntry();
            result = id / 10;
            result /= 10;
            if (result <= 0 || result > productsMap.size()) {
                Utils.errTrow("id numarası listede yok");
                break;
            }
            Utils.doublebuttonDesign("EVET 'E'", "HAYIR 'H'");
            Utils.errTrow("Miktar bilgisini değiştirmek isitiyor musunuz?");

            selectMiktar = input.next().toUpperCase();
            if (selectMiktar.equals("E")) {
                Utils.errTrow("Ürün Miktarını giriniz: ");
                miktar = input.nextInt();
                productsMap.get(id).setAmount(miktar += productsMap.get(id).getAmount());
                productsMap.get(id).setSelf(result);
                Utils.onePruductTable(productsMap.get(id).getProductId(),//--------ONE PRODUCT TABLE----------
                        productsMap.get(id).getProduct(),
                        productsMap.get(id).getProducer(),
                        productsMap.get(id).getUnit(),
                        productsMap.get(id).getAmount(),
                        productsMap.get(id).getSelf());
                break;

            } else {
                Utils.errTrow(Utils.ANSI_YEŞİL + "Miktar Güncellenmedi");
                break;
            }
        }




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

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    @Override
    public boolean onLocation() {

        String s=" ";
        String setPage="\n";
        System.out.println(setPage.repeat(5));
        Utils.versionText(
                s.repeat(5)+pageDescription()+"\n"
                +s.repeat(60)+pm.getName().toUpperCase()+"\n"
                              +s.repeat(40) +info());
        System.out.println(setPage.repeat(2));
        ShowProductList.showList();
        Utils.menu();
        putOnSelf();


        return true;
    }


    @Override
    public String info() {
        String s=" ";
        String str= Utils.ANSI_CYAN+"\n"
                +s.repeat(35)+"Bu lokasyonda,uygulama sizden depodan çıkış yapılacak ürünlerin ürün numarasına göre\n"
                +s.repeat(35)+"miktarını girmenizi isteyecektir. Uygulama girilen miktarı rafta bulunan aynı\n"
                +s.repeat(35)+"ürün numarası ile kayıtlı olan ürünlerle toplayıp toplam miktarı size sunacaktır\n."
                +s.repeat(45)+"Ayrıca sizi ürünü rafa yerleştirmekle uğraştırmayacaktır.\n"
                +s.repeat(47)+"Özel bir hesaplama yaparak ürünü rafa yerleştirecektir.\n";
        return str;
    }

    @Override
    public String pageDescription() {
        String s=" ";
        String str=s.repeat(13)+"\uD83D\uDED2"+"\uD83E\uDDC0"+"\uD83C\uDF56"
                +"\uD83E\uDDC2"+"\uD83E\uDDC8"+"\uD83C\uDF57"
                +"\uD83E\uDD6B"+"\uD83E\uDDC3"+"\uD83C\uDF7C"
                +s.repeat(2)+"ÜRÜN RAFA YERLEŞTİR"+s.repeat(1)
                +"\uD83D\uDED2"+"\uD83E\uDDC0"+"\uD83C\uDF56"
                +"\uD83E\uDDC2"+"\uD83E\uDDC8"+"\uD83C\uDF57"
                +"\uD83E\uDD6B"+"\uD83E\uDDC3"+"\uD83C\uDF7C";
        return str;
    }
}


