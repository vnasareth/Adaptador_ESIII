package ESIIIAdapter.src.model;

public class LoginBuilder {
  private Login login;

  public LoginBuilder() {
    this.login = new Login();
  }

  public static LoginBuilder builder() {
    return new LoginBuilder();
  }

  public LoginBuilder addLoginPadrao(String nome, String senha) {
    this.login.setNome(nome);
    this.login.setSenha(senha);
    return this;
  }

  public LoginBuilder addChaveConfirmacao(int chaveConfirmacao) {
    this.login.setChaveConfirmacao(chaveConfirmacao);
    return this;
  }

  public LoginBuilder addToken(long token) {
    this.login.setToken(token);
    return this;
  }

  public LoginBuilder addCelularDisponivel(boolean celularDisponivel) {
    this.login.setCelularDisponivel(celularDisponivel);
    return this;
  }

  public Login get() {
    return this.login;
  }

}
