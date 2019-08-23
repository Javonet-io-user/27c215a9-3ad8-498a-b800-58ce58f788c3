package jio.System.Diagnostics;

public enum TraceLevel {
  Off(0L),
  Error(1L),
  Warning(2L),
  Info(3L),
  Verbose(4L),
  ;
  private long numVal;

  TraceLevel(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
