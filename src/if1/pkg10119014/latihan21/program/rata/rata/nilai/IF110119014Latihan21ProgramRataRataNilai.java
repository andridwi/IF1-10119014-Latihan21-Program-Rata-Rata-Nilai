/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan21.program.rata.rata.nilai;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class IF110119014Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int i,nilai,Banyakmahasiswa;
    double rata_rata = 0;
    double jumlah = 0;
    
    System.out.print("Masukan banyak mahasiswa :");
    Scanner scanner = new Scanner (System.in);
    Banyakmahasiswa = scanner.nextInt();
    
     for(i=1; i<=Banyakmahasiswa; i++){
     System.out.print("Nilai Mahasiswa ke-"+i+":");
     nilai = scanner.nextInt();
     jumlah += nilai;
     rata_rata = jumlah/Banyakmahasiswa;
     }
     System.out.println();
     System.out.println("Maka, Rata-rata Nilai adalah "+rata_rata);
     System.out.println("Developed by : Andri Dwi p");
     
        
        
    }
    
    }


