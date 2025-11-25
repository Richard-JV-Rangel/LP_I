package com.atividade.e2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    // Dados de conexão baseados no seu XAMPP e no Banco criado
    private static final String URL = "jdbc:mysql://localhost:3306/atividade_e2";
    private static final String USER = "root";
    private static final String PASSWORD = "123456"; // Deixei vazio conforme seu teste no DBeaver

    public static Connection conectar() {
        try {
            Connection conexao = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Conexão com o banco realizada com sucesso!");
            return conexao;
        } catch (SQLException e) {
            System.err.println("❌ Erro ao conectar com o banco: " + e.getMessage());
            return null;
        }
    }
}