package flying.stegosaurus;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Artist extends JPanel{
	
	private static final long serialVersionUID = -9122639062745369674L;
	public static final long frameRate = 60;
	public static final long frameLength = 1000/frameRate;
	public static final boolean capFrameRate = true;

	public void paintComponent(Graphics g){
		
		long startTime = System.currentTimeMillis();
		
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;

		//FPS counter
		double fps = (double)1000.0/(double)(System.currentTimeMillis() - startTime);
		if(capFrameRate && fps > frameRate){
			
			try{
				Thread.sleep(frameLength - (System.currentTimeMillis() - startTime));
			}
			catch (InterruptedException e){
				e.printStackTrace();
			}
			catch(IllegalArgumentException e){
				//whatever
			}
			fps = (double)1000.0/(double)(System.currentTimeMillis() - startTime);
			
		}
		g2D.drawString(fps + "fps", this.getWidth()/2, this.getHeight()-100);
		
	}

}
