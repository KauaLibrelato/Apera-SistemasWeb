package com.apera.aperaserver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Carteira extends EntityId{
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

//    @Column(name = "ativos")
//    private List<Ativo> ativos;
    @Column(name = "valorTotal")
    private Double valorTotal;

    @OneToMany(mappedBy = "carteira")
    private List<Compra> historicoCompras = new ArrayList<>();
    @OneToMany(mappedBy = "carteira")
    private List<Venda> historicoVendas = new ArrayList<>();



    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

//    public List<Ativo> getAtivos() {
//        return ativos;
//    }
//
//    public void setAtivos(List<Ativo> ativos) {
//        this.ativos = ativos;
//    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Compra> getHistoricoCompras() {
        return historicoCompras;
    }

    public void setHistoricoCompras(List<Compra> historicoCompras) {
        this.historicoCompras = historicoCompras;
    }

    public List<Venda> getHistoricoVendas() {
        return historicoVendas;
    }

    public void setHistoricoVendas(List<Venda> historicoVendas) {
        this.historicoVendas = historicoVendas;
    }

    @Override
    public String toString() {
        return "Carteira{" +
                "usuario=" + usuario +
                //", ativos=" + ativos +
                ", valorTotal=" + valorTotal +
                ", historicoCompras=" + historicoCompras +
                ", historicoVendas=" + historicoVendas +
                '}';
    }
}
