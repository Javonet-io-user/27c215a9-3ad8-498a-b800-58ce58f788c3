package Korus.Eds.Core;

public enum AccessType {
  None(0L),
  All(1L),
  Partial(2L),
  ;
  private long numVal;

  AccessType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
