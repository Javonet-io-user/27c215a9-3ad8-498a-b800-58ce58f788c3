package RestSharp.Authenticators.OAuth;

public enum OAuthType {
  RequestToken(0L),
  AccessToken(1L),
  ProtectedResource(2L),
  ClientAuthentication(3L),
  ;
  private long numVal;

  OAuthType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
