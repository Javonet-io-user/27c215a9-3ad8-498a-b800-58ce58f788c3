package Newtonsoft.Json;

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
import Newtonsoft.Json.*;
import jio.System.*;
import jio.System.Xml.*;
import jio.System.Xml.Linq.*;

public class JsonConvert {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultSettings(FuncTResult<JsonSerializerSettings> value) {
    try {
      Javonet.getType("Newtonsoft.Json.JsonConvert").set("DefaultSettings", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static FuncTResult<JsonSerializerSettings> getDefaultSettings() {
    try {
      Object res = Javonet.getType("Newtonsoft.Json.JsonConvert").<NObject>get("DefaultSettings");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getTrue() {
    try {
      java.lang.String res = Javonet.getType("Newtonsoft.Json.JsonConvert").get("True");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTrue(java.lang.String param) {
    try {
      Javonet.getType("Newtonsoft.Json.JsonConvert").set("True", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFalse() {
    try {
      java.lang.String res = Javonet.getType("Newtonsoft.Json.JsonConvert").get("False");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFalse(java.lang.String param) {
    try {
      Javonet.getType("Newtonsoft.Json.JsonConvert").set("False", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getNull() {
    try {
      java.lang.String res = Javonet.getType("Newtonsoft.Json.JsonConvert").get("Null");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNull(java.lang.String param) {
    try {
      Javonet.getType("Newtonsoft.Json.JsonConvert").set("Null", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getUndefined() {
    try {
      java.lang.String res = Javonet.getType("Newtonsoft.Json.JsonConvert").get("Undefined");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUndefined(java.lang.String param) {
    try {
      Javonet.getType("Newtonsoft.Json.JsonConvert").set("Undefined", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getPositiveInfinity() {
    try {
      java.lang.String res = Javonet.getType("Newtonsoft.Json.JsonConvert").get("PositiveInfinity");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPositiveInfinity(java.lang.String param) {
    try {
      Javonet.getType("Newtonsoft.Json.JsonConvert").set("PositiveInfinity", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getNegativeInfinity() {
    try {
      java.lang.String res = Javonet.getType("Newtonsoft.Json.JsonConvert").get("NegativeInfinity");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNegativeInfinity(java.lang.String param) {
    try {
      Javonet.getType("Newtonsoft.Json.JsonConvert").set("NegativeInfinity", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getNaN() {
    try {
      java.lang.String res = Javonet.getType("Newtonsoft.Json.JsonConvert").get("NaN");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNaN(java.lang.String param) {
    try {
      Javonet.getType("Newtonsoft.Json.JsonConvert").set("NaN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToString(DateTime value) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("ToString", value);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToString(
      DateTime value, DateFormatHandling format, DateTimeZoneHandling timeZoneHandling) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .invoke(
                  "ToString",
                  value,
                  NEnum.fromJavaEnum(format),
                  NEnum.fromJavaEnum(timeZoneHandling));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToString(DateTimeOffset value) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("ToString", value);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToString(DateTimeOffset value, DateFormatHandling format) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .invoke("ToString", value, NEnum.fromJavaEnum(format));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToString(java.lang.Boolean value) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("ToString", value);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToString(java.lang.Character value) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("ToString", value);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToString(jio.System.Enum value) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("ToString", value);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToString(java.lang.Integer value) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("ToString", value);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToString(java.lang.Short value) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("ToString", value);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToString(java.lang.Long value) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("ToString", value);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToString(java.math.BigInteger value) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("ToString", value);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToString(java.lang.Float value) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("ToString", value);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToString(java.lang.Double value) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("ToString", value);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToString(java.lang.Byte value) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("ToString", value);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToString(java.math.BigDecimal value) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("ToString", value);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToString(Guid value) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("ToString", value);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToString(TimeSpan value) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("ToString", value);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToString(Uri value) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("ToString", value);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToString(java.lang.String value) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("ToString", value);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToString(java.lang.String value, java.lang.Character delimiter) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("ToString", value, delimiter);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToString(
      java.lang.String value,
      java.lang.Character delimiter,
      StringEscapeHandling stringEscapeHandling) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .invoke("ToString", value, delimiter, NEnum.fromJavaEnum(stringEscapeHandling));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToString(Object value) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("ToString", value);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String SerializeObject(Object value) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("SerializeObject", value);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String SerializeObject(Object value, Formatting formatting) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .invoke("SerializeObject", value, NEnum.fromJavaEnum(formatting));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String SerializeObject(Object value, JsonConverter[] converters) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .invoke("SerializeObject", value, new Object[] {converters});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String SerializeObject(
      Object value, Formatting formatting, JsonConverter[] converters) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .invoke(
                  "SerializeObject",
                  value,
                  NEnum.fromJavaEnum(formatting),
                  new Object[] {converters});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String SerializeObject(Object value, JsonSerializerSettings settings) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("SerializeObject", value, settings);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String SerializeObject(
      Object value, jio.System.Type type, JsonSerializerSettings settings) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .invoke("SerializeObject", value, type, settings);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String SerializeObject(
      Object value, Formatting formatting, JsonSerializerSettings settings) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .invoke("SerializeObject", value, NEnum.fromJavaEnum(formatting), settings);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String SerializeObject(
      Object value, jio.System.Type type, Formatting formatting, JsonSerializerSettings settings) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .invoke("SerializeObject", value, type, NEnum.fromJavaEnum(formatting), settings);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object DeserializeObject(java.lang.String value) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("DeserializeObject", value);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object DeserializeObject(java.lang.String value, JsonSerializerSettings settings) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .invoke("DeserializeObject", value, settings);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object DeserializeObject(java.lang.String value, jio.System.Type type) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("DeserializeObject", value, type);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> T DeserializeObject(java.lang.String value, Class<?> returnType) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .generic(getReturnObjectName(returnType))
              .invoke("DeserializeObject", value);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> T DeserializeAnonymousType(
      java.lang.String value, T anonymousTypeObject, Class<?> returnType) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .generic(getGetObjectName(anonymousTypeObject), getReturnObjectName(returnType))
              .invoke("DeserializeAnonymousType", value, anonymousTypeObject);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> T DeserializeAnonymousType(
      java.lang.String value,
      T anonymousTypeObject,
      JsonSerializerSettings settings,
      Class<?> returnType) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .generic(getGetObjectName(anonymousTypeObject), getReturnObjectName(returnType))
              .invoke("DeserializeAnonymousType", value, anonymousTypeObject, settings);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> T DeserializeObject(
      java.lang.String value, JsonConverter[] converters, Class<?> returnType) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .generic(getReturnObjectName(returnType))
              .invoke("DeserializeObject", value, new Object[] {converters});
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> T DeserializeObject(
      java.lang.String value, JsonSerializerSettings settings, Class<?> returnType) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .generic(getReturnObjectName(returnType))
              .invoke("DeserializeObject", value, settings);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object DeserializeObject(
      java.lang.String value, jio.System.Type type, JsonConverter[] converters) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .invoke("DeserializeObject", value, type, new Object[] {converters});
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object DeserializeObject(
      java.lang.String value, jio.System.Type type, JsonSerializerSettings settings) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .invoke("DeserializeObject", value, type, settings);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void PopulateObject(java.lang.String value, Object target) {
    try {
      Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("PopulateObject", value, target);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void PopulateObject(
      java.lang.String value, Object target, JsonSerializerSettings settings) {
    try {
      Javonet.getType("Newtonsoft.Json.JsonConvert")
          .invoke("PopulateObject", value, target, settings);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String SerializeXmlNode(XmlNode node) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("SerializeXmlNode", node);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String SerializeXmlNode(XmlNode node, Formatting formatting) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .invoke("SerializeXmlNode", node, NEnum.fromJavaEnum(formatting));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String SerializeXmlNode(
      XmlNode node, Formatting formatting, java.lang.Boolean omitRootObject) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .invoke("SerializeXmlNode", node, NEnum.fromJavaEnum(formatting), omitRootObject);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static XmlDocument DeserializeXmlNode(java.lang.String value) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("DeserializeXmlNode", value);
      if (res == null) return null;
      return new XmlDocument((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static XmlDocument DeserializeXmlNode(
      java.lang.String value, java.lang.String deserializeRootElementName) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .invoke("DeserializeXmlNode", value, deserializeRootElementName);
      if (res == null) return null;
      return new XmlDocument((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static XmlDocument DeserializeXmlNode(
      java.lang.String value,
      java.lang.String deserializeRootElementName,
      java.lang.Boolean writeArrayAttribute) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .invoke("DeserializeXmlNode", value, deserializeRootElementName, writeArrayAttribute);
      if (res == null) return null;
      return new XmlDocument((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static XmlDocument DeserializeXmlNode(
      java.lang.String value,
      java.lang.String deserializeRootElementName,
      java.lang.Boolean writeArrayAttribute,
      java.lang.Boolean encodeSpecialCharacters) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .invoke(
                  "DeserializeXmlNode",
                  value,
                  deserializeRootElementName,
                  writeArrayAttribute,
                  encodeSpecialCharacters);
      if (res == null) return null;
      return new XmlDocument((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String SerializeXNode(XObject node) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("SerializeXNode", node);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String SerializeXNode(XObject node, Formatting formatting) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .invoke("SerializeXNode", node, NEnum.fromJavaEnum(formatting));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String SerializeXNode(
      XObject node, Formatting formatting, java.lang.Boolean omitRootObject) {
    try {
      java.lang.String res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .invoke("SerializeXNode", node, NEnum.fromJavaEnum(formatting), omitRootObject);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static XDocument DeserializeXNode(java.lang.String value) {
    try {
      Object res = Javonet.getType("Newtonsoft.Json.JsonConvert").invoke("DeserializeXNode", value);
      if (res == null) return null;
      return new XDocument((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static XDocument DeserializeXNode(
      java.lang.String value, java.lang.String deserializeRootElementName) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .invoke("DeserializeXNode", value, deserializeRootElementName);
      if (res == null) return null;
      return new XDocument((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static XDocument DeserializeXNode(
      java.lang.String value,
      java.lang.String deserializeRootElementName,
      java.lang.Boolean writeArrayAttribute) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .invoke("DeserializeXNode", value, deserializeRootElementName, writeArrayAttribute);
      if (res == null) return null;
      return new XDocument((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static XDocument DeserializeXNode(
      java.lang.String value,
      java.lang.String deserializeRootElementName,
      java.lang.Boolean writeArrayAttribute,
      java.lang.Boolean encodeSpecialCharacters) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.JsonConvert")
              .invoke(
                  "DeserializeXNode",
                  value,
                  deserializeRootElementName,
                  writeArrayAttribute,
                  encodeSpecialCharacters);
      if (res == null) return null;
      return new XDocument((NObject) res);
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
