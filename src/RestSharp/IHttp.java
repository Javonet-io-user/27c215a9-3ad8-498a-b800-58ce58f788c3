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
import jio.System.Security.Cryptography.X509Certificates.*;
import jio.System.Text.*;
import jio.System.Collections.Generic.*;
import jio.System.Net.Cache.*;

public interface IHttp {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HttpWebRequest DeleteAsync(ActionT<HttpResponse> action);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HttpWebRequest GetAsync(ActionT<HttpResponse> action);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HttpWebRequest HeadAsync(ActionT<HttpResponse> action);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HttpWebRequest OptionsAsync(ActionT<HttpResponse> action);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HttpWebRequest PostAsync(ActionT<HttpResponse> action);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HttpWebRequest PutAsync(ActionT<HttpResponse> action);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HttpWebRequest PatchAsync(ActionT<HttpResponse> action);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HttpWebRequest MergeAsync(ActionT<HttpResponse> action);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HttpWebRequest AsPostAsync(ActionT<HttpResponse> action, java.lang.String httpMethod);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HttpWebRequest AsGetAsync(ActionT<HttpResponse> action, java.lang.String httpMethod);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HttpResponse Delete();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HttpResponse Get();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HttpResponse Head();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HttpResponse Options();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HttpResponse Post();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HttpResponse Put();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HttpResponse Patch();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HttpResponse Merge();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HttpResponse AsPost(java.lang.String httpMethod);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HttpResponse AsGet(java.lang.String httpMethod);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public ActionT<Stream> getResponseWriter();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public CookieContainer getCookieContainer();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public ICredentials getCredentials();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAlwaysMultipartFormData();
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
  public java.lang.Boolean getFollowRedirects();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public X509CertificateCollection getClientCertificates();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Integer> getMaxRedirects();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseDefaultCredentials();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Encoding getEncoding();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IList<HttpHeader> getHeaders();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IList<HttpParameter> getParameters();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IList<HttpFile> getFiles();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IList<HttpCookie> getCookies();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getRequestBody();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getRequestContentType();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getPreAuthenticate();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public RequestCachePolicy getCachePolicy();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte[] getRequestBodyBytes(Class<?> returnArrayType);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Uri getUrl();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IWebProxy getProxy();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setResponseWriter(ActionT<Stream> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setCookieContainer(CookieContainer value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setCredentials(ICredentials value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setAlwaysMultipartFormData(java.lang.Boolean value);
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
  public void setFollowRedirects(java.lang.Boolean value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setClientCertificates(X509CertificateCollection value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setMaxRedirects(Nullable<java.lang.Integer> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setUseDefaultCredentials(java.lang.Boolean value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setEncoding(Encoding value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setRequestBody(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setRequestContentType(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setPreAuthenticate(java.lang.Boolean value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setCachePolicy(RequestCachePolicy value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setRequestBodyBytes(java.lang.Byte[] value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setUrl(Uri value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setProxy(IWebProxy value);
}
