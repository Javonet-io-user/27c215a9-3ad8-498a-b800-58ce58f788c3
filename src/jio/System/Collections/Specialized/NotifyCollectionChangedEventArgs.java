package jio.System.Collections.Specialized;

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
import jio.System.Collections.Specialized.*;
import jio.System.Collections.*;

public class NotifyCollectionChangedEventArgs extends EventArgs {
  public NObject javonetHandle;

  public NotifyCollectionChangedEventArgs(NotifyCollectionChangedAction action) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Collections.Specialized.NotifyCollectionChangedEventArgs",
              NEnum.fromJavaEnum(action));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NotifyCollectionChangedEventArgs(
      NotifyCollectionChangedAction action, Object changedItem) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Collections.Specialized.NotifyCollectionChangedEventArgs",
              NEnum.fromJavaEnum(action),
              changedItem);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NotifyCollectionChangedEventArgs(
      NotifyCollectionChangedAction action, Object changedItem, java.lang.Integer index) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Collections.Specialized.NotifyCollectionChangedEventArgs",
              NEnum.fromJavaEnum(action),
              changedItem,
              index);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NotifyCollectionChangedEventArgs(
      NotifyCollectionChangedAction action, IList changedItems) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Collections.Specialized.NotifyCollectionChangedEventArgs",
              NEnum.fromJavaEnum(action),
              changedItems);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NotifyCollectionChangedEventArgs(
      NotifyCollectionChangedAction action, IList changedItems, java.lang.Integer startingIndex) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Collections.Specialized.NotifyCollectionChangedEventArgs",
              NEnum.fromJavaEnum(action),
              changedItems,
              startingIndex);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NotifyCollectionChangedEventArgs(
      NotifyCollectionChangedAction action, Object newItem, Object oldItem) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Collections.Specialized.NotifyCollectionChangedEventArgs",
              NEnum.fromJavaEnum(action),
              newItem,
              oldItem);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NotifyCollectionChangedEventArgs(
      NotifyCollectionChangedAction action,
      Object newItem,
      Object oldItem,
      java.lang.Integer index) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Collections.Specialized.NotifyCollectionChangedEventArgs",
              NEnum.fromJavaEnum(action),
              newItem,
              oldItem,
              index);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NotifyCollectionChangedEventArgs(
      NotifyCollectionChangedAction action, IList newItems, IList oldItems) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Collections.Specialized.NotifyCollectionChangedEventArgs",
              NEnum.fromJavaEnum(action),
              newItems,
              oldItems);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NotifyCollectionChangedEventArgs(
      NotifyCollectionChangedAction action,
      IList newItems,
      IList oldItems,
      java.lang.Integer startingIndex) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Collections.Specialized.NotifyCollectionChangedEventArgs",
              NEnum.fromJavaEnum(action),
              newItems,
              oldItems,
              startingIndex);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NotifyCollectionChangedEventArgs(
      NotifyCollectionChangedAction action,
      Object changedItem,
      java.lang.Integer index,
      java.lang.Integer oldIndex) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Collections.Specialized.NotifyCollectionChangedEventArgs",
              NEnum.fromJavaEnum(action),
              changedItem,
              index,
              oldIndex);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NotifyCollectionChangedEventArgs(
      NotifyCollectionChangedAction action,
      IList changedItems,
      java.lang.Integer index,
      java.lang.Integer oldIndex) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Collections.Specialized.NotifyCollectionChangedEventArgs",
              NEnum.fromJavaEnum(action),
              changedItems,
              index,
              oldIndex);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NotifyCollectionChangedEventArgs(NObject handle) {
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
