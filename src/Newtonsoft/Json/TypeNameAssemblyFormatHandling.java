package Newtonsoft.Json;

public enum TypeNameAssemblyFormatHandling {
  Simple(0L),
  Full(1L),
  ;
  private long numVal;

  TypeNameAssemblyFormatHandling(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
