package jio.System.Net;

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
import jio.System.Net.*;

public class CookieContainer {
  public NObject javonetHandle;

  public CookieContainer() {
    try {
      javonetHandle = Javonet.New("System.Net.CookieContainer");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CookieContainer(java.lang.Integer capacity) {
    try {
      javonetHandle = Javonet.New("System.Net.CookieContainer", capacity);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CookieContainer(
      java.lang.Integer capacity,
      java.lang.Integer perDomainCapacity,
      java.lang.Integer maxCookieSize) {
    try {
      javonetHandle =
          Javonet.New("System.Net.CookieContainer", capacity, perDomainCapacity, maxCookieSize);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CookieContainer(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
