/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan31;

/**
 *
 * @author 
 * NAMA		: Dandi Muhammad Iqbal
 * KELAS	: PBO11K
 * NIM		: 10118911
 * 
 */
public class Latihan31 {

    /**
     * @param args the command line arguments
     */
    public static Mahasiswa mhs = new Mahasiswa();
    public static void tampilNama(String nama, String nim) {
        mhs.nama = nama;
        mhs.nim = nim;
        mhs.perkenalanDiri();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        tampilNama("Rizki Adam Kurniawan", "10110269");
        tampilNama("Indra Tiola", "10110270");
        tampilNama("Robi Tansil Ganefi","10110271");
        tampilNama("Muhammad Nur Awaludin", "10110269");
    }
    
}
