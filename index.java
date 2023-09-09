// import java.io.IOException;
// import java.io.OutputStream;
// import java.net.InetSocketAddress;
// import com.sun.net.httpserver.HttpExchange;
// import com.sun.net.httpserver.HttpHandler;
// import com.sun.net.httpserver.HttpServer;

// public class SimpleServer {

//     public static void main(String[] args) throws Exception {
//         HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
//         server.createContext("/", new RootHandler());
//         server.setExecutor(null); // creates a default executor
//         System.out.println("Server started and listening on port 8080");
//         server.start();
//     }

//     static class RootHandler implements HttpHandler {
//         @Override
//         public void handle(HttpExchange exchange) throws IOException {
//             String response = "Hello! You've connected to the server.";
//             byte[] responseBytes = response.getBytes();
            
//             // Send headers (HTTP/1.0 200 OK)
//             exchange.sendResponseHeaders(200, responseBytes.length);
            
//             OutputStream os = exchange.getResponseBody();
//             os.write(responseBytes);
//             os.close();
//         }
//     }
// }
