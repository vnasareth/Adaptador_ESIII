package ESIIIAdapter.src.controller;

import ESIIIAdapter.src.model.Login;

public class LoginDuasEtapasAdapter implements IServicoLogin {
  private LoginDuasEtapas loginDet;

  public LoginDuasEtapasAdapter(LoginDuasEtapas loginDet) {
    this.loginDet = loginDet;
  }

  @Override
  public void logar(Login login) {
    this.loginDet.fazerLogin(login.getNome(), login.getSenha());
    this.loginDet.confirmarSegundaEtapa(login.getChaveConfirmacao());
  }

}
