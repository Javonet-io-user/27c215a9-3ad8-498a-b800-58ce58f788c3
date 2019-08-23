package Newtonsoft.Json;

public enum JsonToken {
  None(0L),
  StartObject(1L),
  StartArray(2L),
  StartConstructor(3L),
  PropertyName(4L),
  Comment(5L),
  Raw(6L),
  Integer(7L),
  Float(8L),
  String(9L),
  Boolean(10L),
  Null(11L),
  Undefined(12L),
  EndObject(13L),
  EndArray(14L),
  EndConstructor(15L),
  Date(16L),
  Bytes(17L),
  ;
  private long numVal;

  JsonToken(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
