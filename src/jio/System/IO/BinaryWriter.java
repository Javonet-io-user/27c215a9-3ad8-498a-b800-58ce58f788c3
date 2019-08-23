package jio.System.IO;

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
import jio.System.IO.*;
import jio.System.Text.*;
import jio.System.*;

public class BinaryWriter implements IDisposable {
  protected NObject javonetHandle;

  public BinaryWriter(Stream output) {
    try {
      javonetHandle = Javonet.New("System.IO.BinaryWriter", output);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BinaryWriter(Stream output, Encoding encoding) {
    try {
      javonetHandle = Javonet.New("System.IO.BinaryWriter", output, encoding);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BinaryWriter(Stream output, Encoding encoding, java.lang.Boolean leaveOpen) {
    try {
      javonetHandle = Javonet.New("System.IO.BinaryWriter", output, encoding, leaveOpen);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BinaryWriter(NObject handle) {
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
