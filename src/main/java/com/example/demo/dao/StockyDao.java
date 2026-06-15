package com.example.demo.dao;

import com.example.demo.models.Stocky;

import java.util.List;

// Contrato da camada de persistencia: os controllers devem depender desta interface,
// e nao diretamente da classe JDBC.
public interface StockyDao {
    // Retorna o maior id cadastrado. Serve para sugerir o proximo codigo na tela de cadastro.
    int lastId();

    // Busca dados pontuais pelo nome do produto, usados nas telas de adicionar/remover estoque.
    int getId(String produto);

    double getValor(String produto);

    // Retorna um produto completo para pesquisa/listagem.
    Stocky getProduto(String produto);

    Stocky getProdutoById(int id);

    List<Stocky> allProdutos();

    // Operacoes principais de cadastro, edicao e exclusao.
    void insert(Stocky produto);

    void update(Stocky produto);

    void deleteById(int id);

    void deleteByName(String produto);

    // Operacoes especificas para movimentacao de estoque.
    void addQuantidade(int id, int quantidade);

    void removeQuantidade(int id, int quantidade);

    // Garante que a tabela exista antes de usar o sistema.
    void createStocky();
}
