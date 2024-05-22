/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Samsung
 */
public class ConnectionFactory {

    private String usuario = "root";
     private String senha = "usjt@2019";
     private String host = "localhost";
     private String porta = "3306";
     private String timezone = "America/SaoPaulo";
     private String bd = "Universidade";
     
     public Connection obtemConexao(){
         try{
             String url = "jdbc:mysql://" + host + ":" + porta + "/" + bd  +"?serverTimezone=" + timezone;
             Connection conectar =  DriverManager.getConnection(url, usuario, senha);
             
             if(conectar != null){
                 System.out.println("Conexão estabelecida com sucesso");
             }
            return conectar; 
         }catch(SQLException e){
             System.out.println("Erro ao tentar estaelecer a conexão com o banco de dados");
             e.printStackTrace();
             return null;
         }
         
     }

    public static void main(String[] args) {
      ConnectionFactory connectionFactory = new ConnectionFactory();
      Connection connection = connectionFactory.obtemConexao();
      
       if(connection != null){
                 System.out.println("Coenexão testada e aprovada");
             }else{
           System.out.println("Falha na conexão");
       }
    }
}
