package Korus.Eds.Core;

public enum AmountType {
  TotalSum(1L),
  NetSum(2L),
  VatSum(3L),
  ;
  private long numVal;

  AmountType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
