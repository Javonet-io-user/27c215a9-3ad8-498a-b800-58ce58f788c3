package Newtonsoft.Json;

public enum ConstructorHandling {
  Default(0L),
  AllowNonPublicDefaultConstructor(1L),
  ;
  private long numVal;

  ConstructorHandling(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
