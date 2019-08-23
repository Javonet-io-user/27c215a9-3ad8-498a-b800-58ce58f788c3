package RestSharp.Authenticators.OAuth;

public enum OAuthParameterHandling {
  HttpAuthorizationHeader(0L),
  UrlOrPostParameters(1L),
  ;
  private long numVal;

  OAuthParameterHandling(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
