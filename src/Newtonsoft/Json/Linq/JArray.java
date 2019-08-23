package Newtonsoft.Json.Linq;

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
import Newtonsoft.Json.Linq.*;
import Newtonsoft.Json.*;
import jio.System.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;
import jio.System.Dynamic.*;
import jio.System.ComponentModel.*;
import jio.System.Collections.Specialized.*;

public class JArray extends JContainer
    implements IJEnumerable<JToken>,
        jio.System.Collections.Generic.IEnumerable<JToken>,
        jio.System.Collections.IEnumerable,
        IJsonLineInfo,
        ICloneable,
        IDynamicMetaObjectProvider,
        jio.System.Collections.Generic.IList<JToken>,
        jio.System.Collections.Generic.ICollection<JToken>,
        ITypedList,
        IBindingList,
        jio.System.Collections.IList,
        jio.System.Collections.ICollection,
        INotifyCollectionChanged,
        Iterable<JToken> {
  protected NObject javonetHandle;

  @Override
  public Iterator<JToken> iterator() {
    return (Iterator<JToken>) this.GetEnumerator();
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public JTokenType getTypeAsJArray() {
    try {
      Object res = javonetHandle.<NEnum>get("Type");
      if (res == null) return null;
      return JTokenType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "Method")
  public void setItemAsJArray(Object key, JToken value) {
    try {
      javonetHandle.invoke("set_Item", key, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "Method")
  public JToken getItemAsJArray(Object key) {
    try {
      Object res = javonetHandle.invoke("get_Item", key);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "Method")
  public void setItemAsJArray(java.lang.Integer index, JToken value) {
    try {
      javonetHandle.invoke("set_Item", index, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "Method")
  public JToken getItemAsJArray(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("get_Item", index);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsReadOnly() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsReadOnly");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public JArray() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JArray");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JArray(JArray other) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JArray", other);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JArray(Object[] content) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JArray", new Object[] {content});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JArray(Object content) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JArray", content);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JArray(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static JArray Load(JsonReader reader) {
    try {
      Object res = Javonet.getType("Newtonsoft.Json.Linq.JArray").invoke("Load", reader);
      if (res == null) return null;
      return new JArray((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static JArray Load(JsonReader reader, JsonLoadSettings settings) {
    try {
      Object res = Javonet.getType("Newtonsoft.Json.Linq.JArray").invoke("Load", reader, settings);
      if (res == null) return null;
      return new JArray((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static JArray Parse(java.lang.String json) {
    try {
      Object res = Javonet.getType("Newtonsoft.Json.Linq.JArray").invoke("Parse", json);
      if (res == null) return null;
      return new JArray((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static JArray Parse(java.lang.String json, JsonLoadSettings settings) {
    try {
      Object res = Javonet.getType("Newtonsoft.Json.Linq.JArray").invoke("Parse", json, settings);
      if (res == null) return null;
      return new JArray((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static JArray FromObject(Object o) {
    try {
      Object res = Javonet.getType("Newtonsoft.Json.Linq.JArray").invoke("FromObject", o);
      if (res == null) return null;
      return new JArray((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static JArray FromObject(Object o, JsonSerializer jsonSerializer) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.Linq.JArray").invoke("FromObject", o, jsonSerializer);
      if (res == null) return null;
      return new JArray((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void WriteTo(JsonWriter writer, JsonConverter[] converters) {
    try {
      javonetHandle.invoke("WriteTo", writer, new Object[] {converters});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer IndexOf(JToken item) {
    try {
      java.lang.Integer res = javonetHandle.invoke("IndexOf", item);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Insert(java.lang.Integer index, JToken item) {
    try {
      javonetHandle.invoke("Insert", index, item);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RemoveAt(java.lang.Integer index) {
    try {
      javonetHandle.invoke("RemoveAt", index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public jio.System.Collections.Generic.IEnumerator<Object> GetEnumerator() {
    try {
      Object res = javonetHandle.invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(JToken item) {
    try {
      javonetHandle.invoke("Add", item);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Clear() {
    try {
      javonetHandle.invoke("Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Contains(JToken item) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Contains", item);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CopyTo(JToken[] array, java.lang.Integer arrayIndex) {
    try {
      javonetHandle.invoke("CopyTo", new Object[] {array}, arrayIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Remove(JToken item) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Remove", item);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
