package RestSharp.Extensions;

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
import RestSharp.Extensions.*;
import jio.System.Reflection.*;
import jio.System.*;
import jio.System.Globalization.*;

public class ReflectionExtensions {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> T GetAttribute(MemberInfo prop, Class<?> returnType) {
    try {
      Object res =
          Javonet.getType("RestSharp.Extensions.ReflectionExtensions")
              .generic(getReturnObjectName(returnType))
              .invoke("GetAttribute", prop);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> T GetAttribute(jio.System.Type type, Class<?> returnType) {
    try {
      Object res =
          Javonet.getType("RestSharp.Extensions.ReflectionExtensions")
              .generic(getReturnObjectName(returnType))
              .invoke("GetAttribute", type);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsSubclassOfRawGeneric(
      jio.System.Type toCheck, jio.System.Type generic) {
    try {
      java.lang.Boolean res =
          Javonet.getType("RestSharp.Extensions.ReflectionExtensions")
              .invoke("IsSubclassOfRawGeneric", toCheck, generic);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object ChangeType(Object source, jio.System.Type newType) {
    try {
      Object res =
          Javonet.getType("RestSharp.Extensions.ReflectionExtensions")
              .invoke("ChangeType", source, newType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object ChangeType(Object source, jio.System.Type newType, CultureInfo culture) {
    try {
      Object res =
          Javonet.getType("RestSharp.Extensions.ReflectionExtensions")
              .invoke("ChangeType", source, newType, culture);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object FindEnumValue(
      jio.System.Type type, java.lang.String value, CultureInfo culture) {
    try {
      Object res =
          Javonet.getType("RestSharp.Extensions.ReflectionExtensions")
              .invoke("FindEnumValue", type, value, culture);
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
