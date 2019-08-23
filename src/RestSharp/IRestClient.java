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
import RestSharp.Deserializers.*;
import jio.System.Threading.*;
import jio.System.Threading.Tasks.*;
import jio.System.Net.*;
import RestSharp.Authenticators.*;
import jio.System.Text.*;
import jio.System.Collections.Generic.*;
import jio.System.Security.Cryptography.X509Certificates.*;
import jio.System.Net.Cache.*;

public interface IRestClient {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public RestRequestAsyncHandle IRestClient_ExecuteAsync(
      IRestRequest request, ActionT1T2<IRestResponse, RestRequestAsyncHandle> callback);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public <T> RestRequestAsyncHandle IRestClient_ExecuteAsync(
      IRestRequest request, ActionT1T2<IRestResponseT<T>, RestRequestAsyncHandle> callback);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IRestResponse IRestClient_Execute(IRestRequest request);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public <T> IRestResponseT<T> IRestClient_Execute(IRestRequest request);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Byte[] DownloadData(IRestRequest request, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Uri BuildUri(IRestRequest request);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public RestRequestAsyncHandle IRestClient_ExecuteAsyncGet(
      IRestRequest request,
      ActionT1T2<IRestResponse, RestRequestAsyncHandle> callback,
      java.lang.String httpMethod);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public RestRequestAsyncHandle IRestClient_ExecuteAsyncPost(
      IRestRequest request,
      ActionT1T2<IRestResponse, RestRequestAsyncHandle> callback,
      java.lang.String httpMethod);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public <T> RestRequestAsyncHandle IRestClient_ExecuteAsyncGet(
      IRestRequest request,
      ActionT1T2<IRestResponseT<T>, RestRequestAsyncHandle> callback,
      java.lang.String httpMethod);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public <T> RestRequestAsyncHandle IRestClient_ExecuteAsyncPost(
      IRestRequest request,
      ActionT1T2<IRestResponseT<T>, RestRequestAsyncHandle> callback,
      java.lang.String httpMethod);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void AddHandler(java.lang.String contentType, IDeserializer deserializer);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void RemoveHandler(java.lang.String contentType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void ClearHandlers();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IRestResponse IRestClient_ExecuteAsGet(IRestRequest request, java.lang.String httpMethod);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IRestResponse IRestClient_ExecuteAsPost(IRestRequest request, java.lang.String httpMethod);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public <T> IRestResponseT<T> IRestClient_ExecuteAsGet(
      IRestRequest request, java.lang.String httpMethod);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public <T> IRestResponseT<T> IRestClient_ExecuteAsPost(
      IRestRequest request, java.lang.String httpMethod);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public <T> TaskTResult<IRestResponseT<T>> IRestClient_ExecuteTaskAsync(
      IRestRequest request, CancellationToken token);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public <T> TaskTResult<IRestResponseT<T>> IRestClient_ExecuteTaskAsync(IRestRequest request);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public <T> TaskTResult<IRestResponseT<T>> IRestClient_ExecuteGetTaskAsync(IRestRequest request);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public <T> TaskTResult<IRestResponseT<T>> IRestClient_ExecuteGetTaskAsync(
      IRestRequest request, CancellationToken token);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public <T> TaskTResult<IRestResponseT<T>> IRestClient_ExecutePostTaskAsync(IRestRequest request);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public <T> TaskTResult<IRestResponseT<T>> IRestClient_ExecutePostTaskAsync(
      IRestRequest request, CancellationToken token);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public TaskTResult<IRestResponse> IRestClient_ExecuteTaskAsync(
      IRestRequest request, CancellationToken token);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public TaskTResult<IRestResponse> IRestClient_ExecuteTaskAsync(IRestRequest request);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public TaskTResult<IRestResponse> IRestClient_ExecuteGetTaskAsync(IRestRequest request);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public TaskTResult<IRestResponse> IRestClient_ExecuteGetTaskAsync(
      IRestRequest request, CancellationToken token);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public TaskTResult<IRestResponse> IRestClient_ExecutePostTaskAsync(IRestRequest request);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public TaskTResult<IRestResponse> IRestClient_ExecutePostTaskAsync(
      IRestRequest request, CancellationToken token);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public CookieContainer getCookieContainer();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Integer> getMaxRedirects();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getUserAgent();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getTimeout();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getReadWriteTimeout();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseSynchronizationContext();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IAuthenticator getAuthenticator();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Uri getBaseUrl();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Encoding getEncoding();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getPreAuthenticate();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IList<Parameter> getDefaultParameters();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public X509CertificateCollection getClientCertificates();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IWebProxy getProxy();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public RequestCachePolicy getCachePolicy();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getFollowRedirects();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setCookieContainer(CookieContainer value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setMaxRedirects(Nullable<java.lang.Integer> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setUserAgent(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setTimeout(java.lang.Integer value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setReadWriteTimeout(java.lang.Integer value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setUseSynchronizationContext(java.lang.Boolean value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setAuthenticator(IAuthenticator value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setBaseUrl(Uri value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setEncoding(Encoding value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setPreAuthenticate(java.lang.Boolean value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setClientCertificates(X509CertificateCollection value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setProxy(IWebProxy value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setCachePolicy(RequestCachePolicy value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setFollowRedirects(java.lang.Boolean value);
}
