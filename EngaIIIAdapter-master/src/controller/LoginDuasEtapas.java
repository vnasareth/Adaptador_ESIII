package ESIIIAdapter.src.controller;

public class LoginDuasEtapas {
  public void fazerLogin(String nome, String senha) {
    System.out.println("Usuário " + nome + " fazendo login.");
  }

  public void confirmarSegundaEtapa(int chaveConfirmacao) {
    System.out.println("Confirmando o login com a chave " + chaveConfirmacao);
  }
}
