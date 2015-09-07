
package com.freemarkerdemo.demo;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import freemarker.template.*;

public class DemoServlet extends HttpServlet {

	private static final long serialVersionUID = -1930999342485132612L;

	private volatile Configuration cfg; 
    
    public void init() {
    	//创建Freemarker配置实例
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);
        cfg.setServletContextForTemplateLoading(getServletContext(), "WEB-INF/templates");

        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        
        this.cfg = cfg;
    }
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        
        Map<String, String> root = new HashMap<String, String>();
        root.put("message", "Hello, Servlet!");
        
        Template t = cfg.getTemplate("demo.ftl");
        
        resp.setContentType("text/html; charset=" + t.getEncoding());
        Writer out = resp.getWriter();
        
        try {
            t.process(root, out);
        } catch (TemplateException e) {
            throw new ServletException("Error while processing FreeMarker template", e);
        }
    }
}