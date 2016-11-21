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
public class ContaPoupança extends Conta {
    String data;
    
     public void Sacar (double valor){
        saldo = saldo - valor*0.5;
        
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
    
}
