package ESIIIAdapter.src.controller;

import ESIIIAdapter.src.model.Login;

public class LoginTokenAdapter implements IServicoLogin {
  private LoginToken loginTk;

  public LoginTokenAdapter(LoginToken loginTk) {
    this.loginTk = loginTk;
  }

  @Override
  public void logar(Login login) {
    this.loginTk.enviarToken(login.getToken());
  }
}
