import java.util.Scanner;

public class DeretDescendingRekursif {
    static int deretDescendingRekursif(int n) {
        if (n < 0) {
            return n;
        } else {
            System.out.println(n);
            return deretDescendingRekursif(n - 1);
        }
    }

    static int deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nomor : ");
        int nomor = sc.nextInt();
        System.out.println("Deret menurun dari " + nomor + " menggunakan rekursif:");
        deretDescendingRekursif(nomor);
        System.out.println("Deret menurun dari " + nomor + " menggunakan iteratif:");
        deretDescendingIteratif(nomor);
    }
}
