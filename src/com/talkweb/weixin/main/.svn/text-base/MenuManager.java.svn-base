package com.talkweb.weixin.main;

import com.talkweb.weixin.pojo.AccessToken;
import com.talkweb.weixin.pojo.Button;
import com.talkweb.weixin.pojo.CommonButton;
import com.talkweb.weixin.pojo.ComplexButton;
import com.talkweb.weixin.pojo.Menu;
import com.talkweb.weixin.util.LogUtil;
import com.talkweb.weixin.util.WeiXinUtil;

/**
 * 菜单管理器
*    
* 项目名称：WeiChatService   
* 类名称：MenuManager   
* 类描述：   
* 创建人：zhouling
* 创建时间：Nov 15, 2013 4:55:47 PM    
* 修改备注：   
* @version    
*
 */
public class MenuManager {
	
	private static LogUtil log=new LogUtil(MenuManager.class);
	
	 public static void CreateMenu() {  
		log.debug("------------开始创建菜单--------------------");
	        // 第三方用户唯一凭证   
	        String appId = StartOnLoad.TOKEN_APPID;  
	        // 第三方用户唯一凭证密钥   
	        String appSecret = StartOnLoad.TOKEN_SECRET;  
	  
	        // 调用接口获取access_token   
	        AccessToken at = WeiXinUtil.getAccessToken(appId, appSecret);  
	  
	        if (null != at) {  
	            // 调用接口创建菜单   
	            int result = WeiXinUtil.createMenu(getMenu(), at.getToken());  
	  
	            // 判断菜单创建结果   
	            if (0 == result)  
	                log.info("菜单创建成功！");  
	            else  
	                log.info("菜单创建失败，错误码：" + result);  
	        }  
	    }  
	 
	  /** 
	     * 组装菜单数据 
	     *  
	     * @return 
	     */  
	    private static  Menu getMenu() {  
	        CommonButton btn11 = new CommonButton();  
	        btn11.setName("消费明细");  
	        btn11.setType("click");  
	        btn11.setKey("11");  
	  
	        CommonButton btn12 = new CommonButton();  
	        btn12.setName("考勤记录");  
	        btn12.setType("click");  
	        btn12.setKey("12");  
	  
	        CommonButton btn13 = new CommonButton();  
	        btn13.setName("门禁记录");  
	        btn13.setType("click");  
	        btn13.setKey("13");  
	  
	     
	        CommonButton btn21 = new CommonButton();  
	        btn21.setName("钱包余额");  
	        btn21.setType("click");  
	        btn21.setKey("21");  
	  
	        CommonButton btn22 = new CommonButton();  
	        btn22.setName("挂失解挂");  
	        btn22.setType("click");  
	        btn22.setKey("22");  
	
	  
	        CommonButton btn31 = new CommonButton();  
	        btn31.setName("客服电话");  
	        btn31.setType("click");  
	        btn31.setKey("31");  
	  
	        CommonButton btn32 = new CommonButton();  
	        btn32.setName("使用帮助");  
	        btn32.setType("click");  
	        btn32.setKey("32");  
	  
	        CommonButton btn33 = new CommonButton();  
	        btn33.setName("关于我们");  
	        btn33.setType("click");  
	        btn33.setKey("33");  
	  
	        ComplexButton mainBtn1 = new ComplexButton();  
	        mainBtn1.setName("流水明细");  
	        mainBtn1.setSub_button(new CommonButton[] { btn11, btn12, btn13 });  
	  
	        ComplexButton mainBtn2 = new ComplexButton();  
	        mainBtn2.setName("账务查询");  
	        mainBtn2.setSub_button(new CommonButton[] { btn21, btn22});  
	  
	        ComplexButton mainBtn3 = new ComplexButton();  
	        mainBtn3.setName("服务帮助");  
	        mainBtn3.setSub_button(new CommonButton[] { btn31, btn32, btn33 });  
	  
	      
	        Menu menu = new Menu();  
	        menu.setButton(new Button[] { mainBtn1, mainBtn2, mainBtn3 });  
	  
	        return menu;  
	    }  
	  



}
