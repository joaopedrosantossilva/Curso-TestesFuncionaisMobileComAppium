package test;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import core.BaseTest;
import page.ContasPage;

public class CadastroContaTest extends BaseTest{

	ContasPage page = new ContasPage();
	
	@Test
	public void inserirConta() {
		homeApp.clicaNaOpcaoContas();
		page.setConta("Joao 4");
		page.salvar();
		assertTrue(page.contaAdicionadaComSucesso());
	}
	
	@Test 
	public void excluirConta() {
		homeApp.clicaNaOpcaoContas();
		page.clicaESeguraEmCimaDoNomeDaConta("Joao 3");
		page.excluir();
		assertTrue(page.contaExcluidaComSucesso());
	}
}
