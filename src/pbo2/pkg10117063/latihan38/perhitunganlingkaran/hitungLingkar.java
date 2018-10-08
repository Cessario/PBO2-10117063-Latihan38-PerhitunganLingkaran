/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan38.perhitunganlingkaran;

/*
Nama : Cessario Sheva Lakita Purwa Adidjaya
Nim : 1017063
Kelas : IF-2
Deskripsi Program : Menghitung lingkaran berdasarkan (OO)
 */
public class hitungLingkar {

    public double jr;
    public double ls;
    public double kel;
    

    public double hitungJari2(double dmtr) {
        jr = dmtr / 2;
        return jr;
    }

    public double hitungLuas(double jr) {
        ls = Math.PI * jr * jr;
        return ls;
    }

    public double hitungKel(double jr) {
        kel = 2 * Math.PI * jr;
        return kel;
    }

}
