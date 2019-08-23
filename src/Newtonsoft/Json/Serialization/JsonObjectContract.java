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
import Newtonsoft.Json.*;
import jio.System.*;

public class JsonObjectContract extends JsonContainerContract {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setMemberSerialization(MemberSerialization value) {
    try {
      javonetHandle.set("MemberSerialization", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public MemberSerialization getMemberSerialization() {
    try {
      Object res = javonetHandle.<NEnum>get("MemberSerialization");
      if (res == null) return null;
      return MemberSerialization.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMissingMemberHandling(Nullable<MissingMemberHandling> value) {
    try {
      javonetHandle.set("MissingMemberHandling", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<MissingMemberHandling> getMissingMemberHandling() {
    try {
      Object res = javonetHandle.<NObject>get("MissingMemberHandling");
      if (res == null) return null;
      return new Nullable<MissingMemberHandling>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setItemRequired(Nullable<Required> value) {
    try {
      javonetHandle.set("ItemRequired", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<Required> getItemRequired() {
    try {
      Object res = javonetHandle.<NObject>get("ItemRequired");
      if (res == null) return null;
      return new Nullable<Required>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setItemNullValueHandling(Nullable<NullValueHandling> value) {
    try {
      javonetHandle.set("ItemNullValueHandling", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<NullValueHandling> getItemNullValueHandling() {
    try {
      Object res = javonetHandle.<NObject>get("ItemNullValueHandling");
      if (res == null) return null;
      return new Nullable<NullValueHandling>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public JsonPropertyCollection getProperties() {
    try {
      Object res = javonetHandle.<NObject>get("Properties");
      if (res == null) return null;
      return new JsonPropertyCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public JsonPropertyCollection getCreatorParameters() {
    try {
      Object res = javonetHandle.<NObject>get("CreatorParameters");
      if (res == null) return null;
      return new JsonPropertyCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setOverrideCreator(ObjectConstructor<Object> value) {
    try {
      javonetHandle.set("OverrideCreator", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ObjectConstructor<Object> getOverrideCreator() {
    try {
      Object res = javonetHandle.<NObject>get("OverrideCreator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setExtensionDataSetter(ExtensionDataSetter value) {
    try {
      javonetHandle.set("ExtensionDataSetter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ExtensionDataSetter getExtensionDataSetter() {
    try {
      Object res = javonetHandle.<NObject>get("ExtensionDataSetter");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setExtensionDataGetter(ExtensionDataGetter value) {
    try {
      javonetHandle.set("ExtensionDataGetter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ExtensionDataGetter getExtensionDataGetter() {
    try {
      Object res = javonetHandle.<NObject>get("ExtensionDataGetter");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setExtensionDataValueType(jio.System.Type value) {
    try {
      javonetHandle.set("ExtensionDataValueType", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Type getExtensionDataValueType() {
    try {
      Object res = javonetHandle.<NObject>get("ExtensionDataValueType");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setExtensionDataNameResolver(FuncTTResult<java.lang.String, java.lang.String> value) {
    try {
      javonetHandle.set("ExtensionDataNameResolver", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public FuncTTResult<java.lang.String, java.lang.String> getExtensionDataNameResolver() {
    try {
      Object res = javonetHandle.<NObject>get("ExtensionDataNameResolver");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public JsonObjectContract(jio.System.Type underlyingType) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Newtonsoft.Json.Serialization.JsonObjectContract", underlyingType);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JsonObjectContract(NObject handle) {
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
