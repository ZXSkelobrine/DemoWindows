package zx;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.alee.laf.WebLookAndFeel;

public class Dice extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dice frame = new Dice();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Dice() {
		WebLookAndFeel.install();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 197, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblStatu = new JLabel("Status");
		lblStatu.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatu.setBounds(72, 11, 46, 14);
		contentPane.add(lblStatu);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(30, 48, 131, 125);
		contentPane.add(panel);

		JButton btnDismiss = new JButton("Dismiss");
		btnDismiss.setBounds(51, 199, 89, 23);
		contentPane.add(btnDismiss);
	}
}
