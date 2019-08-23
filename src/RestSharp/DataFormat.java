package RestSharp;

public enum DataFormat {
  Json(0L),
  Xml(1L),
  ;
  private long numVal;

  DataFormat(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
