package com.talkweb.weixin.main;

import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.talkweb.weixin.util.LogUtil;

public class StartOnLoad implements ServletContextListener {
	
	private static LogUtil log=new LogUtil(StartOnLoad.class);
	
	//获取access_token的APPID;
	public static String TOKEN_APPID;
	
	//获取access_token的secret;
	public static String TOKEN_SECRET;
	
	//微信校验token // 与微信接口配置信息中的Token要一致  
	public static String TOKEN;
	
	//是否需要创建菜单
	private String isCreateMenu;
	
	

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		//读取数据库初始配置文件		
		//定义配置文件
		Properties dbProperties=new Properties();
		//定义输入流
		InputStream in=null;
		try{
			log.info("+++++读取数据库连接配置文件++++++");
			in=StartOnLoad.class.getResourceAsStream("/resources.properties");
			dbProperties.load(in);
			TOKEN_APPID=dbProperties.getProperty("token.appId");
			TOKEN_SECRET=dbProperties.getProperty("token.secret");
			TOKEN=dbProperties.getProperty("token");
			isCreateMenu=dbProperties.getProperty("isCreateMenu");
			
		}catch (Exception e) {
			// TODO: handle exception
			log.error(e);
		}finally{
			//关闭输入流
			try{
				if(in!=null){
				in.close();
				}
			}catch (Exception e) {
				// TODO: handle exception
				log.error(e);
			}
			
		}
		
		System.out.println(isCreateMenu);
		//判断是否需要调用创建菜单接口
		if("true".equals(isCreateMenu)){
			MenuManager.CreateMenu();			
			
		}
		
		
		
		

	}

}
