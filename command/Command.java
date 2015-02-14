package command;

public interface Command {
	//延迟开机:
	void delay(String str);
	//暂停一下:
	void pause(String str);
	//马上开始:
	void start(String str);
}
