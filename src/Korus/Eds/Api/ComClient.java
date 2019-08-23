package Korus.Eds.Api;import Common.Activation;import static Common.JavonetHelper.Convert;import static Common.JavonetHelper.getGetObjectName;import static Common.JavonetHelper.getReturnObjectName;import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;import Common.JavonetHelper;import Common.MethodTypeAnnotation;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;
                        import java.util.Iterator;import java.lang.*;
import Korus.Eds.Api.*;
import Korus.Eds.Core.*;
import jio.System.Collections.Generic.*;
import jio.System.*;
import Korus.Eds.Api.Search.*;
import Korus.Eds.Api.Forms.*;
import Korus.Eds.WebApi.*;
import jio.System.Net.*;public class ComClient implements IComClient {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            @MethodTypeAnnotation(type = "SetField")public void setProxy (IWebProxy value){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("set_Proxy",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            @MethodTypeAnnotation(type = "GetField")public IWebProxy getProxy (){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("get_Proxy");if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            @MethodTypeAnnotation(type = "SetField")public void setThumbprint (java.lang.String value){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("set_Thumbprint",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            @MethodTypeAnnotation(type = "GetField")public java.lang.String getThumbprint (){ try { java.lang.String res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("get_Thumbprint");if(res == null) return "";return  (java.lang.String) res;} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            @MethodTypeAnnotation(type = "SetField")public void setAuthToken (java.lang.String value){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("set_AuthToken",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            @MethodTypeAnnotation(type = "GetField")public java.lang.String getAuthToken (){ try { java.lang.String res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("get_AuthToken");if(res == null) return "";return  (java.lang.String) res;} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            @MethodTypeAnnotation(type = "SetField")public void setTimeout (java.lang.Integer value){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("set_Timeout",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            @MethodTypeAnnotation(type = "GetField")public java.lang.Integer getTimeout (){ try { java.lang.Integer res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("get_Timeout");if(res == null) return 0;return  res ;} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }public ComClient (){ try {  javonetHandle = Javonet.New("Korus.Eds.Api.ComClient");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ComClient (RestClient restClient){ try {  javonetHandle = Javonet.New("Korus.Eds.Api.ComClient",restClient);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ComClient(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public AdditionalComment[] GetDocumentComments (java.lang.Long documentId, Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("GetDocumentComments",documentId);if(res == null) return null;return (AdditionalComment[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void AddDocumentComment (java.lang.Long documentId,java.lang.String comment,DocumentCommentVisibility visibility){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("AddDocumentComment",documentId,comment,NEnum.fromJavaEnum(visibility));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Subscription GetSubscription (java.lang.String token){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("GetSubscription",token);if(res == null) return null;return new Subscription((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Subscription[] GetSubscriptions (Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("GetSubscriptions");if(res == null) return null;return (Subscription[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Subscription CreateSubscription (){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("CreateSubscription");if(res == null) return null;return new Subscription((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Subscription CreateRestrictedSubscription (){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("CreateRestrictedSubscription");if(res == null) return null;return new Subscription((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void RemoveSubscription (java.lang.String token){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("RemoveSubscription",token);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public List<DocumentEvent> GetSubscriptionEvents (java.lang.String token){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("GetSubscriptionEvents",token);if(res == null) return null;return new List<DocumentEvent>((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public DocumentEvents GetSubscriptionEventsWithTotals (java.lang.String token){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("GetSubscriptionEventsWithTotals",token);if(res == null) return null;return new DocumentEvents((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public DocumentEvents GetSubscriptionEventsWithTotalsByCount (java.lang.String token,java.lang.Integer count){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("GetSubscriptionEventsWithTotalsByCount",token,count);if(res == null) return null;return new DocumentEvents((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void RemoveSubscriptionEvents (java.lang.String token,java.lang.Long[] eventIds){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("RemoveSubscriptionEvents",token,new Object[] {eventIds});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public List<DocumentEvent> GetSubscriptionEvents (java.lang.String token,java.lang.Integer count){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("GetSubscriptionEvents",token,count);if(res == null) return null;return new List<DocumentEvent>((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void SetBaseUrl (java.lang.String url){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("SetBaseUrl",url);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void SetProxy (java.lang.String address,java.lang.String name,java.lang.String password,java.lang.String domain){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("SetProxy",address,name,password,domain);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void SetTimeout (TimeSpan timeout){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("SetTimeout",timeout);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public  <T> T GetObject (java.lang.String resource, Class<?> returnType){ try { Object res =javonetHandle.generic(getReturnObjectName(returnType)).explicitInterface("Korus.Eds.Api.IComClient").invoke("GetObject",resource);if(res == null) return null;return (T)Convert(res, returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public LogonResponse Login (java.lang.String username,java.lang.String password,java.lang.String code){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("Login",username,password,code);if(res == null) return null;return new LogonResponse((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public LogonResponse Login (java.lang.String username,java.lang.String password){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("Login",username,password);if(res == null) return null;return new LogonResponse((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public LogonResponse Login (java.lang.String key){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("Login",key);if(res == null) return null;return new LogonResponse((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public LogonResponse LoginByApiKey (java.lang.String key){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("LoginByApiKey",key);if(res == null) return null;return new LogonResponse((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public LogonResponse LoginAsBranch (java.lang.String username,java.lang.String password,java.lang.String code){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("LoginAsBranch",username,password,code);if(res == null) return null;return new LogonResponse((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Document Document (java.lang.Long documentId){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("Document",documentId);if(res == null) return null;return new Document((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent DocumentContent (java.lang.Long documentId){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentContent",documentId);if(res == null) return null;return new FileContent((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Document DocumentCard (java.lang.Long documentId){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentCard",documentId);if(res == null) return null;return new Document((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Document ChildDocumentCard (java.lang.Long parentId,java.lang.Long id){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("ChildDocumentCard",parentId,id);if(res == null) return null;return new Document((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent ChildPdf (java.lang.Long parentId,java.lang.Long id){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("ChildPdf",parentId,id);if(res == null) return null;return new FileContent((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public DocumentHistory[] DocumentHistory (java.lang.Long documentId, Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentHistory",documentId);if(res == null) return null;return (DocumentHistory[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public KeyValueObject[] DocumentAttributes (java.lang.Long documentId, Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentAttributes",documentId);if(res == null) return null;return (KeyValueObject[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Document[] DocumentList (ApiDocumentFilter filter, Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentList",filter);if(res == null) return null;return (Document[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public SignatureDetails GetSignature (java.lang.Long id){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("GetSignature",id);if(res == null) return null;return new SignatureDetails((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public DocumentSign[] GetSignatures (java.lang.Long id, Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("GetSignatures",id);if(res == null) return null;return (DocumentSign[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Document DocumentAdd (java.lang.String receiverCode,DocumentCard document){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentAdd",receiverCode,document);if(res == null) return null;return new Document((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Document[] DocumentAddBatch (java.lang.String receiverCode,DocumentBatch batch, Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentAddBatch",receiverCode,batch);if(res == null) return null;return (Document[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void AddAttachment (java.lang.Long id,FileContent attachment){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("AddAttachment",id,attachment);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentRequestClarification (java.lang.Long documentId,SignedContent ticket){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentRequestClarification",documentId,ticket);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public StringResult DocumentRejectedComment (java.lang.Long documentId){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentRejectedComment",documentId);if(res == null) return null;return new StringResult((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public UserLogin[] GetNextUserDocument (java.lang.Long id, Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("GetNextUserDocument",id);if(res == null) return null;return (UserLogin[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public java.lang.Long[] GetTicketIdList (java.lang.String fileName, Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("GetTicketIdList",fileName);if(res == null) return null;return (java.lang.Long[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentAddRelation (DocumentRelation relation){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentAddRelation",relation);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public SearchResult[] SearchDocumentsByParams (DocumentSearchArguments args, Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("SearchDocumentsByParams",args);if(res == null) return null;return (SearchResult[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent Pdf (java.lang.Long documentId){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("Pdf",documentId);if(res == null) return null;return new FileContent((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent Attachment (java.lang.Long id){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("Attachment",id);if(res == null) return null;return new FileContent((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public java.lang.Boolean ExistSended (DocumentRefEx reference){ try { java.lang.Boolean res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("ExistSended",reference);if(res == null) return false;return  res ;} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent DocumentProtocol (java.lang.Long documentId){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentProtocol",documentId);if(res == null) return null;return new FileContent((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public java.lang.Long AddDelayedDispatch (DelayedDispatch dispatch){ try { java.lang.Long res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("AddDelayedDispatch",dispatch);if(res == null) return null;return  res ;} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void PatchDocumentSigner (java.lang.Long documentId,DocumentSigner documentSigner){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("PatchDocumentSigner",documentId,documentSigner);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Document[] Cards (CardsInfo cards, Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("Cards",cards);if(res == null) return null;return (Document[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public ExternalServiceData[] GetExtendedServiceData (java.lang.Long id, Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("GetExtendedServiceData",id);if(res == null) return null;return (ExternalServiceData[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentSend (java.lang.Long documentId){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentSend",documentId);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentSign (java.lang.Long documentId,SignatureWithTicket signature){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentSign",documentId,signature);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentAccept (java.lang.Long documentId){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentAccept",documentId);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentAccept (java.lang.Long documentId,SignedContent ticket){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentAccept",documentId,ticket);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentAcceptWithTicket (java.lang.Long documentId,SignedContent ticket){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentAcceptWithTicket",documentId,ticket);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentReject (java.lang.Long documentId,java.lang.String comment){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentReject",documentId,comment);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentRevoke (java.lang.Long documentId,java.lang.String comment){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentRevoke",documentId,comment);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentAcceptRevoke (java.lang.Long documentId){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentAcceptRevoke",documentId);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentTrash (java.lang.Long documentId){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentTrash",documentId);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentRecovery (java.lang.Long documentId){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentRecovery",documentId);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentDelete (java.lang.Long documentId){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentDelete",documentId);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentSetFavorite (java.lang.Long documentId,java.lang.Boolean mark){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentSetFavorite",documentId,mark);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentSelfRoute (java.lang.Long documentId){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentSelfRoute",documentId);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public java.lang.Long PackageAdd (DocumentPackage package){ try { java.lang.Long res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("PackageAdd",package);if(res == null) return null;return  res ;} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public PackageCard GetPackage (java.lang.Long id){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("GetPackage",id);if(res == null) return null;return new PackageCard((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void PackageAppendDocuments (java.lang.Long id,IEnumerable<java.lang.Long> documents){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("PackageAppendDocuments",id,documents);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void PackageRemoveDocuments (java.lang.Long id,IEnumerable<java.lang.Long> documents){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("PackageRemoveDocuments",id,documents);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent CreateAvoidanceRequest (java.lang.Long id,java.lang.String reason){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("CreateAvoidanceRequest",id,reason);if(res == null) return null;return new FileContent((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void SendAvoidanceRequest (java.lang.Long id,SignedContent ticket){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("SendAvoidanceRequest",id,ticket);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent CreateAvoidanceRequestClarificationNotice (java.lang.Long id,java.lang.String reason){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("CreateAvoidanceRequestClarificationNotice",id,reason);if(res == null) return null;return new FileContent((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void AcceptAvoidanceRequest (java.lang.Long id,Signature signature){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("AcceptAvoidanceRequest",id,signature);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void RejectAvoidanceRequest (java.lang.Long id,SignedContent ticket){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("RejectAvoidanceRequest",id,ticket);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void ChangeRoute (java.lang.Long docId,java.lang.Integer stepNumber,java.lang.String login,UserDirectory directory){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("ChangeRoute",docId,stepNumber,login,NEnum.fromJavaEnum(directory));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public DocumentRouteStage[] DocumentRoute (java.lang.Long docId, Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentRoute",docId);if(res == null) return null;return (DocumentRouteStage[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void EditDocumentRoute (DocumentRouteEditSimpleModel documentRouteModel){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("EditDocumentRoute",documentRouteModel);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent CreateInvoice (Invoice invoice){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("CreateInvoice",invoice);if(res == null) return null;return new FileContent((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent CreateInvoice (Invoice invoice,java.lang.String receiverCode){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("CreateInvoice",invoice,receiverCode);if(res == null) return null;return new FileContent((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent CreateInvoiceForReceiver (Invoice invoice,java.lang.String receiverCode){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("CreateInvoiceForReceiver",invoice,receiverCode);if(res == null) return null;return new FileContent((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent CreateCorrectionInvoice (CorrectionInvoice correctionInvoice){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("CreateCorrectionInvoice",correctionInvoice);if(res == null) return null;return new FileContent((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent CreateCorrectionInvoice (CorrectionInvoice correctionInvoice,java.lang.String receiverCode){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("CreateCorrectionInvoice",correctionInvoice,receiverCode);if(res == null) return null;return new FileContent((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent CreateCorrectionInvoiceForReceiver (CorrectionInvoice correctionInvoice,java.lang.String receiverCode){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("CreateCorrectionInvoiceForReceiver",correctionInvoice,receiverCode);if(res == null) return null;return new FileContent((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public ClassifierTemplate[] ClassifierTemplate (java.lang.String documentTypeCode,java.lang.String receiverCode, Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("ClassifierTemplate",documentTypeCode,receiverCode);if(res == null) return null;return (ClassifierTemplate[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Classifier[] Classifiers (Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("Classifiers");if(res == null) return null;return (Classifier[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public ClassifierValue[] ClassifierValues (java.lang.Long classifierId,java.lang.Boolean isNotActive, Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("ClassifierValues",classifierId,isNotActive);if(res == null) return null;return (ClassifierValue[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public User UserInfo (java.lang.Long id){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("UserInfo",id);if(res == null) return null;return new User((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void AddUser (ApiUser user){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("AddUser",user);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void AddCertificate (java.lang.Long userId,Certificate certificate){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("AddCertificate",userId,certificate);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void LockUser (java.lang.Long userId,java.lang.Boolean lockUser){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("LockUser",userId,lockUser);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void SetUserGroup (java.lang.Long userId,java.lang.Long groupId){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("SetUserGroup",userId,groupId);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void SetUserRole (java.lang.Long userId,java.lang.Long roleId){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("SetUserRole",userId,roleId);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public DocumentEvent[] GetEvents (java.lang.Long lastEventId,java.lang.Long count, Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("GetEvents",lastEventId,count);if(res == null) return null;return (DocumentEvent[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public java.lang.Long GetLastEventId (){ try { java.lang.Long res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("GetLastEventId");if(res == null) return null;return  res ;} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public DocumentEvent[] GetDocumentEvents (java.lang.Long id, Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("GetDocumentEvents",id);if(res == null) return null;return (DocumentEvent[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Ticket[] TicketGetUnreplied (Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("TicketGetUnreplied");if(res == null) return null;return (Ticket[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public TicketDetails TicketGet (java.lang.Long id){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("TicketGet",id);if(res == null) return null;return new TicketDetails((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public TicketDetails[] TicketsGet (java.lang.Long id, Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("TicketsGet",id);if(res == null) return null;return (TicketDetails[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public PagedResult<TicketInfo> TicketList (TicketFilter filter){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("TicketList",filter);if(res == null) return null;return new PagedResult<TicketInfo>((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public PagedObjectResult TicketListObjectResult (TicketFilter filter){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("TicketListObjectResult",filter);if(res == null) return null;return new PagedObjectResult((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent TicketCreateReply (java.lang.Long id){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("TicketCreateReply",id);if(res == null) return null;return new FileContent((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public DocumentReply TicketDocumentReply (java.lang.Long id){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("TicketDocumentReply",id);if(res == null) return null;return new DocumentReply((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent TicketCreateClarification (java.lang.Long id,java.lang.String comment){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("TicketCreateClarification",id,comment);if(res == null) return null;return new FileContent((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public TicketDetails TicketAdd (java.lang.Long id,SignedContent ticket){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("TicketAdd",id,ticket);if(res == null) return null;return new TicketDetails((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent TicketCreateTorg12AcceptTicket (java.lang.Long id,Torg12AcceptInfo data){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("TicketCreateTorg12AcceptTicket",id,data);if(res == null) return null;return new FileContent((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent TicketCreateAcceptenceCertificateAcceptTicket (java.lang.Long id,AcceptanceCertificateAcceptInfo data){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("TicketCreateAcceptenceCertificateAcceptTicket",id,data);if(res == null) return null;return new FileContent((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent TicketCreateUpdTicket (java.lang.Long id,UniversalDocumentAcceptInfo acceptInfo){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("TicketCreateUpdTicket",id,acceptInfo);if(res == null) return null;return new FileContent((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public VersionInfo Version (){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("Version");if(res == null) return null;return new VersionInfo((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Company FindCompany (java.lang.String inn,java.lang.String ogrn,java.lang.String kpp){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("FindCompany",inn,ogrn,kpp);if(res == null) return null;return new Company((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Company[] FindCompanies (java.lang.String inn,java.lang.String ogrn,java.lang.String kpp, Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("FindCompanies",inn,ogrn,kpp);if(res == null) return null;return (Company[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Company Company (java.lang.String code){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("Company",code);if(res == null) return null;return new Company((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Company Company (java.lang.Long id){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("Company",id);if(res == null) return null;return new Company((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public LocalAddress ClientLegalAddress (java.lang.Long clientId){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("ClientLegalAddress",clientId);if(res == null) return null;return new LocalAddress((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Certificate UserCertificate (){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("UserCertificate");if(res == null) return null;return new Certificate((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public List<Certificate> GetUserCertificates (java.lang.Long userId){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("GetUserCertificates",userId);if(res == null) return null;return new List<Certificate>((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public java.lang.Byte[] CreateSignature (java.lang.Byte[] content,java.lang.String thumbprint, Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("CreateSignature",new Object[] {content},thumbprint);if(res == null) return null;return (java.lang.Byte[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Role[] GroupList (Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("GroupList");if(res == null) return null;return (Role[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Role[] RoleList (Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("RoleList");if(res == null) return null;return (Role[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public UserDetails[] UserList (Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("UserList");if(res == null) return null;return (UserDetails[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public java.lang.Long UserIdByLogin (java.lang.String login,UserDirectory dirId){ try { java.lang.Long res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("UserIdByLogin",login,NEnum.fromJavaEnum(dirId));if(res == null) return null;return  res ;} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public ContractorDocumentTypes[] ContractorDocumentTypes (Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("ContractorDocumentTypes");if(res == null) return null;return (ContractorDocumentTypes[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void RelationRequestReject (java.lang.Long id){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("RelationRequestReject",id);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void RelationRequestDelete (java.lang.Long id){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("RelationRequestDelete",id);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void RelationRequestAccept (java.lang.Long id){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("RelationRequestAccept",id);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void RelationRequestAddDocument (java.lang.Long relationId,java.lang.Integer id){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("RelationRequestAddDocument",relationId,id);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void RelationRequestRemoveDocument (java.lang.Long relationId,java.lang.Integer id){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("RelationRequestRemoveDocument",relationId,id);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public java.lang.Long RelationRequestAdd (RelationRequest relation){ try { java.lang.Long res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("RelationRequestAdd",relation);if(res == null) return null;return  res ;} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public RelationRequestDetails[] RelationRequestGet (RelationRequestFilter filter, Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("RelationRequestGet",filter);if(res == null) return null;return (RelationRequestDetails[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public ClientRelation[] Discover (ClientDiscovery[] list, Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("Discover",new Object[] {list});if(res == null) return null;return (ClientRelation[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public ClientEdiCode ReceiverEdiCode (java.lang.Long receiverId,java.lang.Integer documentTypeId){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("ReceiverEdiCode",receiverId,documentTypeId);if(res == null) return null;return new ClientEdiCode((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Company GetSelf (){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("GetSelf");if(res == null) return null;return new Company((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public DocumentType DocumentTypeByCode (java.lang.String code){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentTypeByCode",code);if(res == null) return null;return new DocumentType((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public DocumentType DocumentType (java.lang.Integer id){ try { Object res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentType",id);if(res == null) return null;return new DocumentType((NObject) res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public DocumentType[] DocumentTypes (Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("DocumentTypes");if(res == null) return null;return (DocumentType[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public StringKeyValue[] GetDocumentProperties (java.lang.Long documentId, Class<?> returnArrayType){ try { Object[] res =javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("GetDocumentProperties",documentId);if(res == null) return null;return (StringKeyValue[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void AddDocumentProperties (java.lang.Long documentId,StringKeyValue[] arguments){ try { javonetHandle.explicitInterface("Korus.Eds.Api.IComClient").invoke("AddDocumentProperties",documentId,new Object[] {arguments});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}