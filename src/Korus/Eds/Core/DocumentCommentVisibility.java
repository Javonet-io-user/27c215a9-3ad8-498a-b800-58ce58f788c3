package Korus.Eds.Core;

public enum DocumentCommentVisibility {
  Owner(0L),
  All(1L),
  ;
  private long numVal;

  DocumentCommentVisibility(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
