package page;

import org.openqa.selenium.By;

import core.BasePage;

public class MovimentacoesPage extends BasePage{
	
	public void salvar() {
		dsl.clicarNaOpcaoViaTexto("SALVAR");
	}

	public boolean msgCampoDescricaoObrigatorioExibido() {
		return dsl.validaSeElementoEstaPresenteBy(By.xpath("//android.widget.TextView[@text='Descrição é um campo obrigatório']"));
	}
	
	public boolean msgCampoInteressadoObrigatorioExibido() {
		return dsl.validaSeElementoEstaPresenteBy(By.xpath("//android.widget.TextView[@text='Interessado é um campo obrigatório']"));
	}
	
	public boolean msgCampoValorObrigatorioExibido() {
		return dsl.validaSeElementoEstaPresenteBy(By.xpath("//android.widget.TextView[@text='Valor é um campo obrigatório']"));
	}
	
	public boolean msgCampoContaObrigatorioExibido() {
		return dsl.validaSeElementoEstaPresenteBy(By.xpath("//android.widget.TextView[@text='Conta é um campo obrigatório']"));
	}

	public void setDescricao(String descricao) {
		dsl.escreverBy(By.xpath("//android.widget.EditText[@text='Descrição']"), descricao);
		
	}

	public void setInteressado(String interessado) {
		dsl.escreverBy(By.xpath("//android.widget.EditText[@text='Interessado']"), interessado);
		
	}

	public void setValor(String valor) {
		dsl.escreverBy(By.xpath("//android.widget.EditText[@text='Valor']"), valor);
		
	}

	public void selecionarConta(String conta) {
		dsl.clicarNaOpcaoViaTexto("Selecione uma conta...");
		dsl.clicarNaOpcaoViaTexto(conta);
	}

	public boolean msgMovimentacaoRealizadaComSucessoExibido() {
		return dsl.validaSeElementoEstaPresenteBy(By.xpath("//android.widget.TextView[@text='Movimentação cadastrada com sucesso']"));
	}
	

}
