/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;

/**
 *
 * @author Saulo
 */
public class TesteConexao {
    public static void main(String[] args) {
        
        //Abrir uma Conexão
        Connection con = Conexao.Conectar();
        if ( con != null){
            System.out.println ("Conexão Realizada");
            
        }
        //Fechar um Conexão
        Conexao.Desconectar(con);
    }
    
}
