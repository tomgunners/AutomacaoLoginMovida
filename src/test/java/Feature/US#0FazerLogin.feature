
Feature: Fazer Login com Sucesso

  Scenario: Fazendo login com sucesso
    Given que o usuario estar na tela de login
    When o usuario selecionar a nacionalidade
    And o usuario digitar o CPF
    And o usuario digitar a senha valida
    And clicar no botao de logar
    Then o usuario estara na pagina de usuario logado.