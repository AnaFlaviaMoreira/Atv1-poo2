package org.model;

import java.util.Date;
import java.util.List;

public class Modelo {

    private long id;
    private String nome;
    private Date anoModelo;
    private int qntModelos;
    List<Modelo> listmodelo;

    public Modelo() {
        this.id = 0;
        this.nome = "";
        this.anoModelo = new Date();
        this.qntModelos = 0;

    }

    public Modelo(long id, String nome, Date anoModelo, int qntModelos){
        this.id = id;
        this.nome = nome;
        this.anoModelo = anoModelo;
        this.qntModelos = qntModelos;

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Date anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getQntModelos() {
        return qntModelos;
    }

    public void setQntModelos(int qntModelos) {
        this.qntModelos = qntModelos;
    }
}
