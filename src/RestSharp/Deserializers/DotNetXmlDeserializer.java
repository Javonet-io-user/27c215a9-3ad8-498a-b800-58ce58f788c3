package RestSharp.Deserializers;

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
import RestSharp.Deserializers.*;
import RestSharp.*;

public class DotNetXmlDeserializer implements IDeserializer {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setDateFormat(java.lang.String value) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.Deserializers.IDeserializer")
          .invoke("set_DateFormat", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDateFormat() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("RestSharp.Deserializers.IDeserializer")
              .invoke("get_DateFormat");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNamespace(java.lang.String value) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.Deserializers.IDeserializer")
          .invoke("set_Namespace", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getNamespace() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("RestSharp.Deserializers.IDeserializer")
              .invoke("get_Namespace");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRootElement(java.lang.String value) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.Deserializers.IDeserializer")
          .invoke("set_RootElement", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getRootElement() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("RestSharp.Deserializers.IDeserializer")
              .invoke("get_RootElement");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public DotNetXmlDeserializer() {
    try {
      javonetHandle = Javonet.New("RestSharp.Deserializers.DotNetXmlDeserializer");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DotNetXmlDeserializer(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public <T> T Deserialize(IRestResponse response, Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getReturnObjectName(returnType))
              .explicitInterface("RestSharp.Deserializers.IDeserializer")
              .invoke("Deserialize", response);
      if (res == null) return null;
      return (T) Convert(res, returnType);
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
