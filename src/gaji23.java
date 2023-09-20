import java.util.Scanner;
public class gaji23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlmasuk,jmltdkmasuk,totgaji;
        int gaji,potgaji;

        System.out.println("masukkan jumlah hari masuk kerja anda");
        jmlmasuk = sc.nextInt();
        System.out.println("masukkan jumlah hari tidak masuk kerja anda");
        jmltdkmasuk = sc.nextInt();
        System.out.println("masukkan gaji ");
        gaji = sc.nextInt();
        System.out.println("masukkan potongan gaji ");
        potgaji = sc.nextInt();
        totgaji = (jmlmasuk*gaji)-(jmltdkmasuk*potgaji);
        System.out.println("gaji yang anda terima adalah " + totgaji);
        sc.close();
    }
}
