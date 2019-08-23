package Korus.Eds.Core.Data;

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
import Korus.Eds.Core.Data.*;
import Korus.Eds.Core.*;
import jio.System.*;
import jio.System.Collections.Generic.*;

public interface IDocumentFilter extends IBaseDocumentFilter, IAttributeListFilter, IPageable {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Long> getClientId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Integer> getDocumentTypeId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public ICollection<java.lang.String> getDocumentNumbers();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFileName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<Participant> getDirection();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<AmountType> getAmountType();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getSumFrom();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getSumTo();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DirectDebitPaymentStatus> getPaymentStatus();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIncludeExportMode();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Boolean> getAvailabilityAvoidanceRequestion();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Boolean> getAvailabilityRejectionAvoidance();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public ICollection<java.lang.Long> getDocumentIds();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsGenerateExceptionByDocumentIds();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsExtractAdditionalData();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Integer> getViewPeriodInMonths();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setClientId(Nullable<java.lang.Long> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setDirection(Nullable<Participant> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setAmountType(Nullable<AmountType> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setSumFrom(Nullable<java.math.BigDecimal> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setSumTo(Nullable<java.math.BigDecimal> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setIncludeExportMode(java.lang.Boolean value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setAvailabilityAvoidanceRequestion(Nullable<java.lang.Boolean> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setAvailabilityRejectionAvoidance(Nullable<java.lang.Boolean> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setDocumentIds(ICollection<java.lang.Long> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setIsGenerateExceptionByDocumentIds(java.lang.Boolean value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setIsExtractAdditionalData(java.lang.Boolean value);
}
