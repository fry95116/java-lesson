package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String in=null;
		System.out.println("Let's chat v1.0.0\nenter 'h' or '?' to get help");
		while(true){
			try {
				System.out.print("> ");
				in=input.readLine();
			} 
			catch (IOException e) {e.printStackTrace();}
			if(in.equals("q")){				//退出
				System.out.println("quit");
				break;
			}
			else if(in.equals("link")){		//连接
				System.out.println("link");
			}
			else if(in.equals("listen")){	//监听
				System.out.println("listen");
			}
			else if(in.equals("c")){	//关闭
				System.out.println("close");
			}
			else if(in.equals("s")){		//发送
				System.out.println("send");
			}
			else if(in.equals("h")||in.equals("?")){		//帮助
				System.out.println("link [ip] [port]\tlink to your friend's decive");
				System.out.println("listen [port]\twait for your friend's link");
				System.out.println("s [msg]\tsend a message");
				System.out.println("c\tclose link or listen");
				System.out.println("q\tquit");
				System.out.println("h\tget help");
			}
		}
	}

}