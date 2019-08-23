package Newtonsoft.Json;

public enum DateFormatHandling {
  IsoDateFormat(0L),
  MicrosoftDateFormat(1L),
  ;
  private long numVal;

  DateFormatHandling(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
