package Korus.Eds.Core;

public enum LiabilityCashType {
  Budget(1L),
  AdditionalBudget(3L),
  SpecialOperation(4L),
  Temporary(5L),
  Organization(6L),
  ;
  private long numVal;

  LiabilityCashType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
