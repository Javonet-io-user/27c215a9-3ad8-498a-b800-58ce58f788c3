package Korus.Eds.Core;

public enum DocumentRelationType {
  Productive(0L),
  Test(1L),
  ;
  private long numVal;

  DocumentRelationType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
