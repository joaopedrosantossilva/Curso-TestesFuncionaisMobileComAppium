package page;

import org.openqa.selenium.By;

import core.BasePage;

public class ContasPage extends BasePage {

	public void setConta(String conta) {
		dsl.escreverBy(By.xpath("//android.widget.EditText[@text='Conta']"), conta);
	}
	
	public void salvar() {
		dsl.clicarNaOpcaoViaTexto("SALVAR");
	}
	
	public void excluir() {
		dsl.clicarNaOpcaoViaTexto("EXCLUIR");
	}
	
	public boolean contaAdicionadaComSucesso() {
		return dsl.validaSeElementoEstaPresenteBy(By.xpath("//android.widget.TextView[@text='Conta adicionada com sucesso']"));
	}

	public void clicaESeguraEmCimaDoNomeDaConta(String conta) {
		dsl.cliqueLongoBy(By.xpath("//android.widget.TextView[@text='"+conta+"']"));
		
	}

	public boolean contaExcluidaComSucesso() {
		return dsl.validaSeElementoEstaPresenteBy(By.xpath("//android.widget.TextView[@text='Conta excluída com sucesso']"));

	}
}
