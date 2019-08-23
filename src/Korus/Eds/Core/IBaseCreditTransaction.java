package Korus.Eds.Core;

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
import Korus.Eds.Core.*;
import jio.System.*;

public interface IBaseCreditTransaction {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getNumber();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public CreditTransactionStatusType getStatus();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DateTime getDate();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getAmount();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getMetadata();
}
