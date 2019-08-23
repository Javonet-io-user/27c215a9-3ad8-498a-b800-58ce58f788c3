package Newtonsoft.Json.Serialization;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import Newtonsoft.Json.Serialization.*;
import jio.System.Diagnostics.*;
import jio.System.*;
import jio.System.Collections.Generic.*;

public class MemoryTraceWriter implements ITraceWriter {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setLevelFilter(TraceLevel value) {
    try {
      javonetHandle.set("LevelFilter", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TraceLevel getLevelFilter() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Newtonsoft.Json.Serialization.ITraceWriter")
              .invoke("get_LevelFilter");
      if (res == null) return null;
      return TraceLevel.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public MemoryTraceWriter() {
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Serialization.MemoryTraceWriter");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MemoryTraceWriter(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Trace(TraceLevel level, java.lang.String message, jio.System.Exception ex) {
    try {
      javonetHandle
          .explicitInterface("Newtonsoft.Json.Serialization.ITraceWriter")
          .invoke("Trace", NEnum.fromJavaEnum(level), message, ex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IEnumerable<java.lang.String> GetTraceMessages() {
    try {
      Object res = javonetHandle.invoke("GetTraceMessages");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ToString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
