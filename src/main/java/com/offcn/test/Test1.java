package com.offcn.test;

import com.offcn.client.Server;
import com.offcn.client.ServerService;

public class Test1 {

	public static void main(String[] args) {
		Server server = new ServerService().getPort(Server.class);
		String value = server.getValue("´óÍõ");
		System.out.println(value);
	}

}
