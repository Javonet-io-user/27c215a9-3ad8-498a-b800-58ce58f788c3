package Newtonsoft.Json;

public enum MissingMemberHandling {
  Ignore(0L),
  Error(1L),
  ;
  private long numVal;

  MissingMemberHandling(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
