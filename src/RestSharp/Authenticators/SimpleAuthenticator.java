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

public class SimpleAuthenticator implements IAuthenticator {
  protected NObject javonetHandle;

  public SimpleAuthenticator(
      java.lang.String usernameKey,
      java.lang.String username,
      java.lang.String passwordKey,
      java.lang.String password) {
    try {
      javonetHandle =
          Javonet.New(
              "RestSharp.Authenticators.SimpleAuthenticator",
              usernameKey,
              username,
              passwordKey,
              password);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SimpleAuthenticator(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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
