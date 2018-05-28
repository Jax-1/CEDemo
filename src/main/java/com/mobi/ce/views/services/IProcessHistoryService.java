package com.mobi.ce.views.services;

import com.ibm.service.processhistory.ProcessHistorySearchCondition;


import net.sf.json.JSONArray;

public interface IProcessHistoryService {
	 public JSONArray queryHistory(ProcessHistorySearchCondition condition);
	 public JSONArray queryHistoryDetail(String processId);
}
