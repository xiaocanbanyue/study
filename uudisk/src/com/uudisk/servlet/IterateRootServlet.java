package com.uudisk.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import com.uudisk.domain.RootBean;
import com.uudisk.utils.IterateDir;

@SuppressWarnings("serial")
public class IterateRootServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<RootBean> roots=IterateDir.getDiskInfo();
		if(roots!=null){
			JSONArray jsonArray=JSONArray.fromObject(roots);
			response.getWriter().print(jsonArray.toString());
		}
		
	}
}
