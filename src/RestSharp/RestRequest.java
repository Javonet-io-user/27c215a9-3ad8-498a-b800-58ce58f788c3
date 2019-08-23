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
import jio.System.IO.*;
import jio.System.*;
import RestSharp.Serializers.*;
import jio.System.Collections.Generic.*;
import jio.System.Net.*;

public class RestRequest implements IRestRequest {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setAlwaysMultipartFormData(java.lang.Boolean value) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.IRestRequest")
          .invoke("set_AlwaysMultipartFormData", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAlwaysMultipartFormData() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("RestSharp.IRestRequest")
              .invoke("get_AlwaysMultipartFormData");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setJsonSerializer(ISerializer value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("set_JsonSerializer", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ISerializer getJsonSerializer() {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("get_JsonSerializer");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setXmlSerializer(ISerializer value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("set_XmlSerializer", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ISerializer getXmlSerializer() {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("get_XmlSerializer");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setResponseWriter(ActionT<Stream> value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("set_ResponseWriter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ActionT<Stream> getResponseWriter() {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("get_ResponseWriter");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUseDefaultCredentials(java.lang.Boolean value) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.IRestRequest")
          .invoke("set_UseDefaultCredentials", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseDefaultCredentials() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("RestSharp.IRestRequest")
              .invoke("get_UseDefaultCredentials");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<Parameter> getParameters() {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("get_Parameters");
      if (res == null) return null;
      return new List<Parameter>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<FileParameter> getFiles() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("get_Files");
      if (res == null) return null;
      return new List<FileParameter>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMethod(Method value) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.IRestRequest")
          .invoke("set_Method", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Method getMethod() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("get_Method");
      if (res == null) return null;
      return Method.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setResource(java.lang.String value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("set_Resource", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getResource() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("get_Resource");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRequestFormat(DataFormat value) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.IRestRequest")
          .invoke("set_RequestFormat", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DataFormat getRequestFormat() {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("get_RequestFormat");
      if (res == null) return null;
      return DataFormat.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRootElement(java.lang.String value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("set_RootElement", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getRootElement() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("get_RootElement");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setOnBeforeDeserialization(ActionT<IRestResponse> value) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.IRestRequest")
          .invoke("set_OnBeforeDeserialization", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ActionT<IRestResponse> getOnBeforeDeserialization() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestRequest")
              .invoke("get_OnBeforeDeserialization");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDateFormat(java.lang.String value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("set_DateFormat", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDateFormat() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("get_DateFormat");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setXmlNamespace(java.lang.String value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("set_XmlNamespace", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getXmlNamespace() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("get_XmlNamespace");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCredentials(ICredentials value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("set_Credentials", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ICredentials getCredentials() {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("get_Credentials");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUserState(Object value) {
    try {
      javonetHandle.set("UserState", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Object getUserState() {
    try {
      Object res = javonetHandle.<NObject>get("UserState");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTimeout(java.lang.Integer value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("set_Timeout", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getTimeout() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("get_Timeout");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setReadWriteTimeout(java.lang.Integer value) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.IRestRequest")
          .invoke("set_ReadWriteTimeout", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getReadWriteTimeout() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("get_ReadWriteTimeout");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getAttempts() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("get_Attempts");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public RestRequest() {
    try {
      javonetHandle = Javonet.New("RestSharp.RestRequest");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RestRequest(Method method) {
    try {
      javonetHandle = Javonet.New("RestSharp.RestRequest", NEnum.fromJavaEnum(method));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RestRequest(java.lang.String resource) {
    try {
      javonetHandle = Javonet.New("RestSharp.RestRequest", resource);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RestRequest(java.lang.String resource, Method method) {
    try {
      javonetHandle = Javonet.New("RestSharp.RestRequest", resource, NEnum.fromJavaEnum(method));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RestRequest(Uri resource) {
    try {
      javonetHandle = Javonet.New("RestSharp.RestRequest", resource);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RestRequest(Uri resource, Method method) {
    try {
      javonetHandle = Javonet.New("RestSharp.RestRequest", resource, NEnum.fromJavaEnum(method));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RestRequest(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddFile(
      java.lang.String name, java.lang.String path, java.lang.String contentType) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestRequest")
              .invoke("AddFile", name, path, contentType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddFile(
      java.lang.String name,
      java.lang.Byte[] bytes,
      java.lang.String fileName,
      java.lang.String contentType) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestRequest")
              .invoke("AddFile", name, new Object[] {bytes}, fileName, contentType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddFile(
      java.lang.String name,
      ActionT<Stream> writer,
      java.lang.String fileName,
      java.lang.String contentType) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestRequest")
              .invoke("AddFile", name, writer, fileName, contentType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddFileBytes(
      java.lang.String name,
      java.lang.Byte[] bytes,
      java.lang.String filename,
      java.lang.String contentType) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestRequest")
              .invoke("AddFileBytes", name, new Object[] {bytes}, filename, contentType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddBody(Object obj, java.lang.String xmlNamespace) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestRequest")
              .invoke("AddBody", obj, xmlNamespace);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddBody(Object obj) {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("AddBody", obj);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddJsonBody(Object obj) {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("AddJsonBody", obj);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddXmlBody(Object obj) {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("AddXmlBody", obj);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddXmlBody(Object obj, java.lang.String xmlNamespace) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestRequest")
              .invoke("AddXmlBody", obj, xmlNamespace);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddObject(Object obj, java.lang.String[] includedProperties) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestRequest")
              .invoke("AddObject", obj, new Object[] {includedProperties});
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddObject(Object obj) {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("AddObject", obj);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddParameter(Parameter p) {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("AddParameter", p);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddParameter(java.lang.String name, Object value) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestRequest")
              .invoke("AddParameter", name, value);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddParameter(java.lang.String name, Object value, ParameterType type) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestRequest")
              .invoke("AddParameter", name, value, NEnum.fromJavaEnum(type));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddParameter(
      java.lang.String name, Object value, java.lang.String contentType, ParameterType type) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestRequest")
              .invoke("AddParameter", name, value, contentType, NEnum.fromJavaEnum(type));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddHeader(java.lang.String name, java.lang.String value) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestRequest")
              .invoke("AddHeader", name, value);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddCookie(java.lang.String name, java.lang.String value) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestRequest")
              .invoke("AddCookie", name, value);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddUrlSegment(java.lang.String name, java.lang.String value) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestRequest")
              .invoke("AddUrlSegment", name, value);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddQueryParameter(java.lang.String name, java.lang.String value) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestRequest")
              .invoke("AddQueryParameter", name, value);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void IncreaseNumAttempts() {
    try {
      javonetHandle.explicitInterface("RestSharp.IRestRequest").invoke("IncreaseNumAttempts");
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
