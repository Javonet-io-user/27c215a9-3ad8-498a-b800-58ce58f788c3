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
import jio.System.Reflection.*;

public class DefaultContractResolver implements IContractResolver {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getDynamicCodeGeneration() {
    try {
      java.lang.Boolean res = javonetHandle.get("DynamicCodeGeneration");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultMembersSearchFlags(BindingFlags value) {
    try {
      javonetHandle.set("DefaultMembersSearchFlags", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public BindingFlags getDefaultMembersSearchFlags() {
    try {
      Object res = javonetHandle.<NEnum>get("DefaultMembersSearchFlags");
      if (res == null) return null;
      return BindingFlags.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSerializeCompilerGeneratedMembers(java.lang.Boolean value) {
    try {
      javonetHandle.set("SerializeCompilerGeneratedMembers", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSerializeCompilerGeneratedMembers() {
    try {
      java.lang.Boolean res = javonetHandle.get("SerializeCompilerGeneratedMembers");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIgnoreSerializableInterface(java.lang.Boolean value) {
    try {
      javonetHandle.set("IgnoreSerializableInterface", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIgnoreSerializableInterface() {
    try {
      java.lang.Boolean res = javonetHandle.get("IgnoreSerializableInterface");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIgnoreSerializableAttribute(java.lang.Boolean value) {
    try {
      javonetHandle.set("IgnoreSerializableAttribute", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIgnoreSerializableAttribute() {
    try {
      java.lang.Boolean res = javonetHandle.get("IgnoreSerializableAttribute");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIgnoreIsSpecifiedMembers(java.lang.Boolean value) {
    try {
      javonetHandle.set("IgnoreIsSpecifiedMembers", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIgnoreIsSpecifiedMembers() {
    try {
      java.lang.Boolean res = javonetHandle.get("IgnoreIsSpecifiedMembers");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIgnoreShouldSerializeMembers(java.lang.Boolean value) {
    try {
      javonetHandle.set("IgnoreShouldSerializeMembers", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIgnoreShouldSerializeMembers() {
    try {
      java.lang.Boolean res = javonetHandle.get("IgnoreShouldSerializeMembers");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNamingStrategy(NamingStrategy value) {
    try {
      javonetHandle.set("NamingStrategy", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public NamingStrategy getNamingStrategy() {
    try {
      Object res = javonetHandle.<NObject>get("NamingStrategy");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public DefaultContractResolver() {
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Serialization.DefaultContractResolver");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DefaultContractResolver(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public JsonContract ResolveContract(jio.System.Type type) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Newtonsoft.Json.Serialization.IContractResolver")
              .invoke("ResolveContract", type);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetResolvedPropertyName(java.lang.String propertyName) {
    try {
      java.lang.String res = javonetHandle.invoke("GetResolvedPropertyName", propertyName);
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
