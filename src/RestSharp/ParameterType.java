package RestSharp;

public enum ParameterType {
  Cookie(0L),
  GetOrPost(1L),
  UrlSegment(2L),
  HttpHeader(3L),
  RequestBody(4L),
  QueryString(5L),
  ;
  private long numVal;

  ParameterType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
