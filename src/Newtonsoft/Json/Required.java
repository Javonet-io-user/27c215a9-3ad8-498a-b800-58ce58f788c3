package Newtonsoft.Json;

public enum Required {
  Default(0L),
  AllowNull(1L),
  Always(2L),
  DisallowNull(3L),
  ;
  private long numVal;

  Required(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
