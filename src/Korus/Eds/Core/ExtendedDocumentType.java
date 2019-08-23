package Korus.Eds.Core;

public enum ExtendedDocumentType {
  Undefined(0L),
  Document(1L),
  ReceiveConfirmation(2L),
  SendConfirmation(3L),
  ReceiveNotificationOfReceiveConfirmation(4L),
  ReceiveNotificationOfDocument(5L),
  SendConfirmationOfReceiveNotificationOfDocument(6L),
  ReceiveNotificationOfSendConfirmation(7L),
  ReceiveNotificationOfSendConfirmationOfReceiveNotificationOfDocument(8L),
  ClarificationNotice(9L),
  ReceiveNotificationOfClarificationNotice(10L),
  AcceptDocument(11L),
  RejectSignature(12L),
  AvoidanceRequest(13L),
  AvoidanceRequestClarificationNotice(14L),
  AvoidanceRequestAcceptSignature(15L),
  ;
  private long numVal;

  ExtendedDocumentType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
