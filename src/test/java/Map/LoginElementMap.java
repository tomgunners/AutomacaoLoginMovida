package Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElementMap {

	@FindBy(linkText =  "LOGIN")
	protected WebElement BtnLogin;
	
	@FindBy(name =  "nationality")
	protected WebElement RdbNacionalidade;
	
	@FindBy(name =  "cpf")
	protected WebElement TxtCpf;
	
	@FindBy(id =  "senha")
	protected WebElement TxtSenha;
	
	@FindBy(id =  "login-button")
	protected WebElement BtnLoginModal;
	
	@FindBy(xpath = "//*[@id=\"form-login\"]/div[1]/div/div/div[2]/div")
	protected WebElement nameLogin;
}
