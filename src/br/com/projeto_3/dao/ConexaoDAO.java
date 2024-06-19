package br.com.projeto_3.dao;


import java.sql.*;

public class ConexaoDAO {
    
    public static Connection con = null;
        
    public static void ConnectDB(){
        
        try{
            
            String dsn = "projeto_3";
            String user = "postgres";
            String senha = "postdba";
            
            DriverManager.registerDriver(new org.postgresql.Driver());
            
            String url = "jdbc:postgresql://localhost:5433/" + dsn;
            
            con = DriverManager.getConnection(url, user, senha);
            con.setAutoCommit(false);
            
            if(con == null){
                System.out.println("Erro ao abrir o banco! ");
            }
            
            
        }catch(Exception e){
            System.out.println("Problema ao abrir a base de dados" +
            e.getMessage());
        }
  
    }
    
    public static void CloseDB(){
        
        try{
            con.close();
            
        }catch(Exception e){
            System.out.println("Problema ao fechar a base de Dados! " + 
            e.getMessage());
        }
    }

}
