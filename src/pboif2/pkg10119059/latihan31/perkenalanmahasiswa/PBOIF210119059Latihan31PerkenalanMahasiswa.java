/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan perkenalan diri
 */
package pboif2.pkg10119059.latihan31.perkenalanmahasiswa;

/**
 *
 * @author Corazon
 */
public class PBOIF210119059Latihan31PerkenalanMahasiswa {

    public static void main(String[] args) {
        
        Mahasiswa mhs = new Mahasiswa ();
        
        mhs.nim = "10119059";
        mhs.nama = "Irgi Dwiputra";
        mhs.perkenalanDiri();
        
        mhs.nim = "10119060";
        mhs.nama = "M Riko Alfiansyah";
        mhs.perkenalanDiri();
        
        
        mhs.nim = "10119061";
        mhs.nama = "Rheiza Sahanya";
        mhs.perkenalanDiri();
        
        mhs.nim = "10119062";
        mhs.nama = "Bubu Boboboi";
        mhs.perkenalanDiri();
    }
    
}
