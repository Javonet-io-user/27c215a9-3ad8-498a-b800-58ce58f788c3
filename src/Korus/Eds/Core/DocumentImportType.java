package Korus.Eds.Core;

public enum DocumentImportType {
  Unstructured(0L),
  Structured(1L),
  ;
  private long numVal;

  DocumentImportType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
