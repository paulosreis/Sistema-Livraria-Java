package com.example.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Venda {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_venda;
    private int forma_pagamento;
    private String data_venda;
    private String cpf_comprador;
    private String cnpj_comprador;
    private double sub_total;

    protected Venda() {}

    public Venda(int forma_pagamento, String data_venda, String cpf_comprador, String cnpj_comprador, double sub_total) {
        this.forma_pagamento = forma_pagamento;
        this.data_venda = data_venda;
        this.cpf_comprador = cpf_comprador;
        this.cnpj_comprador = cnpj_comprador;
        this.sub_total = sub_total;
    }

    @Override
    public String toString() {
        return String.format(
                "Titulo[id_venda=%d, forma_pagamento=%d, data_venda='%s', cpf_comprador='%s', cnpj_comprador='%s', subtotal=%d]",
                id_venda, forma_pagamento, data_venda, cpf_comprador, cnpj_comprador, sub_total);
    }

    public Long getId_venda() { return id_venda; }

    public int getForma_pagamento() { return forma_pagamento; }

    public String getData_venda() { return data_venda; }

    public String getCpf_comprador() { return cpf_comprador; }

    public String getCnpj_comprador() { return cnpj_comprador; }

    public double getSub_total() { return sub_total; }

    public void setId_venda(Long id_venda) { this.id_venda = id_venda; }

    public void setForma_pagamento(int forma_pagamento) { this.forma_pagamento = forma_pagamento; }

    public void setData_venda(String data_venda) { this.data_venda = data_venda; }

    public void setCpf_comprador(String cpf_comprador) { this.cpf_comprador = cpf_comprador; }

    public void setCnpj_comprador(String cnpj_comprador) { this.cnpj_comprador = cnpj_comprador; }

    public void setSub_total(double sub_total) { this.sub_total = sub_total; }
}