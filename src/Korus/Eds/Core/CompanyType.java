package Korus.Eds.Core;

public enum CompanyType {
  Individual(0L),
  Organization(1L),
  ;
  private long numVal;

  CompanyType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
