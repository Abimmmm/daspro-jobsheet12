public class Percobaan1 {
    static int factorialRekursif(int n) {
        if (n == 0) {
            return (1);
        } else {
            return (n * factorialRekursif(n - 1));
        }
    }

    static int faktorialIteratif(int n) {
        int faktor = 1;
        for (int i = 0; i >= 1; i++) {
            faktor = faktor * i;
        }
        return faktor;
    }

    public static void main(String[] args) {
        System.out.println(factorialRekursif(5));
        System.out.println(faktorialIteratif(5));
    }

}