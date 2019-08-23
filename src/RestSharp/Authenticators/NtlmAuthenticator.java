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
import jio.System.Net.*;

public class NtlmAuthenticator implements IAuthenticator {
  protected NObject javonetHandle;

  public NtlmAuthenticator() {
    try {
      javonetHandle = Javonet.New("RestSharp.Authenticators.NtlmAuthenticator");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NtlmAuthenticator(java.lang.String username, java.lang.String password) {
    try {
      javonetHandle = Javonet.New("RestSharp.Authenticators.NtlmAuthenticator", username, password);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NtlmAuthenticator(ICredentials credentials) {
    try {
      javonetHandle = Javonet.New("RestSharp.Authenticators.NtlmAuthenticator", credentials);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NtlmAuthenticator(NObject handle) {
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
