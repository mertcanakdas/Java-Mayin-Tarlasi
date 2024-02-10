package mayıntarlası;

import java.util.Scanner;

public class TestMayınTarlası {

    public static void main(String[] args) {
        Scanner ınput = new Scanner(System.in);
        int row,column;
        System.out.println("Mayın Tarlasına Hoşgeldin");
        System.out.println("Harita Boyutunu Belirleyiniz");
        System.out.print("Satır: ");
        row = ınput.nextInt();
        System.out.print("Sütün: ");
        column = ınput.nextInt();
        MayınTarlası mine = new MayınTarlası(row, column);
        mine.run();

    }

}
