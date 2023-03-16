import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vizeNot;
        int finalNot;
        double Sonuc;

        System.out.println("Vize Notunuzu Giriniz");
        vizeNot = scanner.nextInt();
        System.out.println("Fianl Notunuzu Giriniz");
        finalNot = scanner.nextInt();
        Sonuc = vizeNot * 0.4 + finalNot * 0.6;
        System.out.println(Sonuc);
    }
}