package hello;

/**
 * Created by anders on 28.08.14.
 *
 * Based on the Spring Guide: "Building a RESTful Web Service",
 * found at: https://spring.io/guides/gs/rest-service/
 */
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
