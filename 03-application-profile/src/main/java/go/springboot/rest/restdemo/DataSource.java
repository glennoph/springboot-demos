package go.springboot.rest.restdemo;

public class DataSource {

    private String  url;
    private int     port;

    public DataSource(String url, int port) {
        this.url = url;
        this.port = port;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "url='" + url + '\'' +
                ", port=" + port +
                '}';
    }
}
