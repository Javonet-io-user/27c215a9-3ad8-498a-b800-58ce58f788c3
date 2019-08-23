package Korus.Eds.Core;

public enum RequestRelationStatus {
  NotExists(0L),
  Confirmation(1L),
  Exists(2L),
  Sent(3L),
  Rejected(4L),
  ClientExists(5L),
  MatchClient(6L),
  Blocked(7L),
  ;
  private long numVal;

  RequestRelationStatus(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
