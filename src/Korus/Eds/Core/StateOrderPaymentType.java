package Korus.Eds.Core;

public enum StateOrderPaymentType {
  NormalPayment(0L),
  UrgentPayment(4L),
  ;
  private long numVal;

  StateOrderPaymentType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
