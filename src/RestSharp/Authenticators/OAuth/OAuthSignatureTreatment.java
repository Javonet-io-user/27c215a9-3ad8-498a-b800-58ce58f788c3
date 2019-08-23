package RestSharp.Authenticators.OAuth;

public enum OAuthSignatureTreatment {
  Escaped(0L),
  Unescaped(1L),
  ;
  private long numVal;

  OAuthSignatureTreatment(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
