package cn.cqjtu.bird;

import javax.swing.JFrame;

public class MAIN {
	public static void main(String[] args) {
		JFrame frame=new JFrame("FlappyBird");
		world w=new world();
		frame.add(w);
		
		frame.setSize(w.getWidth(), w.getHeight());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭虚拟机
		frame.setLocationRelativeTo(null);//居中显示
		frame.setResizable(false);
		frame.setVisible(true);
		w.action();
	}
}
