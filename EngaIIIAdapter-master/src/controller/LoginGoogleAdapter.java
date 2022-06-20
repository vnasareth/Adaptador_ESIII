package ESIIIAdapter.src.controller;

import ESIIIAdapter.src.model.Login;

public class LoginGoogleAdapter implements IServicoLogin {
  private LoginGoogle loginGgl;

  public LoginGoogleAdapter(LoginGoogle loginGgl) {
    this.loginGgl = loginGgl;
  }

  @Override
  public void logar(Login login) {
    this.loginGgl.fazerLogin(login.getNome(), login.getSenha());

    if (login.getCelularDisponivel()) {
      this.loginGgl.enviarChaveConfirmacaoSms(login.getChaveConfirmacao());
    } else {
      this.loginGgl.enviarChaveConfirmacaoEmail(login.getChaveConfirmacao());
    }
  }
}
