package flying.stegosaurus;

import javax.swing.JFrame;

public class Commander{
	
	private static JFrame frame;
	private static Artist artist;
	
	public static void main(String[] args) throws Throwable{
		
		//Create the frame
		frame = new JFrame();
		//Create the artist
		artist = new Artist();
		//Add the artist to the frame
		frame.getContentPane().add(artist);
		//Make the frame closeable
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Packs the frame so everything fits
		frame.pack();
		//Sets the frame as resizeable
		frame.setResizable(true);
		//Centers the frame
		frame.setLocationRelativeTo(null);
		//Makes the frame visible
		frame.setVisible(true);

		//Game loop
		while(true){
			
			artist.repaint();
			
		}
		
	}
	
}
