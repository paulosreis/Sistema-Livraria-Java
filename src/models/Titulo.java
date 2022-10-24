package com.example.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Titulo {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long isbn;
    private String nome;
    private String editora;
    private String autor;
    private String ano_publicacao;
    private String genero;
    private int quantidade;
    private double preco_venda;
    private double preco_custo;

    protected Titulo() {}


    public Titulo(String nome, String editora, String autor, String ano_publicacao, String genero, int quantidade, double preco_venda, double preco_custo) {
        this.nome = nome;
        this.editora = editora;
        this.autor = autor;
        this.ano_publicacao = ano_publicacao;
        this.genero = genero;
        this.quantidade = quantidade;
        this.preco_venda = preco_venda;
        this.preco_custo = preco_custo;
    }

    @Override
    public String toString() {
        return String.format(
                "Titulo[isbn='%s', nome='%s', editora='%s', autor='%s', ano_publicacao='%s', genero='%s', quantidade='%d', preco_venda='%d', preco_custo='%d']",
                isbn, nome, editora, autor, ano_publicacao, genero, quantidade, preco_venda, preco_custo);
    }

    public Long getIsbn() { return isbn; }

    public String getNome() { return nome; }

    public String getEditora() { return editora; }

    public String getAutor() { return autor; }

    public String getAno_publicacao() { return ano_publicacao; }

    public String getGenero() { return genero; }

    public int getQuantidade() { return quantidade; }

    public double getPreco_venda() { return preco_venda; }

    public double getPreco_custo() { return preco_custo; }

    public void setIsbn(Long isbn) { this.isbn = isbn; }

    public void setNome(String nome) { this.nome = nome; }

    public void setEditora(String editora) { this.editora = editora; }

    public void setAutor(String autor) { this.autor = autor; }

    public void setAno_publicacao(String ano_publicacao) { this.ano_publicacao = ano_publicacao; }

    public void setGenero(String genero) { this.genero = genero; }

    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public void setPreco_venda(double preco_venda) { this.preco_venda = preco_venda; }

    public void setPreco_custo(double preco_custo) { this.preco_custo = preco_custo; }

}