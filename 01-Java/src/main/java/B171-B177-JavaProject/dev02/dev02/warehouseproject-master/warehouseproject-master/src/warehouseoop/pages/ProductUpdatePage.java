package B171;
import warehouseoop.contracts.IDescriptionAndLocation;
import warehouseoop.contracts.Location;
import warehouseoop.controller.EntryValidation;
import warehouseoop.productpojo.Product;
import warehouseoop.model.ProductManager;
import warehouseoop.style.Utils;
import java.util.Map;
import static warehouseoop.model.ProductManager.*;


public class ProductUpdatePage extends Location implements IDescriptionAndLocation {



    public ProductUpdatePage(ProductManager productManager) {
        super(productManager, "ÜRÜN GÜNCELLEME SAYFASI");
    }


    ProductManager pm = new ProductManager();


    public void productUpdate() {

        for (Map.Entry<Integer, Product> w : productsMap.entrySet()) {
            int id = EntryValidation.productIdEntry();
            System.out.println();
            Utils.errTrow(id + " numaralı Ürün: " + productsMap.get(id).getProduct());
            System.out.println();
            String newProduct = EntryValidation.productEntry();
            productsMap.get(id).setProduct(newProduct);
            System.out.println();

            String newCompany = EntryValidation.producerEntry();
            productsMap.get(id).setProducer(newCompany);
            System.out.println();

            String newUnit = EntryValidation.unitEntry();
            productsMap.get(id).setUnit(newUnit);


            int newAmount = EntryValidation.amountEntry();
            productsMap.get(id).setAmount(newAmount);
            System.out.println();

            int newShelf = EntryValidation.selfEntry();
            productsMap.get(id).setSelf(newShelf);
            Utils.onePruductTable(productsMap.get(id).getProductId(),
                    productsMap.get(id).getProduct(),
                    productsMap.get(id).getProducer(),
                    productsMap.get(id).getUnit(),
                    productsMap.get(id).getAmount(),
                    productsMap.get(id).getSelf());
            break;
        }

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
        productUpdate();
        Utils.menu();
        return false;
    }




    @Override
    public String info() {
        String s=" ";
        String str= Utils.ANSI_CYAN+"\n"
                +s.repeat(36)+"Bu lokasyonda,uygulama sizden ürüne ait bütün bigileri güncellemenizi bekleyecektir.\n"
                +s.repeat(36)+"Lütfen raf numarası vereceğiniz ürünün listeden kontrolünü yapınız daha önce verilmiş\n"
                +s.repeat(36)+"bir raf numarası girmeyiniz.Ancak burası güncelleme esnasında kullanıcının insiyatifine\n."
                +s.repeat(35)+"bırakılmıştır. Hata yaptığınızı düşünürseniz raf numarasını uygulamaya yaptırmak için\n"
                +s.repeat(36)+"ürünü rafa yerleştir butonu ile işleminizi düzeltebilirsiniz.\n";
        return str;
    }

    @Override
    public String pageDescription() {
        String s=" ";
        String str=s.repeat(13)+"\uD83D\uDED2"+"\uD83E\uDDC0"+"\uD83C\uDF56"
                +"\uD83E\uDDC2"+"\uD83E\uDDC8"+"\uD83C\uDF57"
                +"\uD83E\uDD6B"+"\uD83E\uDDC3"+"\uD83C\uDF7C"
                +s.repeat(2)+"ÜRÜN GÜNCELLEME SAYFASI"+s.repeat(1)
                +"\uD83D\uDED2"+"\uD83E\uDDC0"+"\uD83C\uDF56"
                +"\uD83E\uDDC2"+"\uD83E\uDDC8"+"\uD83C\uDF57"
                +"\uD83E\uDD6B"+"\uD83E\uDDC3"+"\uD83C\uDF7C";
        return str;

    }



}
