package jio.System.Xml.Linq;

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
import jio.System.Xml.Linq.*;
import jio.System.*;
import jio.System.Xml.*;

public class XDocument extends XContainer implements IXmlLineInfo {
  protected NObject javonetHandle;

  public XDocument() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Xml.Linq.XDocument");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XDocument(Object[] content) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Xml.Linq.XDocument", new Object[] {content});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XDocument(XDeclaration declaration, Object[] content) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Xml.Linq.XDocument", declaration, new Object[] {content});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XDocument(XDocument other) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Xml.Linq.XDocument", other);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XDocument(NObject handle) {
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
