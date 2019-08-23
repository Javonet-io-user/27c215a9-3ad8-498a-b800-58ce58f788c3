package RestSharp.Extensions.MonoHttp;

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
import RestSharp.Extensions.MonoHttp.*;
import jio.System.IO.*;
import jio.System.Text.*;
import jio.System.Collections.Specialized.*;

public class HttpUtility {
  protected NObject javonetHandle;

  public HttpUtility() {
    try {
      javonetHandle = Javonet.New("RestSharp.Extensions.MonoHttp.HttpUtility");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public HttpUtility(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void HtmlAttributeEncode(java.lang.String s, TextWriter output) {
    try {
      Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility")
          .invoke("HtmlAttributeEncode", s, output);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String HtmlAttributeEncode(java.lang.String s) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility")
              .invoke("HtmlAttributeEncode", s);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String UrlDecode(java.lang.String str) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility").invoke("UrlDecode", str);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String UrlDecode(java.lang.String s, Encoding e) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility").invoke("UrlDecode", s, e);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String UrlDecode(java.lang.Byte[] bytes, Encoding e) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility")
              .invoke("UrlDecode", new Object[] {bytes}, e);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String UrlDecode(
      java.lang.Byte[] bytes, java.lang.Integer offset, java.lang.Integer count, Encoding e) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility")
              .invoke("UrlDecode", new Object[] {bytes}, offset, count, e);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] UrlDecodeToBytes(
      java.lang.Byte[] bytes, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility")
              .invoke("UrlDecodeToBytes", new Object[] {bytes});
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] UrlDecodeToBytes(java.lang.String str, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility")
              .invoke("UrlDecodeToBytes", str);
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] UrlDecodeToBytes(
      java.lang.String str, Encoding e, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility")
              .invoke("UrlDecodeToBytes", str, e);
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] UrlDecodeToBytes(
      java.lang.Byte[] bytes,
      java.lang.Integer offset,
      java.lang.Integer count,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility")
              .invoke("UrlDecodeToBytes", new Object[] {bytes}, offset, count);
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String UrlEncode(java.lang.String str) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility").invoke("UrlEncode", str);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String UrlEncode(java.lang.String s, Encoding enc) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility").invoke("UrlEncode", s, enc);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String UrlEncode(java.lang.Byte[] bytes) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility")
              .invoke("UrlEncode", new Object[] {bytes});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String UrlEncode(
      java.lang.Byte[] bytes, java.lang.Integer offset, java.lang.Integer count) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility")
              .invoke("UrlEncode", new Object[] {bytes}, offset, count);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] UrlEncodeToBytes(java.lang.String str, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility")
              .invoke("UrlEncodeToBytes", str);
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] UrlEncodeToBytes(
      java.lang.String str, Encoding e, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility")
              .invoke("UrlEncodeToBytes", str, e);
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] UrlEncodeToBytes(
      java.lang.Byte[] bytes, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility")
              .invoke("UrlEncodeToBytes", new Object[] {bytes});
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] UrlEncodeToBytes(
      java.lang.Byte[] bytes,
      java.lang.Integer offset,
      java.lang.Integer count,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility")
              .invoke("UrlEncodeToBytes", new Object[] {bytes}, offset, count);
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String UrlEncodeUnicode(java.lang.String str) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility")
              .invoke("UrlEncodeUnicode", str);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] UrlEncodeUnicodeToBytes(
      java.lang.String str, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility")
              .invoke("UrlEncodeUnicodeToBytes", str);
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String HtmlDecode(java.lang.String s) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility").invoke("HtmlDecode", s);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void HtmlDecode(java.lang.String s, TextWriter output) {
    try {
      Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility").invoke("HtmlDecode", s, output);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String HtmlEncode(java.lang.String s) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility").invoke("HtmlEncode", s);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void HtmlEncode(java.lang.String s, TextWriter output) {
    try {
      Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility").invoke("HtmlEncode", s, output);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String UrlPathEncode(java.lang.String s) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility").invoke("UrlPathEncode", s);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static NameValueCollection ParseQueryString(java.lang.String query) {
    try {
      Object res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility")
              .invoke("ParseQueryString", query);
      if (res == null) return null;
      return new NameValueCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static NameValueCollection ParseQueryString(java.lang.String query, Encoding encoding) {
    try {
      Object res =
          Javonet.getType("RestSharp.Extensions.MonoHttp.HttpUtility")
              .invoke("ParseQueryString", query, encoding);
      if (res == null) return null;
      return new NameValueCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
