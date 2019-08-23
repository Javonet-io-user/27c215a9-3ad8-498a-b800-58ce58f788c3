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
import Newtonsoft.Json.*;

public class JsonProperty {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setPropertyName(java.lang.String value) {
    try {
      javonetHandle.set("PropertyName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getPropertyName() {
    try {
      java.lang.String res = javonetHandle.get("PropertyName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDeclaringType(jio.System.Type value) {
    try {
      javonetHandle.set("DeclaringType", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Type getDeclaringType() {
    try {
      Object res = javonetHandle.<NObject>get("DeclaringType");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setOrder(Nullable<java.lang.Integer> value) {
    try {
      javonetHandle.set("Order", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Integer> getOrder() {
    try {
      Object res = javonetHandle.<NObject>get("Order");
      if (res == null) return null;
      return new Nullable<java.lang.Integer>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUnderlyingName(java.lang.String value) {
    try {
      javonetHandle.set("UnderlyingName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getUnderlyingName() {
    try {
      java.lang.String res = javonetHandle.get("UnderlyingName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setValueProvider(IValueProvider value) {
    try {
      javonetHandle.set("ValueProvider", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IValueProvider getValueProvider() {
    try {
      Object res = javonetHandle.<NObject>get("ValueProvider");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAttributeProvider(IAttributeProvider value) {
    try {
      javonetHandle.set("AttributeProvider", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IAttributeProvider getAttributeProvider() {
    try {
      Object res = javonetHandle.<NObject>get("AttributeProvider");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPropertyType(jio.System.Type value) {
    try {
      javonetHandle.set("PropertyType", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Type getPropertyType() {
    try {
      Object res = javonetHandle.<NObject>get("PropertyType");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setConverter(JsonConverter value) {
    try {
      javonetHandle.set("Converter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public JsonConverter getConverter() {
    try {
      Object res = javonetHandle.<NObject>get("Converter");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMemberConverter(JsonConverter value) {
    try {
      javonetHandle.set("MemberConverter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public JsonConverter getMemberConverter() {
    try {
      Object res = javonetHandle.<NObject>get("MemberConverter");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIgnored(java.lang.Boolean value) {
    try {
      javonetHandle.set("Ignored", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIgnored() {
    try {
      java.lang.Boolean res = javonetHandle.get("Ignored");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setReadable(java.lang.Boolean value) {
    try {
      javonetHandle.set("Readable", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getReadable() {
    try {
      java.lang.Boolean res = javonetHandle.get("Readable");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setWritable(java.lang.Boolean value) {
    try {
      javonetHandle.set("Writable", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getWritable() {
    try {
      java.lang.Boolean res = javonetHandle.get("Writable");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setHasMemberAttribute(java.lang.Boolean value) {
    try {
      javonetHandle.set("HasMemberAttribute", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getHasMemberAttribute() {
    try {
      java.lang.Boolean res = javonetHandle.get("HasMemberAttribute");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultValue(Object value) {
    try {
      javonetHandle.set("DefaultValue", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Object getDefaultValue() {
    try {
      Object res = javonetHandle.<NObject>get("DefaultValue");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRequired(Required value) {
    try {
      javonetHandle.set("Required", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Required getRequired() {
    try {
      Object res = javonetHandle.<NEnum>get("Required");
      if (res == null) return null;
      return Required.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsRequiredSpecified() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsRequiredSpecified");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIsReference(Nullable<java.lang.Boolean> value) {
    try {
      javonetHandle.set("IsReference", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Boolean> getIsReference() {
    try {
      Object res = javonetHandle.<NObject>get("IsReference");
      if (res == null) return null;
      return new Nullable<java.lang.Boolean>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNullValueHandling(Nullable<NullValueHandling> value) {
    try {
      javonetHandle.set("NullValueHandling", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<NullValueHandling> getNullValueHandling() {
    try {
      Object res = javonetHandle.<NObject>get("NullValueHandling");
      if (res == null) return null;
      return new Nullable<NullValueHandling>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultValueHandling(Nullable<DefaultValueHandling> value) {
    try {
      javonetHandle.set("DefaultValueHandling", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DefaultValueHandling> getDefaultValueHandling() {
    try {
      Object res = javonetHandle.<NObject>get("DefaultValueHandling");
      if (res == null) return null;
      return new Nullable<DefaultValueHandling>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setReferenceLoopHandling(Nullable<ReferenceLoopHandling> value) {
    try {
      javonetHandle.set("ReferenceLoopHandling", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<ReferenceLoopHandling> getReferenceLoopHandling() {
    try {
      Object res = javonetHandle.<NObject>get("ReferenceLoopHandling");
      if (res == null) return null;
      return new Nullable<ReferenceLoopHandling>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setObjectCreationHandling(Nullable<ObjectCreationHandling> value) {
    try {
      javonetHandle.set("ObjectCreationHandling", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<ObjectCreationHandling> getObjectCreationHandling() {
    try {
      Object res = javonetHandle.<NObject>get("ObjectCreationHandling");
      if (res == null) return null;
      return new Nullable<ObjectCreationHandling>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTypeNameHandling(Nullable<TypeNameHandling> value) {
    try {
      javonetHandle.set("TypeNameHandling", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<TypeNameHandling> getTypeNameHandling() {
    try {
      Object res = javonetHandle.<NObject>get("TypeNameHandling");
      if (res == null) return null;
      return new Nullable<TypeNameHandling>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setShouldSerialize(Predicate<Object> value) {
    try {
      javonetHandle.set("ShouldSerialize", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Predicate<Object> getShouldSerialize() {
    try {
      Object res = javonetHandle.<NObject>get("ShouldSerialize");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setShouldDeserialize(Predicate<Object> value) {
    try {
      javonetHandle.set("ShouldDeserialize", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Predicate<Object> getShouldDeserialize() {
    try {
      Object res = javonetHandle.<NObject>get("ShouldDeserialize");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setGetIsSpecified(Predicate<Object> value) {
    try {
      javonetHandle.set("GetIsSpecified", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Predicate<Object> getGetIsSpecified() {
    try {
      Object res = javonetHandle.<NObject>get("GetIsSpecified");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSetIsSpecified(ActionT1T2<Object, Object> value) {
    try {
      javonetHandle.set("SetIsSpecified", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ActionT1T2<Object, Object> getSetIsSpecified() {
    try {
      Object res = javonetHandle.<NObject>get("SetIsSpecified");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setItemConverter(JsonConverter value) {
    try {
      javonetHandle.set("ItemConverter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public JsonConverter getItemConverter() {
    try {
      Object res = javonetHandle.<NObject>get("ItemConverter");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setItemIsReference(Nullable<java.lang.Boolean> value) {
    try {
      javonetHandle.set("ItemIsReference", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Boolean> getItemIsReference() {
    try {
      Object res = javonetHandle.<NObject>get("ItemIsReference");
      if (res == null) return null;
      return new Nullable<java.lang.Boolean>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setItemTypeNameHandling(Nullable<TypeNameHandling> value) {
    try {
      javonetHandle.set("ItemTypeNameHandling", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<TypeNameHandling> getItemTypeNameHandling() {
    try {
      Object res = javonetHandle.<NObject>get("ItemTypeNameHandling");
      if (res == null) return null;
      return new Nullable<TypeNameHandling>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setItemReferenceLoopHandling(Nullable<ReferenceLoopHandling> value) {
    try {
      javonetHandle.set("ItemReferenceLoopHandling", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<ReferenceLoopHandling> getItemReferenceLoopHandling() {
    try {
      Object res = javonetHandle.<NObject>get("ItemReferenceLoopHandling");
      if (res == null) return null;
      return new Nullable<ReferenceLoopHandling>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public JsonProperty() {
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Serialization.JsonProperty");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JsonProperty(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ToString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
