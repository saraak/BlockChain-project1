public class Data {
    public String recipientName;
    public float amount;
    public String senderName;
    public String routingNum;
    private String accountNum;
    public String pdfUrl;


    public Data(String recipientName, String senderName, String routingNum, String accountNum, String pdfUrl, float amount) {
        this.recipientName = recipientName;
        this.senderName = senderName;
        this.routingNum = routingNum;
        this.accountNum = accountNum;
        this.pdfUrl = pdfUrl;
        this.amount = amount;
    }

}
