package Newtonsoft.Json;

public enum DefaultValueHandling {
  Include(0L),
  Ignore(1L),
  Populate(2L),
  IgnoreAndPopulate(3L),
  ;
  private long numVal;

  DefaultValueHandling(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
