package page;

import core.BasePage;

public class MenuPage extends BasePage{
	
	public void clicarNaOpcaoDoMenu(String opcao) {
		dsl.clicarNaOpcaoViaTexto(opcao);
	}

}
