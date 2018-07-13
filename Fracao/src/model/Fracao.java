/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import utils.Mmc;

/**
 *
 * @author aluno
 */

public class Fracao {


    private double numerador;
    private double denominador;

    public Fracao(double numerador, double denominador) {
        if(denominador != 0){
            this.numerador = numerador;
            this.denominador = denominador;
        }else{
            throw new RuntimeException("Uma fração não aceita 0 como denominador!");
        }
        
    }
    
    
    

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public String getFracao(){
        return getNumerador() + "/" + getDenominador();
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }



    public static Fracao soma(Fracao fracao1, Fracao fracao2){
        Fracao fracao = new Fracao((fracao1.getNumerador()+fracao2.getNumerador()),Mmc.mmc(fracao1.getDenominador(), fracao2.getDenominador()));
        return fracao;
    }

    public static Fracao multiplicacao(Fracao fracao1, Fracao fracao2){
        Fracao fracao = new Fracao(fracao1.getNumerador() * fracao2.getNumerador(), fracao1.getDenominador() * fracao2.getDenominador());
        return fracao;
    }
    
}

