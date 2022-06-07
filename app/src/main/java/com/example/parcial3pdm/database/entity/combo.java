package com.example.parcial3pdm.database.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "combo")
public class combo {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "entrada")
    private String entrada;
    @ColumnInfo(name ="platoFuerte")
    private String platoFuerte;
    @ColumnInfo(name = "postre")
    private String postre;
    @ColumnInfo(name ="precio")
    private float precio;

    public combo(){

    }

    public combo(String entrada,String platoFuerte,String postre,float precio){
        this.entrada = entrada;
        this.platoFuerte = platoFuerte;
        this.postre = postre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getPlatoFuerte() {
        return platoFuerte;
    }

    public void setPlatoFuerte(String platoFuerte) {
        this.platoFuerte = platoFuerte;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
