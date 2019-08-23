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
import jio.System.*;

public class SimpleJson {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public static void setCurrentJsonSerializerStrategy(IJsonSerializerStrategy value) {
    try {
      Javonet.getType("RestSharp.SimpleJson").set("CurrentJsonSerializerStrategy", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static IJsonSerializerStrategy getCurrentJsonSerializerStrategy() {
    try {
      Object res =
          Javonet.getType("RestSharp.SimpleJson").<NObject>get("CurrentJsonSerializerStrategy");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static PocoJsonSerializerStrategy getPocoJsonSerializerStrategy() {
    try {
      Object res =
          Javonet.getType("RestSharp.SimpleJson").<NObject>get("PocoJsonSerializerStrategy");
      if (res == null) return null;
      return new PocoJsonSerializerStrategy((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object DeserializeObject(java.lang.String json) {
    try {
      Object res = Javonet.getType("RestSharp.SimpleJson").invoke("DeserializeObject", json);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean TryDeserializeObject(java.lang.String json, Object obj) {
    try {
      java.lang.Boolean res =
          Javonet.getType("RestSharp.SimpleJson").invoke("TryDeserializeObject", json, obj);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object DeserializeObject(
      java.lang.String json, jio.System.Type type, IJsonSerializerStrategy jsonSerializerStrategy) {
    try {
      Object res =
          Javonet.getType("RestSharp.SimpleJson")
              .invoke("DeserializeObject", json, type, jsonSerializerStrategy);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object DeserializeObject(java.lang.String json, jio.System.Type type) {
    try {
      Object res = Javonet.getType("RestSharp.SimpleJson").invoke("DeserializeObject", json, type);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> T DeserializeObject(
      java.lang.String json, IJsonSerializerStrategy jsonSerializerStrategy, Class<?> returnType) {
    try {
      Object res =
          Javonet.getType("RestSharp.SimpleJson")
              .generic(getReturnObjectName(returnType))
              .invoke("DeserializeObject", json, jsonSerializerStrategy);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> T DeserializeObject(java.lang.String json, Class<?> returnType) {
    try {
      Object res =
          Javonet.getType("RestSharp.SimpleJson")
              .generic(getReturnObjectName(returnType))
              .invoke("DeserializeObject", json);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String SerializeObject(
      Object json, IJsonSerializerStrategy jsonSerializerStrategy) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.SimpleJson")
              .invoke("SerializeObject", json, jsonSerializerStrategy);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String SerializeObject(Object json) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.SimpleJson").invoke("SerializeObject", json);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String EscapeToJavascriptString(java.lang.String jsonString) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.SimpleJson").invoke("EscapeToJavascriptString", jsonString);
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
