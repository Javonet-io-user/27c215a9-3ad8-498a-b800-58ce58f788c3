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

public class JConstructor extends JContainer
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
        INotifyCollectionChanged {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setName(java.lang.String value) {
    try {
      javonetHandle.set("Name", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getName() {
    try {
      java.lang.String res = javonetHandle.get("Name");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public JTokenType getTypeAsJConstructor() {
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
  public void setItemAsJConstructor(Object key, JToken value) {
    try {
      javonetHandle.invoke("set_Item", key, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "Method")
  public JToken getItemAsJConstructor(Object key) {
    try {
      Object res = javonetHandle.invoke("get_Item", key);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public JConstructor() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JConstructor");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JConstructor(JConstructor other) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JConstructor", other);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JConstructor(java.lang.String name, Object[] content) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Newtonsoft.Json.Linq.JConstructor", name, new Object[] {content});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JConstructor(java.lang.String name, Object content) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JConstructor", name, content);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JConstructor(java.lang.String name) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JConstructor", name);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JConstructor(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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
  public static JConstructor Load(JsonReader reader) {
    try {
      Object res = Javonet.getType("Newtonsoft.Json.Linq.JConstructor").invoke("Load", reader);
      if (res == null) return null;
      return new JConstructor((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static JConstructor Load(JsonReader reader, JsonLoadSettings settings) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.Linq.JConstructor").invoke("Load", reader, settings);
      if (res == null) return null;
      return new JConstructor((NObject) res);
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
