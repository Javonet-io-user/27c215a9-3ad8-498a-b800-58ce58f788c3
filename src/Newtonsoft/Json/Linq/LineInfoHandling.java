package Newtonsoft.Json.Linq;

public enum LineInfoHandling {
  Ignore(0L),
  Load(1L),
  ;
  private long numVal;

  LineInfoHandling(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
