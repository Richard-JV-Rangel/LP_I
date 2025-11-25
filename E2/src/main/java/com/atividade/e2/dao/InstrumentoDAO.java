package com.atividade.e2.dao;

import com.atividade.e2.model.InstrumentoMusical;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InstrumentoDAO {

    public void salvar(InstrumentoMusical instrumento) {
        String sql = "INSERT INTO instrumento_musical (tipo, marca, preco) VALUES (?, ?, ?)";
        try (Connection conn = ConexaoDB.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, instrumento.getTipo());
            stmt.setString(2, instrumento.getMarca());
            stmt.setDouble(3, instrumento.getPreco());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao salvar Instrumento: " + e.getMessage());
        }
    }

    public void atualizar(InstrumentoMusical instrumento) {
        String sql = "UPDATE instrumento_musical SET tipo = ?, marca = ?, preco = ? WHERE id = ?";
        try (Connection conn = ConexaoDB.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, instrumento.getTipo());
            stmt.setString(2, instrumento.getMarca());
            stmt.setDouble(3, instrumento.getPreco());
            stmt.setInt(4, instrumento.getId());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao atualizar Instrumento: " + e.getMessage());
        }
    }

    public void deletar(int id) {
        String sql = "DELETE FROM instrumento_musical WHERE id = ?";
        try (Connection conn = ConexaoDB.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao deletar Instrumento: " + e.getMessage());
        }
    }

    public List<InstrumentoMusical> listarTodos() {
        List<InstrumentoMusical> lista = new ArrayList<>();
        String sql = "SELECT * FROM instrumento_musical";

        try (Connection conn = ConexaoDB.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                InstrumentoMusical i = new InstrumentoMusical(
                        rs.getInt("id"),
                        rs.getString("tipo"),
                        rs.getString("marca"),
                        rs.getDouble("preco")
                );
                lista.add(i);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar Instrumentos: " + e.getMessage());
        }
        return lista;
    }
}