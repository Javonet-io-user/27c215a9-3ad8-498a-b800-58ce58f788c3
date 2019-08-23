package jio.System.ComponentModel;

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
import jio.System.ComponentModel.*;

public class ListChangedEventArgs extends EventArgs {
  public NObject javonetHandle;

  public ListChangedEventArgs(ListChangedType listChangedType, java.lang.Integer newIndex) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.ComponentModel.ListChangedEventArgs",
              NEnum.fromJavaEnum(listChangedType),
              newIndex);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListChangedEventArgs(
      ListChangedType listChangedType, java.lang.Integer newIndex, PropertyDescriptor propDesc) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.ComponentModel.ListChangedEventArgs",
              NEnum.fromJavaEnum(listChangedType),
              newIndex,
              propDesc);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListChangedEventArgs(ListChangedType listChangedType, PropertyDescriptor propDesc) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.ComponentModel.ListChangedEventArgs",
              NEnum.fromJavaEnum(listChangedType),
              propDesc);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListChangedEventArgs(
      ListChangedType listChangedType, java.lang.Integer newIndex, java.lang.Integer oldIndex) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.ComponentModel.ListChangedEventArgs",
              NEnum.fromJavaEnum(listChangedType),
              newIndex,
              oldIndex);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListChangedEventArgs(NObject handle) {
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
