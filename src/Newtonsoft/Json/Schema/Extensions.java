package Newtonsoft.Json.Schema;

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
import Newtonsoft.Json.Schema.*;
import Newtonsoft.Json.Linq.*;
import jio.System.Collections.Generic.*;

public class Extensions {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsValid(JToken source, JsonSchema schema) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Newtonsoft.Json.Schema.Extensions").invoke("IsValid", source, schema);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsValid(
      JToken source, JsonSchema schema, IList<java.lang.String> errorMessages) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Newtonsoft.Json.Schema.Extensions")
              .invoke("IsValid", source, schema, errorMessages);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Validate(JToken source, JsonSchema schema) {
    try {
      Javonet.getType("Newtonsoft.Json.Schema.Extensions").invoke("Validate", source, schema);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Validate(
      JToken source, JsonSchema schema, ValidationEventHandler validationEventHandler) {
    try {
      Javonet.getType("Newtonsoft.Json.Schema.Extensions")
          .invoke("Validate", source, schema, validationEventHandler);
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
