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
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*//  ----- Caso 1 ----------
        ContaCorrente c = new ContaCorrente(30, "Banco do Jorge");
        c.deposito(50);
        c.saque(20.30f);
        JOptionPane.showMessageDialog(null, "O saldo é de " + c.obterSaldo());*/
        
        /*// -------- Caso 2 ----------
        ContaCorrente c = new ContaCorrente(30, "Banco do Jorge");
        c.deposito(0);
        c.saque(0);
        JOptionPane.showMessageDialog(null, "O saldo é de " + c.obterSaldo()); //opcional*/
        
        /*// ---------- Caso 3 ----------
        ContaCorrente c = new ContaCorrente(30, "");*/
        
        /*// ------------ Caso 4 ----------
        ContaCorrente c = new ContaCorrente(30, "Cleytinho");*/
        
        // ----------- Caso 5 -------------
        
        String[] bancosConta = new String[3];
        
        bancosConta[0] = "Banco do Jorge";
        bancosConta[1] = "Banco Cleytinho";
        bancosConta[2] = "Meu colchão";
        
        String banco_user = JOptionPane.showInputDialog("Nome do banco:");
        
        if (banco_user.equals(bancosConta[0]) || banco_user.equals(bancosConta[1]) || banco_user.equals(bancosConta[2])){
            ContaCorrente c = new ContaCorrente(30, banco_user);
            
            boolean result_deposito;
            result_deposito = c.deposito(50);
            if (result_deposito == false){
                JOptionPane.showMessageDialog(null, "Não foi possível realizar o deposito!");
            }

            if ( c.saque(20.30f) == false){
                JOptionPane.showMessageDialog(null, "Não foi possível realizar o saque!");
            }

            JOptionPane.showMessageDialog(null, "O saldo é de " + c.obterSaldo());
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível criar a conta");
        }
        
        
        
    }
    
}
