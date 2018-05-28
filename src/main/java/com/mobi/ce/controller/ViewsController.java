package com.mobi.ce.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mobi.ce.util.HttpRequest;
import com.mobi.ce.views.services.IFormService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping(value="/views")
public class ViewsController {
	private Logger logger =Logger.getLogger(ViewsController.class);
	@Resource
	private IFormService formService;
	/**
	 * 加载表单数据
	 * @param businessId
	 * @param processId
	 * @param request
	 * @param response
	 * @author jang
	 * @return
	 */
	@RequestMapping(value="/travelapply.do")
	@ResponseBody
	private String travelApply(String businessId,String processId,HttpServletRequest request, HttpServletResponse response){
//		businessId="100000002214";
		String callback = request.getParameter("callback");
		if(businessId==null&&processId==null){
			return callback + "({})";
		}
		logger.info("initFormData:businessId="+businessId+",processId="+processId);
		JSONObject formData = this.formService.initFormData(businessId, processId);
		
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        System.out .println("11111111111");
       return callback + "(" + formData + ")";
	}
	@RequestMapping(value="/testLine.do")
	@ResponseBody
	private String testLine(String businessId,String processId,HttpServletRequest request, HttpServletResponse response){
		String url="http://10.6.1.80/irj/portal";
		String param="login_submit=on&login_do_redirect=1&no_cert_storing=on&j_username=10001497&j_password=zhangjie032111&uidPasswordLogon=%E7%99%BB%E5%BD%95";
		String sendGet = HttpRequest.sendGet(url, param);
		System.out.println(sendGet);
		JSONObject formData=new JSONObject();
		formData.accumulate("back", sendGet);
		response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
       return null+"("+formData+")";
	}

}
