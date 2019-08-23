package Newtonsoft.Json.Linq;

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
import Newtonsoft.Json.Linq.*;
import jio.System.Collections.Generic.*;
import jio.System.*;

public class Extensions {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> IJEnumerable<JToken> Ancestors(IEnumerable<T> source) {
    try {
      Object res = Javonet.getType("Newtonsoft.Json.Linq.Extensions").invoke("Ancestors", source);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> IJEnumerable<JToken> AncestorsAndSelf(IEnumerable<T> source) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.Linq.Extensions").invoke("AncestorsAndSelf", source);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> IJEnumerable<JToken> Descendants(IEnumerable<T> source) {
    try {
      Object res = Javonet.getType("Newtonsoft.Json.Linq.Extensions").invoke("Descendants", source);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> IJEnumerable<JToken> DescendantsAndSelf(IEnumerable<T> source) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.Linq.Extensions").invoke("DescendantsAndSelf", source);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static IJEnumerable<JProperty> Properties(IEnumerable<JObject> source) {
    try {
      Object res = Javonet.getType("Newtonsoft.Json.Linq.Extensions").invoke("Properties", source);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <A> IJEnumerable<JToken> Values(IEnumerable<A> source, Object key) {
    try {
      Object res = Javonet.getType("Newtonsoft.Json.Linq.Extensions").invoke("Values", source, key);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <A> IJEnumerable<JToken> Values(IEnumerable<A> source) {
    try {
      Object res = Javonet.getType("Newtonsoft.Json.Linq.Extensions").invoke("Values", source);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <U, A> U Value(IEnumerable<A> value, Class<?> returnType) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.Linq.Extensions")
              .generic(getReturnObjectName(returnType))
              .invoke("Value", value);
      if (res == null) return null;
      return (U) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T, A> IJEnumerable<JToken> Children(IEnumerable<A> source) {
    try {
      Object res = Javonet.getType("Newtonsoft.Json.Linq.Extensions").invoke("Children", source);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <A> IJEnumerable<JToken> AsJEnumerable(IEnumerable<A> source) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.Linq.Extensions").invoke("AsJEnumerable", source);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
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
