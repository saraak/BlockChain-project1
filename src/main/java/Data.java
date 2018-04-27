public class Data {
    public String recipientName;
    public float amount;
    public String senderName;
    public String routingNum;
    private String accountNum;
    public String pdfUrl;

    public Data(){}

    public Data(String recipientName, String senderName, String routingNum, String accountNum, String pdfUrl, float amount) {
        this.recipientName = recipientName;
        this.senderName = senderName;
        this.routingNum = routingNum;
        this.accountNum = accountNum;
        this.pdfUrl = pdfUrl;
        this.amount = amount;
    }

    public String getRecipientName(){
        return recipientName;
    }
    public String getSenderName(){
        return senderName;
    }

    public String getRoutingNum() {
        return routingNum;
    }

    public float getAmount() {
        return amount;
    }

    public String getAccountNum() {
        return StringUtil.applySha256(accountNum);
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public void setRoutingNum(String routingNum) {
        this.routingNum = routingNum;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }
}
