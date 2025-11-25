package com.atividade.e2.dao;

import com.atividade.e2.model.PessoaMusica;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PessoaMusicaDAO {

    public void salvar(PessoaMusica pessoa) {
        String sql = "INSERT INTO pessoa_musica (nome, sentimento, papel) VALUES (?, ?, ?)";
        try (Connection conn = ConexaoDB.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getSentimento());
            stmt.setString(3, pessoa.getPapel());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao salvar Pessoa: " + e.getMessage());
        }
    }

    public void atualizar(PessoaMusica pessoa) {
        String sql = "UPDATE pessoa_musica SET nome = ?, sentimento = ?, papel = ? WHERE id = ?";
        try (Connection conn = ConexaoDB.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getSentimento());
            stmt.setString(3, pessoa.getPapel());
            stmt.setInt(4, pessoa.getId());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao atualizar Pessoa: " + e.getMessage());
        }
    }

    public void deletar(int id) {
        String sql = "DELETE FROM pessoa_musica WHERE id = ?";
        try (Connection conn = ConexaoDB.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao deletar Pessoa: " + e.getMessage());
        }
    }

    public List<PessoaMusica> listarTodos() {
        List<PessoaMusica> lista = new ArrayList<>();
        String sql = "SELECT * FROM pessoa_musica";

        try (Connection conn = ConexaoDB.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                PessoaMusica p = new PessoaMusica(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("sentimento"),
                        rs.getString("papel")
                );
                lista.add(p);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar Pessoas: " + e.getMessage());
        }
        return lista;
    }
}