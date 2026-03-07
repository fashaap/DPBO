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

public class soal5 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[11];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        int bilangan = array[10];
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < bilangan) {
                System.out.println(array[i] + " lebih kecil dari " + bilangan);
            } else if (array[i] > bilangan) {
                System.out.println(array[i] + " lebih besar dari " + bilangan);
            } else {
                System.out.println(array[i] + " sama dengan " + bilangan);
            }
        }
    }
}
