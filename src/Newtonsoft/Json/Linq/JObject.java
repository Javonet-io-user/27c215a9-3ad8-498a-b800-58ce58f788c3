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
import jio.System.Collections.Generic.*;
import jio.System.*;
import Newtonsoft.Json.*;
import jio.System.Collections.*;
import jio.System.Dynamic.*;
import jio.System.ComponentModel.*;
import jio.System.Collections.Specialized.*;

public class JObject extends JContainer
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
        jio.System.Collections.Generic.IDictionary<java.lang.String, JToken>,
        INotifyPropertyChanged,
        ICustomTypeDescriptor,
        INotifyPropertyChanging,
        Iterable<JToken> {
  protected NObject javonetHandle;

  @Override
  public Iterator<JToken> iterator() {
    return (Iterator<JToken>) this.GetEnumerator();
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public JTokenType getTypeAsJObject() {
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
  public void setItemAsJObject(Object key, JToken value) {
    try {
      javonetHandle.invoke("set_Item", key, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "Method")
  public JToken getItemAsJObject(Object key) {
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
  public void setItemAsJObject(java.lang.String propertyName, JToken value) {
    try {
      javonetHandle.invoke("set_Item", propertyName, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "Method")
  public JToken getItemAsJObject(java.lang.String propertyName) {
    try {
      Object res = javonetHandle.invoke("get_Item", propertyName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public JObject() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JObject");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "PropertyChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PropertyChangedEventHandler handler : _PropertyChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PropertyChangedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PropertyChanging",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PropertyChangingEventHandler handler : _PropertyChangingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PropertyChangingEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JObject(JObject other) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JObject", other);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "PropertyChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PropertyChangedEventHandler handler : _PropertyChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PropertyChangedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PropertyChanging",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PropertyChangingEventHandler handler : _PropertyChangingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PropertyChangingEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JObject(Object[] content) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JObject", new Object[] {content});
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "PropertyChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PropertyChangedEventHandler handler : _PropertyChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PropertyChangedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PropertyChanging",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PropertyChangingEventHandler handler : _PropertyChangingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PropertyChangingEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JObject(Object content) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JObject", content);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "PropertyChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PropertyChangedEventHandler handler : _PropertyChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PropertyChangedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PropertyChanging",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PropertyChangingEventHandler handler : _PropertyChangingListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PropertyChangingEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JObject(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public jio.System.Collections.Generic.IEnumerable<JProperty> Properties() {
    try {
      Object res = javonetHandle.invoke("Properties");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public JProperty Property(java.lang.String name) {
    try {
      Object res = javonetHandle.invoke("Property", name);
      if (res == null) return null;
      return new JProperty((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public JProperty Property(java.lang.String name, StringComparison comparison) {
    try {
      Object res = javonetHandle.invoke("Property", name, NEnum.fromJavaEnum(comparison));
      if (res == null) return null;
      return new JProperty((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public JEnumerable<JToken> PropertyValues() {
    try {
      Object res = javonetHandle.invoke("PropertyValues");
      if (res == null) return null;
      return new JEnumerable<JToken>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static JObject Load(JsonReader reader) {
    try {
      Object res = Javonet.getType("Newtonsoft.Json.Linq.JObject").invoke("Load", reader);
      if (res == null) return null;
      return new JObject((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static JObject Load(JsonReader reader, JsonLoadSettings settings) {
    try {
      Object res = Javonet.getType("Newtonsoft.Json.Linq.JObject").invoke("Load", reader, settings);
      if (res == null) return null;
      return new JObject((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static JObject Parse(java.lang.String json) {
    try {
      Object res = Javonet.getType("Newtonsoft.Json.Linq.JObject").invoke("Parse", json);
      if (res == null) return null;
      return new JObject((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static JObject Parse(java.lang.String json, JsonLoadSettings settings) {
    try {
      Object res = Javonet.getType("Newtonsoft.Json.Linq.JObject").invoke("Parse", json, settings);
      if (res == null) return null;
      return new JObject((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static JObject FromObject(Object o) {
    try {
      Object res = Javonet.getType("Newtonsoft.Json.Linq.JObject").invoke("FromObject", o);
      if (res == null) return null;
      return new JObject((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static JObject FromObject(Object o, JsonSerializer jsonSerializer) {
    try {
      Object res =
          Javonet.getType("Newtonsoft.Json.Linq.JObject").invoke("FromObject", o, jsonSerializer);
      if (res == null) return null;
      return new JObject((NObject) res);
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
  public JToken GetValue(java.lang.String propertyName) {
    try {
      Object res = javonetHandle.invoke("GetValue", propertyName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public JToken GetValue(java.lang.String propertyName, StringComparison comparison) {
    try {
      Object res = javonetHandle.invoke("GetValue", propertyName, NEnum.fromJavaEnum(comparison));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean TryGetValue(
      java.lang.String propertyName, StringComparison comparison, JToken value) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke("TryGetValue", propertyName, NEnum.fromJavaEnum(comparison), value);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(java.lang.String propertyName, JToken value) {
    try {
      javonetHandle.invoke("Add", propertyName, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ContainsKey(java.lang.String propertyName) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("ContainsKey", propertyName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Remove(java.lang.String propertyName) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Remove", propertyName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean TryGetValue(java.lang.String propertyName, JToken value) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("TryGetValue", propertyName, value);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Collections.Generic.ICollection<java.lang.String> getKeys() {
    try {
      Object res = javonetHandle.<NObject>get("Keys");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Collections.Generic.ICollection<JToken> getValues() {
    try {
      Object res = javonetHandle.<NObject>get("Values");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

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
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(KeyValuePair<java.lang.String, JToken> item) {
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
  public java.lang.Boolean Contains(KeyValuePair<java.lang.String, JToken> item) {
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
  public void CopyTo(KeyValuePair[] array, java.lang.Integer arrayIndex) {
    try {
      javonetHandle.invoke("CopyTo", new Object[] {array}, arrayIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Remove(KeyValuePair<java.lang.String, JToken> item) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Remove", item);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AttributeCollection GetAttributes() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetAttributes");
      if (res == null) return null;
      return new AttributeCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetClassName() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetClassName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetComponentName() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetComponentName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TypeConverter GetConverter() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetConverter");
      if (res == null) return null;
      return new TypeConverter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public EventDescriptor GetDefaultEvent() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetDefaultEvent");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public PropertyDescriptor GetDefaultProperty() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetDefaultProperty");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object GetEditor(jio.System.Type editorBaseType) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetEditor", editorBaseType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public EventDescriptorCollection GetEvents() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetEvents");
      if (res == null) return null;
      return new EventDescriptorCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public EventDescriptorCollection GetEvents(Attribute[] attributes) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetEvents", new Object[] {attributes});
      if (res == null) return null;
      return new EventDescriptorCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public PropertyDescriptorCollection GetProperties() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetProperties");
      if (res == null) return null;
      return new PropertyDescriptorCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public PropertyDescriptorCollection GetProperties(Attribute[] attributes) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetProperties", new Object[] {attributes});
      if (res == null) return null;
      return new PropertyDescriptorCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object GetPropertyOwner(PropertyDescriptor pd) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.ICustomTypeDescriptor")
              .invoke("GetPropertyOwner", pd);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Event */

  private java.util.ArrayList<PropertyChangedEventHandler> _PropertyChangedListeners =
      new java.util.ArrayList<PropertyChangedEventHandler>();

  public void addPropertyChanged(PropertyChangedEventHandler toAdd) {
    _PropertyChangedListeners.add(toAdd);
  }

  public void removePropertyChanged(PropertyChangedEventHandler toRemove) {
    _PropertyChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<PropertyChangingEventHandler> _PropertyChangingListeners =
      new java.util.ArrayList<PropertyChangingEventHandler>();

  public void addPropertyChanging(PropertyChangingEventHandler toAdd) {
    _PropertyChangingListeners.add(toAdd);
  }

  public void removePropertyChanging(PropertyChangingEventHandler toRemove) {
    _PropertyChangingListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
