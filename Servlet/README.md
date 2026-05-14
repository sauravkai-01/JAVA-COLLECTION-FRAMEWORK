Java Servlets are server-side Java programs that handle client requests (usually HTTP) and generate dynamic responses, forming the backbone of Java web applications. They run inside a servlet container (like Apache Tomcat) and are widely used in enterprise-level applications for their scalability and efficiency.


Definition: A Java class that extends server functionality by processing requests and producing responses.
Part of: Jakarta EE (formerly Java EE).
Runs in: A Servlet Container (e.g., Tomcat, Jetty, GlassFish).  
Purpose: Generate dynamic web content (HTML, JSON, XML, etc.) instead of static pages.


Servlet Lifecycle Every servlet goes through these phases:  
init() → Called once when the servlet is loaded.  
service() → Handles client requests (doGet, doPost, etc.).  
destroy() → Called before the servlet is unloaded.  

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  

public class HelloServlet extends HttpServlet {  
    @Override  
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {  
        
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Hello, Servlet!</h1>");
    }  
}  

Servlet Architecture Workflow  
- Client sends request → Web server receives it.  
- Web server passes request to servlet container.    
- Servlet processes request and generates response.   
- Response is sent back to client browser.    

Key Advantages Over CGI. 
- Performance: Uses threads instead of creating new processes for each request.  
- Scalability: Efficiently handles multiple requests.  
- Integration: Can interact with databases, RMI, CORBA, or web services.  
- Flexibility: Supports multiple response formats (HTML, XML, JSON, images).

Servlet vs CGI Comparison


<img width="800" height="401" alt="Jsp-servlet-architecture" src="https://github.com/user-attachments/assets/e98820a0-8896-4769-99f6-7f9cece721ee" />
