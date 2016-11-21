/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laila;

/**
 *
 * @author aluno
 */
public class Main {
    
    public static void main(String args[]){
    ContaCorrente cc = new ContaCorrente();
    cc.setSaldo(3000);
    cc.MostrarSaldo();
    cc.Sacar(1200);
    cc.MostrarSaldo();
        
        
    ContaPoupança cp = new ContaPoupança();
    cp.setSaldo(2000);
    cp.MostrarSaldo();
    cp.Sacar(100);
    cp.MostrarSaldo();
    }
    
   
    
    
}
