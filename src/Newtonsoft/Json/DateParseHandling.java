package Newtonsoft.Json;

public enum DateParseHandling {
  None(0L),
  DateTime(1L),
  DateTimeOffset(2L),
  ;
  private long numVal;

  DateParseHandling(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
