package B171;
import warehouseoop.contracts.IDescriptionAndLocation;
import warehouseoop.contracts.Location;
import warehouseoop.controller.EntryValidation;
import warehouseoop.model.ProductManager;
import warehouseoop.style.Utils;
import static warehouseoop.model.ProductManager.productsMap;


public class OutputProductPage extends Location implements IDescriptionAndLocation {

    ProductManager pm=new ProductManager();

    public OutputProductPage(ProductManager productManager) {
        super(productManager, "ÜRÜN ÇIKIŞ SAYFASI");
    }




    public int outputProduct() {
        ProductManager pm = new ProductManager();
        ShowProductList sp = new ShowProductList(pm);
        ProductManager productManager = new ProductManager();
        //ShowProductList showProductList();
        String title;
        title = "Ürünün numarasını giriniz: ";
        int eskiMiktar = 0;
        int id = 0;

        try {
            id = EntryValidation.productIdEntry();
            Utils.errTrow(id + " numaralı Ürün: " + productsMap.get(id).getProduct());
        } catch (NullPointerException e) {
            Utils.cursorSetting("Lütfen listede bulunan bir ürün numarası giriniz");
        }

        int miktar = 0;
        try {
            eskiMiktar = productsMap.get(id).getAmount();
            System.out.println();
            miktar = EntryValidation.amountEntry();


            if (miktar < 0) {
                Utils.errTrow("Geçerli bir değer giriniz : ");
            }
            int yeniMiktar = miktar;
            miktar = productsMap.get(id).getAmount() - miktar;

            if (miktar < 0 || miktar > productsMap.get(id).getAmount()) {
                Utils.cursorSetting(Utils.ANSI_KIRMIZI + "Depoda talep edilen miktar kadar ürün bulunmamaktadır : ");
                System.out.println();
                Utils.cursorSetting(Utils.ANSI_MOR + "Talep Edilen Miktar: " + yeniMiktar);
                Utils.cursorSetting(Utils.ANSI_MOR + "Raftaki Miktar: " + eskiMiktar);
            } else if (miktar == 0) {
                System.out.println();
                Utils.cursorSetting(Utils.ANSI_KIRMIZI + "Depoda ürün kalmadı raf boş! : ");
                System.out.println();
                productsMap.get(id).setAmount(0);
                productsMap.get(id).setSelf(0);
                System.out.println();
                Utils.errTrow("Ürüne ait detaylı bilgi: ");
                System.out.println();
                productsMap.get(id).setAmount(miktar);
                Utils.onePruductTable(productsMap.get(id).getProductId(),
                        productsMap.get(id).getProduct(),
                        productsMap.get(id).getProducer(),
                        productsMap.get(id).getUnit(),
                        productsMap.get(id).getAmount(),
                        productsMap.get(id).getSelf());
            } else {
                Utils.errTrow("Ürüne ait detaylı bilgi: ");
                System.out.println();
                productsMap.get(id).setAmount(miktar);
                Utils.onePruductTable(productsMap.get(id).getProductId(),
                        productsMap.get(id).getProduct(),
                        productsMap.get(id).getProducer(),
                        productsMap.get(id).getUnit(),
                        productsMap.get(id).getAmount(),
                        productsMap.get(id).getSelf());
            }
        } catch (NullPointerException e) {
            Utils.cursorSetting("Hatalı giriş yaptınız tekrar deneyiniz.");
        }




        return miktar;

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
        outputProduct();
        Utils.menu();
        return true;
    }



    @Override
    public String info() {
        String s=" ";
        String str= Utils.ANSI_CYAN+"\n"
                +s.repeat(36)+"Bu lokasyonda, uygulama sizden depodan çıkış yapılacak ürünlerin ürün numarasına göre\n"
                +s.repeat(36)+"miktarını girmenizi isteyecektir. Uygulama girilen miktarı rafta bulunan aynı\n"
                +s.repeat(36)+"ürün numarası ile kayıtlı olan ürünlerden çıkararak kalan miktarı size sunacaktır.\n."
                +s.repeat(35)+"Rafta  ürün kalamadı ise uyarı verecektir. Çıkışı yapılacak ürün miktarı raftaki üründen\n"
                +s.repeat(36)+"fazla ise uygulama sizi uyaracaktır.\n";
        return str;
    }
    @Override
    public String pageDescription() {
        String s=" ";
        String str=s.repeat(13)+"\uD83D\uDED2"+"\uD83E\uDDC0"+"\uD83C\uDF56"
                +"\uD83E\uDDC2"+"\uD83E\uDDC8"+"\uD83C\uDF57"
                +"\uD83E\uDD6B"+"\uD83E\uDDC3"+"\uD83C\uDF7C"
                +s.repeat(2)+"ÜRÜN ÇIKIŞ SAYFASI"+s.repeat(1)
                +"\uD83D\uDED2"+"\uD83E\uDDC0"+"\uD83C\uDF56"
                +"\uD83E\uDDC2"+"\uD83E\uDDC8"+"\uD83C\uDF57"
                +"\uD83E\uDD6B"+"\uD83E\uDDC3"+"\uD83C\uDF7C";
        return str;

    }
}