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
import jio.System.*;
import jio.System.Collections.Generic.*;

public class HttpResponse implements IHttpResponse {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setContentType(java.lang.String value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IHttpResponse").invoke("set_ContentType", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getContentType() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("RestSharp.IHttpResponse").invoke("get_ContentType");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setContentLength(java.lang.Long value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IHttpResponse").invoke("set_ContentLength", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getContentLength() {
    try {
      java.lang.Long res =
          javonetHandle.explicitInterface("RestSharp.IHttpResponse").invoke("get_ContentLength");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setContentEncoding(java.lang.String value) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.IHttpResponse")
          .invoke("set_ContentEncoding", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getContentEncoding() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("RestSharp.IHttpResponse").invoke("get_ContentEncoding");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getContent() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("RestSharp.IHttpResponse").invoke("get_Content");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setStatusCode(HttpStatusCode value) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.IHttpResponse")
          .invoke("set_StatusCode", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public HttpStatusCode getStatusCode() {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IHttpResponse").invoke("get_StatusCode");
      if (res == null) return null;
      return HttpStatusCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setStatusDescription(java.lang.String value) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.IHttpResponse")
          .invoke("set_StatusDescription", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getStatusDescription() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("RestSharp.IHttpResponse")
              .invoke("get_StatusDescription");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRawBytes(java.lang.Byte[] value) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.IHttpResponse")
          .invoke("set_RawBytes", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte[] getRawBytes(Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle.explicitInterface("RestSharp.IHttpResponse").invoke("get_RawBytes");
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setResponseUri(Uri value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IHttpResponse").invoke("set_ResponseUri", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Uri getResponseUri() {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IHttpResponse").invoke("get_ResponseUri");
      if (res == null) return null;
      return new Uri((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setServer(java.lang.String value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IHttpResponse").invoke("set_Server", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getServer() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("RestSharp.IHttpResponse").invoke("get_Server");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IList<HttpHeader> getHeaders() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttpResponse").invoke("get_Headers");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IList<HttpCookie> getCookies() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttpResponse").invoke("get_Cookies");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setResponseStatus(ResponseStatus value) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.IHttpResponse")
          .invoke("set_ResponseStatus", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ResponseStatus getResponseStatus() {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IHttpResponse").invoke("get_ResponseStatus");
      if (res == null) return null;
      return ResponseStatus.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setErrorMessage(java.lang.String value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IHttpResponse").invoke("set_ErrorMessage", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getErrorMessage() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("RestSharp.IHttpResponse").invoke("get_ErrorMessage");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setErrorException(jio.System.Exception value) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.IHttpResponse")
          .invoke("set_ErrorException", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Exception getErrorException() {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IHttpResponse").invoke("get_ErrorException");
      if (res == null) return null;
      return new jio.System.Exception((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public HttpResponse() {
    try {
      javonetHandle = Javonet.New("RestSharp.HttpResponse");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public HttpResponse(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
