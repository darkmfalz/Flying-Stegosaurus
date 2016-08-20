package flying.stegosaurus;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Artist extends JPanel{
	
	private static final long serialVersionUID = -9122639062745369674L;

	public void paintComponent(Graphics g){
		
		long startTime = System.currentTimeMillis();
		
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;

		//FPS counter
		g2D.drawString((double)1000.0/(double)(System.currentTimeMillis() - startTime) + "fps", this.getWidth()/2, this.getHeight()-100);
		
	}

}
