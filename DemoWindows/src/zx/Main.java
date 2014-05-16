package zx;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import com.alee.laf.WebLookAndFeel;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		WebLookAndFeel.install();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 581, 113, 0 };
		gbl_contentPane.rowHeights = new int[] { 377, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 1.0,
				Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 0;
		contentPane.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 0, 0 };
		gbl_panel_2.rowHeights = new int[] { 0, 0 };
		gbl_panel_2.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);

		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 0;
		panel_2.add(scrollPane_1, gbc_scrollPane_1);

		JTextPane txtpnMessages = new JTextPane();
		txtpnMessages.setEditable(false);
		scrollPane_1.setViewportView(txtpnMessages);
		txtpnMessages.setText("messages");

		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 2;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		contentPane.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 0, 0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		JButton btnCharacters = new JButton("Characters");
		GridBagConstraints gbc_btnCharacters = new GridBagConstraints();
		gbc_btnCharacters.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCharacters.insets = new Insets(0, 0, 5, 0);
		gbc_btnCharacters.gridx = 0;
		gbc_btnCharacters.gridy = 0;
		panel_1.add(btnCharacters, gbc_btnCharacters);

		JButton btnDice = new JButton("Dice");
		GridBagConstraints gbc_btnDice = new GridBagConstraints();
		gbc_btnDice.insets = new Insets(0, 0, 5, 0);
		gbc_btnDice.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDice.gridx = 0;
		gbc_btnDice.gridy = 1;
		panel_1.add(btnDice, gbc_btnDice);

		JButton btnConnect = new JButton("Connect");
		GridBagConstraints gbc_btnConnect = new GridBagConstraints();
		gbc_btnConnect.insets = new Insets(0, 0, 5, 0);
		gbc_btnConnect.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnConnect.gridx = 0;
		gbc_btnConnect.gridy = 2;
		panel_1.add(btnConnect, gbc_btnConnect);

		JButton btnDisconnect = new JButton("Disconnect");
		GridBagConstraints gbc_btnDisconnect = new GridBagConstraints();
		gbc_btnDisconnect.insets = new Insets(0, 0, 5, 0);
		gbc_btnDisconnect.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDisconnect.gridx = 0;
		gbc_btnDisconnect.gridy = 3;
		panel_1.add(btnDisconnect, gbc_btnDisconnect);

		JButton btnLogin = new JButton("Login");
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLogin.gridx = 0;
		gbc_btnLogin.gridy = 4;
		panel_1.add(btnLogin, gbc_btnLogin);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		panel.add(scrollPane, gbc_scrollPane);

		JTextArea txtrMessage = new JTextArea();
		txtrMessage.setLineWrap(true);
		scrollPane.setViewportView(txtrMessage);
		txtrMessage.setText("message");

		JButton btnSend = new JButton("Say");
		GridBagConstraints gbc_btnSend = new GridBagConstraints();
		gbc_btnSend.insets = new Insets(0, 0, 5, 0);
		gbc_btnSend.gridx = 1;
		gbc_btnSend.gridy = 0;
		panel.add(btnSend, gbc_btnSend);

		JButton btnDo = new JButton("Do");
		GridBagConstraints gbc_btnDo = new GridBagConstraints();
		gbc_btnDo.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDo.gridx = 1;
		gbc_btnDo.gridy = 1;
		panel.add(btnDo, gbc_btnDo);
	}
}
