package Newtonsoft.Json.Linq;

public enum MergeArrayHandling {
  Concat(0L),
  Union(1L),
  Replace(2L),
  Merge(3L),
  ;
  private long numVal;

  MergeArrayHandling(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
