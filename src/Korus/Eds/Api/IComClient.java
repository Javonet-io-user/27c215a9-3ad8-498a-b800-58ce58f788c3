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
import jio.System.Collections.Generic.*;
import jio.System.*;
import Korus.Eds.Core.*;
import Korus.Eds.Api.Search.*;
import Korus.Eds.Api.Forms.*;
import Korus.Eds.WebApi.*;
import jio.System.Net.*;public interface IComClient { /**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void RemoveSubscription (java.lang.String token);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public List<DocumentEvent> GetSubscriptionEvents (java.lang.String token);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public DocumentEvents GetSubscriptionEventsWithTotals (java.lang.String token);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public DocumentEvents GetSubscriptionEventsWithTotalsByCount (java.lang.String token,java.lang.Integer count);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void RemoveSubscriptionEvents (java.lang.String token,java.lang.Long[] eventIds);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public List<DocumentEvent> GetSubscriptionEvents (java.lang.String token,java.lang.Integer count);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public java.lang.Long PackageAdd (DocumentPackage package);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void PackageAppendDocuments (java.lang.Long id,IEnumerable<java.lang.Long> documents);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void PackageRemoveDocuments (java.lang.Long id,IEnumerable<java.lang.Long> documents);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public PackageCard GetPackage (java.lang.Long id);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Company GetSelf ();/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public StringKeyValue[] GetDocumentProperties (java.lang.Long documentId, Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void AddDocumentProperties (java.lang.Long documentId,StringKeyValue[] arguments);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void SetBaseUrl (java.lang.String url);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void SetProxy (java.lang.String address,java.lang.String name,java.lang.String password,java.lang.String domain);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void SetTimeout (TimeSpan timeout);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public  <T> T GetObject (java.lang.String resource, Class<?> returnType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public LogonResponse Login (java.lang.String username,java.lang.String password,java.lang.String code);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public LogonResponse Login (java.lang.String username,java.lang.String password);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public LogonResponse Login (java.lang.String key);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public LogonResponse LoginByApiKey (java.lang.String key);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public LogonResponse LoginAsBranch (java.lang.String username,java.lang.String password,java.lang.String code);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public DocumentType[] DocumentTypes (Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public DocumentType DocumentTypeByCode (java.lang.String code);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public DocumentType DocumentType (java.lang.Integer id);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Document Document (java.lang.Long documentId);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent DocumentContent (java.lang.Long documentId);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Document DocumentCard (java.lang.Long documentId);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Document ChildDocumentCard (java.lang.Long parentId,java.lang.Long id);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent ChildPdf (java.lang.Long parentId,java.lang.Long id);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public DocumentHistory[] DocumentHistory (java.lang.Long documentId, Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public KeyValueObject[] DocumentAttributes (java.lang.Long documentId, Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Document[] DocumentList (ApiDocumentFilter filter, Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public SignatureDetails GetSignature (java.lang.Long id);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public DocumentSign[] GetSignatures (java.lang.Long id, Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Document DocumentAdd (java.lang.String receiverCode,DocumentCard document);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Document[] DocumentAddBatch (java.lang.String receiverCode,DocumentBatch batch, Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void AddAttachment (java.lang.Long id,FileContent attachment);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentRequestClarification (java.lang.Long documentId,SignedContent ticket);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public StringResult DocumentRejectedComment (java.lang.Long documentId);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public UserLogin[] GetNextUserDocument (java.lang.Long id, Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public java.lang.Long[] GetTicketIdList (java.lang.String fileName, Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentAddRelation (DocumentRelation relation);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public SearchResult[] SearchDocumentsByParams (DocumentSearchArguments args, Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void PatchDocumentSigner (java.lang.Long documentId,DocumentSigner documentSigner);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Document[] Cards (CardsInfo cards, Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public ExternalServiceData[] GetExtendedServiceData (java.lang.Long id, Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent Pdf (java.lang.Long documentId);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent Attachment (java.lang.Long id);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public java.lang.Boolean ExistSended (DocumentRefEx reference);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent DocumentProtocol (java.lang.Long documentId);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public java.lang.Long AddDelayedDispatch (DelayedDispatch dispatch);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentSend (java.lang.Long documentId);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentSign (java.lang.Long documentId,SignatureWithTicket signature);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentAccept (java.lang.Long documentId);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentAccept (java.lang.Long documentId,SignedContent ticket);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentAcceptWithTicket (java.lang.Long documentId,SignedContent ticket);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentReject (java.lang.Long documentId,java.lang.String comment);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentRevoke (java.lang.Long documentId,java.lang.String comment);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentAcceptRevoke (java.lang.Long documentId);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentTrash (java.lang.Long documentId);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentRecovery (java.lang.Long documentId);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentDelete (java.lang.Long documentId);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentSetFavorite (java.lang.Long documentId,java.lang.Boolean mark);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void DocumentSelfRoute (java.lang.Long documentId);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent CreateAvoidanceRequest (java.lang.Long id,java.lang.String reason);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void SendAvoidanceRequest (java.lang.Long id,SignedContent ticket);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent CreateAvoidanceRequestClarificationNotice (java.lang.Long id,java.lang.String reason);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void AcceptAvoidanceRequest (java.lang.Long id,Signature signature);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void RejectAvoidanceRequest (java.lang.Long id,SignedContent ticket);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void ChangeRoute (java.lang.Long docId,java.lang.Integer stepNumber,java.lang.String login,UserDirectory directory);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public DocumentRouteStage[] DocumentRoute (java.lang.Long docId, Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void EditDocumentRoute (DocumentRouteEditSimpleModel documentRouteModel);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent CreateInvoice (Invoice invoice);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent CreateInvoice (Invoice invoice,java.lang.String receiverCode);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent CreateInvoiceForReceiver (Invoice invoice,java.lang.String receiverCode);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent CreateCorrectionInvoice (CorrectionInvoice correctionInvoice);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent CreateCorrectionInvoice (CorrectionInvoice correctionInvoice,java.lang.String receiverCode);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent CreateCorrectionInvoiceForReceiver (CorrectionInvoice correctionInvoice,java.lang.String receiverCode);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public ClassifierTemplate[] ClassifierTemplate (java.lang.String documentTypeCode,java.lang.String receiverCode, Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Classifier[] Classifiers (Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public ClassifierValue[] ClassifierValues (java.lang.Long classifierId,java.lang.Boolean isNotActive, Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public User UserInfo (java.lang.Long id);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void AddUser (ApiUser user);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void AddCertificate (java.lang.Long userId,Certificate certificate);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void LockUser (java.lang.Long userId,java.lang.Boolean lockUser);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void SetUserGroup (java.lang.Long userId,java.lang.Long groupId);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void SetUserRole (java.lang.Long userId,java.lang.Long roleId);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public DocumentEvent[] GetEvents (java.lang.Long lastEventId,java.lang.Long count, Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public java.lang.Long GetLastEventId ();/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public DocumentEvent[] GetDocumentEvents (java.lang.Long id, Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Ticket[] TicketGetUnreplied (Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public TicketDetails TicketGet (java.lang.Long id);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public TicketDetails[] TicketsGet (java.lang.Long id, Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public PagedResult<TicketInfo> TicketList (TicketFilter filter);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public PagedObjectResult TicketListObjectResult (TicketFilter filter);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent TicketCreateReply (java.lang.Long id);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public DocumentReply TicketDocumentReply (java.lang.Long id);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent TicketCreateClarification (java.lang.Long id,java.lang.String comment);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public TicketDetails TicketAdd (java.lang.Long id,SignedContent ticket);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent TicketCreateTorg12AcceptTicket (java.lang.Long id,Torg12AcceptInfo data);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent TicketCreateAcceptenceCertificateAcceptTicket (java.lang.Long id,AcceptanceCertificateAcceptInfo data);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public FileContent TicketCreateUpdTicket (java.lang.Long id,UniversalDocumentAcceptInfo acceptInfo);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public VersionInfo Version ();/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Company FindCompany (java.lang.String inn,java.lang.String ogrn,java.lang.String kpp);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Company[] FindCompanies (java.lang.String inn,java.lang.String ogrn,java.lang.String kpp, Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Company Company (java.lang.String code);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Company Company (java.lang.Long id);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public LocalAddress ClientLegalAddress (java.lang.Long clientId);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Certificate UserCertificate ();/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public List<Certificate> GetUserCertificates (java.lang.Long userId);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public java.lang.Byte[] CreateSignature (java.lang.Byte[] content,java.lang.String thumbprint, Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Role[] GroupList (Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Role[] RoleList (Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public UserDetails[] UserList (Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public java.lang.Long UserIdByLogin (java.lang.String login,UserDirectory dirId);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public ContractorDocumentTypes[] ContractorDocumentTypes (Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void RelationRequestReject (java.lang.Long id);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void RelationRequestDelete (java.lang.Long id);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void RelationRequestAccept (java.lang.Long id);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void RelationRequestAddDocument (java.lang.Long relationId,java.lang.Integer id);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void RelationRequestRemoveDocument (java.lang.Long relationId,java.lang.Integer id);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public java.lang.Long RelationRequestAdd (RelationRequest relation);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public RelationRequestDetails[] RelationRequestGet (RelationRequestFilter filter, Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public ClientRelation[] Discover (ClientDiscovery[] list, Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public ClientEdiCode ReceiverEdiCode (java.lang.Long receiverId,java.lang.Integer documentTypeId);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public AdditionalComment[] GetDocumentComments (java.lang.Long documentId, Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public void AddDocumentComment (java.lang.Long documentId,java.lang.String comment,DocumentCommentVisibility visibility);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Subscription GetSubscription (java.lang.String token);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Subscription[] GetSubscriptions (Class<?> returnArrayType);/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Subscription CreateSubscription ();/**
	 * Method
	 */
@MethodTypeAnnotation(type = "Method")
            public Subscription CreateRestrictedSubscription ();/**
	 * Get property
	 */
@MethodTypeAnnotation(type = "GetField")
            public IWebProxy getProxy ();/**
	 * Get property
	 */
@MethodTypeAnnotation(type = "GetField")
            public java.lang.String getThumbprint ();/**
	 * Get property
	 */
@MethodTypeAnnotation(type = "GetField")
            public java.lang.String getAuthToken ();/**
	 * Get property
	 */
@MethodTypeAnnotation(type = "GetField")
            public java.lang.Integer getTimeout ();/**
	 * Set property
	 */
@MethodTypeAnnotation(type = "SetField")
            public void setProxy (IWebProxy value);/**
	 * Set property
	 */
@MethodTypeAnnotation(type = "SetField")
            public void setThumbprint (java.lang.String value);/**
	 * Set property
	 */
@MethodTypeAnnotation(type = "SetField")
            public void setAuthToken (java.lang.String value);/**
	 * Set property
	 */
@MethodTypeAnnotation(type = "SetField")
            public void setTimeout (java.lang.Integer value);}