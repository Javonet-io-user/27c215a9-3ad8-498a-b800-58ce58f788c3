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

public interface IDocumentEvent {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getDocumentId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Long> getTicketId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<TransportDocumentType> getTicketType();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<ExtendedDocumentType> getExtendedTicketType();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DocumentEventType getEventType();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DateTime getDate();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DocumentRelationType getDocumentRelationType();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setId(java.lang.Long value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setDocumentId(java.lang.Long value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setTicketId(Nullable<java.lang.Long> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setTicketType(Nullable<TransportDocumentType> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setExtendedTicketType(Nullable<ExtendedDocumentType> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setEventType(DocumentEventType value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setDate(DateTime value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setDocumentRelationType(DocumentRelationType value);
}
