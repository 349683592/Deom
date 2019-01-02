package com.offcn;

import javax.jws.WebService;//webService关键类库包
import javax.xml.ws.Endpoint;

//把当前类发布成webService标记
@WebService
public class Server {

	/**
	 * 供客户端调用的方法
	 * @param name
	 * @return
	 */
		public String getValue(String name){
			return "我叫:"+name;
		}
		
		/**
		 * 主方法，发布webService服务
		 * @param args
		 */
		public static void main(String[] args) {
			Endpoint.publish("http://localhost:9292/service/hello", new Server());
			System.out.println("发布成功");
		}
}
