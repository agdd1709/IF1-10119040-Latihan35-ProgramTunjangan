/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan40.programtunjangan;
import java.util.Scanner;
import if1.pkg10119040.latihan40.programtunjangan.tunjangan;

/**
 *
 * @author Acer
 */
public class IF110119040Latihan40ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        tunjangan tunj = new tunjangan();
        System.out.println("===========Program Tunjangan=========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp.");
        tunj.gajiPokok = input.nextInt();
        System.out.print("Status Anda? (Menikah/Belum)    : ");
        tunj.status = input.next();
        
        tunj.tampilHasil();
    }
    
}
