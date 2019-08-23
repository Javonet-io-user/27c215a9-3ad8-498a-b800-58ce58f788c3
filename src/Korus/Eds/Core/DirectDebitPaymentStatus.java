package Korus.Eds.Core;

public enum DirectDebitPaymentStatus {
  NotPaid(0L),
  Paid(1L),
  ;
  private long numVal;

  DirectDebitPaymentStatus(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
