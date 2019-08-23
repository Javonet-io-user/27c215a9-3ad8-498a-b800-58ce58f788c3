package Korus.Eds.Core;

public enum Participant {
  None(0L),
  Sender(1L),
  Receiver(2L),
  Operator(3L),
  ;
  private long numVal;

  Participant(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
