import java.util.Scanner;
public class lingkaran23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        double keliling,luas;
        final double phi = 3.14;
        System.out.println("masukkan jari-jari lingkaran :");
        r = sc.nextInt();
        keliling = 2*phi*r;
        luas = phi*r*r;
        System.out.println(keliling);
        System.out.println(luas);
        sc.close();
    }
}
