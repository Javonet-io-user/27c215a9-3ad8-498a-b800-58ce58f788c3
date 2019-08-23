package Newtonsoft.Json;

public enum DateTimeZoneHandling {
  Local(0L),
  Utc(1L),
  Unspecified(2L),
  RoundtripKind(3L),
  ;
  private long numVal;

  DateTimeZoneHandling(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
