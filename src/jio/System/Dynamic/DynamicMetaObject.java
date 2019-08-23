package jio.System.Dynamic;

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
import jio.System.Dynamic.*;
import jio.System.Linq.Expressions.*;
import jio.System.*;

public class DynamicMetaObject {
  public NObject javonetHandle;

  public DynamicMetaObject(Expression expression, BindingRestrictions restrictions) {
    try {
      javonetHandle = Javonet.New("System.Dynamic.DynamicMetaObject", expression, restrictions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DynamicMetaObject(Expression expression, BindingRestrictions restrictions, Object value) {
    try {
      javonetHandle =
          Javonet.New("System.Dynamic.DynamicMetaObject", expression, restrictions, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DynamicMetaObject(NObject handle) {
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
