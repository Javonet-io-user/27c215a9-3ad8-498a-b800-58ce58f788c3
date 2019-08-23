package RestSharp;

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
import RestSharp.*;
import jio.System.Net.*;

public class RestRequestAsyncHandle {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public HttpWebRequest getWebRequest() {
    try {
      Object res = javonetHandle.<NObject>get("WebRequest");
      if (res == null) return null;
      return new HttpWebRequest((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setWebRequest(HttpWebRequest param) {
    try {
      javonetHandle.set("WebRequest", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RestRequestAsyncHandle() {
    try {
      javonetHandle = Javonet.New("RestSharp.RestRequestAsyncHandle");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RestRequestAsyncHandle(HttpWebRequest webRequest) {
    try {
      javonetHandle = Javonet.New("RestSharp.RestRequestAsyncHandle", webRequest);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RestRequestAsyncHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Abort() {
    try {
      javonetHandle.invoke("Abort");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
