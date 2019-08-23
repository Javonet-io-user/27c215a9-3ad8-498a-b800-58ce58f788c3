package Newtonsoft.Json.Linq;

public enum JTokenType {
  None(0L),
  Object(1L),
  Array(2L),
  Constructor(3L),
  Property(4L),
  Comment(5L),
  Integer(6L),
  Float(7L),
  String(8L),
  Boolean(9L),
  Null(10L),
  Undefined(11L),
  Date(12L),
  Raw(13L),
  Bytes(14L),
  Guid(15L),
  Uri(16L),
  TimeSpan(17L),
  ;
  private long numVal;

  JTokenType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
