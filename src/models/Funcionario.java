package com.example.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario {

    private String login;
    private String senha;
    private String data_contratacao;
    private String nome;
    private String cpf;
    private double salario;

    protected Funcionario() {}

    public Funcionario(String login, String senha, String data_contratacao, String nome, String cpf, double salario) {
        this.login = login;
        this.senha = senha;
        this.data_contratacao = data_contratacao;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return String.format(
                "Titulo[login='%s', senha='%s', data_contratacao'%s', nome='%s', cpf='%s', salario=%d]",
                login, senha, data_contratacao, nome, cpf, salario);
    }

    public String getLogin() { return login; }

    public String getSenha() { return senha; }

    public String getData_contratacao() { return data_contratacao; }

    public String getNome() { return nome; }

    public String getCpf() { return cpf; }

    public double getSalario() { return salario; }

    public void setLogin(String login) { this.login = login; }

    public void setSenha(String senha) { this.senha = senha; }

    public void setData_contratacao(String data_contratacao) { this.data_contratacao = data_contratacao; }

    public void setNome(String nome) { this.nome = nome; }

    public void setCpf(String cpf) { this.cpf = cpf; }

    public void setSalario(double salario) { this.salario = salario; }
}
