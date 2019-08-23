package Korus.Eds.Core;

public enum ExtraParamType {
  None(0L),
  InfoFields(1L),
  Properties(2L),
  ;
  private long numVal;

  ExtraParamType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
