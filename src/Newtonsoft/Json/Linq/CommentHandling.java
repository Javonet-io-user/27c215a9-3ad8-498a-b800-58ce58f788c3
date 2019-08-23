package Newtonsoft.Json.Linq;

public enum CommentHandling {
  Ignore(0L),
  Load(1L),
  ;
  private long numVal;

  CommentHandling(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
