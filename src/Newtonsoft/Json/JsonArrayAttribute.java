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

public class JsonArrayAttribute extends JsonContainerAttribute implements _Attribute {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setAllowNullItems(java.lang.Boolean value) {
    try {
      javonetHandle.set("AllowNullItems", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAllowNullItems() {
    try {
      java.lang.Boolean res = javonetHandle.get("AllowNullItems");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public JsonArrayAttribute() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.JsonArrayAttribute");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JsonArrayAttribute(java.lang.Boolean allowNullItems) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.JsonArrayAttribute", allowNullItems);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JsonArrayAttribute(java.lang.String id) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.JsonArrayAttribute", id);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JsonArrayAttribute(NObject handle) {
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
