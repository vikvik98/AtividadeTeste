package utils;

import model.Fracao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FracaoMetodosTest{

    @Test
    void recebeDuasFracoesERetornaASomaDelas() {

        Fracao fracao1 = new Fracao(4,8);
        Fracao fracao2 = new Fracao(4,8);

        Fracao fracaoResultante = FracaoMetodos.soma(fracao1, fracao2);

        assertEquals(fracaoResultante.getFracao(), "8.0/8.0");

    }

    void recebeDuasFracoesERetornaSeAMultiplicacaoDelas(){

        Fracao fracao1 = new Fracao(1,2);
        Fracao fracao2 = new Fracao(2,4);

        Fracao fracaoResultante = FracaoMetodos.multiplicacao(fracao1,fracao2);

        assertEquals(fracaoResultante.getFracao(), "2.0/8.0");

    }
}