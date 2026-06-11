package com.example.demo.application.controllers.dashboard.tools.check;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Check {
    public TextField campoPesquisar;
    public GridPane gridPane;

    @FXML
    public void initialize() {
        // A construção da parte inferior da tela deve ser feita aqui.
        // Veja o design do Figma para formatar essa sessão (está na sessão de verificar estoque).
        // Disponha as informações de cada produto em cada linha do gridPane.
    }

    public void pesquisar() {
        // Deve pesquisar o produto no estoque e exibir na tela.
        // Pegue o campoPesquisar e faça a pesquisa.
        // Veja como deve ser mostrado o resultado na tela (veja no Figma).
        // Utilize a classe getProduto da classe StockyDaoJDBC para fazer a pesquisa (ela retorna um objeto do tipo Stock - uma model).
    }

    public void sair() {
        // Deve voltar para a tela de dashboard.
    }
}
