package RestSharp.Serializers;

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
import RestSharp.Serializers.*;
import jio.System.*;
import jio.System.Text.*;

public class DotNetXmlSerializer implements ISerializer {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setRootElement(java.lang.String value) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.Serializers.ISerializer")
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
              .explicitInterface("RestSharp.Serializers.ISerializer")
              .invoke("get_RootElement");
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
          .explicitInterface("RestSharp.Serializers.ISerializer")
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
              .explicitInterface("RestSharp.Serializers.ISerializer")
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
  public void setDateFormat(java.lang.String value) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.Serializers.ISerializer")
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
              .explicitInterface("RestSharp.Serializers.ISerializer")
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
  public void setContentType(java.lang.String value) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.Serializers.ISerializer")
          .invoke("set_ContentType", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getContentType() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("RestSharp.Serializers.ISerializer")
              .invoke("get_ContentType");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEncoding(Encoding value) {
    try {
      javonetHandle.set("Encoding", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Encoding getEncoding() {
    try {
      Object res = javonetHandle.<NObject>get("Encoding");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public DotNetXmlSerializer() {
    try {
      javonetHandle = Javonet.New("RestSharp.Serializers.DotNetXmlSerializer");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DotNetXmlSerializer(java.lang.String namespace) {
    try {
      javonetHandle = Javonet.New("RestSharp.Serializers.DotNetXmlSerializer", namespace);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DotNetXmlSerializer(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String Serialize(Object obj) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("RestSharp.Serializers.ISerializer")
              .invoke("Serialize", obj);
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
