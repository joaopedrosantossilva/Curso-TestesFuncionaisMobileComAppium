package core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import page.HomeAppSeuBarrigaPage;
import page.LoginPage;
import page.MenuPage;

public class BaseTest {

	protected MenuPage menu = new MenuPage();
	protected LoginPage login = new LoginPage();
	protected HomeAppSeuBarrigaPage homeApp = new HomeAppSeuBarrigaPage();
	
	@Rule
	public TestName testName = new TestName();
	
	@Before
	public void login() {
		menu.clicarNaOpcaoDoMenu("SeuBarriga Nativo");
		login.setNome("joao@teste.com");
		login.setSenha("joao@teste");
		login.entrar();
	}
	
	@After
	public void ConclusaoTest() {
		screenShot();
		DriverFactory.killDriver();
	}
	
	public void screenShot() {
		try {
			File screen = ((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE); 
			FileUtils.copyFile(screen,new File("target/screenshots/"+testName.getMethodName()+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
