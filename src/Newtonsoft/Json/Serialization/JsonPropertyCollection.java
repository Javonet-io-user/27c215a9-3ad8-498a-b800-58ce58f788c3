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
import jio.System.Collections.ObjectModel.*;
import jio.System.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;

public class JsonPropertyCollection extends KeyedCollection<java.lang.String, JsonProperty>
    implements jio.System.Collections.Generic.IList<JsonProperty>,
        jio.System.Collections.Generic.ICollection<JsonProperty>,
        jio.System.Collections.Generic.IEnumerable<JsonProperty>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IList,
        jio.System.Collections.ICollection,
        IReadOnlyList<JsonProperty>,
        IReadOnlyCollection<JsonProperty> {
  protected NObject javonetHandle;

  public JsonPropertyCollection(jio.System.Type type) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Serialization.JsonPropertyCollection", type);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JsonPropertyCollection(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddProperty(JsonProperty property) {
    try {
      javonetHandle.invoke("AddProperty", property);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public JsonProperty GetClosestMatchProperty(java.lang.String propertyName) {
    try {
      Object res = javonetHandle.invoke("GetClosestMatchProperty", propertyName);
      if (res == null) return null;
      return new JsonProperty((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public JsonProperty GetProperty(java.lang.String propertyName, StringComparison comparisonType) {
    try {
      Object res =
          javonetHandle.invoke("GetProperty", propertyName, NEnum.fromJavaEnum(comparisonType));
      if (res == null) return null;
      return new JsonProperty((NObject) res);
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
