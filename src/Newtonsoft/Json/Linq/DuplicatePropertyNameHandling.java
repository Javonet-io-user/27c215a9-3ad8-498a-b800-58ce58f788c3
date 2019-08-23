package Newtonsoft.Json.Linq;

public enum DuplicatePropertyNameHandling {
  Replace(0L),
  Ignore(1L),
  Error(2L),
  ;
  private long numVal;

  DuplicatePropertyNameHandling(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
