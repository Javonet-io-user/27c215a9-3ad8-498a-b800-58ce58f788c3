package Korus.Eds.Core;

public enum Actions {
  None(0L),
  Add(1L),
  Reject(2L),
  Submit(4L),
  AcceptRevoke(8L),
  Accept(16L),
  Revoke(32L),
  Sign(64L),
  Send(128L),
  Trash(256L),
  Edit(512L),
  RejectWithTicket(1024L),
  Delete(2048L),
  EditableRoute(4096L),
  AcceptWithTicket(8192L),
  SubstituteSigner(16384L),
  CreateSignatureTicket(32768L),
  AvoidanceRequest(65536L),
  RejectAvoidance(131072L),
  AcceptAvoidance(262144L),
  PackageRouteSync(524288L),
  RemoveFromPackage(1048576L),
  AssignableToSelf(2097152L),
  AcceptWithoutSign(4194304L),
  SignReplyTicket(8388608L),
  SignReceiveNotification(16777216L),
  AddPaymentRequestOrder(33554432L),
  DeleteDraft(67108864L),
  IsPrintable(134217728L),
  ;
  private long numVal;

  Actions(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
