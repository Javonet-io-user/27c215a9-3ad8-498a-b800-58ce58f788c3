package Newtonsoft.Json.Schema;

public enum JsonSchemaType {
  None(0L),
  String(1L),
  Float(2L),
  Integer(4L),
  Boolean(8L),
  Object(16L),
  Array(32L),
  Null(64L),
  Any(127L),
  ;
  private long numVal;

  JsonSchemaType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
