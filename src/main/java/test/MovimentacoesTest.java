package test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import core.BaseTest;
import page.MovimentacoesPage;

public class MovimentacoesTest extends BaseTest{

	protected MovimentacoesPage movimentacoes = new MovimentacoesPage();

	@Test 
	public void validarCampoDescricaoObrigatorio() {
		homeApp.clicaNaOpcaoMovimentacoes();
		movimentacoes.salvar();
		Assert.assertTrue(movimentacoes.msgCampoDescricaoObrigatorioExibido());
		
	}
	
	@Test
	public void validarCampoInteressadoObrigatorio() {
		homeApp.clicaNaOpcaoMovimentacoes();
		movimentacoes.setDescricao("Deposito");
		movimentacoes.salvar();
		Assert.assertTrue(movimentacoes.msgCampoInteressadoObrigatorioExibido());
		
	}
	
	@Test
	public void validarCampoValorContaObrigatorio() {
		homeApp.clicaNaOpcaoMovimentacoes();
		movimentacoes.setDescricao("Deposito");
		movimentacoes.setInteressado("João");
		movimentacoes.salvar();
		Assert.assertTrue(movimentacoes.msgCampoValorObrigatorioExibido());
	}
	
	@Test 
	public void validarCampoContaObrigatorio() {
		homeApp.clicaNaOpcaoMovimentacoes();
		movimentacoes.setDescricao("Deposito");
		movimentacoes.setInteressado("João");
		movimentacoes.setValor("500");
		movimentacoes.salvar();
		Assert.assertTrue(movimentacoes.msgCampoContaObrigatorioExibido());
	}
	
	@Test 
	public void validarInclusaoMovimentacao() {
		homeApp.clicaNaOpcaoMovimentacoes();
		movimentacoes.setDescricao("saque");
		movimentacoes.setInteressado("João teste");
		movimentacoes.setValor("500");
		movimentacoes.selecionarConta("conta nova");
		movimentacoes.salvar();
		Assert.assertTrue(movimentacoes.msgMovimentacaoRealizadaComSucessoExibido());
	}
	
}
