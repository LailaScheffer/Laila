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
public class Funcionario {
    double salarioHora = 25;
    
    public void calcular (double horas){
        System.out.println(horas*salarioHora);
    }
    public void calcular(double horas, int dep){
        System.out.println(salarioHora*horas+dep*300);
    }
    
    public void calcular(double horas, int dep, double ferias){
        System.out.println(salarioHora*horas+dep*300+ferias);
    }
    
}
