import java.util.Scanner;

public class PenjumlahanRekursif {
    static int penjumlahanRekursif(int n){
        if (n <= 0) {
            return 0;
        }else {
            System.out.print(n);
            if (n > 1) {
                System.out.print("+");
            }
            return n + penjumlahanRekursif(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nomor : ");
        int f = sc.nextInt();

        System.out.println(" = " + penjumlahanRekursif(f));
    }
}
