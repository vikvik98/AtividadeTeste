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



    public Fracao soma(Fracao fracao){
        Fracao somaFracao = new Fracao((this.numerador + fracao.getNumerador()),Mmc.mmc(this.denominador, fracao.getDenominador()));
        return somaFracao;
    }

    public Fracao multiplicacao(Fracao fracao){
        Fracao MultiplicaFracao = new Fracao(this.numerador * fracao.getNumerador(), this.denominador() * fracao.getDenominador());
        return MultiplicaFracao;
    }
    
}

