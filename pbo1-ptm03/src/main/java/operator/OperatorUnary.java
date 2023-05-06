/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operator;

/**
 *
 * @author Welcomp
 */
public class OperatorUnary {
    public static void main(String[] args) {
        int i = 0;
        i++;                        //i tadinya 0 ditambahkan 1 sehingga i = 1
        System.out.println(i);    //betulkan i nilainya 1
        i++;                        //i tadinya 1 ditambahkan 1 lagi menjadi 2
        System.out.println(i);    //tuh betulkan i nilainya 2
        i=i+1;                      //bisa dilihat i++ sama dengan i=i+1
        System.out.println(i);    //i yang tadinya 2 sekarang menjadi 3
        
        //berlaku juga untuk penambhan angka lain dan operator aritmatika lain
        i+=3; //sama dengan i=i+3
        System.out.println(i);
        
        i+=3;
        System.out.println(i);
        
        i*=3; //sama dengan i=i*3
        System.out.println(i);
        
        i*=3;
        System.out.println(i);
    }
}
