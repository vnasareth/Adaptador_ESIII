package ESIIIAdapter.src.controller;

public class LoginGoogle {
  public void fazerLogin(String nome, String senha) {
    System.out.println("Usuário " + nome + " fazendo login.");
  }

  public void enviarChaveConfirmacaoEmail(int chaveConfirmacao) {
    System.out.println("Enviando chave de confirmação " + chaveConfirmacao + " para o email.");
  }

  public void enviarChaveConfirmacaoSms(int chaveConfirmacao) {
    System.out.println("Enviando chave de confirmação " + chaveConfirmacao + " para o smartphone.");
  }
}
