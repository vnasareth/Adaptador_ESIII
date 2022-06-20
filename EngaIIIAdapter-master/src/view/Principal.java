package ESIIIAdapter.src.view;

import ESIIIAdapter.src.controller.IServicoLogin;
import ESIIIAdapter.src.controller.LoginGoogle;
import ESIIIAdapter.src.controller.LoginGoogleAdapter;
import ESIIIAdapter.src.model.Login;
import ESIIIAdapter.src.model.LoginBuilder;

public class Principal {
  public static void main(String[] args) {
    Login login = LoginBuilder.builder()
        .addLoginPadrao("José de Alencar", "12345678")
        .addChaveConfirmacao(1234)
        .get();

    LoginGoogle loginGgl = new LoginGoogle();
    IServicoLogin svLogin = new LoginGoogleAdapter(loginGgl);
    svLogin.logar(login);
  }
}
