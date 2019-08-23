package Newtonsoft.Json;

public enum MetadataPropertyHandling {
  Default(0L),
  ReadAhead(1L),
  Ignore(2L),
  ;
  private long numVal;

  MetadataPropertyHandling(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
