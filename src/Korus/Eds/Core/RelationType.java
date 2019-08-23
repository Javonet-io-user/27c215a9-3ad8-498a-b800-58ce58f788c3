package Korus.Eds.Core;

public enum RelationType {
  Other(0L),
  Revision(1L),
  Correction(2L),
  ;
  private long numVal;

  RelationType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
