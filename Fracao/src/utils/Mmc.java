/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author aluno
 */
public class Mmc {
    
    public static double mdc(double a, double b){
        while(b != 0){
            double r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static double mmc(double a, double b){
        return a * (b / mdc(a, b));
    }
    
}
