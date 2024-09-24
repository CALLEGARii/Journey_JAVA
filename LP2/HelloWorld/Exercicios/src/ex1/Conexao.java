package ex1;

import java.sql.*;

public class Conexao{

public static Connection con = null;
	
   public static void ConnectDB(){
	    String dsn = "jdbc:postgresql://localhost:5432/Exercicio";
	    String user = "postgres";
	    String senha = "postdba";
       
      try(Connection con = DriverManager.getConnection(dsn, user, senha);
         Statement stmt = con.createStatement()){
    	  
          String sql = "CREATE TABLE ALUNO " +
                   "(id INTEGER not NULL, " +
                   " first VARCHAR(255), " + 
                   " last VARCHAR(255), " +
                   " age INTEGER, " + 
                   " PRIMARY KEY ( id ))"; 

         stmt.executeUpdate(sql);
         System.out.println("Created table in given database...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
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
   
   public static void main(String[] args) {
	   ConnectDB();
   }  
} 
