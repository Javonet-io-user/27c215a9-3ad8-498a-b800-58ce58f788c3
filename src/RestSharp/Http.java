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
import jio.System.Net.*;
import jio.System.IO.*;
import jio.System.Collections.Generic.*;
import jio.System.Security.Cryptography.X509Certificates.*;
import jio.System.Text.*;
import jio.System.Net.Cache.*;

public class Http implements IHttp, IHttpFactory {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setAlwaysMultipartFormData(java.lang.Boolean value) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.IHttp")
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
          javonetHandle.explicitInterface("RestSharp.IHttp").invoke("get_AlwaysMultipartFormData");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUserAgent(java.lang.String value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IHttp").invoke("set_UserAgent", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getUserAgent() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("RestSharp.IHttp").invoke("get_UserAgent");
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
      javonetHandle.explicitInterface("RestSharp.IHttp").invoke("set_Timeout", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getTimeout() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("RestSharp.IHttp").invoke("get_Timeout");
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
      javonetHandle.explicitInterface("RestSharp.IHttp").invoke("set_ReadWriteTimeout", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getReadWriteTimeout() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("RestSharp.IHttp").invoke("get_ReadWriteTimeout");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCredentials(ICredentials value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IHttp").invoke("set_Credentials", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ICredentials getCredentials() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("get_Credentials");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCookieContainer(CookieContainer value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IHttp").invoke("set_CookieContainer", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CookieContainer getCookieContainer() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("get_CookieContainer");
      if (res == null) return null;
      return new CookieContainer((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setResponseWriter(ActionT<Stream> value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IHttp").invoke("set_ResponseWriter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ActionT<Stream> getResponseWriter() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("get_ResponseWriter");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IList<HttpFile> getFiles() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("get_Files");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFollowRedirects(java.lang.Boolean value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IHttp").invoke("set_FollowRedirects", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getFollowRedirects() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("RestSharp.IHttp").invoke("get_FollowRedirects");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setClientCertificates(X509CertificateCollection value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IHttp").invoke("set_ClientCertificates", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public X509CertificateCollection getClientCertificates() {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IHttp").invoke("get_ClientCertificates");
      if (res == null) return null;
      return new X509CertificateCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMaxRedirects(Nullable<java.lang.Integer> value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IHttp").invoke("set_MaxRedirects", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Integer> getMaxRedirects() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("get_MaxRedirects");
      if (res == null) return null;
      return new Nullable<java.lang.Integer>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUseDefaultCredentials(java.lang.Boolean value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IHttp").invoke("set_UseDefaultCredentials", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseDefaultCredentials() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("RestSharp.IHttp").invoke("get_UseDefaultCredentials");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEncoding(Encoding value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IHttp").invoke("set_Encoding", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Encoding getEncoding() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("get_Encoding");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IList<HttpHeader> getHeaders() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("get_Headers");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IList<HttpParameter> getParameters() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("get_Parameters");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IList<HttpCookie> getCookies() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("get_Cookies");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRequestBody(java.lang.String value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IHttp").invoke("set_RequestBody", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getRequestBody() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("RestSharp.IHttp").invoke("get_RequestBody");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRequestContentType(java.lang.String value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IHttp").invoke("set_RequestContentType", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getRequestContentType() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("RestSharp.IHttp").invoke("get_RequestContentType");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRequestBodyBytes(java.lang.Byte[] value) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.IHttp")
          .invoke("set_RequestBodyBytes", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte[] getRequestBodyBytes(Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle.explicitInterface("RestSharp.IHttp").invoke("get_RequestBodyBytes");
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUrl(Uri value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IHttp").invoke("set_Url", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Uri getUrl() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("get_Url");
      if (res == null) return null;
      return new Uri((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPreAuthenticate(java.lang.Boolean value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IHttp").invoke("set_PreAuthenticate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getPreAuthenticate() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("RestSharp.IHttp").invoke("get_PreAuthenticate");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setProxy(IWebProxy value) {
    try {
      javonetHandle.explicitInterface("RestSharp.IHttp").invoke("set_Proxy", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IWebProxy getProxy() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("get_Proxy");
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
      javonetHandle.explicitInterface("RestSharp.IHttp").invoke("set_CachePolicy", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public RequestCachePolicy getCachePolicy() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("get_CachePolicy");
      if (res == null) return null;
      return new RequestCachePolicy((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Http() {
    try {
      javonetHandle = Javonet.New("RestSharp.Http");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Http(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public HttpWebRequest DeleteAsync(ActionT<HttpResponse> action) {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("DeleteAsync", action);
      if (res == null) return null;
      return new HttpWebRequest((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public HttpWebRequest GetAsync(ActionT<HttpResponse> action) {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("GetAsync", action);
      if (res == null) return null;
      return new HttpWebRequest((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public HttpWebRequest HeadAsync(ActionT<HttpResponse> action) {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("HeadAsync", action);
      if (res == null) return null;
      return new HttpWebRequest((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public HttpWebRequest OptionsAsync(ActionT<HttpResponse> action) {
    try {
      Object res =
          javonetHandle.explicitInterface("RestSharp.IHttp").invoke("OptionsAsync", action);
      if (res == null) return null;
      return new HttpWebRequest((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public HttpWebRequest PostAsync(ActionT<HttpResponse> action) {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("PostAsync", action);
      if (res == null) return null;
      return new HttpWebRequest((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public HttpWebRequest PutAsync(ActionT<HttpResponse> action) {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("PutAsync", action);
      if (res == null) return null;
      return new HttpWebRequest((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public HttpWebRequest PatchAsync(ActionT<HttpResponse> action) {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("PatchAsync", action);
      if (res == null) return null;
      return new HttpWebRequest((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public HttpWebRequest MergeAsync(ActionT<HttpResponse> action) {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("MergeAsync", action);
      if (res == null) return null;
      return new HttpWebRequest((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public HttpWebRequest AsPostAsync(ActionT<HttpResponse> action, java.lang.String httpMethod) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IHttp")
              .invoke("AsPostAsync", action, httpMethod);
      if (res == null) return null;
      return new HttpWebRequest((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public HttpWebRequest AsGetAsync(ActionT<HttpResponse> action, java.lang.String httpMethod) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IHttp")
              .invoke("AsGetAsync", action, httpMethod);
      if (res == null) return null;
      return new HttpWebRequest((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IHttp Create() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttpFactory").invoke("Create");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public HttpResponse Post() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("Post");
      if (res == null) return null;
      return new HttpResponse((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public HttpResponse Put() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("Put");
      if (res == null) return null;
      return new HttpResponse((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public HttpResponse Get() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("Get");
      if (res == null) return null;
      return new HttpResponse((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public HttpResponse Head() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("Head");
      if (res == null) return null;
      return new HttpResponse((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public HttpResponse Options() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("Options");
      if (res == null) return null;
      return new HttpResponse((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public HttpResponse Delete() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("Delete");
      if (res == null) return null;
      return new HttpResponse((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public HttpResponse Patch() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("Patch");
      if (res == null) return null;
      return new HttpResponse((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public HttpResponse Merge() {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("Merge");
      if (res == null) return null;
      return new HttpResponse((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public HttpResponse AsGet(java.lang.String httpMethod) {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("AsGet", httpMethod);
      if (res == null) return null;
      return new HttpResponse((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public HttpResponse AsPost(java.lang.String httpMethod) {
    try {
      Object res = javonetHandle.explicitInterface("RestSharp.IHttp").invoke("AsPost", httpMethod);
      if (res == null) return null;
      return new HttpResponse((NObject) res);
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
