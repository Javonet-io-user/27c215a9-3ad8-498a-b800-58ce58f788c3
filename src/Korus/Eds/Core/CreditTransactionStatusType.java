package Korus.Eds.Core;

public enum CreditTransactionStatusType {
  None(0L),
  Analysis(1L),
  DocumentCollecting(2L),
  Approval(3L),
  Acception(4L),
  Paperwork(5L),
  Rejected(6L),
  Accepted(7L),
  ;
  private long numVal;

  CreditTransactionStatusType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
