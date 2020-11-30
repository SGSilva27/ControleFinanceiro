/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.*;
import java.util.ArrayList;
import modelo.Cadastro_Usuario;

/**
 *
 * @author Flaubert
 */
public class TarefaDAO {

    private Connection con;
    private PreparedStatement cmd;

    public int inserir(Cadastro_Usuario t) {
        try {
            String sql = "INSERT INTO cadastro_usuarios " + //adicionando cadastro_usuarios
                    "(nome,sexo,ocupacao,familia,grau_parentesco,email,senha,confirma_senha) "
                    + "VALUES (?,?,?,?,?,?,?,?) ";//essas interogação é trocado  pelo que está escrito

            con = Conexao.Conectar();//abre a conexão
            cmd = con.prepareStatement(sql);//aqui as informações estão //
//pré copiladas e não deixa invasão
            cmd.setString(1, t.getNome());
            cmd.setString(2, t.getSexo());
            cmd.setString(3, t.getOcupacao());
            cmd.setString(4, t.getFamilia());
            cmd.setString(5, t.getGrau_parentesco());
            cmd.setString(6, t.getEmail());
            cmd.setString(7, t.getSenha());
            cmd.setString(8, t.getConfirma_senha());

            if (cmd.executeUpdate() > 0) {//aqui ele faz a inserção no banco
                return 1;
            } else {
                return -1;
            }


        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        } finally {//desconecta a conexão
            Conexao.Desconectar(con);
        }

    }

    public int atualizar(Cadastro_Usuario t) {
        try {
            String sql = "UPDATE cadastro_usuarios  " //atualizando cadastro_usuarios
                    + "SET nome=?,sexo=?,ocupacao=?,familia=?,grau_parentesco=?,email=?,senha=?,confirma_senha=? "
                    + "WHERE codigo=?";//essas interogação é trocado  pelo que está escrito

            con = Conexao.Conectar();//abre a conexão
            cmd = con.prepareStatement(sql);//aqui as informações estão //
//pré copiladas e não deixa invasão
            cmd.setString(1, t.getNome());
            cmd.setString(2, t.getSexo());
            cmd.setString(3, t.getOcupacao());
            cmd.setString(4, t.getFamilia());
            cmd.setString(5, t.getGrau_parentesco());
            cmd.setString(6, t.getEmail());
            cmd.setString(7, t.getSenha());
            cmd.setString(8, t.getConfirma_senha());

            if (cmd.executeUpdate() > 0) {//aqui ele faz a inserção no banco
                return 1;
            } else {
                return -1;
            }


        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        } finally {//desconecta a conexão
            Conexao.Desconectar(con);
        }

    }

    public int apagar(Cadastro_Usuario p) {
        try {
            String sql = "DELETE FROM  cadastro_usuarios " //atualizando cadastro_usuarios
                    + "WHERE codigo=?";//essas interogação é trocado  pelo que está escrito

            con = Conexao.Conectar();//abre a conexão
            cmd = con.prepareStatement(sql);//aqui as informações estão //
//pré copiladas e não deixa invasão
            cmd.setInt(1, p.getCodigo());

            if (cmd.executeUpdate() > 0) {//aqui ele faz a inserção no banco
                return 1;
            } else {
                return -1;
            }


        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        } finally {//desconecta a conexão
            Conexao.Desconectar(con);
        }

    }

    public ArrayList consultarPorData(Date data) {
        try {
            String sql = "SELECT * FROM cadastro_usuarios WHERE data=?";
            con = Conexao.Conectar();
            cmd = con.prepareStatement(sql);
            cmd.setDate(1, data);
            ResultSet rs = cmd.executeQuery();
            ArrayList resultado = new ArrayList();
            while (rs.next()) {
                Cadastro_Usuario t = new Cadastro_Usuario();
                t.setCodigo(rs.getInt("codigo"));
                t.setNome(rs.getString("nome"));
                t.setSexo(rs.getString("sexo"));
                t.setOcupacao(rs.getString("ocupacao"));
                t.setFamilia(rs.getString("familia"));
                t.setGrau_parentesco(rs.getString("grau_parentesco"));
                t.setEmail(rs.getString("email"));
                t.setSenha(rs.getString("senha"));
                t.setConfirma_senha(rs.getString("confirma_senha"));
                resultado.add(t);
            }
            return resultado;
        } catch (Exception e) {
            System.out.println("ERRO:" + e);
            return null;
        } finally {
            Conexao.Desconectar(con);
        }

    }

    //NÃO FAZIA PARTE DO CODIGO ORIGINAL ISSO É PARA TENTR CONFIGURAR O BOTAO NOME
    public ArrayList consultarPorStatus(String status) {
        try {
            String sql = "SELECT * FROM tb_tarefa WHERE nome ILIKE ?";
            con = Conexao.Conectar();
            cmd = con.prepareStatement(sql);
            cmd.setString(1, "%" + status + "%");
            ResultSet rs = cmd.executeQuery();
            ArrayList resultado = new ArrayList();
            while (rs.next()) {
                Cadastro_Usuario t = new Cadastro_Usuario();
                t.setCodigo(rs.getInt("codigo"));
                t.setCodigo(rs.getInt("codigo"));
                t.setNome(rs.getString("nome"));
                t.setSexo(rs.getString("sexo"));
                t.setOcupacao(rs.getString("ocupacao"));
                t.setFamilia(rs.getString("familia"));
                t.setGrau_parentesco(rs.getString("grau_parentesco"));
                t.setEmail(rs.getString("email"));
                t.setSenha(rs.getString("senha"));
                t.setConfirma_senha(rs.getString("confirma_senha"));
                resultado.add(t);
            }
            return resultado;
        } catch (Exception e) {
            System.out.println("ERRO:" + e);
            return null;
        } finally {
            Conexao.Desconectar(con);

        }
    }

    public ArrayList listarTodos() {
        try {
            String sql = "SELECT * FROM tb_tarefa ORDER BY data";//ORDERDAR POR data
            con = Conexao.Conectar();
            cmd = con.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            ArrayList resultado = new ArrayList();
            while (rs.next()) {
                Cadastro_Usuario t = new Cadastro_Usuario();
                t.setCodigo(rs.getInt("codigo"));
                t.setCodigo(rs.getInt("codigo"));
                t.setNome(rs.getString("nome"));
                t.setSexo(rs.getString("sexo"));
                t.setOcupacao(rs.getString("ocupacao"));
                t.setFamilia(rs.getString("familia"));
                t.setGrau_parentesco(rs.getString("grau_parentesco"));
                t.setEmail(rs.getString("email"));
                t.setSenha(rs.getString("senha"));
                t.setConfirma_senha(rs.getString("confirma_senha"));
                resultado.add(t);
            }
            return resultado;
        } catch (Exception e) {
            System.out.println("ERRO:" + e);
            return null;
        } finally {
            Conexao.Desconectar(con);

        }
    }
}
