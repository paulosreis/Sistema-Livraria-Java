package com.example.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gerente extends Funcionario{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_gerente;
    private Double bonus;


    protected Vendedor() {}

    public Vendedor(Double comicao ) {
        this.bonus = comicao;
    }

    @Override
    public String toString() {
        return String.format(
                "Vendedor[id=%d, bonus=%d]",
                id_gerente, bonus);
    }

    public Long getId_gerente() {
        return id_gerente;
    }

    public Double getBonus() { return bonus; }

    public void setId_gerente(Long id_gerente) { this.id_gerente = id_gerente; }

    public void setBonus(Double bonus) { this.bonus = bonus; }
}
