package command;
//真正的执行者
public class Receiver {
		//延迟开机:
		void delay(String str)
		{
			System.out.println(str+"电视");
		}
		//暂停一下:
		void pause(String str)
		{
			System.out.println(str+"电视");
		}
		//马上开始:
		void start(String str)
		{
			System.out.println(str+"电视");
		}
}
