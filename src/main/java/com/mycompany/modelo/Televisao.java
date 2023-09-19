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
    private String marca;

    public Televisao() {
    }

    public Double getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(Double polegadas) {
        this.polegadas = polegadas;
    }

    public String getMarcaarca() {
        return marca;
    }

    public void setProcessador(String marca) {
        this.marca = marca;
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

    public void setMarca(String nextLine) {
    }

       }

