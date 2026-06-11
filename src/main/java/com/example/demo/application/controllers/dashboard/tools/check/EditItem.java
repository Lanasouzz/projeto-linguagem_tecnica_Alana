package com.example.demo.application.controllers.dashboard.tools.check;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class EditItem {
    public TextField nome;
    public TextField valor;
    public TextField codigo;

    public VBox erroContainer;
    public Label erroMessage;

    // Quando ocorrer um erro, torne visível o erroContainer e passe a mensagem de erro para o erroMessage.
    // Por padrão o erroContainer é invisível.
    // Crie uma função que torne o erroContainer invisível; coloque essa função no início dos outros métodos para que, sempre que uma ação seja feita pelo usuário, a mensagem de erro desapareça.

    @FXML
    public void initialize() {
        // Essa página é acionada a partir do botão "Editar" na tela de verificar produtos (existe um botão para cada produto).
        // Deve passar o código do produto a ser editado para o "codigo".
        // Utilize a classe getId da classe StockyDaoJDBC para pegar o id do produto (mas a implementação deste método não é feita diretamente por essa classe).
        // Passe também o nome do produto e o valor do produto para os respectivos campos.
    }

    public void salvarESair() {
        // Deve recolher a informações modificadas e atualizar o banco de dados.
        // Também deve voltar para a tela de verificar produtos.
    }

    public void sair() {
        // Deve voltar para a tela de verificar produtos.
    }
}
