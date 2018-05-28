package com.mobi.ce.util;

import java.util.List;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Json串操作类
 * @author jang
 *
 */
public class JsonUtil {
	/**
	 * 将List转换成Json
	 * @param list
	 * @return
	 */
	public static <E> JSONArray conversionList(List<E> list){
		if(list==null){
			return new JSONArray();
		}
		JSONArray json = JSONArray.fromObject(list);
		return json;
	}
	/**
	 * 将Bean转换成Json
	 * @param c
	 * @param object
	 * @return
	 */
	public static JSONObject conversionBean(Object object){
		if(object==null){
			return new JSONObject();
		}
		JSONObject fromObject = JSONObject.fromObject(object);
		return fromObject;
	}
}
