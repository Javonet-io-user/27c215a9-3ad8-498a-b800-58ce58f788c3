package Sphere.Shared.Core.Xml;

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
import Sphere.Shared.Core.Xml.*;

public interface IXmlFile extends ISerializableObject {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getAppVersion();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFormatVersion();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public ISigner getSigner();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IXmlDocument getIXmlFile_Document();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getSenderCode();
}
