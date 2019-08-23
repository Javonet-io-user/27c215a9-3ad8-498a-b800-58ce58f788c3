package RestSharp.Authenticators;

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
import RestSharp.Authenticators.*;
import RestSharp.*;
import RestSharp.Authenticators.OAuth.*;

public class OAuth1Authenticator implements IAuthenticator {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setRealm(java.lang.String value) {
    try {
      javonetHandle.set("Realm", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getRealm() {
    try {
      java.lang.String res = javonetHandle.get("Realm");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setParameterHandling(OAuthParameterHandling value) {
    try {
      javonetHandle.set("ParameterHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public OAuthParameterHandling getParameterHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("ParameterHandling");
      if (res == null) return null;
      return OAuthParameterHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSignatureMethod(OAuthSignatureMethod value) {
    try {
      javonetHandle.set("SignatureMethod", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public OAuthSignatureMethod getSignatureMethod() {
    try {
      Object res = javonetHandle.<NEnum>get("SignatureMethod");
      if (res == null) return null;
      return OAuthSignatureMethod.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSignatureTreatment(OAuthSignatureTreatment value) {
    try {
      javonetHandle.set("SignatureTreatment", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public OAuthSignatureTreatment getSignatureTreatment() {
    try {
      Object res = javonetHandle.<NEnum>get("SignatureTreatment");
      if (res == null) return null;
      return OAuthSignatureTreatment.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public OAuth1Authenticator() {
    try {
      javonetHandle = Javonet.New("RestSharp.Authenticators.OAuth1Authenticator");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OAuth1Authenticator(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static OAuth1Authenticator ForRequestToken(
      java.lang.String consumerKey, java.lang.String consumerSecret) {
    try {
      Object res =
          Javonet.getType("RestSharp.Authenticators.OAuth1Authenticator")
              .invoke("ForRequestToken", consumerKey, consumerSecret);
      if (res == null) return null;
      return new OAuth1Authenticator((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static OAuth1Authenticator ForRequestToken(
      java.lang.String consumerKey, java.lang.String consumerSecret, java.lang.String callbackUrl) {
    try {
      Object res =
          Javonet.getType("RestSharp.Authenticators.OAuth1Authenticator")
              .invoke("ForRequestToken", consumerKey, consumerSecret, callbackUrl);
      if (res == null) return null;
      return new OAuth1Authenticator((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static OAuth1Authenticator ForAccessToken(
      java.lang.String consumerKey,
      java.lang.String consumerSecret,
      java.lang.String token,
      java.lang.String tokenSecret) {
    try {
      Object res =
          Javonet.getType("RestSharp.Authenticators.OAuth1Authenticator")
              .invoke("ForAccessToken", consumerKey, consumerSecret, token, tokenSecret);
      if (res == null) return null;
      return new OAuth1Authenticator((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static OAuth1Authenticator ForAccessToken(
      java.lang.String consumerKey,
      java.lang.String consumerSecret,
      java.lang.String token,
      java.lang.String tokenSecret,
      java.lang.String verifier) {
    try {
      Object res =
          Javonet.getType("RestSharp.Authenticators.OAuth1Authenticator")
              .invoke("ForAccessToken", consumerKey, consumerSecret, token, tokenSecret, verifier);
      if (res == null) return null;
      return new OAuth1Authenticator((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static OAuth1Authenticator ForAccessTokenRefresh(
      java.lang.String consumerKey,
      java.lang.String consumerSecret,
      java.lang.String token,
      java.lang.String tokenSecret,
      java.lang.String sessionHandle) {
    try {
      Object res =
          Javonet.getType("RestSharp.Authenticators.OAuth1Authenticator")
              .invoke(
                  "ForAccessTokenRefresh",
                  consumerKey,
                  consumerSecret,
                  token,
                  tokenSecret,
                  sessionHandle);
      if (res == null) return null;
      return new OAuth1Authenticator((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static OAuth1Authenticator ForAccessTokenRefresh(
      java.lang.String consumerKey,
      java.lang.String consumerSecret,
      java.lang.String token,
      java.lang.String tokenSecret,
      java.lang.String verifier,
      java.lang.String sessionHandle) {
    try {
      Object res =
          Javonet.getType("RestSharp.Authenticators.OAuth1Authenticator")
              .invoke(
                  "ForAccessTokenRefresh",
                  consumerKey,
                  consumerSecret,
                  token,
                  tokenSecret,
                  verifier,
                  sessionHandle);
      if (res == null) return null;
      return new OAuth1Authenticator((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static OAuth1Authenticator ForClientAuthentication(
      java.lang.String consumerKey,
      java.lang.String consumerSecret,
      java.lang.String username,
      java.lang.String password) {
    try {
      Object res =
          Javonet.getType("RestSharp.Authenticators.OAuth1Authenticator")
              .invoke("ForClientAuthentication", consumerKey, consumerSecret, username, password);
      if (res == null) return null;
      return new OAuth1Authenticator((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static OAuth1Authenticator ForProtectedResource(
      java.lang.String consumerKey,
      java.lang.String consumerSecret,
      java.lang.String accessToken,
      java.lang.String accessTokenSecret) {
    try {
      Object res =
          Javonet.getType("RestSharp.Authenticators.OAuth1Authenticator")
              .invoke(
                  "ForProtectedResource",
                  consumerKey,
                  consumerSecret,
                  accessToken,
                  accessTokenSecret);
      if (res == null) return null;
      return new OAuth1Authenticator((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Authenticate(IRestClient client, IRestRequest request) {
    try {
      javonetHandle
          .explicitInterface("RestSharp.Authenticators.IAuthenticator")
          .invoke("Authenticate", client, request);
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
