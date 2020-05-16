package com.javakc.ssm.base.util;

import java.util.UUID;

/**
 * 項目工具類
 * @author javakc
 * @version v0.1
 */
public class CommonUtil {
	
	/**
	 * 獲取32位uuid
	 * @return
	 */
	public static String uuid()
	{
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	/**
	 * 驗證當前對象不為空
	 * 為空: 返回false
	 * 不為空: 返回true
	 * @param obj
	 * @return
	 */
	public static boolean isNotNull(Object obj)
	{
		if(null == obj || "".equals(obj))
		{
			return false;
		}
		return true;
	}
	
	/**
	 * 驗證字符串是否為空
	 * 為空: 返回false
	 * 不為空: 返回true
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str)
	{
		if(null != str && !"".equals(str))
		{
			return true;
		}
		return false;
	}

	/**
	 * 生成所有模块需要的编号
	 * @param prefix
	 * @param suffix
	 * @return
	 */
	public static String getNo(String prefix, Integer suffix){
		String init = prefix + "0001";
		if(suffix != 0){
			int num = suffix + 1;
			//不足4位的地方补充为0，表示输出的宽度至少为4位
			init = String.format(prefix+"%04d", num);
		}
		return init;
	}











	
}
