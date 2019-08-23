package Newtonsoft.Json;

public enum StringEscapeHandling {
  Default(0L),
  EscapeNonAscii(1L),
  EscapeHtml(2L),
  ;
  private long numVal;

  StringEscapeHandling(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
