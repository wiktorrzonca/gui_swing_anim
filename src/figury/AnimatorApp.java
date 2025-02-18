package figury;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AnimatorApp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					final AnimatorApp frame = new AnimatorApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param delay 
	 */
	public AnimatorApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int ww = 450, wh = 300;
		setBounds((screen.width-ww)/2, (screen.height-wh)/2, ww, wh);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		AnimPanel kanwa = new AnimPanel();
		kanwa.setBounds(10, 11, 422, 219);
		contentPane.add(kanwa);
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				kanwa.initialize();
			}
		});

		JButton square = new JButton("Square");
		square.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kanwa.addSquare();
			}
		});
		square.setBounds(30, 239, 80, 23);
		contentPane.add(square);

		JButton elipsa = new JButton("Ellipse");
		elipsa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kanwa.addElipsa();
			}
		});
		elipsa.setBounds(130, 239, 80, 23);
		contentPane.add(elipsa);

		JButton prostokat = new JButton("Rectangle");
		prostokat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kanwa.addProstokat();
			}
		});
		prostokat.setBounds(230, 239, 80, 23);
		contentPane.add(prostokat);

		JButton btnAnimate = new JButton("Animate");
		btnAnimate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kanwa.animate();
			}
		});
		btnAnimate.setBounds(330, 239, 80, 23);
		contentPane.add(btnAnimate);
		
	}

}
