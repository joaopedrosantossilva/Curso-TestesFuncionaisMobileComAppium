package page;

import core.BasePage;

public class HomeAppSeuBarrigaPage extends BasePage{
	
	public void clicaNaOpcaoHome() {
		dsl.clicarNaOpcaoViaTexto("HOME");
	}
	
	public void clicaNaOpcaoContas() {
		dsl.clicarNaOpcaoViaTexto("CONTAS");
	}
	
	public void clicaNaOpcaoMovimentacoes() {
		dsl.clicarNaOpcaoViaTexto("MOV...");
	}
	
}
