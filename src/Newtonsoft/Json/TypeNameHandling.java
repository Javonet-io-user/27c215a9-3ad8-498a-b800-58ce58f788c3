package Newtonsoft.Json;

public enum TypeNameHandling {
  None(0L),
  Objects(1L),
  Arrays(2L),
  All(3L),
  Auto(4L),
  ;
  private long numVal;

  TypeNameHandling(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
