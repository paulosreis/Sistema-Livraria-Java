package com.example.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendedor {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  private Double comicao;
  

  protected Vendedor() {}

  public Vendedor(Double comicao ) {
    this.comicao = comicao;
  }

  @Override
  public String toString() {
    return String.format(
        "Vendedor[id=%d, firstName='%s']",
        id, comicao);
  }

  public Long getId() {
    return id;
  }

  public Double getComicao() {
    return comicao;
  }

}