package Korus.Eds.Core;

public enum RelationRequestSide {
  None(0L),
  Sender(1L),
  Receiver(2L),
  All(3L),
  ;
  private long numVal;

  RelationRequestSide(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
