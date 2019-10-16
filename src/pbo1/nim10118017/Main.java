package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Main class untuk membuat objek mahasiswa dan memanggil methodnya.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Semua objek disimpan dalam array dengan index sebagai acuannya.
        
        //Instansiasi objek.
        Mahasiswa[] mahasiswa = new Mahasiswa[4];
        for (int i = 0; i < mahasiswa.length; i++) {
            mahasiswa[i] = new Mahasiswa();
        }
        
        //Inisialisasi variabel yang ada di class Mahasiswa.
        mahasiswa[0].nim = "10110269";
        mahasiswa[0].nama = "Rizki Adam Kurniawan";
        mahasiswa[1].nim = "10110270";
        mahasiswa[1].nama = "Indra Tiola";
        mahasiswa[2].nim = "10110271";
        mahasiswa[2].nama = "Robi Tanzil Ganefi";
        mahasiswa[3].nim = "10110269";
        mahasiswa[3].nama = "Muhammad Nur Awaludin";
        
        //Memanggil method dengan cara perulangan.
        for (Mahasiswa i : mahasiswa) {
            i.perkenalkanDiri();
            System.out.println();
        }
        System.out.println("\nDeveloped by : Agung Nurhamidan");
    }
    
}
