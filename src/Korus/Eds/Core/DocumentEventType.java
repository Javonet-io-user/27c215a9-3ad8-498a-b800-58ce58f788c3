package Korus.Eds.Core;

public enum DocumentEventType {
  Undefined(0L),
  Created(1L),
  Delivered(2L),
  Accepted(3L),
  Signed(4L),
  Rejected(5L),
  TicketReceived(6L),
  Received(7L),
  TicketSended(8L),
  MovedToTrash(9L),
  Deleted(10L),
  Sended(11L),
  DeliveredForReciever(12L),
  Revoked(13L),
  ReceivedRequestReview(14L),
  RequestedAvoidance(15L),
  RejectedAvoidance(16L),
  AcceptedAvoidance(17L),
  SignatureReject(18L),
  RestoredFromTrash(19L),
  ;
  private long numVal;

  DocumentEventType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
