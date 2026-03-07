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

public class soal3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int kecil, tengah, besar;

        if (a <= b && a <= c) {
            kecil = a;
            if (b <= c) {
                tengah = b;
                besar = c;
            } else {
                tengah = c;
                besar = b;
            }
        } else if (b <= a && b <= c) {
            kecil = b;
            if (a <= c) {
                tengah = a;
                besar = c;
            } else {
                tengah = c;
                besar = a;
            }
        } else {
            kecil = c;
            if (a <= b) {
                tengah = a;
                besar = b;
            } else {
                tengah = b;
                besar = a;
            }
        }

        System.out.println(kecil + " " + tengah + " " + besar);
    }
}
