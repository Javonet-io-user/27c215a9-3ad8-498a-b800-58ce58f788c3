package Newtonsoft.Json;

public enum NullValueHandling {
  Include(0L),
  Ignore(1L),
  ;
  private long numVal;

  NullValueHandling(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
