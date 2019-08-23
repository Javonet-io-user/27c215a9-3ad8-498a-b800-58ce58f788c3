package RestSharp.Serializers;

public enum NameStyle {
  AsIs(0L),
  CamelCase(1L),
  LowerCase(2L),
  PascalCase(3L),
  ;
  private long numVal;

  NameStyle(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
