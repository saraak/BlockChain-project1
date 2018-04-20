import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Date;
import java.security.MessageDigest;


public class Block {

    public String hash;
    public String previousHash;
    public Data data;
    private long timeStamp;

    public Block(Data data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }

    public String calculateHash() {
        String calculatedhash = StringUtil.applySha256(
                previousHash + Long.toString(timeStamp) +
                        data
        );
        return calculatedhash;
    }

}

