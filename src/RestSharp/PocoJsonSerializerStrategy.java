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

public class PocoJsonSerializerStrategy implements IJsonSerializerStrategy {
  protected NObject javonetHandle;

  public PocoJsonSerializerStrategy() {
    try {
      javonetHandle = Javonet.New("RestSharp.PocoJsonSerializerStrategy");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PocoJsonSerializerStrategy(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean TrySerializeNonPrimitiveObject(Object input, Object output) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("RestSharp.IJsonSerializerStrategy")
              .invoke("TrySerializeNonPrimitiveObject", input, output);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object DeserializeObject(Object value, jio.System.Type type) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("RestSharp.IJsonSerializerStrategy")
              .invoke("DeserializeObject", value, type);
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
