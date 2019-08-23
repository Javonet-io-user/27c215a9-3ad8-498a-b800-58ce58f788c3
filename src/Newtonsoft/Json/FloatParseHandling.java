package Newtonsoft.Json;

public enum FloatParseHandling {
  Double(0L),
  Decimal(1L),
  ;
  private long numVal;

  FloatParseHandling(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
