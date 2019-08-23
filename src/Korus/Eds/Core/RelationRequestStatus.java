package Korus.Eds.Core;

public enum RelationRequestStatus {
  None(0L),
  Sender(1L),
  Processed(2L),
  Accepted(3L),
  Rejected(4L),
  Locked(5L),
  ;
  private long numVal;

  RelationRequestStatus(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
