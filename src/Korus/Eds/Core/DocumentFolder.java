package Korus.Eds.Core;

public enum DocumentFolder {
  None(0L),
  In(1L),
  Out(2L),
  Draft(3L),
  OnProcess(4L),
  Favorites(5L),
  Processed(7L),
  Tickets(8L),
  Trash(9L),
  NoRoute(10L),
  BranchOnProcess(11L),
  BranchAll(12L),
  AllDocuments(13L),
  DocumentView(14L),
  ;
  private long numVal;

  DocumentFolder(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
