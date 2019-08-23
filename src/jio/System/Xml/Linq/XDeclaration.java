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

public class XDeclaration {
  public NObject javonetHandle;

  public XDeclaration(
      java.lang.String version, java.lang.String encoding, java.lang.String standalone) {
    try {
      javonetHandle = Javonet.New("System.Xml.Linq.XDeclaration", version, encoding, standalone);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XDeclaration(XDeclaration other) {
    try {
      javonetHandle = Javonet.New("System.Xml.Linq.XDeclaration", other);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XDeclaration(NObject handle) {
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
