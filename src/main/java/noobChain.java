import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class noobChain {

    public static ArrayList<Block> blockchain = new ArrayList<Block>();

    public static void main(String[] args) {

        try {
            Block genesisBlock = new Block(new Data("first reciever", "first sender",
                    "1234", "5678", "www.someurl.com/this-transaction-pdf.pdf",
                    5647.67f), "0");
            System.out.println("Hash for block 1: " + genesisBlock.hash);

            Block secondBlock = new Block(new Data("second reciever", "second sender",
                    "765432456", "21335243", "www.someurl.com/this-transaction-pdf-1.pdf",
                    37623467f), genesisBlock.hash);
            System.out.println("Hash for block 2: " + secondBlock.hash);

            Block thirdBlock = new Block(new Data("third reciever", "third sender",
                    "16435", "453542", "www.someurl.com/this-transaction-pdf-2.pdf",
                    4543.54f), secondBlock.hash);
            System.out.println("Hash for block 3: " + thirdBlock.hash);

            blockchain.add(genesisBlock);
            blockchain.add(secondBlock);
            blockchain.add(thirdBlock);

            ObjectMapper mapper = new ObjectMapper();

            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(blockchain));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }



    }


}
