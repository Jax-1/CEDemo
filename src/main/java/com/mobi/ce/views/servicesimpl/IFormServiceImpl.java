package com.mobi.ce.views.servicesimpl;


import org.springframework.stereotype.Service;

import com.ibm.service.form.FormData;
import com.ibm.service.form.FormService;
import com.ibm.service.form.FormServiceService;
import com.mobi.ce.util.JsonUtil;
import com.mobi.ce.views.services.IFormService;

import net.sf.json.JSONObject;
@Service("IFormService")
public class IFormServiceImpl implements IFormService {
	/**
	 * 加载表单信息，返回json
	 */
	@Override
	public JSONObject initFormData(String businessId, String processId) {
		FormServiceService formImpl=new FormServiceService();
		FormService form=formImpl.getPort(FormService.class);
		FormData formData = form.initFormData(businessId, processId);
		return JsonUtil.conversionBean(formData);
	}

}
