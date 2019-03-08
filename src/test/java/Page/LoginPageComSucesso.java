package Page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Map.LoginElementMap;
import Setup.Configuracao;

public class LoginPageComSucesso extends LoginElementMap{
	static WebDriver driver;
	
	public LoginPageComSucesso() {
		PageFactory.initElements(Configuracao.getDriver(), this);
	}
	
	public void cliqueNoBotaoLogarHome() {
		BtnLogin.click();
	}
	
	public void selecionarNacionalidade() {
		RdbNacionalidade.click();
	}

	public void digitarCpfValido() {
		TxtCpf.sendKeys("18816364530");
	}
	
	public void digitarSenhaValida() {
		TxtSenha.sendKeys("123456");
	}
	
	public void cliqueNoBotaoLogar() {
		BtnLoginModal.click();
	}
	
	public void validaLoginComSucesso() throws Exception {
		String MsgLoginComSucesso = nameLogin.getText();
		Assert.assertEquals("Logado com sucesso!", MsgLoginComSucesso);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
