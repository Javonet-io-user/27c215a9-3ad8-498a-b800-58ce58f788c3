package jio.System.Net.Cache;

public enum RequestCacheLevel {
  Default(0L),
  BypassCache(1L),
  CacheOnly(2L),
  CacheIfAvailable(3L),
  Revalidate(4L),
  Reload(5L),
  NoCacheNoStore(6L),
  ;
  private long numVal;

  RequestCacheLevel(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
