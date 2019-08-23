package Korus.Eds.Core;

public enum AcceptanceResultCode {
  None(0L),
  AcceptedNoDisaccord(1L),
  AcceptedDisaccord(2L),
  NotAccepted(3L),
  ;
  private long numVal;

  AcceptanceResultCode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
