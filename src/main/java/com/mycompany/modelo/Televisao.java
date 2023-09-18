/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author cintia.3990
 */
public class Televisao extends Produto{
     private Double polegadas;
    private String processador;
    private String marca;

    public Televisao() {
    }

    public Double getPolegadas() {
        return polegadas;
    }

    public void setMemoriaRam(Double polegadas) {
        this.polegadas = polegadas;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    @Override
    public String toString() {
        return  "Nome: " + super.getNome() + 
                " | Preço: " + super.getPreco() +
                " | Polegadas: " + this.polegadas + 
                " | Marca: " + this.marca;
    }

    public void setPolegadas(double nextDouble) {
          }

    public void setPolegada(double nextDouble) {
       }

       }

