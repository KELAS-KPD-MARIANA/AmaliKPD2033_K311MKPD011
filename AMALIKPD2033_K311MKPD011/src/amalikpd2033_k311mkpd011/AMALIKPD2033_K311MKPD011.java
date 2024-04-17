package AMALIKPD2033_K311MKPD011;
import java.util.Scanner;
public class AMALIKPD2033_K311MKPD011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        int bilanganharibekerja;
         System.out.print("Masukkan bilangan hari bekerja: ");
            bilanganharibekerja = input.nextInt();
        do {
                System.out.println("Bilangan hari tidak boleh melebihi 31 hari. ");
                System.out.println("Masukkan semula bilangan hari bekerja: ");
                bilanganharibekerja = input.nextInt();
                
                if (bilanganharibekerja > 31); {
        
        }
        }while (bilanganharibekerja > 31); {
        
       int gaji = bilanganharibekerja * 160;

        System.out.println("Rumusan gaji bulanan bagi " + nama);
        System.out.println("Jumlah hari berkerja " + bilanganharibekerja);
        System.out.println("GAJI SEBULAN ADALAH " + gaji);
        }
    }
}