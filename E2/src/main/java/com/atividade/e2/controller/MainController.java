package com.atividade.e2.controller;

import com.atividade.e2.dao.CrimeDAO;
import com.atividade.e2.dao.InstrumentoDAO;
import com.atividade.e2.dao.PessoaMusicaDAO;
import com.atividade.e2.model.Crime;
import com.atividade.e2.model.InstrumentoMusical;
import com.atividade.e2.model.PessoaMusica;
import javafx.animation.PauseTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Duration;

public class MainController {

    //DAOs
    private final PessoaMusicaDAO musicoDAO = new PessoaMusicaDAO();
    private final InstrumentoDAO instrumentoDAO = new InstrumentoDAO();
    private final CrimeDAO crimeDAO = new CrimeDAO();

    //ABA MÚSICO
    @FXML private TextField txtNomeMusico, txtSentimento, txtPapel;
    @FXML private Label lblMsgMusico;
    @FXML private TableView<PessoaMusica> tabMusico;
    @FXML private TableColumn<PessoaMusica, Integer> colIdMusico;
    @FXML private TableColumn<PessoaMusica, String> colNomeMusico, colSentimento, colPapel;
    private PessoaMusica musicoSelecionado;

    //ABA INSTRUMENTO
    @FXML private TextField txtTipoInst, txtMarcaInst, txtPrecoInst;
    @FXML private Label lblMsgInst;
    @FXML private TableView<InstrumentoMusical> tabInst;
    @FXML private TableColumn<InstrumentoMusical, Integer> colIdInst;
    @FXML private TableColumn<InstrumentoMusical, String> colTipoInst, colMarcaInst;
    @FXML private TableColumn<InstrumentoMusical, Double> colPrecoInst;
    private InstrumentoMusical instSelecionado;

    //ABA CRIME
    @FXML private TextField txtTipoCrime, txtLocalCrime, txtPenaCrime;
    @FXML private Label lblMsgCrime;
    @FXML private TableView<Crime> tabCrime;
    @FXML private TableColumn<Crime, Integer> colIdCrime;
    @FXML private TableColumn<Crime, String> colTipoCrime, colLocalCrime;
    @FXML private TableColumn<Crime, Integer> colPenaCrime;
    private Crime crimeSelecionado;

    @FXML
    public void initialize() {
        configurarTabelas();
        atualizarTabelas();
    }

    private void configurarTabelas() {
        // Músico
        colIdMusico.setCellValueFactory(new PropertyValueFactory<>("id"));
        colNomeMusico.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colSentimento.setCellValueFactory(new PropertyValueFactory<>("sentimento"));
        colPapel.setCellValueFactory(new PropertyValueFactory<>("papel"));

        // Instrumento
        colIdInst.setCellValueFactory(new PropertyValueFactory<>("id"));
        colTipoInst.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        colMarcaInst.setCellValueFactory(new PropertyValueFactory<>("marca"));
        colPrecoInst.setCellValueFactory(new PropertyValueFactory<>("preco"));

        // Crime
        colIdCrime.setCellValueFactory(new PropertyValueFactory<>("id"));
        colTipoCrime.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        colLocalCrime.setCellValueFactory(new PropertyValueFactory<>("localCrime"));
        colPenaCrime.setCellValueFactory(new PropertyValueFactory<>("penaAnos"));
    }

    private void atualizarTabelas() {
        tabMusico.setItems(FXCollections.observableArrayList(musicoDAO.listarTodos()));
        tabInst.setItems(FXCollections.observableArrayList(instrumentoDAO.listarTodos()));
        tabCrime.setItems(FXCollections.observableArrayList(crimeDAO.listarTodos()));
    }

    //AÇÕES MÚSICO
    @FXML
    void btnSalvarMusico() {
        PessoaMusica p = new PessoaMusica(txtNomeMusico.getText(), txtSentimento.getText(), txtPapel.getText());
        musicoDAO.salvar(p);
        mostrarMensagem(lblMsgMusico, "Músico salvo com sucesso!");
        btnLimparMusico();
        atualizarTabelas();
    }

    @FXML
    void btnEditarMusico() {
        if (musicoSelecionado != null) {
            musicoSelecionado.setNome(txtNomeMusico.getText());
            musicoSelecionado.setSentimento(txtSentimento.getText());
            musicoSelecionado.setPapel(txtPapel.getText());
            musicoDAO.atualizar(musicoSelecionado);
            mostrarMensagem(lblMsgMusico, "Músico editado!");
            btnLimparMusico();
            atualizarTabelas();
        }
    }

    @FXML
    void btnExcluirMusico() {
        if (musicoSelecionado != null) {
            musicoDAO.deletar(musicoSelecionado.getId());
            mostrarMensagem(lblMsgMusico, "Músico excluído.");
            btnLimparMusico();
            atualizarTabelas();
        }
    }

    @FXML
    void selecionarMusico() {
        musicoSelecionado = tabMusico.getSelectionModel().getSelectedItem();
        if (musicoSelecionado != null) {
            txtNomeMusico.setText(musicoSelecionado.getNome());
            txtSentimento.setText(musicoSelecionado.getSentimento());
            txtPapel.setText(musicoSelecionado.getPapel());
        }
    }

    @FXML
    void btnLimparMusico() {
        txtNomeMusico.clear();
        txtSentimento.clear();
        txtPapel.clear();
        musicoSelecionado = null;
    }

    //AÇÕES INSTRUMENTO
    @FXML
    void btnSalvarInst() {
        try {
            double preco = Double.parseDouble(txtPrecoInst.getText().replace(",", "."));
            InstrumentoMusical i = new InstrumentoMusical(txtTipoInst.getText(), txtMarcaInst.getText(), preco);
            instrumentoDAO.salvar(i);
            mostrarMensagem(lblMsgInst, "Instrumento salvo!");
            btnLimparInst();
            atualizarTabelas();
        } catch (NumberFormatException e) {
            mostrarMensagem(lblMsgInst, "Erro: Preço inválido.");
        }
    }

    @FXML
    void btnEditarInst() {
        if (instSelecionado != null) {
            try {
                instSelecionado.setTipo(txtTipoInst.getText());
                instSelecionado.setMarca(txtMarcaInst.getText());
                instSelecionado.setPreco(Double.parseDouble(txtPrecoInst.getText().replace(",", ".")));
                instrumentoDAO.atualizar(instSelecionado);
                mostrarMensagem(lblMsgInst, "Instrumento editado!");
                btnLimparInst();
                atualizarTabelas();
            } catch (Exception e) { mostrarMensagem(lblMsgInst, "Erro no preço."); }
        }
    }

    @FXML
    void btnExcluirInst() {
        if (instSelecionado != null) {
            instrumentoDAO.deletar(instSelecionado.getId());
            mostrarMensagem(lblMsgInst, "Instrumento excluído.");
            btnLimparInst();
            atualizarTabelas();
        }
    }

    @FXML
    void selecionarInst() {
        instSelecionado = tabInst.getSelectionModel().getSelectedItem();
        if (instSelecionado != null) {
            txtTipoInst.setText(instSelecionado.getTipo());
            txtMarcaInst.setText(instSelecionado.getMarca());
            txtPrecoInst.setText(String.valueOf(instSelecionado.getPreco()));
        }
    }

    @FXML
    void btnLimparInst() {
        txtTipoInst.clear();
        txtMarcaInst.clear();
        txtPrecoInst.clear();
        instSelecionado = null;
    }

    //AÇÕES CRIME
    @FXML
    void btnSalvarCrime() {
        try {
            int pena = Integer.parseInt(txtPenaCrime.getText());
            Crime c = new Crime(txtTipoCrime.getText(), txtLocalCrime.getText(), pena);
            crimeDAO.salvar(c);
            mostrarMensagem(lblMsgCrime, "Registro criminal salvo!");
            btnLimparCrime();
            atualizarTabelas();
        } catch (NumberFormatException e) {
            mostrarMensagem(lblMsgCrime, "Erro: Pena deve ser número.");
        }
    }

    @FXML
    void btnEditarCrime() {
        if (crimeSelecionado != null) {
            try {
                crimeSelecionado.setTipo(txtTipoCrime.getText());
                crimeSelecionado.setLocalCrime(txtLocalCrime.getText());
                crimeSelecionado.setPenaAnos(Integer.parseInt(txtPenaCrime.getText()));
                crimeDAO.atualizar(crimeSelecionado);
                mostrarMensagem(lblMsgCrime, "Registro editado.");
                btnLimparCrime();
                atualizarTabelas();
            } catch (Exception e) { mostrarMensagem(lblMsgCrime, "Erro na pena."); }
        }
    }

    @FXML
    void btnExcluirCrime() {
        if (crimeSelecionado != null) {
            crimeDAO.deletar(crimeSelecionado.getId());
            mostrarMensagem(lblMsgCrime, "Registro excluído.");
            btnLimparCrime();
            atualizarTabelas();
        }
    }

    @FXML
    void selecionarCrime() {
        crimeSelecionado = tabCrime.getSelectionModel().getSelectedItem();
        if (crimeSelecionado != null) {
            txtTipoCrime.setText(crimeSelecionado.getTipo());
            txtLocalCrime.setText(crimeSelecionado.getLocalCrime());
            txtPenaCrime.setText(String.valueOf(crimeSelecionado.getPenaAnos()));
        }
    }

    @FXML
    void btnLimparCrime() {
        txtTipoCrime.clear();
        txtLocalCrime.clear();
        txtPenaCrime.clear();
        crimeSelecionado = null;
    }

    // Método para sumir com a mensagem depois de 3 segundos
    private void mostrarMensagem(Label label, String texto) {
        label.setText(texto);
        PauseTransition delay = new PauseTransition(Duration.seconds(3));
        delay.setOnFinished(e -> label.setText(""));
        delay.play();
    }

    //MÉTODOS DA ATIVIDADE E1

    @FXML
    void btnAcaoMusico() {
        if (musicoSelecionado != null) {
            mostrarAlerta("Ação do Músico", musicoSelecionado.cantar());
        } else {
            mostrarAlerta("Atenção", "Selecione um músico na tabela primeiro.");
        }
    }

    @FXML
    void btnAcaoInst() {
        if (instSelecionado != null) {
            mostrarAlerta("Som do Instrumento", instSelecionado.tocar());
        } else {
            mostrarAlerta("Atenção", "Selecione um instrumento na tabela primeiro.");
        }
    }

    @FXML
    void btnAcaoCrime() {
        if (crimeSelecionado != null) {
            mostrarAlerta("Relatório Policial", crimeSelecionado.cometer());
        } else {
            mostrarAlerta("Atenção", "Selecione um crime na tabela primeiro.");
        }
    }

    // Método auxiliar para criar janelas bonitas
    private void mostrarAlerta(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
}