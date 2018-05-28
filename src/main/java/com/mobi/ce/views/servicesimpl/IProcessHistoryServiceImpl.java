package com.mobi.ce.views.servicesimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.service.processhistory.ProcessHistorySearchCondition;
import com.ibm.service.processhistory.ProcessHistoryService;
import com.ibm.service.processhistory.ProcessHistoryServiceService;
import com.ibm.service.processhistory.TBpmProcInstanceExtra;
import com.ibm.service.processhistory.TBpmTaskInstance;
import com.mobi.ce.util.JsonUtil;
import com.mobi.ce.views.services.IProcessHistoryService;

import net.sf.json.JSONArray;
@Service("IProcessHistoryService")
public class IProcessHistoryServiceImpl implements IProcessHistoryService {

	@Override
	public JSONArray queryHistory(ProcessHistorySearchCondition condition) {
		ProcessHistoryServiceService historyImpl=new ProcessHistoryServiceService();
		ProcessHistoryService historyService = historyImpl.getPort(ProcessHistoryService.class);
		List<TBpmProcInstanceExtra> history = historyService.queryHistory(condition);
		
		return JsonUtil.conversionList(history);
	}

	@Override
	public JSONArray queryHistoryDetail(String processId) {
		ProcessHistoryServiceService historyImpl=new ProcessHistoryServiceService();
		ProcessHistoryService historyService = historyImpl.getPort(ProcessHistoryService.class);
		List<TBpmTaskInstance> historyDetail = historyService.queryHistoryDetail(processId);
		
		return JsonUtil.conversionList(historyDetail);
	}

}
