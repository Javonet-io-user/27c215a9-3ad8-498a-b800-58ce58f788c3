package Korus.Eds.Core;

public enum AcceptanceDocumentType {
  None(0L),
  AcceptanceDocumentDisaccord(2L),
  DocumentDisaccord(3L),
  ;
  private long numVal;

  AcceptanceDocumentType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
