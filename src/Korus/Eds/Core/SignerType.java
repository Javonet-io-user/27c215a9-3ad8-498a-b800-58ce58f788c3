package Korus.Eds.Core;

public enum SignerType {
  Individual(0L),
  Organization(1L),
  Physical(2L),
  ;
  private long numVal;

  SignerType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
