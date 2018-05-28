package com.mobi.ce.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ibm.service.processhistory.ProcessHistorySearchCondition;
import com.mobi.ce.views.services.IFormService;
import com.mobi.ce.views.services.IProcessHistoryService;

import net.sf.json.JSONArray;

@Controller
@RequestMapping(value="/history")
public class HistoryController {
	private Logger logger =Logger.getLogger(HistoryController.class);
	@Resource
	private IProcessHistoryService processHistoryService;
	
	/**
	 * 查询历史记录
	 * @param condition
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/queryMyHistory.do")
	@ResponseBody
	private String queryMyHistory(ProcessHistorySearchCondition condition,HttpServletRequest request, HttpServletResponse response){
		logger.info("queryMyHistory:"+condition.toString());
		JSONArray history = this.processHistoryService.queryHistory(condition);
		String callback = request.getParameter("callback");
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
       return callback + "(" + history + ")";
	}
	/**
	 * 查询审批记录
	 * @param processId
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/approvalInfo.do")
	@ResponseBody
	private String queryMyHistoryDetail(String processId,HttpServletRequest request, HttpServletResponse response){
		logger.info("queryMyHistoryDetail:processId="+processId);
		JSONArray historyDetail = this.processHistoryService.queryHistoryDetail(processId);
		String callback = request.getParameter("callback");
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        return callback + "(" + historyDetail + ")";
	}
	
}
