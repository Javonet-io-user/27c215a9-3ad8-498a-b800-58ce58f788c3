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
import jio.System.Collections.Generic.*;

public class JsonSchemaResolver {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public IList<JsonSchema> getLoadedSchemas() {
    try {
      Object res = javonetHandle.<NObject>get("LoadedSchemas");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public JsonSchemaResolver() {
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Schema.JsonSchemaResolver");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JsonSchemaResolver(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public JsonSchema GetSchema(java.lang.String reference) {
    try {
      Object res = javonetHandle.invoke("GetSchema", reference);
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
