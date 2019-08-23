package Korus.Eds.Core;

public enum ExportType {
  None(0L),
  Fns(1L),
  Sber(2L),
  Invest(4L),
  Extended(8L),
  ExtendedHtml(16L),
  All(-1L),
  ;
  private long numVal;

  ExportType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
