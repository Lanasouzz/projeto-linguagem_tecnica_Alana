package com.example.demo.application.controllers.dashboard.tools;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Register {
    public TextField nome;
    public TextField quantidade;
    public TextField valor;
    public TextField codigo;

    public VBox erroContainer;
    public Label erroMessage;

    // Quando ocorrer um erro, torne visível o erroContainer e passe a mensagem de erro para o erroMessage.
    // Por padrão o erroContainer é invisível.
    // Crie uma função que torne o erroContainer invisível; coloque essa função no início dos outros métodos para que, sempre que uma ação seja feita pelo usuário, a mensagem de erro desapareça.

    @FXML
    public void initialize() {
        // Ao inicializar a página, deve passar para o campo de código o endereço que terá o produto a ser cadastrado.
        // Provavelmente o id do produto no banco de dados será atualizado automaticamente, então pegue do banco de dados o id do último produto cadastrado e adicione 1 ao valor.
        // O valor no TextField deve ter o formato "0000", uma string, mas o valor que será retornado pelo banco será um número inteiro (pense nisso).
        // O último valor é retornado pela função "lastId" da classe StockyDaoJDBC (mas a implementação deste método não é feita diretamente por essa classe).
    }

    public void salvarEContinuar() {
        // Deve salvar o produto e atualizar a pagína atual (caso tenha uma maneira de reinicializar a classe, faça isso).
    }

    public void salvarESair() {
        // Deve salvar o produto e voltar para a tela de dashboard.
    }

    public void sair() {
        // Deve voltar para a tela de dashboard.
    }
}
