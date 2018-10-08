/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan38.perhitunganlingkaran;

import java.util.Scanner;

/*
Nama : Cessario Sheva Lakita Purwa Adidjaya
Nim : 1017063
Kelas : IF-2
Deskripsi Program : Menampilkan perhitungan Lingkaran (OO)
 */
public class PBO210117063Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String d;
        double dmtr;
        
        System.out.println("====Perhitungan Lingkaran====");
        Scanner scanner = new Scanner(System.in);
        hitungLingkar lingkar = new hitungLingkar();
        
        do {            
            System.out.print("Masukkan nilai diameter lingkaran : ");
            d = scanner.nextLine();
            //validasi input yang masuk
            System.out.println((!d.matches("[0-9]*"))
                    ? "Nilai Diameter Tidak Sesuai\n" : "");
            
        } while (!d.matches("[0-9]*"));
        
        System.out.println("===Hasil Perhitungan Lingkaran===");
        //Proses Konversi String ke Double
        dmtr = Double.parseDouble(d);        
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n", 
                lingkar.hitungJari2(dmtr));
        System.out.printf("Luas Lingkaran = %.2f cm %n"
                + "", lingkar.hitungLuas(dmtr));
        System.out.printf("Keliling Lingkaran = %.2f cm %n",
                lingkar.hitungKel(dmtr));
    }
    
}
