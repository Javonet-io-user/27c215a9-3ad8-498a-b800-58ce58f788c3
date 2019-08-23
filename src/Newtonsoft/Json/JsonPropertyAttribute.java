package Newtonsoft.Json;

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
import jio.System.*;
import Newtonsoft.Json.*;
import jio.System.Runtime.InteropServices.*;

public class JsonPropertyAttribute extends Attribute implements _Attribute {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setItemConverterType(jio.System.Type value) {
    try {
      javonetHandle.set("ItemConverterType", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Type getItemConverterType() {
    try {
      Object res = javonetHandle.<NObject>get("ItemConverterType");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setItemConverterParameters(Object[] value) {
    try {
      javonetHandle.set("ItemConverterParameters", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Object[] getItemConverterParameters(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("ItemConverterParameters");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNamingStrategyType(jio.System.Type value) {
    try {
      javonetHandle.set("NamingStrategyType", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Type getNamingStrategyType() {
    try {
      Object res = javonetHandle.<NObject>get("NamingStrategyType");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNamingStrategyParameters(Object[] value) {
    try {
      javonetHandle.set("NamingStrategyParameters", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Object[] getNamingStrategyParameters(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("NamingStrategyParameters");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNullValueHandling(NullValueHandling value) {
    try {
      javonetHandle.set("NullValueHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public NullValueHandling getNullValueHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("NullValueHandling");
      if (res == null) return null;
      return NullValueHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultValueHandling(DefaultValueHandling value) {
    try {
      javonetHandle.set("DefaultValueHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DefaultValueHandling getDefaultValueHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("DefaultValueHandling");
      if (res == null) return null;
      return DefaultValueHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setReferenceLoopHandling(ReferenceLoopHandling value) {
    try {
      javonetHandle.set("ReferenceLoopHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ReferenceLoopHandling getReferenceLoopHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("ReferenceLoopHandling");
      if (res == null) return null;
      return ReferenceLoopHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setObjectCreationHandling(ObjectCreationHandling value) {
    try {
      javonetHandle.set("ObjectCreationHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ObjectCreationHandling getObjectCreationHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("ObjectCreationHandling");
      if (res == null) return null;
      return ObjectCreationHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTypeNameHandling(TypeNameHandling value) {
    try {
      javonetHandle.set("TypeNameHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TypeNameHandling getTypeNameHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("TypeNameHandling");
      if (res == null) return null;
      return TypeNameHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIsReference(java.lang.Boolean value) {
    try {
      javonetHandle.set("IsReference", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsReference() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsReference");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setOrder(java.lang.Integer value) {
    try {
      javonetHandle.set("Order", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getOrder() {
    try {
      java.lang.Integer res = javonetHandle.get("Order");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
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
  public void setItemReferenceLoopHandling(ReferenceLoopHandling value) {
    try {
      javonetHandle.set("ItemReferenceLoopHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ReferenceLoopHandling getItemReferenceLoopHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("ItemReferenceLoopHandling");
      if (res == null) return null;
      return ReferenceLoopHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setItemTypeNameHandling(TypeNameHandling value) {
    try {
      javonetHandle.set("ItemTypeNameHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TypeNameHandling getItemTypeNameHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("ItemTypeNameHandling");
      if (res == null) return null;
      return TypeNameHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setItemIsReference(java.lang.Boolean value) {
    try {
      javonetHandle.set("ItemIsReference", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getItemIsReference() {
    try {
      java.lang.Boolean res = javonetHandle.get("ItemIsReference");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public JsonPropertyAttribute() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.JsonPropertyAttribute");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JsonPropertyAttribute(java.lang.String propertyName) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.JsonPropertyAttribute", propertyName);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JsonPropertyAttribute(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
