package Korus.Eds.Core;

public enum DocumentStatus {
  None(0L),
  Draft(1L),
  ToSign(2L),
  Prepared(3L),
  IsRead(4L),
  OnAgreement(5L),
  Signed(6L),
  Rejected(7L),
  Accepted(9L),
  OnRevocation(10L),
  Revoked(11L),
  Sended(12L),
  Delivered(13L),
  Received(14L),
  NoRoute(15L),
  RequestedAvoidance(16L),
  RejectedAvoidance(17L),
  AcceptedAvoidance(18L),
  ClarificationRequested(19L),
  WaitingForSend(20L),
  Archive(21L),
  ForIntegrationOnly(22L),
  ;
  private long numVal;

  DocumentStatus(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
