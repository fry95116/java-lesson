package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String in=null;
		System.out.println("Let's chat v1.0.0\nenter 'h' or '?' to get help");
		while(true){
			try {
				System.out.print("> ");
				in=input.readLine();
			} 
			catch (IOException e) {e.printStackTrace();}
			if(in.equals("q")){				//�˳�
				System.out.println("quit");
				break;
			}
			else if(in.equals("link")){		//����
				System.out.println("link");
			}
			else if(in.equals("listen")){	//����
				System.out.println("listen");
			}
			else if(in.equals("c")){	//�ر�
				System.out.println("close");
			}
			else if(in.equals("s")){		//����
				System.out.println("send");
			}
			else if(in.equals("h")||in.equals("?")){		//����
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