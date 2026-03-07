/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author Fasha Azhi Putra
 */
import java.util.Scanner;

public class soal4 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); //jumlah
        input.nextLine();

        int apel = 0;
        int jeruk = 0;
        int mangga = 0;

        for (int i = 0; i < n; i++) {
            String buah = input.nextLine();

            if (buah.equals("apel")) {
                apel++;
            } else if (buah.equals("jeruk")) {
                jeruk++;
            } else if (buah.equals("mangga")) {
                mangga++;
            }
        }

        System.out.println(apel + " " + jeruk + " " + mangga);
    }
}
