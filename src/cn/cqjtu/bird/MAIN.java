package cn.cqjtu.bird;

import javax.swing.JFrame;

public class MAIN {
	public static void main(String[] args) {
		JFrame frame=new JFrame("FlappyBird");
		world w=new world();
		frame.add(w);
		
		frame.setSize(w.getWidth(), w.getHeight());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�ر������
		frame.setLocationRelativeTo(null);//������ʾ
		frame.setResizable(false);
		frame.setVisible(true);
		w.action();
	}
}
