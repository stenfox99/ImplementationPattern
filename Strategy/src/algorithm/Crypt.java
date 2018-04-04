package algorithm;

public class Crypt {
    private Algorithm algorithm;

    public Crypt(Algorithm algorithm){
        this.algorithm = algorithm;
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public String crypt(String text,String key){
        return algorithm.crypt(text,key);
    }
}
