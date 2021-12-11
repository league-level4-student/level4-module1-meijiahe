package _06_Snake;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class SnakeSegment {
	private Location location;
	private int size;
	public BufferedImage image; 
	public boolean needImage = true;
	public boolean gotImage = false;	
	public boolean isHead = false;

	public SnakeSegment(Location loc, int size, boolean isHead) {
		this.location = loc;
		this.size = size;
		this.isHead = isHead;
		if (needImage) {
		    if (isHead == true) {
		    	 loadImage ("snake head.png");
		    }
		}
	}
	
	public void setLocation(Location loc) {
		this.location = loc;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void draw(Graphics g) {
		g.setColor(Snake.SNAKE_COLOR);
		if (gotImage == true) {
			g.drawImage(image,location.x * size, location.y * size, size, size,null);
		}
		else {
			g.fillRect(location.x*size, location.y*size, size, size);
		}
	}
	
	void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	}
}
