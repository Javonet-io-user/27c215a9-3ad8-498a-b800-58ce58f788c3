package Korus.Eds.Core.Search;

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
import Korus.Eds.Core.Search.*;
import Korus.Eds.Core.*;
import jio.System.*;
import jio.System.Collections.Generic.*;

public interface IDocumentSearchResult {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDescription();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTypeCode();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DocumentFormType getFormType();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DocumentStatus getStatus();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getStatusName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DateTime getCreated();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getParticipantName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getParticipantId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getSenderId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getReceiverId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Long> getSenderPackageId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Long> getReceiverPackageId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getTotal();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DateTime getStatusChangeDate();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getNumber();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getSendDate();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getReceiveDate();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getNetSum();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getVatSum();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getTotalSum();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getComment();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getChangeNumber();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DateTime getChangeDate();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getOperationContent();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getInfoFieldData();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IEnumerable<java.lang.String> getComments();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsDocflowCompleted();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Long> getPackageId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getPackageName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFilename();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DirectDebitPaymentStatus> getPaymentState();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setTypeCode(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setParticipantName(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setParticipantId(java.lang.Long value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setSenderId(java.lang.Long value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setReceiverId(java.lang.Long value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setSenderPackageId(Nullable<java.lang.Long> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setReceiverPackageId(Nullable<java.lang.Long> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setTotal(java.lang.Long value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setStatusChangeDate(DateTime value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setNumber(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setSendDate(Nullable<DateTime> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setReceiveDate(Nullable<DateTime> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setNetSum(Nullable<java.math.BigDecimal> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setVatSum(Nullable<java.math.BigDecimal> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setTotalSum(Nullable<java.math.BigDecimal> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setComment(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setChangeNumber(java.lang.Long value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setChangeDate(DateTime value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setOperationContent(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setInfoFieldData(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setComments(IEnumerable<java.lang.String> value);
}
