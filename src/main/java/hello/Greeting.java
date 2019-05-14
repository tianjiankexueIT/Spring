package hello;

/**
 * @author: linjingjia
 * @Data: 2019  2019/5/14   16:27
 **/
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}