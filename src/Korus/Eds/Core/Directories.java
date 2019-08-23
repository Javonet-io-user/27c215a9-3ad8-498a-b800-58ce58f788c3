package Korus.Eds.Core;

public enum Directories {
  None(0L),
  Sbbol(1L),
  Local(2L),
  Sbrf(4L),
  Ast(8L),
  Beeline(32L),
  Leasing(128L),
  Loginet(512L),
  Alfabank(2048L),
  ;
  private long numVal;

  Directories(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
