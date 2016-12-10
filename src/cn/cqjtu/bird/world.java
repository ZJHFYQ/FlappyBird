package cn.cqjtu.bird;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class world extends JPanel{
	private int height;
	private int width;
	private BufferedImage background;
	private BufferedImage startImage;
	
	public world(){	
		try {
			background=ImageIO.read(this.getClass().getResource("bg.png"));
			height=background.getHeight();
			width=background.getWidth();
			startImage=ImageIO.read(this.getClass().getResource("start.png"));
		} catch (IOException e) {
		}
	}
	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}
	@Override
	public void paint(Graphics g) {
		g.drawImage(background, 0, 0, null);
		g.drawImage(startImage, 0, 0,null);
	}
	
	
	public static void main(String[] args) {
		JFrame frame=new JFrame("FlappyBird");
		world w=new world();
		System.out.println(w.toString());
		frame.add(w);
		frame.setSize(w.width, w.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭虚拟机
		frame.setLocationRelativeTo(null);//居中显示
		frame.setResizable(false);
		frame.setVisible(true);
	}
}


