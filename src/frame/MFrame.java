package frame;

import java.awt.EventQueue;

public class MFrame {

public static void main(String args[]){
	EventQueue.invokeLater(new Runnable(){

		public void run() {
		Xwindow win =new Xwindow();
		win.setVisible(true); 
         //frame.setUndecorated(true);
        win.getMediaPlayer().playMedia("F:\\ExtJs视频教程\\[01]EXTJS4.0的概述和HELLOWORD程序.wmv");  //直接播放视屏，参数是视屏文件的绝对路径
		}
		
	}
	);
}

}
