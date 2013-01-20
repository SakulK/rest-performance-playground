package sakulk;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.net.httpserver.HttpServer;

public class App  {
    public static void main( String[] args) throws Exception {
    	String baseUri = "http://localhost:8080/";
        HttpServer httpServer = HttpServerFactory.create(baseUri, new PackagesResourceConfig("sakulk"));
        httpServer.start();
    }
}
