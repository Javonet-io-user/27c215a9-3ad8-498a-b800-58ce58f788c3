package Korus.Eds.Core;

public enum BarcodeType {
  None(0L),
  Code128(1L),
  Ean8(2L),
  Ean13(3L),
  ;
  private long numVal;

  BarcodeType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
