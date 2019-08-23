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
import jio.System.Net.*;
import jio.System.*;
import jio.System.Collections.Generic.*;

public interface IRestResponse {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IRestRequest getRequest();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getContentType();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getContentLength();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getContentEncoding();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getContent();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public HttpStatusCode getStatusCode();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getStatusDescription();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte[] getRawBytes(Class<?> returnArrayType);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Uri getResponseUri();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getServer();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IList<RestResponseCookie> getCookies();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IList<Parameter> getHeaders();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public ResponseStatus getResponseStatus();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getErrorMessage();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Exception getErrorException();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setRequest(IRestRequest value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setContentType(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setContentLength(java.lang.Long value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setContentEncoding(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setContent(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setStatusCode(HttpStatusCode value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setStatusDescription(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setRawBytes(java.lang.Byte[] value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setResponseUri(Uri value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setServer(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setResponseStatus(ResponseStatus value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setErrorMessage(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setErrorException(jio.System.Exception value);
}
