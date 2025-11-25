package com.atividade.e2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Carrega o nosso arquivo visual MainView.fxml
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view/MainView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        // Configurações da janela
        stage.setTitle("Sistema E2 - Gestão Musical e Criminal");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(); // Lança a aplicação
    }
}