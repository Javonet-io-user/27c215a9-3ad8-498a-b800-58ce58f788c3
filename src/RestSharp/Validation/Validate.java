package RestSharp.Validation;

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
import RestSharp.Validation.*;

public class Validate {
  protected NObject javonetHandle;

  public Validate() {
    try {
      javonetHandle = Javonet.New("RestSharp.Validation.Validate");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Validate(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void IsBetween(
      java.lang.Integer value, java.lang.Integer min, java.lang.Integer max) {
    try {
      Javonet.getType("RestSharp.Validation.Validate").invoke("IsBetween", value, min, max);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void IsValidLength(java.lang.String value, java.lang.Integer maxSize) {
    try {
      Javonet.getType("RestSharp.Validation.Validate").invoke("IsValidLength", value, maxSize);
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
