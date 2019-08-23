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

public interface IRestRequest {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddFile(
      java.lang.String name, java.lang.String path, java.lang.String contentType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddFile(
      java.lang.String name,
      java.lang.Byte[] bytes,
      java.lang.String fileName,
      java.lang.String contentType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddFile(
      java.lang.String name,
      ActionT<Stream> writer,
      java.lang.String fileName,
      java.lang.String contentType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddFileBytes(
      java.lang.String name,
      java.lang.Byte[] bytes,
      java.lang.String filename,
      java.lang.String contentType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddBody(Object obj, java.lang.String xmlNamespace);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddBody(Object obj);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddJsonBody(Object obj);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddXmlBody(Object obj);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddXmlBody(Object obj, java.lang.String xmlNamespace);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddObject(Object obj, java.lang.String[] includedProperties);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddObject(Object obj);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddParameter(Parameter p);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddParameter(java.lang.String name, Object value);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddParameter(java.lang.String name, Object value, ParameterType type);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddParameter(
      java.lang.String name, Object value, java.lang.String contentType, ParameterType type);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddHeader(java.lang.String name, java.lang.String value);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddCookie(java.lang.String name, java.lang.String value);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddUrlSegment(java.lang.String name, java.lang.String value);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IRestRequest AddQueryParameter(java.lang.String name, java.lang.String value);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void IncreaseNumAttempts();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAlwaysMultipartFormData();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public ISerializer getJsonSerializer();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public ISerializer getXmlSerializer();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public ActionT<Stream> getResponseWriter();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public List<Parameter> getParameters();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public List<FileParameter> getFiles();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Method getMethod();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getResource();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DataFormat getRequestFormat();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getRootElement();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDateFormat();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getXmlNamespace();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public ICredentials getCredentials();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getTimeout();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getReadWriteTimeout();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getAttempts();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseDefaultCredentials();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public ActionT<IRestResponse> getOnBeforeDeserialization();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setAlwaysMultipartFormData(java.lang.Boolean value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setJsonSerializer(ISerializer value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setXmlSerializer(ISerializer value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setResponseWriter(ActionT<Stream> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setMethod(Method value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setResource(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setRequestFormat(DataFormat value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setRootElement(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setDateFormat(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setXmlNamespace(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setCredentials(ICredentials value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setTimeout(java.lang.Integer value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setReadWriteTimeout(java.lang.Integer value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setUseDefaultCredentials(java.lang.Boolean value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setOnBeforeDeserialization(ActionT<IRestResponse> value);
}
