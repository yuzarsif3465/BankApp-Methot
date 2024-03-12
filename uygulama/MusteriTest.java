package uygulama;

import java.util.Scanner;

public class MusteriTest {
    public static void main(String[] args) {

        Musteri musteri1= new Musteri("254624","yusuf","zorlu",100);
        Musteri musteri2= new Musteri("21535","ferhat","karkur",250);
        Scanner sc= new Scanner(System.in);
        System.out.println(musteri1);

        MusteriIslemleri mIslemleri= new MusteriIslemleri();
        mIslemleri.paraCekme(musteri1);
        mIslemleri.paraYatırma(musteri2);

    }
}
