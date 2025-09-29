package com.projeto.controler;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;

public class MainController {
    @FXML
    private TabPane tabPane;

    @FXML
    public void initialize() {
        // Carrega todas as abas que criamos
        loadTab("Logotipo", "/com/projeto/view/LogotipoView.fxml");
        loadTab("Música", "/com/projeto/view/MusicaView.fxml");
        loadTab("Jornal", "/com/projeto/view/JornalView.fxml");
        loadTab("Vídeo", "/com/projeto/view/VideoView.fxml");
        // Adicione aqui a linha para a aba "Ferrovia" quando a criar
    }

    private void loadTab(String title, String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            AnchorPane content = loader.load();
            Tab tab = new Tab(title);
            tab.setContent(content);
            tabPane.getTabs().add(tab);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}