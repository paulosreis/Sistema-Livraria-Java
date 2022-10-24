package com.example.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendedor extends Funcionario {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long idvend;
  private Double comicao;


  protected Vendedor() {}

  public Vendedor(Double comicao ) {
    this.comicao = comicao;
  }

  @Override
  public String toString() {
    return String.format(
            "Vendedor[id=%d, comicao=%d]",
            idvend, comicao);
  }

  public Long getIdvend() {
    return idvend;
  }

  public Double getComicao() {
    return comicao;
  }

}