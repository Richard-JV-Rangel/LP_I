package com.atividade.e2.dao;

import com.atividade.e2.model.Crime;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CrimeDAO {

    public void salvar(Crime crime) {
        String sql = "INSERT INTO crime (tipo, local_crime, pena_anos) VALUES (?, ?, ?)";
        try (Connection conn = ConexaoDB.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, crime.getTipo());
            stmt.setString(2, crime.getLocalCrime());
            stmt.setInt(3, crime.getPenaAnos());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao salvar Crime: " + e.getMessage());
        }
    }

    public void atualizar(Crime crime) {
        String sql = "UPDATE crime SET tipo = ?, local_crime = ?, pena_anos = ? WHERE id = ?";
        try (Connection conn = ConexaoDB.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, crime.getTipo());
            stmt.setString(2, crime.getLocalCrime());
            stmt.setInt(3, crime.getPenaAnos());
            stmt.setInt(4, crime.getId());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao atualizar Crime: " + e.getMessage());
        }
    }

    public void deletar(int id) {
        String sql = "DELETE FROM crime WHERE id = ?";
        try (Connection conn = ConexaoDB.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao deletar Crime: " + e.getMessage());
        }
    }

    public List<Crime> listarTodos() {
        List<Crime> lista = new ArrayList<>();
        String sql = "SELECT * FROM crime";

        try (Connection conn = ConexaoDB.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Crime c = new Crime(
                        rs.getInt("id"),
                        rs.getString("tipo"),
                        rs.getString("local_crime"), // Nome exato da coluna no banco
                        rs.getInt("pena_anos")
                );
                lista.add(c);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar Crimes: " + e.getMessage());
        }
        return lista;
    }
}