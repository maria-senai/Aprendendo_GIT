/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acesso_banco;

/**
 *
 * @author SESI_SENAI
 */
public class Acesso_banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario u = new Usuario();
        u.setId(1);
        u.setNome("Maria Claudia");
        Banco.atualizaBanco(u);
        Banco.close();
    }
    
}
