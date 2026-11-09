/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Gabrieli
 */
public class Impressao {

    private int id;
    private String modelo;
    private String material;
    private String cor;
    private int quantidade;
    private float filamento;
    private int horas;
    private int minutos;
    private String status;

    public Impressao(String modelo, String material, String cor,
            int quantidade, float filamento, int horas,
            int minutos, String status) {

        this.modelo = modelo;
        this.material = material;
        this.cor = cor;
        this.quantidade = quantidade;
        this.filamento = filamento;
        this.horas = horas;
        this.minutos = minutos;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double tempoTotal() {
        return horas + (minutos / 60.0);
    }

    public String getModelo() {
        return modelo;
    }

    public String getMaterial() {
        return material;
    }

    public String getCor() {
        return cor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getFilamento() {
        return filamento;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public String getStatus() {
        return status;
    }
}