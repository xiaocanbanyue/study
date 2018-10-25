package com.uudisk.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import com.uudisk.domain.DirBean;
import com.uudisk.utils.IterateDir;

@SuppressWarnings("serial")
public class IterateDirServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestPath=request.getParameter("path").trim();
		if(requestPath!=null&&requestPath.length()>1){
			String nowPath=requestPath;
			if(nowPath.endsWith("/")){
				nowPath=nowPath.substring(0, requestPath.length()-1);
			}
			try {
				DirBean dirBean=IterateDir.getFiles(nowPath);
				JSONArray jsonArray=JSONArray.fromObject(dirBean);
				response.getWriter().print(jsonArray.toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
