package B171;

import java.util.Scanner;

public class Utils {


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_SIYAH = "\u001B[30m";
    public static final String ANSI_KIRMIZI = "\u001B[31m";
    public static final String ANSI_YEŞİL = "\u001B[32m";
    public static final String ANSI_SARI = "\u001B[33m";
    public static final String ANSI_MAVI = "\u001B[34m";
    public static final String ANSI_MOR = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BEYAZ = "\u001B[37m";
    public static Scanner input = new Scanner(System.in);


 public static void street() {
        String s=" ";

        System.out.println(ANSI_YEŞİL+"\n"+
                s.repeat(30)+"         |       _L                                                          |\n" +
                s.repeat(30)+"        / \\     (  )                                                        ( )  |   |\n" +
                s.repeat(30)+"        | |     |  |                                                  ___L_/   \\/ \\ / \\\n" +
                s.repeat(30)+"        | |   ()|  |()                                   | |         /      \\ |||  \\| |\n" +
                s.repeat(30)+"     ___| |_()|   _  |_____                              |V|  ____--/     __dv|    ____\"\\\n" +
                s.repeat(30)+"  /\"\"          __( )   ____\"==________..__           ____||| /       _____              ||\n" +
                s.repeat(30)+" /  __  []  ||     | ||   || / __________ \\  _  |  _/  ____ \"  [] []|     |    /\\/\\/\\/\\  _\n" +
                s.repeat(30)+" | /___    _''_      ''   ''| ]] ]]}} }} } |/ \\/ \\|  [[[|  |                  |  c c c |  \\\n" +
                s.repeat(30)+"   |      / \\/ \\                   ________        __             ______   _           |\n" +
                s.repeat(30)+"          |            _______   _     _                _______   ||| ||     __\n" +
                s.repeat(30)+"        ___________         (◕‿◕) DEV 02 DEPO PROJESİ v-1.0 (◕‿◕)          _________");

    }

public static void menu(){

    System.out.println();
    System.out.println();
    String s=" ";
    String araSimge="❍";
    String ustSimge="┏━━━━•❅•°•❈•°•❅•━━━━┓";
    String altSimge="┗━━━━•❅•°•❈•°•❅•━━━━┛";
    System.out.println(ANSI_YEŞİL+s.repeat(6)+ustSimge.repeat(1)+s.repeat(3)+ustSimge.repeat(1)
                      +s.repeat(3)+ustSimge.repeat(1)+s.repeat(3)+ustSimge.repeat(1)
                      +s.repeat(3)+ustSimge.repeat(1)+s.repeat(2)
                      +s.repeat(1)+ustSimge.repeat(1)+s.repeat(3));

    System.out.println(ANSI_SARI+s.repeat(6)+araSimge.repeat(1)+s.repeat(3)+"1- LİSTELE"+s.repeat(7)+araSimge.repeat(1)
            +s.repeat(3)+araSimge.repeat(1)+s.repeat(2)+"2- ÜRÜN TANIMLA"+s.repeat(2)+araSimge.repeat(1)
            +s.repeat(3)+araSimge.repeat(1)+s.repeat(2)+"3- ÜRÜN RAFA KOY"+s.repeat(2)+araSimge.repeat(1)
            +s.repeat(3)+araSimge.repeat(1)+s.repeat(1)+"4- ÜRÜN ÇIKIŞ YAP"+s.repeat(2)+araSimge.repeat(1)
            +s.repeat(3)+araSimge.repeat(1)+s.repeat(1)+"5- ÜRÜN GÜNCELLE"+s.repeat(2)+araSimge.repeat(1)
            +s.repeat(3)+araSimge.repeat(1)+s.repeat(4)+"6- ÇIKIŞ"+s.repeat(8)+araSimge.repeat(1)
    );

    System.out.println(ANSI_YEŞİL+s.repeat(6)+altSimge.repeat(1)+s.repeat(3)+altSimge.repeat(1)
                      +s.repeat(3)+altSimge.repeat(1)+s.repeat(3)+altSimge.repeat(1)
                      +s.repeat(3)+altSimge.repeat(1)+s.repeat(2)
                      +s.repeat(1)+altSimge.repeat(1)+s.repeat(3)+"\n");

    }
    public static void errTrow(String str){
        String s=" ";

        //int Uzunluk=str.length()+41;

        System.out.print(Utils.ANSI_CYAN+s.repeat(45)+"✩｡:*•.─────  ❁ " + str + " ❁  ─────.•*:｡✩\n" +
                s.repeat(45)+"✩｡:*•.─────  ❁"+" ==> ");
    }
public static void versionText(String str){
        String s=" ";
    String satirUstSol="╭══•";
    String satirUstSag="•══╮";
    String content1="ೋ   •✧   ๑♡   ๑   ✧   •   ೋ";
    String content3=str;
    String content2="© DEV 02 DEPO PROJESİ v-1.0 her hakkı saklıdır ©";
    String satirAltSol= "╰══•";
    String satirAltSag="•══╯";
    System.out.println(ANSI_YEŞİL+s.repeat(30)+satirUstSol+s.repeat(27)+content1+s.repeat(27)+satirUstSag);
    System.out.println(ANSI_SARI+s.repeat(31)+content3);
    System.out.println(ANSI_SARI+s.repeat(55)+content2);
    System.out.println(ANSI_YEŞİL+s.repeat(30)+satirAltSol+s.repeat(27)+content1+s.repeat(27)+satirAltSag);
}

public static void cursorSetting(String str){
    String s=" ";
    System.out.println(Utils.ANSI_YEŞİL+s.repeat(45)+ "\uD83D\uDCE2" +"✩｡:*•.─────  ❁"+str+" ❁  ─────.•*:｡✩\n");
}
public static void onePruductTable(int urunId,String urun,String uretici,String birim,int miktar,int raf){//-----------------ONE PRODUCT TABLE------------
    String s=" ";
    String cizgi="-";
    System.out.println(s.repeat(39)+cizgi.repeat(109)+"\n");
    System.out.printf(s.repeat(39)+"| %-5S  | %-30S  | %-30S  | %-10S   |%-5S |%-5S|%n ","ÜRÜN NO","ÜRÜN","ÜRETİCİ","BİRİM","MİKTAR","RAF");
    System.out.printf(s.repeat(39)+" %-5S      %-30S    %-30S    %-10S     %-5S   %-5S%n",urunId,urun,uretici,birim,miktar,raf);
    System.out.println(s.repeat(39)+cizgi.repeat(109)+"\n");
}//-----------------ONE PRODUCT TABLE FINISH------------


public static void headerTable(String tarih){ //---------------------HEADER----------------
    String s=" ";
    String cizgi="-";
    String ciftCizgi="=";
    String baslik =s.repeat(33)+"|%-8S | %-32S  | %-32S | %-12S |  %-10S | %-5S|%n";
    String govde = s.repeat(33)+"|%-8S |  %-32S | %-32S | %-12S |  %-10S | %-5S|%n";
    System.out.printf(s.repeat(33)+ciftCizgi.repeat(118));
    System.out.println();
    System.out.printf(s.repeat(80)+"ÜRÜN LİSTESİ "+s.repeat(30) + tarih + "%n");
    System.out.println(s.repeat(33)+cizgi.repeat(118));
    System.out.printf(baslik, "URUN NO", "URUN", "URETICI FİRMA", "BIRIM","MİKTAR","RAF");
    System.out.println(s.repeat(33)+cizgi.repeat(118));
} //---------------------HEADER FINISH----------------
public static void bodyTable(int urunId,String urun,String uretici,String birim,int miktar,int raf){//-----------------BODY------------
        String s=" ";
        String cizgi="-";
        String govde =s.repeat(33)+"|%-8S |  %-32S | %-32S | %-12S |  %-10S | %-5S|%n";
        System.out.printf(govde, urunId, urun, uretici, birim,miktar,raf);
        System.out.println(s.repeat(33)+cizgi.repeat(118));
    }//-----------------BODY FINISH------------
public static void footerTable(){//-----------------FOOTER------------
        String s=" ";
        String cizgi="-";
        String baslik =s.repeat(33)+"|%-8S | %-32S  | %-32S | %-12S |  %-10S | %-5S|%n";
        System.out.printf(baslik, "URUN NO", "URUN", "URETICI FİRMA", "BIRIM","MİKTAR","RAF");
        System.out.println(s.repeat(33)+cizgi.repeat(118));
    }//-----------------FOOTER FINIS------------
public static void doublebuttonDesign(String str1,String str2){
    System.out.println();
    System.out.println();
    String s=" ";
    String araSimge="❍";
    String ustSimge="┏━━━━•❅•°•❈•°•❅•━━━━┓";
    String altSimge="┗━━━━•❅•°•❈•°•❅•━━━━┛";

    System.out.println(ANSI_YEŞİL+s.repeat(80)+ustSimge.repeat(1)+s.repeat(10)+ustSimge.repeat(1));
    System.out.println(ANSI_SARI+s.repeat(80)+araSimge.repeat(1)+s.repeat(5)+str1+s.repeat(7)+araSimge.repeat(1)
                                                   +s.repeat(10)+araSimge.repeat(1)+s.repeat(5)+str2+s.repeat(5)+araSimge.repeat(1));
    System.out.println(ANSI_YEŞİL+s.repeat(80)+altSimge.repeat(1)+s.repeat(10)+altSimge.repeat(1));
    System.out.println("\n");
    }
public static void subMenu(String str){

        System.out.println();
        System.out.println();
        String s=" ";
        String ustSimge="┏━━━━•❅•°•❈•°•❅•━━━━┓";
        String altSimge="┗━━━━•❅•°•❈•°•❅•━━━━┛";
        System.out.println(Utils.ANSI_YEŞİL+s.repeat(46)+ustSimge.repeat(1)+s.repeat(7)+ustSimge.repeat(1)
                +s.repeat(7)+ustSimge.repeat(1));

        System.out.println(Utils.ANSI_SARI+s.repeat(46)
                +s.repeat(6)+"1- LİSTELE"+s.repeat(7)
                +s.repeat(7)+"2-"+str+""+s.repeat(2)
                +s.repeat(14)+"3- ANA SAYFA"+s.repeat(2));

        System.out.println(Utils.ANSI_YEŞİL+s.repeat(46)+altSimge.repeat(1)+s.repeat(7)+altSimge.repeat(1)
                +s.repeat(7)+altSimge.repeat(1)+"\n");
        System.out.println();

    }
public static void goodby(String str){
        String s=" ";
        System.out.println(Utils.ANSI_CYAN+s.repeat(60)+"╔════════"+s.repeat(38)+"═══════╗");
        System.out.print(Utils.ANSI_CYAN+s.repeat(80)+str+"\n");
        System.out.println(Utils.ANSI_CYAN+s.repeat(60)+"╚════════"+s.repeat(38)+"═══════╝");
    }
public static void pagLogo(String str){
    String s=" ";
    System.out.println(Utils.ANSI_CYAN+s.repeat(70)+"╔════════"+s.repeat(38)+"═══════╗");
    System.out.print(Utils.ANSI_CYAN+s.repeat(80)+str+"\n");
    System.out.println(Utils.ANSI_CYAN+s.repeat(70)+"╚════════"+s.repeat(38)+"═══════╝");
}
public static void infoPage(String str){
        String s=" ";
        String up="\uD83D\uDC46";
        String down="\uD83D\uDC47";
        String left="\uD83D\uDC48";
        String right="\uD83D\uDC49";
        String devMr="\uD83E\uDDD1\u200D\uD83D\uDCBB";
        String devMrs="\uD83D\uDC69\uD83C\uDFFB\u200D\uD83D\uDCBB";
        String downShape="╔════════"+s.repeat(20)+down+s.repeat(20)+"═══════╗";
        String upShape="╚════════"+s.repeat(20)+up+s.repeat(20)+"═══════╝";
    System.out.println(ANSI_CYAN+s.repeat(120)+downShape);
    System.out.println(s.repeat(148)+devMr);
    System.out.println(ANSI_CYAN+s.repeat(135)+str);
    System.out.println(ANSI_CYAN+s.repeat(137)+"Team Lead Mehmet Duran Kaya");
    System.out.println(ANSI_CYAN+s.repeat(120)+upShape);
}

}





