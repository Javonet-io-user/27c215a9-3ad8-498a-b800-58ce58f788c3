package Korus.Eds.Core;

public enum UserDirectory {
  None(0L),
  Sbbol(1L),
  Local(2L),
  Sbrf(3L),
  Ast(4L),
  Beeline(6L),
  Leasing(8L),
  Loginet(10L),
  Alfabank(12L),
  ;
  private long numVal;

  UserDirectory(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
