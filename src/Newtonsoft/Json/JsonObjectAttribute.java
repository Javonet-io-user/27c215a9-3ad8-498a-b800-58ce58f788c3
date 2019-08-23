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
import Newtonsoft.Json.*;
import jio.System.Runtime.InteropServices.*;

public class JsonObjectAttribute extends JsonContainerAttribute implements _Attribute {
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
  public void setMissingMemberHandling(MissingMemberHandling value) {
    try {
      javonetHandle.set("MissingMemberHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public MissingMemberHandling getMissingMemberHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("MissingMemberHandling");
      if (res == null) return null;
      return MissingMemberHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setItemNullValueHandling(NullValueHandling value) {
    try {
      javonetHandle.set("ItemNullValueHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public NullValueHandling getItemNullValueHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("ItemNullValueHandling");
      if (res == null) return null;
      return NullValueHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setItemRequired(Required value) {
    try {
      javonetHandle.set("ItemRequired", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Required getItemRequired() {
    try {
      Object res = javonetHandle.<NEnum>get("ItemRequired");
      if (res == null) return null;
      return Required.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public JsonObjectAttribute() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.JsonObjectAttribute");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JsonObjectAttribute(MemberSerialization memberSerialization) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Newtonsoft.Json.JsonObjectAttribute", NEnum.fromJavaEnum(memberSerialization));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JsonObjectAttribute(java.lang.String id) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.JsonObjectAttribute", id);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JsonObjectAttribute(NObject handle) {
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
