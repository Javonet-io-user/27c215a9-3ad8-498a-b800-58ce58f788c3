package Korus.Eds.Core;

public enum ValidationMode {
  Default(0L),
  AllowForeignCertificate(1L),
  ThreatInvalidSignerAsWarning(2L),
  AppendInvalidSignerAsWarning(4L),
  AppendInvalidSignerFullInfoAsWarning(8L),
  ;
  private long numVal;

  ValidationMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
