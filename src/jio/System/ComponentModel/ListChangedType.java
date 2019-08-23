package jio.System.ComponentModel;

public enum ListChangedType {
  Reset(0L),
  ItemAdded(1L),
  ItemDeleted(2L),
  ItemMoved(3L),
  ItemChanged(4L),
  PropertyDescriptorAdded(5L),
  PropertyDescriptorDeleted(6L),
  PropertyDescriptorChanged(7L),
  ;
  private long numVal;

  ListChangedType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
