package frame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;

public class Xwindow extends JFrame {
	public JPanel contentPanel;
	public JPanel audioPanel;
	EmbeddedMediaPlayerComponent playerComponent;   //媒体播放器组件 
	public Xwindow(){
		setVisible(false);
    	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		screenSize.setSize(screenSize.getWidth(), screenSize.getHeight() - 40);
    	setSize(screenSize);
		setUndecorated(true);
		setLocationRelativeTo(null);
        setTitle("   VideoPlayer   Copyright@2017  by XD");  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
       /***最外层,可以按照播放器加入按钮和菜单栏，这里全部不加入**/
        contentPanel=new JPanel();  
        contentPanel.setBorder(new EmptyBorder(0, 0, 0, 0));  
        contentPanel.setLayout(new BorderLayout(0,0));  
        setContentPane(contentPanel);  
       /** 视频播放Panel**/
        audioPanel=new JPanel();
        audioPanel.setBorder(new EmptyBorder(0,0,0,0));
        audioPanel.setLayout(new BorderLayout(0,0));
     contentPanel.add(audioPanel);
        playerComponent=new EmbeddedMediaPlayerComponent();
        audioPanel.add(playerComponent);  
        
	}
	
    public EmbeddedMediaPlayer getMediaPlayer() {  
        return playerComponent.getMediaPlayer();  
    }  
}
