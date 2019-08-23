package Newtonsoft.Json.Schema;

public enum UndefinedSchemaIdHandling {
  None(0L),
  UseTypeName(1L),
  UseAssemblyQualifiedName(2L),
  ;
  private long numVal;

  UndefinedSchemaIdHandling(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
