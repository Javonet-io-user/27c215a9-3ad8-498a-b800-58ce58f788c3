package Korus.Eds.Core;

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
import Korus.Eds.Core.*;
import jio.System.Collections.Generic.*;
import jio.System.*;

public class PublicExtensions {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToShortDateString(
      Nullable<DateTime> date, java.lang.String placeholder) {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.PublicExtensions")
              .invoke("ToShortDateString", date, placeholder);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToNullableString(Nullable<java.math.BigDecimal> number) {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.PublicExtensions").invoke("ToNullableString", number);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.math.BigDecimal ToDecimal(java.lang.String numberString) {
    try {
      java.math.BigDecimal res =
          Javonet.getType("Korus.Eds.Core.PublicExtensions").invoke("ToDecimal", numberString);
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Nullable<java.math.BigDecimal> ToNullableDecimal(java.lang.String numberString) {
    try {
      Object res =
          Javonet.getType("Korus.Eds.Core.PublicExtensions")
              .invoke("ToNullableDecimal", numberString);
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Nullable<java.lang.Long> ToNullableLong(java.lang.String numberString) {
    try {
      Object res =
          Javonet.getType("Korus.Eds.Core.PublicExtensions").invoke("ToNullableLong", numberString);
      if (res == null) return null;
      return new Nullable<java.lang.Long>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String FormatCurrency(java.math.BigDecimal val) {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.PublicExtensions").invoke("FormatCurrency", val);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToInvariantString(java.lang.Long val) {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.PublicExtensions").invoke("ToInvariantString", val);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToInvariantString(Nullable<java.lang.Integer> val) {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.PublicExtensions").invoke("ToInvariantString", val);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToInvariantString(java.lang.Integer val) {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.PublicExtensions").invoke("ToInvariantString", val);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToFnsDate(DateTime date) {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.PublicExtensions").invoke("ToFnsDate", date);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToFnsDate(Nullable<DateTime> date) {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.PublicExtensions").invoke("ToFnsDate", date);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DateTime ParseFnsDate(java.lang.String date) {
    try {
      Object res = Javonet.getType("Korus.Eds.Core.PublicExtensions").invoke("ParseFnsDate", date);
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Nullable<DateTime> ParseNullableFnsDate(java.lang.String date) {
    try {
      Object res =
          Javonet.getType("Korus.Eds.Core.PublicExtensions").invoke("ParseNullableFnsDate", date);
      if (res == null) return null;
      return new Nullable<DateTime>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToFnsTime(TimeSpan time) {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.PublicExtensions").invoke("ToFnsTime", time);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToFnsTime(Nullable<DateTime> date) {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.PublicExtensions").invoke("ToFnsTime", date);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static TimeSpan ParseFnsTime(java.lang.String time) {
    try {
      Object res = Javonet.getType("Korus.Eds.Core.PublicExtensions").invoke("ParseFnsTime", time);
      if (res == null) return null;
      return new TimeSpan((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Nullable<TimeSpan> ParseNullableFnsTime(java.lang.String time) {
    try {
      Object res =
          Javonet.getType("Korus.Eds.Core.PublicExtensions").invoke("ParseNullableFnsTime", time);
      if (res == null) return null;
      return new Nullable<TimeSpan>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToXmlDate(DateTime date) {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.PublicExtensions").invoke("ToXmlDate", date);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToXmlDate(Nullable<DateTime> date) {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.PublicExtensions").invoke("ToXmlDate", date);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DateTime ParseXmlDate(java.lang.String date) {
    try {
      Object res = Javonet.getType("Korus.Eds.Core.PublicExtensions").invoke("ParseXmlDate", date);
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Nullable<DateTime> ParseNullableXmlDate(java.lang.String date) {
    try {
      Object res =
          Javonet.getType("Korus.Eds.Core.PublicExtensions").invoke("ParseNullableXmlDate", date);
      if (res == null) return null;
      return new Nullable<DateTime>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String Limited(java.lang.String str, java.lang.Integer maxChars) {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.PublicExtensions").invoke("Limited", str, maxChars);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T, A, B> void ForEach(IEnumerable<A> enumeration, ActionT<B> action) {
    try {
      Javonet.getType("Korus.Eds.Core.PublicExtensions").invoke("ForEach", enumeration, action);
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
