package Newtonsoft.Json.Converters;

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
import Newtonsoft.Json.Converters.*;
import jio.System.*;
import Newtonsoft.Json.Serialization.*;

public class StringEnumConverter extends JsonConverter {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setCamelCaseText(java.lang.Boolean value) {
    try {
      javonetHandle.set("CamelCaseText", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getCamelCaseText() {
    try {
      java.lang.Boolean res = javonetHandle.get("CamelCaseText");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNamingStrategy(NamingStrategy value) {
    try {
      javonetHandle.set("NamingStrategy", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public NamingStrategy getNamingStrategy() {
    try {
      Object res = javonetHandle.<NObject>get("NamingStrategy");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAllowIntegerValues(java.lang.Boolean value) {
    try {
      javonetHandle.set("AllowIntegerValues", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAllowIntegerValues() {
    try {
      java.lang.Boolean res = javonetHandle.get("AllowIntegerValues");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public StringEnumConverter() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Converters.StringEnumConverter");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StringEnumConverter(java.lang.Boolean camelCaseText) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Converters.StringEnumConverter", camelCaseText);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StringEnumConverter(NamingStrategy namingStrategy, java.lang.Boolean allowIntegerValues) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Newtonsoft.Json.Converters.StringEnumConverter", namingStrategy, allowIntegerValues);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StringEnumConverter(jio.System.Type namingStrategyType) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Newtonsoft.Json.Converters.StringEnumConverter", namingStrategyType);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StringEnumConverter(
      jio.System.Type namingStrategyType, Object[] namingStrategyParameters) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Newtonsoft.Json.Converters.StringEnumConverter",
              namingStrategyType,
              new Object[] {namingStrategyParameters});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StringEnumConverter(
      jio.System.Type namingStrategyType,
      Object[] namingStrategyParameters,
      java.lang.Boolean allowIntegerValues) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Newtonsoft.Json.Converters.StringEnumConverter",
              namingStrategyType,
              new Object[] {namingStrategyParameters},
              allowIntegerValues);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StringEnumConverter(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void WriteJson(JsonWriter writer, Object value, JsonSerializer serializer) {
    try {
      javonetHandle.invoke("WriteJson", writer, value, serializer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object ReadJson(
      JsonReader reader,
      jio.System.Type objectType,
      Object existingValue,
      JsonSerializer serializer) {
    try {
      Object res = javonetHandle.invoke("ReadJson", reader, objectType, existingValue, serializer);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean CanConvert(jio.System.Type objectType) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("CanConvert", objectType);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
