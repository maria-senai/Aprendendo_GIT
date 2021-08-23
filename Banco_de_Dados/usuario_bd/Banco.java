/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acesso_banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author SESI_SENAI
 */
public class Banco {
    private static Connection connection;
   
    public static Connection getConnection(){
        if(connection == null){
            try{
                //Class.forName("com.mysql.jdbc.Driver"); //para mysql
                Class.forName("org.postgresql.Driver");//para postgresql
                String host = "localhost";
                String port = "5432";
                String database = "postgres";
                String user = "postgres";
                String pass = "senai";//digitar a senha do seu banco
                //String url = "jdbc:mysql://"+host+":"+port+"/"+database; //para mysql
                String url = "jdbc:postgresql://"+host+":"+port+"/"+database;//para postgresql
                connection = DriverManager.getConnection(url, user, pass);                
               
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
    public static void close(){
        if (connection == null){
            throw new RuntimeException("Nenhuma conexão aberta!");
        }
        else{
            try{
                connection.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
 
    public static void salvar (Usuario usuario){
        try{
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO usuario (id, nome) values(?, ?)");
            ps.setInt(1, usuario.getId());
            ps.setString(2, usuario.getNome());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void deleta(int id){
        try{
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("Delete FROM usuario WHERE id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();


            }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void atualizaBanco(Usuario usuario){
        deleta(usuario.getId());
        salvar(usuario);
    }
}