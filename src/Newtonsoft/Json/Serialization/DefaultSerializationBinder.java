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
import jio.System.Runtime.Serialization.*;
import Newtonsoft.Json.Serialization.*;
import jio.System.*;

public class DefaultSerializationBinder extends SerializationBinder
    implements ISerializationBinder {
  protected NObject javonetHandle;

  public DefaultSerializationBinder() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Serialization.DefaultSerializationBinder");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DefaultSerializationBinder(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public jio.System.Type BindToType(java.lang.String assemblyName, java.lang.String typeName) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Newtonsoft.Json.Serialization.ISerializationBinder")
              .invoke("BindToType", assemblyName, typeName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BindToName(
      jio.System.Type serializedType,
      AtomicReference<java.lang.String> assemblyName,
      AtomicReference<java.lang.String> typeName) {
    try {
      javonetHandle
          .explicitInterface("Newtonsoft.Json.Serialization.ISerializationBinder")
          .invoke(
              "BindToName",
              serializedType,
              new NOut(assemblyName, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
              new NOut(typeName, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
