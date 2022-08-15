import java.util.Scanner;

public class ticketPrice {
    public static void main(String[] args) {

        int yas, km, ytipi;
        double perKM = 0.10, tutar, tutarInd, yasInd, ytipiInd, toplamFiyat;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM Türünden Giriniz:");
        km = input.nextInt();

        System.out.print("Yaşınızı Giriniz:");
        yas = input.nextInt();

        System.out.print("Yolculuk Tipini Giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        ytipi = input.nextInt();

        if (yas < 0 || km < 0 || ytipi < 1 || ytipi > 2) {
            System.out.print("Hatalı Veri Girdiniz!");
        } else {
            if (yas < 12) {
                if (ytipi == 1) {
                    perKM = km * 0.10;
                    yasInd = perKM * 0.5;
                    toplamFiyat = perKM - yasInd;
                    System.out.println("Toplam Fiyat: " + toplamFiyat + "TL");

                } else if (ytipi == 2) {
                    perKM = km * 0.10;
                    yasInd = perKM * 0.5;
                    tutarInd = perKM - yasInd;
                    ytipiInd = tutarInd * 0.20;
                    toplamFiyat = tutarInd - ytipiInd;
                    System.out.print("Toplam Fiyat: " + toplamFiyat + "TL");
                }
            } else if (yas > 12 && yas < 24) {
                if (ytipi == 1) {
                    perKM = km * 0.10;
                    yasInd = perKM * 0.1;
                    toplamFiyat = perKM - yasInd;
                    System.out.print("Toplam Fiyat: " + toplamFiyat + "TL");
                } else if (ytipi == 2) {
                    perKM = km * 0.10;
                    yasInd = perKM * 0.5;
                    tutarInd = perKM - yasInd;
                    ytipiInd = tutarInd * 0.20;
                    toplamFiyat = tutarInd - ytipiInd;
                    System.out.print("Toplam Fiyat: " + toplamFiyat + "TL");
                }
            } else if (yas >= 65) {
                if (ytipi == 1) {
                    perKM = km * 0.10;
                    yasInd = perKM * 0.3;
                    toplamFiyat = perKM - yas;
                    System.out.print("Toplam Fiyat: " + toplamFiyat + "TL");

                } else if (ytipi == 2) {
                    perKM = km * 0.10;
                    yasInd = perKM * 0.3;
                    tutarInd = perKM - yasInd;
                    ytipiInd = tutarInd * 0.20;
                    toplamFiyat = tutarInd - ytipiInd;
                    System.out.println("Toplam Fiyat Tutari: " + toplamFiyat + "TL");
                }
            }
        }
    }
}



