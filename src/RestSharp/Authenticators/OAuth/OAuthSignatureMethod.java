package RestSharp.Authenticators.OAuth;

public enum OAuthSignatureMethod {
  HmacSha1(0L),
  PlainText(1L),
  RsaSha1(2L),
  ;
  private long numVal;

  OAuthSignatureMethod(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
