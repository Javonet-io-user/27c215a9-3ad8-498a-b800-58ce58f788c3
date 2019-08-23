package jio.System.Collections.Specialized;

public enum NotifyCollectionChangedAction {
  Add(0L),
  Remove(1L),
  Replace(2L),
  Move(3L),
  Reset(4L),
  ;
  private long numVal;

  NotifyCollectionChangedAction(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
