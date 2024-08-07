package pong;

import java.awt.*;
import javax.swing.JComponent;

@SuppressWarnings("serial")
public class ShapeDrawing extends JComponent {

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.white);
		g2.fillRect(25, 200, 25, 150);
	}

}
