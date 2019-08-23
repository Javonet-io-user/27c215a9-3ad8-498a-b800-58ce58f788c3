package Korus.Eds.Core;

public enum BusinessProcessType {
  None(0L),
  CreditProcess(1L),
  Uvhd(2L),
  ;
  private long numVal;

  BusinessProcessType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
