<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- ssi.jsp 공통페이지(Server Side Include) --%>

<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="net.sungjuk.*" %>

<jsp:useBean id="dao" class="net.sungjuk.SungjukDAO" scope="page"/>
<jsp:useBean id="dto" class="net.sungjuk.SungjukDTO" scope="page"/>

<%request.setCharacterEncoding("UTF-8");%>
