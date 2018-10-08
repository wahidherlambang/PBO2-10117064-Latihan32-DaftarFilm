/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan32.daftarfilm;

/**
 *
 * @author WAHID HERLAMBANG
 */
public class PBO210117064Latihan32ObjectOrientedDaftarFilm {

    /**
 * @param args the command line arguments
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk menampilkan 
 * daftar film
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===Daftar Film Sedang Tayang===");
        Film movie = new Film();
        movie.nowPlaying("Venom", "Action, Horror, Sci-fi", 8.5, 120);
        movie.nowPlaying("Small Foot", "Animation", 9.0, 96);
        movie.nowPlaying("Crazy Rich Asian", "Comedy", 7.8, 119);
        movie.nowPlaying("Asih", "Horror", 6.0, 100);
    }
    
}
