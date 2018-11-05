<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<jsp:directive.page import="org.springframework.web.context.support.ServletContextResource"/>
<jsp:directive.page import="org.springframework.core.io.Resource"/>
<jsp:directive.page import="org.springframework.web.util.WebUtils"/>
<jsp:directive.page import="java.util.*"/>
<%@ page import="java.io.*" %>
<%

  Resource res3 = new ServletContextResource(application,"/WEB-INF/conf/file1.txt");
  out.print(res3.getFilename()+"<br/>");
  out.print(WebUtils.getTempDir(application).getAbsolutePath());
  File file = res3.getFile();
  BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
  out.print(reader.readLine());
%>
