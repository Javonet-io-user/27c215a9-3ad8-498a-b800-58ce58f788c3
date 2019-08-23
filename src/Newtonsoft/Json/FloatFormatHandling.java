package Newtonsoft.Json;

public enum FloatFormatHandling {
  String(0L),
  Symbol(1L),
  DefaultValue(2L),
  ;
  private long numVal;

  FloatFormatHandling(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
