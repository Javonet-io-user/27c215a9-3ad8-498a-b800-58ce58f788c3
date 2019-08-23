package Newtonsoft.Json;

public enum ReferenceLoopHandling {
  Error(0L),
  Ignore(1L),
  Serialize(2L),
  ;
  private long numVal;

  ReferenceLoopHandling(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
