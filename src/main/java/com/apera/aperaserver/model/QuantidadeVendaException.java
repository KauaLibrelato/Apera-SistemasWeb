package com.apera.aperaserver.model;

public class QuantidadeVendaException extends Exception{
    public QuantidadeVendaException() {
        super("A quantidade de ativos a serem vendidos é maior que a disponível na carteira");
    }
 }
