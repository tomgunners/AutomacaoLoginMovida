package Step;

import Page.LoginPageComSucesso;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidandoLoginComSucesso {
		
	@Given("^que o usuario estar na tela de login$")
	public void que_o_usuario_estar_na_tela_de_login() throws Throwable {
		LoginPageComSucesso loginPage = new LoginPageComSucesso();
		loginPage.cliqueNoBotaoLogarHome();
	}

	@When("^o usuario selecionar a nacionalidade$")
	public void o_usuario_selecionar_a_nacionalidade() throws Throwable {
		LoginPageComSucesso loginPage = new LoginPageComSucesso();
		loginPage.selecionarNacionalidade();
	}

	@When("^o usuario digitar o CPF$")
	public void o_usuario_digitar_o_CPF() throws Throwable {
		LoginPageComSucesso loginPage = new LoginPageComSucesso();
		loginPage.digitarCpfValido();
	}

	@When("^o usuario digitar a senha valida$")
	public void o_usuario_digitar_a_senha_valida() throws Throwable {
		LoginPageComSucesso loginPage = new LoginPageComSucesso();
		loginPage.digitarSenhaValida();
	}

	@When("^clicar no botao de logar$")
	public void clicar_no_botao_de_logar() throws Throwable {
		LoginPageComSucesso loginPage = new LoginPageComSucesso();
		loginPage.cliqueNoBotaoLogar();
	}

	@Then("^o usuario estara na pagina de usuario logado\\.$")
	public void o_usuario_estara_na_pagina_de_usuario_logado() throws Throwable {
		LoginPageComSucesso loginPage = new LoginPageComSucesso();
		loginPage.validaLoginComSucesso();
	}
}
