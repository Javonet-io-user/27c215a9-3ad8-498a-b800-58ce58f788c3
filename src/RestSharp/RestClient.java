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
import jio.System.Threading.Tasks.*;
import jio.System.Threading.*;
import RestSharp.Deserializers.*;
import jio.System.Security.Cryptography.X509Certificates.*;
import jio.System.Net.*;
import jio.System.Net.Cache.*;
import RestSharp.Authenticators.*;
import jio.System.Text.*;
import jio.System.Collections.Generic.*;

public class RestClient implements IRestClient {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setMaxRedirects(Nullable<java.lang.Integer> value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("set_MaxRedirects", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Integer> getMaxRedirects() {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("get_MaxRedirects");
      if (res == null) return null;
      return new Nullable<java.lang.Integer>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setClientCertificates(X509CertificateCollection value) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.IRestClient")
          .invoke("set_ClientCertificates", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public X509CertificateCollection getClientCertificates() {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("get_ClientCertificates");
      if (res == null) return null;
      return new X509CertificateCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setProxy(IWebProxy value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("set_Proxy", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IWebProxy getProxy() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("get_Proxy");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCachePolicy(RequestCachePolicy value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("set_CachePolicy", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public RequestCachePolicy getCachePolicy() {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("get_CachePolicy");
      if (res == null) return null;
      return new RequestCachePolicy((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFollowRedirects(java.lang.Boolean value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("set_FollowRedirects", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getFollowRedirects() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("get_FollowRedirects");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCookieContainer(CookieContainer value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("set_CookieContainer", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CookieContainer getCookieContainer() {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("get_CookieContainer");
      if (res == null) return null;
      return new CookieContainer((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUserAgent(java.lang.String value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("set_UserAgent", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getUserAgent() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("get_UserAgent");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTimeout(java.lang.Integer value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("set_Timeout", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getTimeout() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("get_Timeout");
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
          .explicitInterface("RestSharp.IRestClient")
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
          javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("get_ReadWriteTimeout");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUseSynchronizationContext(java.lang.Boolean value) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.IRestClient")
          .invoke("set_UseSynchronizationContext", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseSynchronizationContext() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("RestSharp.IRestClient")
              .invoke("get_UseSynchronizationContext");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAuthenticator(IAuthenticator value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("set_Authenticator", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IAuthenticator getAuthenticator() {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("get_Authenticator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setBaseUrl(Uri value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("set_BaseUrl", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Uri getBaseUrl() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("get_BaseUrl");
      if (res == null) return null;
      return new Uri((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEncoding(Encoding value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("set_Encoding", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Encoding getEncoding() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("get_Encoding");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPreAuthenticate(java.lang.Boolean value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("set_PreAuthenticate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getPreAuthenticate() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("get_PreAuthenticate");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IList<Parameter> getDefaultParameters() {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("get_DefaultParameters");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public IHttpFactory getHttpFactory() {
    try {
      Object res = javonetHandle.<NObject>get("HttpFactory");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setHttpFactory(IHttpFactory param) {
    try {
      javonetHandle.set("HttpFactory", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RestClient() {
    try {
      javonetHandle = Javonet.New("RestSharp.RestClient");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RestClient(Uri baseUrl) {
    try {
      javonetHandle = Javonet.New("RestSharp.RestClient", baseUrl);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RestClient(java.lang.String baseUrl) {
    try {
      javonetHandle = Javonet.New("RestSharp.RestClient", baseUrl);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RestClient(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public <T> TaskTResult<IRestResponseT<T>> IRestClient_ExecuteGetTaskAsync(IRestRequest request) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestClient")
              .invoke("ExecuteGetTaskAsync", request);
      if (res == null) return null;
      return new TaskTResult<IRestResponseT<T>>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public <T> TaskTResult<IRestResponseT<T>> IRestClient_ExecuteGetTaskAsync(
      IRestRequest request, CancellationToken token) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestClient")
              .invoke("ExecuteGetTaskAsync", request, token);
      if (res == null) return null;
      return new TaskTResult<IRestResponseT<T>>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public <T> TaskTResult<IRestResponseT<T>> IRestClient_ExecutePostTaskAsync(IRestRequest request) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestClient")
              .invoke("ExecutePostTaskAsync", request);
      if (res == null) return null;
      return new TaskTResult<IRestResponseT<T>>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public <T> TaskTResult<IRestResponseT<T>> IRestClient_ExecutePostTaskAsync(
      IRestRequest request, CancellationToken token) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestClient")
              .invoke("ExecutePostTaskAsync", request, token);
      if (res == null) return null;
      return new TaskTResult<IRestResponseT<T>>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public <T> TaskTResult<IRestResponseT<T>> IRestClient_ExecuteTaskAsync(IRestRequest request) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestClient")
              .invoke("ExecuteTaskAsync", request);
      if (res == null) return null;
      return new TaskTResult<IRestResponseT<T>>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public <T> TaskTResult<IRestResponseT<T>> IRestClient_ExecuteTaskAsync(
      IRestRequest request, CancellationToken token) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestClient")
              .invoke("ExecuteTaskAsync", request, token);
      if (res == null) return null;
      return new TaskTResult<IRestResponseT<T>>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TaskTResult<IRestResponse> IRestClient_ExecuteTaskAsync(IRestRequest request) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestClient")
              .invoke("ExecuteTaskAsync", request);
      if (res == null) return null;
      return new TaskTResult<IRestResponse>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TaskTResult<IRestResponse> IRestClient_ExecuteGetTaskAsync(IRestRequest request) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestClient")
              .invoke("ExecuteGetTaskAsync", request);
      if (res == null) return null;
      return new TaskTResult<IRestResponse>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TaskTResult<IRestResponse> IRestClient_ExecuteGetTaskAsync(
      IRestRequest request, CancellationToken token) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestClient")
              .invoke("ExecuteGetTaskAsync", request, token);
      if (res == null) return null;
      return new TaskTResult<IRestResponse>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TaskTResult<IRestResponse> IRestClient_ExecutePostTaskAsync(IRestRequest request) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestClient")
              .invoke("ExecutePostTaskAsync", request);
      if (res == null) return null;
      return new TaskTResult<IRestResponse>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TaskTResult<IRestResponse> IRestClient_ExecutePostTaskAsync(
      IRestRequest request, CancellationToken token) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestClient")
              .invoke("ExecutePostTaskAsync", request, token);
      if (res == null) return null;
      return new TaskTResult<IRestResponse>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TaskTResult<IRestResponse> IRestClient_ExecuteTaskAsync(
      IRestRequest request, CancellationToken token) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestClient")
              .invoke("ExecuteTaskAsync", request, token);
      if (res == null) return null;
      return new TaskTResult<IRestResponse>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddHandler(java.lang.String contentType, IDeserializer deserializer) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.IRestClient")
          .invoke("AddHandler", contentType, deserializer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RemoveHandler(java.lang.String contentType) {
    try {
      javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("RemoveHandler", contentType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ClearHandlers() {
    try {
      javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("ClearHandlers");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Uri BuildUri(IRestRequest request) {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("BuildUri", request);
      if (res == null) return null;
      return new Uri((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Byte[] DownloadData(IRestRequest request, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("DownloadData", request);
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IRestResponse IRestClient_Execute(IRestRequest request) {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("Execute", request);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IRestResponse IRestClient_ExecuteAsGet(IRestRequest request, java.lang.String httpMethod) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestClient")
              .invoke("ExecuteAsGet", request, httpMethod);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IRestResponse IRestClient_ExecuteAsPost(
      IRestRequest request, java.lang.String httpMethod) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestClient")
              .invoke("ExecuteAsPost", request, httpMethod);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public <T> IRestResponseT<T> IRestClient_Execute(IRestRequest request) {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IRestClient").invoke("Execute", request);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public <T> IRestResponseT<T> IRestClient_ExecuteAsGet(
      IRestRequest request, java.lang.String httpMethod) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestClient")
              .invoke("ExecuteAsGet", request, httpMethod);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public <T> IRestResponseT<T> IRestClient_ExecuteAsPost(
      IRestRequest request, java.lang.String httpMethod) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestClient")
              .invoke("ExecuteAsPost", request, httpMethod);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public <A, B> RestRequestAsyncHandle IRestClient_ExecuteAsync(
      IRestRequest request, ActionT1T2<A, B> callback) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestClient")
              .invoke("ExecuteAsync", request, callback);
      if (res == null) return null;
      return new RestRequestAsyncHandle((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public <A, B> RestRequestAsyncHandle IRestClient_ExecuteAsyncGet(
      IRestRequest request, ActionT1T2<A, B> callback, java.lang.String httpMethod) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestClient")
              .invoke("ExecuteAsyncGet", request, callback, httpMethod);
      if (res == null) return null;
      return new RestRequestAsyncHandle((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public <A, B> RestRequestAsyncHandle IRestClient_ExecuteAsyncPost(
      IRestRequest request, ActionT1T2<A, B> callback, java.lang.String httpMethod) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IRestClient")
              .invoke("ExecuteAsyncPost", request, callback, httpMethod);
      if (res == null) return null;
      return new RestRequestAsyncHandle((NObject) res);
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
