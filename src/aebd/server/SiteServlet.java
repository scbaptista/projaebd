package aebd.server;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/ola")
public class SiteServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
    	response.addHeader("Access-Control-Allow-Origin", "*");
     	response.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE, HEAD");
     	response.addHeader("Access-Control-Allow-Headers", "X-PINGOTHER, Origin, X-Requested-With, Content-Type, Accept");
		response.setHeader("Content-Type", "text/html");
		response.setContentType("text/plain; chaset=UTF-8");
		
		String ulString = "teste ola ..... ";
		
		ServletOutputStream ouputStream = response.getOutputStream();
        response.setContentType("text/html");
        byte[] bytes = String.valueOf(ulString).getBytes();
       
				
        System.out.println(ulString);
        ouputStream.write(bytes, 0, bytes.length);
        ouputStream.flush();
        ouputStream.close();
	}

}
