public class Fibonacci {
    static int pasanganMarmut(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        } else {
            return pasanganMarmut(bulan - 1) + pasanganMarmut(bulan - 2);
        }
    }

    public static void main(String[] args) {
        int bulan = 12;
        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + " adalah: " + pasanganMarmut(bulan));
    }
}
