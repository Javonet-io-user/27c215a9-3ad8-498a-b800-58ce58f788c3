package Korus.Eds.Core;

public enum TransportDocumentType {
  ReceiveNotice(1L),
  SendConfirmation(2L),
  ReceiveConfirmation(3L),
  ClarificationNotice(4L),
  Invoice(5L),
  CorrectionInvoice(6L),
  Torg12SellerTitle(7L),
  Torg12BuyerTitle(8L),
  AcceptanceCertificatePerformerTitle(9L),
  AcceptanceCertificateCustomerTitle(10L),
  Document(11L),
  RejectSignature(12L),
  AvoidanceRequest(13L),
  AcceptSignature(14L),
  ReceiveNoticeRoaming(15L),
  ClarificationNoticeRoaming(16L),
  UpdInvoice(18L),
  UpdInvoiceSellerInfo(19L),
  UpdInvoiceBuyerInfo(20L),
  UpdSellerInfo(21L),
  UpdBuyerInfo(22L),
  UpdCorrectionInvoice(23L),
  UpdCorrectionInvoiceSellerInfo(24L),
  UpdCorrectionInvoiceBuyerInfo(25L),
  UpdCorrectionSellerInfo(26L),
  UpdCorrectionBuyerInfo(27L),
  DocumentOfTransferOfWorkResultsPerformerInfo(28L),
  DocumentOfTransferOfWorkResultsCustomerInfo(29L),
  DocumentOfTransferOfGoodsSellerInfo(30L),
  DocumentOfTransferOfGoodsBuyerInfo(31L),
  ;
  private long numVal;

  TransportDocumentType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
