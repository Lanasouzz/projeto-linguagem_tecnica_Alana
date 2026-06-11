package com.example.demo.impl;

import com.example.demo.dao.StockyDao;
import com.example.demo.models.Stocky;

import java.sql.Connection;
import java.util.List;

public class StockyDaoJDBC implements StockyDao {
    private final Connection conn;

    public StockyDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    // Aqui devem ser estabelecidos os métodos de comunicação com o banco de dados. Métodos como listar os itens do bando, pesquisar um item específico, adicionar um novo item, etc.
    // Utilize a variável "conn" como a conexão com o banco.

    public int lastId() {
        // Deve retornar o valor do id di último produto cadastrado.
        // implemente esse método a partir da interface.
        return 0;
    }

    public int getId(String produto) {
        // Deve retornar o id do produto.
        // implemente esse método a partir da interface.
        return 0;
    }

    public double getValor(String produto) {
        // Deve retornar o valor do produto.
        // implemente esse método a partir da interface.
        return 0;
    }

    public Stocky getProduto(String produto){
        // Deve retornar um objeto da classe Stock com as informações do produto indicado no argumento.
        // implemente esse método a partir da interface.
    }

    public List<Stocky> allProdutos(){
        // Deve retornar uma lista com todos os produtos do estoque.
        // implemente esse método a partir da interface.
    }

    public void createStocky(){
        // Faça um método que verifica se o estoque (tabela) já foi criado no banco de dados atual.
        // Caso o estoque ainda não exista, crie a tabela do estoque e adicione alguns produtos.
        // Vamos testar o sistema em diferentes computadores, então é bom que sempre que o código for executado em uma nova máquina o estoque já esteja minimamente estruturado.
    }
}
