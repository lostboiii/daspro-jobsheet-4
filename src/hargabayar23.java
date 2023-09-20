import java.util.Scanner;
public class hargabayar23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int harga,jumlah,halaman;
        double dis,total,bayar,jmldis;
        String merkbuku;
        System.out.println("masukkan harga barang yang dibeli ");
        harga = sc.nextInt();
        System.out.println("masukkan jumlah barang yang dibeli ");
        jumlah = sc.nextInt();
        System.out.println("masukkan merk buku "); 
        merkbuku = sc.nextLine();
        System.out.println("masukkan jumlah halaman ");
        halaman = sc.nextInt();
        System.out.println("masukkan besaran diskon ");
        dis = sc.nextDouble();
        total = harga*jumlah;
        jmldis = total*dis;
        bayar = total-jmldis;
        System.out.println("diskon yang anda dapatkan adalah " + jmldis);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);
        sc.close();
    }
}
