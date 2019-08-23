package Sphere.Shared.Core;

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
import Sphere.Shared.Core.*;
import jio.System.Text.*;

public class SerializableObject<T> implements ISerializableObject {
  protected NObject javonetHandle;
  /** GenericConstructor */
  @MethodTypeAnnotation(type = "GetField")
  public SerializableObject(Class<?> T) {
    try {
      javonetHandle =
          Javonet.getType("Sphere.Shared.Core.SerializableObject`1", getReturnObjectName(T))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SerializableObject(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> T Deserialize(java.lang.Byte[] content, Class<?> returnType) {
    try {
      Object res =
          Javonet.getType("Sphere.Shared.Core.SerializableObject`1")
              .invoke("Deserialize", new Object[] {content});
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Byte[] Serialize(Encoding encoding, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Sphere.Shared.Core.ISerializableObject")
              .invoke("Serialize", encoding);
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String SerializeToString() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Sphere.Shared.Core.ISerializableObject")
              .invoke("SerializeToString");
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
