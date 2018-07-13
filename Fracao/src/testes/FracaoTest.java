package testes;

import model.Fracao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FracaoTest {
    @Test
    void compara_a_soma_de_doas_fracoes() {

        Fracao fracao1 = new Fracao(4,8);
        Fracao fracao2 = new Fracao(4,8);

        Fracao fracaoResultante = Fracao.soma(fracao1, fracao2);

        assertEquals(fracaoResultante.getFracao(), "8.0/8.0");

    }

    @Test
    void compara_a_multiplicacao_de_doas_fracoes(){

        Fracao fracao1 = new Fracao(1,2);
        Fracao fracao2 = new Fracao(2,4);

        Fracao fracaoResultante = Fracao.multiplicacao(fracao1,fracao2);

        assertEquals(fracaoResultante.getFracao(), "2.0/8.0");

    }

}