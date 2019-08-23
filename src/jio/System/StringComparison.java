package jio.System;

public enum StringComparison {
  CurrentCulture(0L),
  CurrentCultureIgnoreCase(1L),
  InvariantCulture(2L),
  InvariantCultureIgnoreCase(3L),
  Ordinal(4L),
  OrdinalIgnoreCase(5L),
  ;
  private long numVal;

  StringComparison(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
