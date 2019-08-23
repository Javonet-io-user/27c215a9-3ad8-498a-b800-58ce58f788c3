package RestSharp;

public enum ResponseStatus {
  None(0L),
  Completed(1L),
  Error(2L),
  TimedOut(3L),
  Aborted(4L),
  ;
  private long numVal;

  ResponseStatus(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
