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
	private ground gro;
	
	public world(){	
		try {
			background=ImageIO.read(this.getClass().getResource("bg.png"));
			height=background.getHeight();
			width=background.getWidth();
			startImage=ImageIO.read(this.getClass().getResource("start.png"));
			gro=new ground(400);
			
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
		gro.paint(g);//»æÖÆ¹ö¶¯Ìõ
	}
	
	
	public void action(){
		while(true)
		{
			try {
				gro.step(this.width);
				repaint();
				Thread.currentThread().sleep(1000/60);
			} catch (InterruptedException e) {
			}
		}
	}
	
}


