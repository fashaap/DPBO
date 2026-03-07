/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author Fasha Azhi Putra
 */
public class Student {

    String studentId;
    String studentName;
    int korean;
    int english;
    int math;

    public double calculateAverage() {
        return (korean + english + math) / 3.0;
    }

    public void printStudentInfo() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Korean: " + korean);
        System.out.println("English: " + english);
        System.out.println("Math: " + math);
    }

    public void changeStudentId(String newId) {
        studentId = newId;
    }

    public static void main(String[] args) {

        Student mahasiswa = new Student();

        mahasiswa.studentId = "14";
        mahasiswa.studentName = "Fasha Azhi Putra";
        mahasiswa.korean = 55;
        mahasiswa.english = 86;
        mahasiswa.math = 77;

        mahasiswa.changeStudentId("12");

        mahasiswa.printStudentInfo();

        double rataRata = mahasiswa.calculateAverage();
        System.out.printf("Average : %.2f", rataRata);
    }
}
