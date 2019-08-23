package jio.System.Runtime.Serialization.Formatters;

public enum FormatterAssemblyStyle {
  Simple(0L),
  Full(1L),
  ;
  private long numVal;

  FormatterAssemblyStyle(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
