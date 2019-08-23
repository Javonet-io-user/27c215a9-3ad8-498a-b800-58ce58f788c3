package Newtonsoft.Json;

public enum MemberSerialization {
  OptOut(0L),
  OptIn(1L),
  Fields(2L),
  ;
  private long numVal;

  MemberSerialization(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
