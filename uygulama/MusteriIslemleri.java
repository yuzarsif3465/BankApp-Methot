package uygulama;

import java.util.Scanner;

public class MusteriIslemleri {
    Scanner sc= new Scanner(System.in);
    public void paraCekme(Musteri musteri){
        int a;
        int b;

        System.out.print(musteri.getAdı()+" cekmek istedigin tutar: ");
        a=sc.nextInt();
        if(a<= musteri.getBakiye()){
            b= musteri.getBakiye()-a;
            System.out.println("kalan bakiyen: "+b);
        }
        else{
            System.out.println("yeterli bakiyen yok");
        }
    }
    public void paraYatırma(Musteri musteri){
        int a;
        int b;
        System.out.println(musteri.getAdı()+"yatırmak istedigini miktar: ");
        a=sc.nextInt();
        b= musteri.getBakiye()+a;
        System.out.println("yeni bakiyen: "+b);

    }




}
