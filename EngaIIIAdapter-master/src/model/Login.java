package ESIIIAdapter.src.model;

public class Login {
  private String nome;
  private String senha;
  private long token;
  private int chaveConfirmacao;
  private boolean celularDisponivel;

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSenha() {
    return this.senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public long getToken() {
    return this.token;
  }

  public void setToken(long token) {
    this.token = token;
  }

  public int getChaveConfirmacao() {
    return this.chaveConfirmacao;
  }

  public void setChaveConfirmacao(int chaveConfirmacao) {
    this.chaveConfirmacao = chaveConfirmacao;
  }

  public boolean isCelularDisponivel() {
    return this.celularDisponivel;
  }

  public boolean getCelularDisponivel() {
    return this.celularDisponivel;
  }

  public void setCelularDisponivel(boolean celularDisponivel) {
    this.celularDisponivel = celularDisponivel;
  }

  @Override
  public String toString() {
    return "{" +
        " nome='" + getNome() + "'" +
        ", senha='" + getSenha() + "'" +
        ", token='" + getToken() + "'" +
        ", chaveConfirmacao='" + getChaveConfirmacao() + "'" +
        ", celularDisponivel='" + isCelularDisponivel() + "'" +
        "}";
  }
}
