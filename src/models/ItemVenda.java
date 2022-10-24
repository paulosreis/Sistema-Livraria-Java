package com.example.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemVenda {
    private String nome;
    private int quantidade;
    private double valor_unit;

    protected ItemVenda() {}

    public Titulo(String nome, int quantidade, double valor_unit) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor_unit = valor_unit;
    }

    public String getNome() { return nome; }

    public int getQuantidade() { return quantidade; }

    public double getValor_unit() { return valor_unit; }

    public void setNome(String nome) { this.nome = nome; }

    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public void setValor_unit(double valor_unit) { this.valor_unit = valor_unit; }
}
