/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;

/**
 *
 * @author Welcomp
 */
public class Switch {
    /*
    public static void main(String[] args) {
        int jalanJalan = 3;
        switch(jalanJalan){
            case 1:
                System.out.println("urang lapas");
                break;
            case 2:
                System.out.println("urang acayan");
                break;
            case 3:
                System.out.println("ubat nyamuk");
                break;
            case 4:
                System.out.println("dubil dit");
                break;
            default:
                System.out.println("mahluk halus");
                break;
        }
    }
*/
    
    public static void main(String[] args) {
        char nilai = 'D';
        switch(nilai){
            case 'A':
                System.out.println("Mhs   : \"Terimakasih pak\"");
                System.out.println("Dosen : \"Selamat ya!\"");
                break;
            case 'B':
                System.out.println("Mhs   : \"Kenapa ulun kada dapat A pak?\"");
                System.out.println("Dosen : \"@#$%&*!\"");
                break;
            case 'C':
                System.out.println("Mhs   : \"Ulun turun pul pak ai, tugas pul jua\"");
                System.out.println("Dosen : \"Tapi bisalah menjawab ujian?\"");
                System.out.println("Mhs   : \"Hihihihi\"");
                break;
            default:
                System.out.println("Mhs   : \"Ulun turun pul pak ai, tugas pul jua\"");
                System.out.println("Dosen : \"Bujur jua kah?\"");
                System.out.println("Dosen : \"Memeriksa berkas...\"");
                System.out.println("Dosen : \"Menceleng\"");
                System.out.println("Mhs   : \"Kabur...\"");
                break;
        }
    }
}
