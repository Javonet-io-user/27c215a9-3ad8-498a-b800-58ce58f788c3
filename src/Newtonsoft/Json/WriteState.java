package Newtonsoft.Json;

public enum WriteState {
  Error(0L),
  Closed(1L),
  Object(2L),
  Array(3L),
  Constructor(4L),
  Property(5L),
  Start(6L),
  ;
  private long numVal;

  WriteState(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
