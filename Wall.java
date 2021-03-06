

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Wall extends GameObject{
	//Screen dimensions
	double scale;
			
	
	public Wall(double x, double y, double width, double height, double scale, ID id)
	{
		super(x, y, width*scale, height*scale, id);
		this.scale = scale;

	}
	
	public void addDamage(double dt){
		
	}

	public Rectangle2D getBounds2D(){
		return new Rectangle2D.Double(x, y, width, height);
	}
	
	public void tick(double delta, double dt){
		
	}
	
	public void render(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rect = new Rectangle2D.Double(x, y, width, height);
		g2.setColor(Color.red);
	    g2.fill(rect);
	}
	
}
