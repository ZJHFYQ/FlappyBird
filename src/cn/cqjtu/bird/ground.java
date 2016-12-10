package cn.cqjtu.bird;

import java.awt.Graphics;
import java.awt.Window;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ground {
	
	private int x;
	private int y;
	private BufferedImage scroll;
	private int height;
	private int width;
	
	public  ground(int y){
		this.y=y;
		try {
			scroll=ImageIO.read(this.getClass().getResource("ground.png"));
			height=scroll.getHeight();
			width=scroll.getWidth();
			x=0;
		} catch (IOException e) {
		}
	}
	
	public void paint(Graphics g){
		g.drawImage(scroll,x,y,null);
	}
	
	public void step(int wid){		
		if(Math.abs(x)+wid==this.width)
		{
			x=0;
		}
		else{
			x--;
		}
	}
	
	
}
