package Newtonsoft.Json;

public enum ObjectCreationHandling {
  Auto(0L),
  Reuse(1L),
  Replace(2L),
  ;
  private long numVal;

  ObjectCreationHandling(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
