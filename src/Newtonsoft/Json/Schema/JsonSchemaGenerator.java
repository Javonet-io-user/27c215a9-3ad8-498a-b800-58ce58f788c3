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
import jio.System.*;
import Newtonsoft.Json.Serialization.*;

public class JsonSchemaGenerator {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setUndefinedSchemaIdHandling(UndefinedSchemaIdHandling value) {
    try {
      javonetHandle.set("UndefinedSchemaIdHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public UndefinedSchemaIdHandling getUndefinedSchemaIdHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("UndefinedSchemaIdHandling");
      if (res == null) return null;
      return UndefinedSchemaIdHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setContractResolver(IContractResolver value) {
    try {
      javonetHandle.set("ContractResolver", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IContractResolver getContractResolver() {
    try {
      Object res = javonetHandle.<NObject>get("ContractResolver");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public JsonSchemaGenerator() {
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Schema.JsonSchemaGenerator");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JsonSchemaGenerator(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public JsonSchema Generate(jio.System.Type type) {
    try {
      Object res = javonetHandle.invoke("Generate", type);
      if (res == null) return null;
      return new JsonSchema((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public JsonSchema Generate(jio.System.Type type, JsonSchemaResolver resolver) {
    try {
      Object res = javonetHandle.invoke("Generate", type, resolver);
      if (res == null) return null;
      return new JsonSchema((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public JsonSchema Generate(jio.System.Type type, java.lang.Boolean rootSchemaNullable) {
    try {
      Object res = javonetHandle.invoke("Generate", type, rootSchemaNullable);
      if (res == null) return null;
      return new JsonSchema((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public JsonSchema Generate(
      jio.System.Type type, JsonSchemaResolver resolver, java.lang.Boolean rootSchemaNullable) {
    try {
      Object res = javonetHandle.invoke("Generate", type, resolver, rootSchemaNullable);
      if (res == null) return null;
      return new JsonSchema((NObject) res);
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
