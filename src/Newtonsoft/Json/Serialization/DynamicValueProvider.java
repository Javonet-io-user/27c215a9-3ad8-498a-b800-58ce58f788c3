package Newtonsoft.Json.Serialization;

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
import Newtonsoft.Json.Serialization.*;
import jio.System.*;
import jio.System.Reflection.*;

public class DynamicValueProvider implements IValueProvider {
  protected NObject javonetHandle;

  public DynamicValueProvider(MemberInfo memberInfo) {
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Serialization.DynamicValueProvider", memberInfo);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DynamicValueProvider(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetValue(Object target, Object value) {
    try {
      javonetHandle
          .explicitInterface("Newtonsoft.Json.Serialization.IValueProvider")
          .invoke("SetValue", target, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object GetValue(Object target) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Newtonsoft.Json.Serialization.IValueProvider")
              .invoke("GetValue", target);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
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
