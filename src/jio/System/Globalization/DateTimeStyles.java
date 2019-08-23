package jio.System.Globalization;

public enum DateTimeStyles {
  None(0L),
  AllowLeadingWhite(1L),
  AllowTrailingWhite(2L),
  AllowInnerWhite(4L),
  AllowWhiteSpaces(7L),
  NoCurrentDateDefault(8L),
  AdjustToUniversal(16L),
  AssumeLocal(32L),
  AssumeUniversal(64L),
  RoundtripKind(128L),
  ;
  private long numVal;

  DateTimeStyles(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
