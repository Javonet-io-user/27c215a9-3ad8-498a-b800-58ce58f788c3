package Korus.Eds.Core;

public enum SignatureValidationMode {
  None(0L),
  DocumentSigners(1L),
  ;
  private long numVal;

  SignatureValidationMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
