package uygulama;

public class Musteri {
    private String hesapNumarası;
    private String adı;
    private String soyAdı;
    private int bakiye;


    public Musteri(String hesapNumarası, String adı, String soyAdı, int bakiye){
        this.hesapNumarası=hesapNumarası;
        this.adı=adı;
        this.soyAdı=soyAdı;
        this.bakiye=bakiye;
    }
    public Musteri(){

    }

    public void setAdı(String adı){this.adı=adı;}
    public String getAdı(){return adı;}
    public void setSoyAdı(String soyAdı){this.soyAdı=soyAdı;}
    public String getSoyAdı(){return soyAdı;}
    public void setHesapNumarası(String hesapNumarası){this.hesapNumarası=hesapNumarası;}
    public String getHesapNumarası(){return hesapNumarası;}
    public void setBakiye(int bakiye){this.bakiye=bakiye;}
    public int getBakiye(){return bakiye;}



    public String toString() {
        return "Musteri{" +
                "hesapNumarası='" + hesapNumarası + '\'' +
                ", adı='" + adı + '\'' +
                ", soyAdı='" + soyAdı + '\'' +
                ", bakiye=" + bakiye +
                '}';
    }
}
