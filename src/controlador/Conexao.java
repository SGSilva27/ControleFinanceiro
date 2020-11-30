/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Saulo
 */
public class Conexao {
    
    //INFORMAÇÕES NECESSÁRIAS PARA A COMUNICAÇÃO COM O BANCO
    
    private static final String DRIVER="org.postgresql.Driver";
    private static final String URL="jdbc:postgresql://localhost:5432/Controle_Financeiro";
    private static final String USUARIO="postgres";
    private static final String SENHA="Kris21";
    
    //Metodo Conectar
    public static Connection Conectar (){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(
                    URL, USUARIO, SENHA);          
        } catch (Exception e) {
            System.out.println ("ERRO:"+e.getMessage ());
            return null;
        }
        
    }
    
    //Metodo Desconectar
    public static void Desconectar (Connection con){
          try {
              con.close();
        } catch (Exception e) {
            System.out.println ("ERRO:" +e.getMessage ());
        }
        
    }
  
}

