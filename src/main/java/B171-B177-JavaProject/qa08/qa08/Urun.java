package B171;

public class Urun {
    private int urunId;
    private String urunIsmi;
    private String uretici;
    private String birim;
    private int miktar;
    private String raf;


    public Urun(int urunId, String urunIsmi, String uretici, String birim, int miktar, String raf) {
        this.urunId = urunId;
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.birim = birim;
        this.miktar = miktar;
        this.raf = raf;
    }

    public int getUrunId() {
        return urunId;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public String getBirim() {
        return birim;
    }

    public int getMiktar() {
        return miktar;
    }

    public String getRaf() {
        return raf;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

}
