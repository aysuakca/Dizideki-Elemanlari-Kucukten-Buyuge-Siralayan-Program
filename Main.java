import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Dizinin Boyutunu Giriniz : ");
        int n = scan.nextInt();

        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". elemani giriniz.");
            list[i] = scan.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Girilen dizi: ");
        for (int i = 0; i < n; i++) {
            System.out.print(list[i] + " ");
        }
    }
}