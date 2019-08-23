package Newtonsoft.Json.Linq;

public enum MergeNullValueHandling {
  Ignore(0L),
  Merge(1L),
  ;
  private long numVal;

  MergeNullValueHandling(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
