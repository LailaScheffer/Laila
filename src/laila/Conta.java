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
public class Conta {
    int numero;
    double saldo;
    int agencia;
    
    
    public void MostrarSaldo (){
        System.out.println(saldo);
        
    }
    
    public void Sacar (double valor){
        saldo = saldo - valor;
        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    
    
}
