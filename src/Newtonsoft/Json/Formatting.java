package Newtonsoft.Json;

public enum Formatting {
  None(0L),
  Indented(1L),
  ;
  private long numVal;

  Formatting(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
