package jio.System.Net.Cache;

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
import jio.System.Net.Cache.*;

public class RequestCachePolicy {
  public NObject javonetHandle;

  public RequestCachePolicy() {
    try {
      javonetHandle = Javonet.New("System.Net.Cache.RequestCachePolicy");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RequestCachePolicy(RequestCacheLevel level) {
    try {
      javonetHandle = Javonet.New("System.Net.Cache.RequestCachePolicy", NEnum.fromJavaEnum(level));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RequestCachePolicy(NObject handle) {
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
