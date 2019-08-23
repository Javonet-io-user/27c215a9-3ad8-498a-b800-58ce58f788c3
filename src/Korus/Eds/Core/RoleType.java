package Korus.Eds.Core;

public enum RoleType {
  Role(0L),
  Group(1L),
  ;
  private long numVal;

  RoleType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
