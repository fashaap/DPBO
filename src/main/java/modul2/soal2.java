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

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mil = 1.6;

        System.out.print("Masukan jumlah mil: ");
        double n = input.nextDouble();
        
        double konfersi = n * mil;

        System.out.printf("%.1f %s %.1f %s", n, "mil setara dengan", konfersi, "kilometer");
    }
}