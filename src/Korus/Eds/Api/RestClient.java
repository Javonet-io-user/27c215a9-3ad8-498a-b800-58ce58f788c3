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
import RestSharp.*;
import jio.System.Collections.Generic.*;
import jio.System.*;
import Korus.Eds.Core.*;
import Korus.Eds.Api.Search.*;
import Korus.Eds.Api.Forms.*;
import Korus.Eds.WebApi.*;
import jio.System.Net.*;public class RestClient {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            @MethodTypeAnnotation(type = "SetField")public void setAuthToken (java.lang.String value){ try { javonetHandle.set("AuthToken",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            @MethodTypeAnnotation(type = "GetField")public java.lang.String getAuthToken (){ try { java.lang.String res =javonetHandle.get("AuthToken");if(res == null) return "";return  (java.lang.String) res;} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            @MethodTypeAnnotation(type = "SetField")public void setProxy (IWebProxy value){ try { javonetHandle.set("Proxy",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            @MethodTypeAnnotation(type = "GetField")public IWebProxy getProxy (){ try { Object res =javonetHandle.<NObject>get("Proxy");if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            @MethodTypeAnnotation(type = "SetField")public void setThumbprint (java.lang.String value){ try { javonetHandle.set("Thumbprint",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            @MethodTypeAnnotation(type = "GetField")public java.lang.String getThumbprint (){ try { java.lang.String res =javonetHandle.get("Thumbprint");if(res == null) return "";return  (java.lang.String) res;} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            @MethodTypeAnnotation(type = "SetField")public void setTimeout (java.lang.Integer value){ try { javonetHandle.set("Timeout",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            @MethodTypeAnnotation(type = "GetField")public java.lang.Integer getTimeout (){ try { java.lang.Integer res =javonetHandle.get("Timeout");if(res == null) return 0;return  res ;} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }public RestClient (){ try {  javonetHandle = Javonet.New("Korus.Eds.Api.RestClient");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RestClient (java.lang.String baseUri){ try {  javonetHandle = Javonet.New("Korus.Eds.Api.RestClient",baseUri);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RestClient(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<Subscription> GetSubscription (java.lang.String token){ try { Object res =javonetHandle.invoke("GetSubscription",token);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<Subscription>> GetSubscriptions (){ try { Object res =javonetHandle.invoke("GetSubscriptions");if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<Subscription> CreateSubscription (){ try { Object res =javonetHandle.invoke("CreateSubscription");if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<Subscription> CreateRestrictedSubscription (){ try { Object res =javonetHandle.invoke("CreateRestrictedSubscription");if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse RemoveSubscription (java.lang.String token){ try { Object res =javonetHandle.invoke("RemoveSubscription",token);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<DocumentEvent>> GetSubscriptionEvents (java.lang.String token){ try { Object res =javonetHandle.invoke("GetSubscriptionEvents",token);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<DocumentEvents> GetSubscriptionEventsWithTotals (java.lang.String token){ try { Object res =javonetHandle.invoke("GetSubscriptionEventsWithTotals",token);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<DocumentEvents> GetSubscriptionEventsWithTotalsByCount (java.lang.String token,java.lang.Long count){ try { Object res =javonetHandle.invoke("GetSubscriptionEventsWithTotalsByCount",token,count);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse RemoveSubscriptionEvents (java.lang.String token,java.lang.Long[] eventIds){ try { Object res =javonetHandle.invoke("RemoveSubscriptionEvents",token,new Object[] {eventIds});if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<DocumentEvent>> GetSubscriptionEvents (java.lang.String token,java.lang.Long count){ try { Object res =javonetHandle.invoke("GetSubscriptionEvents",token,count);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void SetBaseUrl (java.lang.String url){ try { javonetHandle.invoke("SetBaseUrl",url);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void SetTimeout (TimeSpan timeout){ try { javonetHandle.invoke("SetTimeout",timeout);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public  <T> IRestResponseT<T> GetObject (java.lang.String resource){ try { Object res =javonetHandle.invoke("GetObject",resource);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<LogonResponse> Login (java.lang.String username,java.lang.String password,java.lang.String code){ try { Object res =javonetHandle.invoke("Login",username,password,code);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<LogonResponse> Login (java.lang.String key){ try { Object res =javonetHandle.invoke("Login",key);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<LogonResponse> Login (Credentials credentials){ try { Object res =javonetHandle.invoke("Login",credentials);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<Document> Document (java.lang.Long documentId){ try { Object res =javonetHandle.invoke("Document",documentId);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<FileContent> DocumentContent (java.lang.Long documentId){ try { Object res =javonetHandle.invoke("DocumentContent",documentId);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<Document> DocumentCard (java.lang.Long documentId){ try { Object res =javonetHandle.invoke("DocumentCard",documentId);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<Document> ChildDocumentCard (java.lang.Long parentId,java.lang.Long id){ try { Object res =javonetHandle.invoke("ChildDocumentCard",parentId,id);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<FileContent> ChildPdf (java.lang.Long parentId,java.lang.Long id){ try { Object res =javonetHandle.invoke("ChildPdf",parentId,id);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<DocumentHistory>> DocumentHistory (java.lang.Long documentId){ try { Object res =javonetHandle.invoke("DocumentHistory",documentId);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<KeyValueObject>> DocumentAttributes (java.lang.Long documentId){ try { Object res =javonetHandle.invoke("DocumentAttributes",documentId);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<Document>> DocumentList (ApiDocumentFilter filter){ try { Object res =javonetHandle.invoke("DocumentList",filter);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<SignatureDetails> GetSignature (java.lang.Long id){ try { Object res =javonetHandle.invoke("GetSignature",id);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<DocumentSign>> GetSignatures (java.lang.Long id){ try { Object res =javonetHandle.invoke("GetSignatures",id);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<java.lang.Boolean> ExistSended (DocumentRefEx reference){ try { Object res =javonetHandle.invoke("ExistSended",reference);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<Document> DocumentAdd (java.lang.String receiverCode,DocumentCard document){ try { Object res =javonetHandle.invoke("DocumentAdd",receiverCode,document);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<Document>> DocumentAddBatch (java.lang.String receiverCode,DocumentBatch batch){ try { Object res =javonetHandle.invoke("DocumentAddBatch",receiverCode,batch);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<FileContent> Attachment (java.lang.Long id){ try { Object res =javonetHandle.invoke("Attachment",id);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse AddAttachment (java.lang.Long id,FileContent attachment){ try { Object res =javonetHandle.invoke("AddAttachment",id,attachment);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse DocumentRequestClarification (java.lang.Long documentId,SignedContent ticket){ try { Object res =javonetHandle.invoke("DocumentRequestClarification",documentId,ticket);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<StringResult> DocumentRejectedComment (java.lang.Long documentId){ try { Object res =javonetHandle.invoke("DocumentRejectedComment",documentId);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<UserLogin>> GetNextUserDocument (java.lang.Long id){ try { Object res =javonetHandle.invoke("GetNextUserDocument",id);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<java.lang.Long>> GetTicketIdList (java.lang.String fileName){ try { Object res =javonetHandle.invoke("GetTicketIdList",fileName);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse DocumentAddRelation (DocumentRelation relation){ try { Object res =javonetHandle.invoke("DocumentAddRelation",relation);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<SearchResult>> SearchDocumentsByParams (DocumentSearchArguments args){ try { Object res =javonetHandle.invoke("SearchDocumentsByParams",args);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<FileContent> Pdf (java.lang.Long documentId){ try { Object res =javonetHandle.invoke("Pdf",documentId);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<FileContent> DocumentProtocol (java.lang.Long documentId){ try { Object res =javonetHandle.invoke("DocumentProtocol",documentId);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<java.lang.Long> AddDelayedDispatch (DelayedDispatch dispatch){ try { Object res =javonetHandle.invoke("AddDelayedDispatch",dispatch);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse PatchDocumentSigner (java.lang.Long documentId,DocumentSigner documentSigner){ try { Object res =javonetHandle.invoke("PatchDocumentSigner",documentId,documentSigner);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<Document>> Cards (CardsInfo cards){ try { Object res =javonetHandle.invoke("Cards",cards);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<ExternalServiceData>> GetExtendedServiceData (java.lang.Long id){ try { Object res =javonetHandle.invoke("GetExtendedServiceData",id);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<AdditionalComment>> GetDocumentComments (java.lang.Long documentId){ try { Object res =javonetHandle.invoke("GetDocumentComments",documentId);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse AddDocumentComment (java.lang.Long documentId,java.lang.String comment,DocumentCommentVisibility visibility){ try { Object res =javonetHandle.invoke("AddDocumentComment",documentId,comment,NEnum.fromJavaEnum(visibility));if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<StringKeyValue>> GetDocumentProperties (java.lang.Long documentId){ try { Object res =javonetHandle.invoke("GetDocumentProperties",documentId);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse AddDocumentProperties (java.lang.Long documentId,StringKeyValue[] arguments){ try { Object res =javonetHandle.invoke("AddDocumentProperties",documentId,new Object[] {arguments});if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse DocumentSign (java.lang.Long documentId,SignatureWithTicket signature){ try { Object res =javonetHandle.invoke("DocumentSign",documentId,signature);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse DocumentSend (java.lang.Long documentId){ try { Object res =javonetHandle.invoke("DocumentSend",documentId);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse DocumentAccept (java.lang.Long documentId,SignedContent ticket){ try { Object res =javonetHandle.invoke("DocumentAccept",documentId,ticket);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse DocumentReject (java.lang.Long documentId,java.lang.String comment){ try { Object res =javonetHandle.invoke("DocumentReject",documentId,comment);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse DocumentRevoke (java.lang.Long documentId,java.lang.String comment){ try { Object res =javonetHandle.invoke("DocumentRevoke",documentId,comment);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse DocumentAcceptRevoke (java.lang.Long documentId){ try { Object res =javonetHandle.invoke("DocumentAcceptRevoke",documentId);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse DocumentTrash (java.lang.Long documentId){ try { Object res =javonetHandle.invoke("DocumentTrash",documentId);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse DocumentRecovery (java.lang.Long documentId){ try { Object res =javonetHandle.invoke("DocumentRecovery",documentId);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse DocumentDelete (java.lang.Long documentId){ try { Object res =javonetHandle.invoke("DocumentDelete",documentId);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse DocumentSetFavorite (java.lang.Long documentId,java.lang.Boolean mark){ try { Object res =javonetHandle.invoke("DocumentSetFavorite",documentId,mark);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse DocumentSelfRoute (java.lang.Long documentId){ try { Object res =javonetHandle.invoke("DocumentSelfRoute",documentId);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<java.lang.Long> PackageAdd (DocumentPackage package){ try { Object res =javonetHandle.invoke("PackageAdd",package);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<PackageCard> PackageGet (java.lang.Long id){ try { Object res =javonetHandle.invoke("PackageGet",id);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse PackageAppendDocuments (java.lang.Long id,IEnumerable<java.lang.Long> documents){ try { Object res =javonetHandle.invoke("PackageAppendDocuments",id,documents);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse PackageRemoveDocuments (java.lang.Long id,IEnumerable<java.lang.Long> documents){ try { Object res =javonetHandle.invoke("PackageRemoveDocuments",id,documents);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<FileContent> CreateAvoidanceRequest (java.lang.Long id,java.lang.String reason){ try { Object res =javonetHandle.invoke("CreateAvoidanceRequest",id,reason);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse SendAvoidanceRequest (java.lang.Long id,SignedContent ticket){ try { Object res =javonetHandle.invoke("SendAvoidanceRequest",id,ticket);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<FileContent> CreateAvoidanceRequestClarificationNotice (java.lang.Long id,java.lang.String reason){ try { Object res =javonetHandle.invoke("CreateAvoidanceRequestClarificationNotice",id,reason);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse AcceptAvoidanceRequest (java.lang.Long id,Signature signature){ try { Object res =javonetHandle.invoke("AcceptAvoidanceRequest",id,signature);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse RejectAvoidanceRequest (java.lang.Long id,SignedContent ticket){ try { Object res =javonetHandle.invoke("RejectAvoidanceRequest",id,ticket);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse ChangeRoute (java.lang.Long docId,java.lang.Integer stepNumber,java.lang.String login,UserDirectory directory){ try { Object res =javonetHandle.invoke("ChangeRoute",docId,stepNumber,login,NEnum.fromJavaEnum(directory));if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<DocumentRouteStage>> DocumentRoute (java.lang.Long docId){ try { Object res =javonetHandle.invoke("DocumentRoute",docId);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse EditDocumentRoute (DocumentRouteEditSimpleModel documentRouteModel){ try { Object res =javonetHandle.invoke("EditDocumentRoute",documentRouteModel);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<User> UserInfo (java.lang.Long id){ try { Object res =javonetHandle.invoke("UserInfo",id);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse AddUser (ApiUser user){ try { Object res =javonetHandle.invoke("AddUser",user);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse AddCertificate (java.lang.Long userId,Certificate certificate){ try { Object res =javonetHandle.invoke("AddCertificate",userId,certificate);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse LockUser (java.lang.Long userId,java.lang.Boolean lockUser){ try { Object res =javonetHandle.invoke("LockUser",userId,lockUser);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse SetUserGroup (java.lang.Long userId,java.lang.Long groupId){ try { Object res =javonetHandle.invoke("SetUserGroup",userId,groupId);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse SetUserRole (java.lang.Long userId,java.lang.Long roleId){ try { Object res =javonetHandle.invoke("SetUserRole",userId,roleId);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<Ticket>> TicketGetUnreplied (){ try { Object res =javonetHandle.invoke("TicketGetUnreplied");if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<TicketDetails> TicketGet (java.lang.Long id){ try { Object res =javonetHandle.invoke("TicketGet",id);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<TicketDetails>> TicketsGet (java.lang.Long id){ try { Object res =javonetHandle.invoke("TicketsGet",id);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<PagedResult<TicketInfo>> TicketList (TicketFilter filter){ try { Object res =javonetHandle.invoke("TicketList",filter);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<FileContent> TicketCreateReply (java.lang.Long id){ try { Object res =javonetHandle.invoke("TicketCreateReply",id);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<DocumentReply> TicketDocumentReply (java.lang.Long id){ try { Object res =javonetHandle.invoke("TicketDocumentReply",id);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<FileContent> TicketCreateClarification (java.lang.Long id,java.lang.String comment){ try { Object res =javonetHandle.invoke("TicketCreateClarification",id,comment);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<TicketDetails> TicketAdd (java.lang.Long id,SignedContent ticket){ try { Object res =javonetHandle.invoke("TicketAdd",id,ticket);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<FileContent> TicketCreateTorg12AcceptTicket (java.lang.Long id,Torg12AcceptInfo data){ try { Object res =javonetHandle.invoke("TicketCreateTorg12AcceptTicket",id,data);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<FileContent> TicketCreateUpdTicket (java.lang.Long id,UniversalDocumentAcceptInfo acceptInfo){ try { Object res =javonetHandle.invoke("TicketCreateUpdTicket",id,acceptInfo);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<FileContent> TicketCreateAcceptenceCertificateAcceptTicket (java.lang.Long id,AcceptanceCertificateAcceptInfo data){ try { Object res =javonetHandle.invoke("TicketCreateAcceptenceCertificateAcceptTicket",id,data);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<FileContent> CreateInvoice (Invoice invoice){ try { Object res =javonetHandle.invoke("CreateInvoice",invoice);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<FileContent> CreateInvoice (Invoice invoice,java.lang.String receiverCode){ try { Object res =javonetHandle.invoke("CreateInvoice",invoice,receiverCode);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<FileContent> CreateCorrectionInvoice (CorrectionInvoice correctionInvoice){ try { Object res =javonetHandle.invoke("CreateCorrectionInvoice",correctionInvoice);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<FileContent> CreateCorrectionInvoice (CorrectionInvoice correctionInvoice,java.lang.String receiverCode){ try { Object res =javonetHandle.invoke("CreateCorrectionInvoice",correctionInvoice,receiverCode);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<ClassifierTemplate>> ClassifierTemplate (java.lang.String documentTypeCode,java.lang.String receiverCode){ try { Object res =javonetHandle.invoke("ClassifierTemplate",documentTypeCode,receiverCode);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<Classifier>> Classifiers (){ try { Object res =javonetHandle.invoke("Classifiers");if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<ClassifierValue>> ClassifierValues (java.lang.Long classifierId,java.lang.Boolean isNotActive){ try { Object res =javonetHandle.invoke("ClassifierValues",classifierId,isNotActive);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<DocumentEvent>> GetEvents (java.lang.Long lastEventId,java.lang.Long count){ try { Object res =javonetHandle.invoke("GetEvents",lastEventId,count);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<java.lang.Long> GetLastEventId (){ try { Object res =javonetHandle.invoke("GetLastEventId");if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<DocumentEvent>> GetDocumentEvents (java.lang.Long id){ try { Object res =javonetHandle.invoke("GetDocumentEvents",id);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<VersionInfo> Version (){ try { Object res =javonetHandle.invoke("Version");if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<Company> Company (java.lang.Long id){ try { Object res =javonetHandle.invoke("Company",id);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<Company> Company (java.lang.String code){ try { Object res =javonetHandle.invoke("Company",code);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<Company>> FindCompanies (java.lang.String inn,java.lang.String ogrn,java.lang.String kpp){ try { Object res =javonetHandle.invoke("FindCompanies",inn,ogrn,kpp);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<Company> FindCompany (java.lang.String inn,java.lang.String ogrn,java.lang.String kpp){ try { Object res =javonetHandle.invoke("FindCompany",inn,ogrn,kpp);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<LocalAddress> ClientLegalAddress (java.lang.Long clientId){ try { Object res =javonetHandle.invoke("ClientLegalAddress",clientId);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<Certificate> UserCertificate (){ try { Object res =javonetHandle.invoke("UserCertificate");if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<Certificate>> GetUserCertificates (java.lang.Long userId){ try { Object res =javonetHandle.invoke("GetUserCertificates",userId);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public java.lang.Byte[] CreateSignature (java.lang.Byte[] content,java.lang.String thumbprint, Class<?> returnArrayType){ try { Object[] res =javonetHandle.invoke("CreateSignature",new Object[] {content},thumbprint);if(res == null) return null;return (java.lang.Byte[])JavonetHelper.ConvertNObjectToDestinationType((Object) res,returnArrayType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<Role>> GroupList (){ try { Object res =javonetHandle.invoke("GroupList");if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<Role>> RoleList (){ try { Object res =javonetHandle.invoke("RoleList");if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<UserDetails>> UserList (){ try { Object res =javonetHandle.invoke("UserList");if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<java.lang.Long> UserIdByLogin (java.lang.String login,UserDirectory dirId){ try { Object res =javonetHandle.invoke("UserIdByLogin",login,NEnum.fromJavaEnum(dirId));if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<ContractorDocumentTypes>> ContractorDocumentTypes (){ try { Object res =javonetHandle.invoke("ContractorDocumentTypes");if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse RelationRequestReject (java.lang.Long id){ try { Object res =javonetHandle.invoke("RelationRequestReject",id);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse RelationRequestDelete (java.lang.Long id){ try { Object res =javonetHandle.invoke("RelationRequestDelete",id);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse RelationRequestAccept (java.lang.Long id){ try { Object res =javonetHandle.invoke("RelationRequestAccept",id);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse RelationRequestAddDocument (java.lang.Long relationId,java.lang.Integer id){ try { Object res =javonetHandle.invoke("RelationRequestAddDocument",relationId,id);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponse RelationRequestRemoveDocument (java.lang.Long relationId,java.lang.Integer id){ try { Object res =javonetHandle.invoke("RelationRequestRemoveDocument",relationId,id);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<java.lang.Long> RelationRequestAdd (RelationRequest relation){ try { Object res =javonetHandle.invoke("RelationRequestAdd",relation);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<RelationRequestDetails>> RelationRequestGet (RelationRequestFilter filter){ try { Object res =javonetHandle.invoke("RelationRequestGet",filter);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<ClientRelation>> Discover (List<ClientDiscovery> list){ try { Object res =javonetHandle.invoke("Discover",list);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<ClientEdiCode> ReceiverEdiCode (java.lang.Long receiverId,java.lang.Integer documentTypeId){ try { Object res =javonetHandle.invoke("ReceiverEdiCode",receiverId,documentTypeId);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<Company> GetSelf (){ try { Object res =javonetHandle.invoke("GetSelf");if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<List<DocumentType>> DocumentTypes (){ try { Object res =javonetHandle.invoke("DocumentTypes");if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<DocumentType> DocumentTypeByCode (java.lang.String code){ try { Object res =javonetHandle.invoke("DocumentTypeByCode",code);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public IRestResponseT<DocumentType> DocumentType (java.lang.Integer id){ try { Object res =javonetHandle.invoke("DocumentType",id);if(res == null) return null;return ConvertToConcreteInterfaceImplementation(res);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}