package test;

import static org.junit.Assert.assertTrue;
import org.junit.Ignore;
import org.junit.Test;
import core.BaseTest;
import page.ContasPage;

public class CadastroContaTest extends BaseTest{

	ContasPage page = new ContasPage();
	
	@Test @Ignore
	public void inserirConta() {
		homeApp.clicaNaOpcaoContas();
		page.setConta("Joao 2");
		page.salvar();
		assertTrue(page.contaAdicionadaComSucesso());
	}
	
	@Test @Ignore
	public void excluirConta() {
		homeApp.clicaNaOpcaoContas();
		page.clicaESeguraEmCimaDoNomeDaConta("Joao 2");
		page.excluir();
		assertTrue(page.contaExcluidaComSucesso());
	}
}
