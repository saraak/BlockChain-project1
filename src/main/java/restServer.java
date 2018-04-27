import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

import static spark.Spark.*;

public class restServer {
    public static ArrayList<Block> blockchain = new ArrayList<Block>();

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        port(8080);

        get("/blockchain", (request, response) -> {
            return mapper.writeValueAsString(blockchain);
        });

        post("/blockchain", (request, response) -> {
            Data data = mapper.readValue(request.body(), Data.class);
            Block postBlock;

            if (blockchain.size() > 0)
               postBlock = new Block(data, blockchain.get(blockchain.size() - 1).hash);
            else
                postBlock = new Block(data, "0");

            blockchain.add(postBlock);

            return "{\"status\":\"ok\"}";
        });

    }
}
