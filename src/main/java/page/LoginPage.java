package page;

import org.openqa.selenium.By;

import core.BasePage;

public class LoginPage extends BasePage{
	
	public void setNome(String nome) {
		dsl.escreverBy(By.xpath("//android.widget.EditText[@text='Nome']"), nome);
	}
	
	public void setSenha(String senha) {
		dsl.escreverBy(By.xpath("//android.widget.EditText[@text='Senha']"), senha);
	}
	
	public void entrar() {
		dsl.clicarNaOpcaoViaTexto("ENTRAR");
	}

}
