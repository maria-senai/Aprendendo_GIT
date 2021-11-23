/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import javax.swing.JOptionPane;

/**
 *
 * @author SESI_SENAI
 */
public class ContaCorrente {
    
    // Atributos
    private int numConta;
    private float saldo;
    private String nomeBanco;
    
    // Métodos

    public ContaCorrente(int numConta, String nomeBanco) {
        this.numConta = numConta;
        this.nomeBanco = nomeBanco;
        
    }
    
    public boolean deposito(float valor){
        if (valor > 0){
            saldo = saldo + valor;
            return true;
        }
        return false;
    }
    
    public boolean saque(float valor){
        if (valor <= saldo && valor > 0){
            saldo = saldo - valor;
            return true;
        }
        return false;
    }
    
    public float obterSaldo(){
        return saldo;
    }
    
    
}
