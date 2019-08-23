package Korus.Eds.Core;

public enum Direction {
  In(0L),
  Out(1L),
  ;
  private long numVal;

  Direction(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
