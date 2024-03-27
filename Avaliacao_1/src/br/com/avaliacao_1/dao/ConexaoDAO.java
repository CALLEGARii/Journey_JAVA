package br.com.avaliacao_1.dao;

import java.sql.*;

public class ConexaoDAO {
    
    public static Connection con = null;
    
    public ConexaoDAO(){
        
    }
        
     public static void ConnectDB(){
        
        try{
            
            String dsn = "Avaliacao1_Rafael_Callegari";
            String user = "postgres";
            String senha = "Callegari@3145";
            
            DriverManager.registerDriver(new org.postgresql.Driver());
            
            String url = "jdbc:postgresql://localhost:5432/" + dsn;
            
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