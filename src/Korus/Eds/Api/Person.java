package Korus.Eds.Api;

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
import Korus.Eds.Api.*;
import Sphere.Shared.Core.*;

public class Person implements IPerson {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setLastName(java.lang.String value) {
    try {
      javonetHandle.set("LastName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getLastName() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Sphere.Shared.Core.IPerson").invoke("get_LastName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFirstName(java.lang.String value) {
    try {
      javonetHandle.set("FirstName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFirstName() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Sphere.Shared.Core.IPerson").invoke("get_FirstName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMiddleName(java.lang.String value) {
    try {
      javonetHandle.set("MiddleName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getMiddleName() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Sphere.Shared.Core.IPerson").invoke("get_MiddleName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public Person() {
    try {
      javonetHandle = Javonet.New("Korus.Eds.Api.Person");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Person(IPerson person) {
    try {
      javonetHandle = Javonet.New("Korus.Eds.Api.Person", person);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Person(
      java.lang.String lastName, java.lang.String firstName, java.lang.String middleName) {
    try {
      javonetHandle = Javonet.New("Korus.Eds.Api.Person", lastName, firstName, middleName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Person(NObject handle) {
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
