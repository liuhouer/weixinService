package com.talkweb.weixin.util;

import java.security.MessageDigest;
import java.util.Arrays;

import com.talkweb.weixin.main.StartOnLoad;

/**
 * 微信认证工具类
*    
* 项目名称：WeiChatService   
* 类名称：SignUtil   
* 类描述：   
* 创建人：zhouling
* 创建时间：Nov 12, 2013 4:39:09 PM    
* 修改备注：   
* @version    
*
 */
public class SignUtil {
	
	 // 与微信接口配置信息中的Token要一致   
  
    
    public static boolean checkSignature (String signature,String timeStamp,String nonce){
    	String[] arr= new String[]{StartOnLoad.TOKEN,timeStamp,nonce};
    	//将token,timeStamp,nonce按字典序排序
    	Arrays.sort(arr);
    	
    	StringBuffer contentBuffer=new StringBuffer();
    	for(int i=0;i<arr.length;i++){
    		contentBuffer.append(arr[i]);
    	}
    	
    	MessageDigest mDigest=null;
    	String tmpString=null;
    	try{
    		mDigest=MessageDigest.getInstance("SHA-1");
    		//将三个参数拼接成一个字符串进行SHA-1加密
    		byte[] digest=mDigest.digest(contentBuffer.toString().getBytes());
    		tmpString=StringUtil.byteToStr(digest);
    		
    	}catch (Exception e) {
			// TODO: handle exception
    		e.printStackTrace();
		}
    	contentBuffer=null;
    	// 将sha1加密后的字符串可与signature对比，标识该请求来源于微信  
    	return tmpString!=null?tmpString.equals(signature.toUpperCase()):false;
    	
    	
    	
    }


}
