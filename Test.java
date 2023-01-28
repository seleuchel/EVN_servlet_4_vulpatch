import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class Test extends HttpServlet{
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        System.out.println("hi servlet");
    }
}