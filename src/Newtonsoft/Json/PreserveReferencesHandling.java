package Newtonsoft.Json;

public enum PreserveReferencesHandling {
  None(0L),
  Objects(1L),
  Arrays(2L),
  All(3L),
  ;
  private long numVal;

  PreserveReferencesHandling(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
