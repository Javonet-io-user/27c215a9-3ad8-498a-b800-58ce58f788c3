package Korus.Eds.Core;

public enum EdiCodeType {
  All(0L),
  Default(1L),
  Active(2L),
  Local(4L),
  ActiveLocal(6L),
  ;
  private long numVal;

  EdiCodeType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
