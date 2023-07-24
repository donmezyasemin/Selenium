package B171;
import warehouseoop.style.Utils;



public class EntryValidation {

    public static int productIdEntry(){
        int id=0;
        String regexTurkceKarakterler="[0-9]+";
        String productId="";
        boolean validInput = false;
        while (!validInput) {
            System.out.println();
            Utils.errTrow("Ürün numarası giriniz:");
            productId = Utils.input.nextLine().trim();
            if (productId.isEmpty()||  productId.contains(" ") ||!productId.matches(regexTurkceKarakterler)) {
                Utils.cursorSetting("Ürün numarası hatalı girildi. Tekrar deneyiniz.");
                continue;
            }
            validInput = true;
        }
        try {
            id=Integer.parseInt(productId);
        } catch (NumberFormatException e) {
            Utils.cursorSetting("Hatalı giriş tekrar deneyiniz.");
        }
        return id;
    }

    public static String productEntry() {
        String regexTurkceKarakterler="[\\\\p{L}ÇçĞğİıÖöŞşÜü\\\\s]+";;
        String productName="";
        boolean validInput = false;
        while (!validInput) {
            Utils.errTrow("Ürün ismini giriniz:");
            productName = Utils.input.nextLine().trim();
            if (productName.isEmpty() ||productName.matches(regexTurkceKarakterler)) {
                Utils.cursorSetting("Ürün ismi hatalı girildi. Tekrar deneyiniz.");
                continue;
            }
            validInput = true;
            return productName;
        }
        return productName;

    }

    public static String producerEntry(){
            String regexTurkceKarakterler="[\\\\p{L}ÇçĞğİıÖöŞşÜü\\\\s]+";
            String producer="";
            boolean validInput = false;
            while (!validInput) {
                Utils.errTrow("Üretici firmayı giriniz:");
                producer = Utils.input.nextLine().trim();
                if (producer.isEmpty() || producer.matches(regexTurkceKarakterler)) {
                    Utils.cursorSetting("Uretici firma hatalı girildi. Tekrar deneyiniz.");
                    continue;
                }
                validInput = true;
                return producer;
            }

return producer;
        }



    public static String unitEntry(){
String regexTurkceKarakterler="[a-zA-Z\\u011F\\u011E\\u0131\\u0130\\u00F6\\u00D6\\u015F\\u015E\\u00FC\\u00DC\\u00E7\\u00C7]+";
        String unit="";
        boolean validInput = false;
        while (!validInput) {
            Utils.errTrow("Birim giriniz:");
            unit = Utils.input.nextLine().trim();
            if (unit.isEmpty() || unit.contains(" ") || !unit.matches(regexTurkceKarakterler)) {
                Utils.cursorSetting("Birim hatalı girildi. Tekrar deneyiniz.");
                continue;
            }
            validInput = true;
            return unit;
        }
        return unit;
    }

    public static int amountEntry(){
        String regexTurkceKarakterler="[0-9]+";
        String amount="";
        boolean validInput = false;
        int amountState=0;
        while (!validInput) {
            Utils.errTrow("Miktar giriniz:");
            amount = Utils.input.nextLine().trim();
            if (amount.isEmpty() || amount.contains(" ") || !amount.matches(regexTurkceKarakterler)) {
                Utils.cursorSetting("Miktar hatalı girildi. Tekrar deneyiniz.");
                continue;
            }
            validInput = true;
             amountState=Integer.parseInt(amount);
            return amountState;
        }
        return amountState;
    }

    public static int selfEntry(){
        String regexTurkceKarakterler="[0-9]+";
        String self="";
        boolean validInput = false;
        int selfState=0;
        while (!validInput) {
            Utils.errTrow("Raf bilgisini giriniz:");
            self = Utils.input.nextLine().trim();
            if (self.isEmpty() || self.contains(" ") || !self.matches(regexTurkceKarakterler)) {
                Utils.cursorSetting("Raf bilgisi hatalı girildi. Tekrar deneyiniz.");
                continue;
            }
            validInput = true;
            selfState=Integer.parseInt(self);
            return selfState;

        }
        return selfState;
    }

}

