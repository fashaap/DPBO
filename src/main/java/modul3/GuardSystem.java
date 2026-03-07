/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author Fasha Azhi Putra
 */
public class GuardSystem {
    String id;
    String name;
    String age;
    String country;

    public boolean verification(String country) {
        switch (country) {
            case "israel":
                return false;
            case "america":
                return false;
            default:
                return true;
        }
    }
    
    public void hakAkses(boolean kondisi){
        if(kondisi){
            System.out.println("Selamat anda diperbolehkan masuk kedalam gedung TULT");
        }else{
            System.out.println("Warning!! anda penyusup");
        }
    }
    
    public void printUserProfile(){
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Country : " + country);
    }
    
    public static void main(String[] args){
        GuardSystem mahasiswa = new GuardSystem();
        GuardSystem gedungTULT = new GuardSystem();
        
        mahasiswa.id = "1030225******";
        mahasiswa.name = "Fasha Azhi Putra";
        mahasiswa.age = "20";
        mahasiswa.country = "indonesia";
        
        mahasiswa.printUserProfile();
        
        Boolean daerahAsal = mahasiswa.verification(mahasiswa.country);
        gedungTULT.hakAkses(daerahAsal);
        
    }
}
