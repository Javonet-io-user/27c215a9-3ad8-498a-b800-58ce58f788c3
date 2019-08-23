package RestSharp;

public enum Method {
  GET(0L),
  POST(1L),
  PUT(2L),
  DELETE(3L),
  HEAD(4L),
  OPTIONS(5L),
  PATCH(6L),
  MERGE(7L),
  ;
  private long numVal;

  Method(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
