package com.offcn;

import javax.jws.WebService;//webService�ؼ�����
import javax.xml.ws.Endpoint;

//�ѵ�ǰ�෢����webService���
@WebService
public class Server {

	/**
	 * ���ͻ��˵��õķ���
	 * @param name
	 * @return
	 */
		public String getValue(String name){
			return "�ҽ�:"+name;
		}
		
		/**
		 * ������������webService����
		 * @param args
		 */
		public static void main(String[] args) {
			Endpoint.publish("http://localhost:9292/service/hello", new Server());
			System.out.println("�����ɹ�");
		}
}
