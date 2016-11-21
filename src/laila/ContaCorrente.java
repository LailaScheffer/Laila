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
public class ContaCorrente extends Conta {
    double limite;
    
    @Override
      public void Sacar (double valor){
        saldo = saldo - valor*1.2;
        
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
  
    
}
