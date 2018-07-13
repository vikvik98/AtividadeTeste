/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import model.Fracao;

/**
 *
 * @author aluno
 */
public class FracaoMetodos {

    public FracaoMetodos() {
    }
    
    
    public static Fracao soma(Fracao fracao1, Fracao fracao2){
        Fracao fracao = new Fracao((fracao1.getNumerador()+fracao2.getNumerador()),Mmc.mmc(fracao1.getDenominador(), fracao2.getDenominador()));
        return fracao;
    }

    public static Fracao multiplicacao(Fracao fracao1, Fracao fracao2){
        Fracao fracao = new Fracao(fracao1.getNumerador() * fracao2.getDenominador(), fracao1.getDenominador() * fracao2.getNumerador());
        return fracao;
    }
    
}
