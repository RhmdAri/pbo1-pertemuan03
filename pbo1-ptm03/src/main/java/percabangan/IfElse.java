/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;

/**
 *
 * @author Welcomp
 */
public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDiDompet = 25000;
        
        if (uangDiDompet<totalBelanja) {
            System.out.println("Uang anda kurang, kurangi jajan anda!"); 
        } else if (uangDiDompet>totalBelanja){
            double kembalian = uangDiDompet-totalBelanja; 
            System.out.println("Uang cukup, kembalian : "+kembalian);    
        } else {
            System.out.println("Uang kamu pas...>///<...");
        }
    }
}
