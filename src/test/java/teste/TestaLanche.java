package teste;

import br.edu.ifpr.ordenacao.OrdenaVetor;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestaLanche {
	@Test
	public void testeXBacon(){
		int codigo = 3;
		int quantidade = 2;
		double saidaEsperada = 10;

		double respostaObtida = Lanche.calculaValorFinal(codigo,quantidade);

		assertEquals(saidaEsperada, respostaObtida,2);
	}

	@Test
	public void testeTorradaSimples(){
		int codigo = 4;
		int quantidade = 2;
		double saidaEsperada = 4;

		double respostaObtida = Lanche.calculaValorFinal(codigo,quantidade);

		assertEquals(saidaEsperada, respostaObtida,2);
	}
}
