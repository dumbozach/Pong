package pong;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComponent;
import javax.swing.*;

public class Main {

	JFrame frame;
	JPanel panel;

	@SuppressWarnings("static-access")
	public Main() {

		frame = new JFrame();
		frame.setSize(700, 600);

		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		panel.setLayout(new GridLayout(0, 1));
		panel.setSize(frame.WIDTH, frame.HEIGHT);
		panel.setBackground(Color.black);
		panel.add(new ShapeDrawing());

		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);

	}

	public static void main(String[] args) {
		new Main();
	}

}
