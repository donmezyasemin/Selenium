package B171;

import warehouseoop.contracts.IDescriptionAndLocation;
import warehouseoop.contracts.Location;
import warehouseoop.model.ProductManager;
import warehouseoop.style.Utils;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class ExitPage extends Location implements IDescriptionAndLocation {

ProductManager pm=new ProductManager();
    public ExitPage(ProductManager productManager) {
        super(productManager, "UYGULAMA ÇIKIŞ SAYFASI");
    }


    public void printGroup(){
        List<String> list= new ArrayList<>();
        list.add("Mentor Betül Hoca");
        list.add("Tüm Dev-02 Team");
        list.add("author@ Team Lead Mehmet Duran Kaya");
        list.add("author@ Songül Çelik");
        list.add("author@ Tansu Gezgin");
        list.add("author@ Abdulkadir Bayram");
        list.add("author@ Elif Sude Türker");
        list.add("author@ Emre Akkaş");
        list.add("author@ Fevzi Baykuş");
        list.add("author@ Hasan Bülbül");
        list.add("author@ Mustafa Akın");
        list.add("author@ Süleyman Sönmezcan");
        list.add("author@ Tuğba Akdoğan");
        list.add("author@ Yasin Sarıçam");



String s=" ";
        System.out.println(Utils.ANSI_SARI+s.repeat(60)+"✩｡:*•.─────  ❁ ❁  ─────.•*:｡✩");
        list.
                stream().
                forEach(t-> System.out.println(Utils.ANSI_SARI+s.repeat(69)+ t));
        System.out.println(Utils.ANSI_SARI+s.repeat(60)+"✩｡:*•.─────  ❁ ❁  ─────.•*:｡✩");
    }
    public void seeYouLater(){
        List<String> list= new ArrayList<>();
        list.add("Mentor Betül Hoca");
        list.add("Team Lead Mehmet Duran Kaya");
        list.add("Songül Çelik");
        list.add("Tansu Gezgin");
        list.add("Abdulkadir Bayram");
        list.add("Elif Sude Türker");
        list.add("Emre Akkaş");
        list.add("Fevzi Baykuş");
        list.add("Hasan Bülbül");
        list.add("Mustafa Akın");
        list.add("Süleyman Sönmezcan");
        list.add("Tuğba Akdoğan");
        list.add("Yasin Sarıçam");
        list.add("Tüm Dev-02 Takımı");
        list.add("Bizi izlediğiniz için teşekkür ederiz.");

        String s=" ";
        System.out.println(Utils.ANSI_SARI+s.repeat(60)+"✩｡:*•.─────  ❁ ❁  ─────.•*:｡✩");
        list.
                stream().
                forEach(t-> System.out.println(Utils.ANSI_MOR+s.repeat(69)+ t + "\uD83D\uDC4B" ));
        System.out.println(Utils.ANSI_SARI+s.repeat(60)+"✩｡:*•.─────  ❁ ❁  ─────.•*:｡✩");
    }
    public void appExit()  {

        Utils.cursorSetting("Programdan çıkmak istedinize emin misiniz?");
        Utils.doublebuttonDesign(" EVET 'E'"," HAYIR 'H'");
        Utils.errTrow("Çıkmak için 'E' Kalmak 'H' tuşuna basınız.");


        String secim= null;
        try {
            secim = Utils.input.nextLine().toUpperCase();
        } catch (InputMismatchException e) {
            throw new RuntimeException(e);
        }
        if(secim.equals("E")){

            Utils.cursorSetting(Utils.ANSI_CYAN+"DEV-02 Takım adına Takım Leed Mehmet Duran Kaya sundu ");
            System.out.println();
            seeYouLater();
            Utils.goodby("\uD83D\uDC4B"+"\uD83D\uDC4B"+"\uD83D\uDC4B"+"\uD83D\uDC4B"+"\uD83D\uDC4B");
            System.exit(0);

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
        printGroup();
       appExit();
        Utils.street();
        Utils.menu();
        return true;

    }



    @Override
    public String info() {
        String s=" ";
        String str= Utils.ANSI_CYAN+"\n"
                +s.repeat(45)+"Uygulama, yanlışlıkla çıkış butonuna basma ihtimalinizi değerlendirir,\n"
                +s.repeat(40)+"uygulamadan çıkmak istedğinizi onaylamanızı bekler, onayladığınız takdirde\n"
                +s.repeat(38)+"uygulama sonlandırılır ancak onaylanmadığı takdirde sizi anasayfaya yönlendirir.\n.";
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
