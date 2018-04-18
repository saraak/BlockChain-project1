public class noobChain {

    public static void main(String[] args) {

        Block genesisBlock = new Block("Hi I'm number 1", "0");
        System.out.println("Hash for block 1: " + genesisBlock.hash);

        Block secondBlock = new Block("And I'm number 2", genesisBlock.hash);
        System.out.println("Hash for block 2: " + secondBlock.hash);

        Block thirdBlock = new Block("I'm sad I'm number 3", secondBlock.hash);
        System.out.println("Hash for block 3: " + thirdBlock.hash);
    }


}
