module com.atividade.e2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;          // Necessário para usar Connection, DriverManager, etc
    requires mysql.connector.j; // Necessário para o driver do MySQL

    // Permite que o JavaFX acesse a classe Main (na raiz do pacote)
    opens com.atividade.e2 to javafx.fxml;

    opens com.atividade.e2.controller to javafx.fxml;

    // Permite que a Tabela leia os dados de PessoaMusica, Crime, etc.
    opens com.atividade.e2.model to javafx.base;

    // Exporta o pacote principal para rodar o app
    exports com.atividade.e2;
}