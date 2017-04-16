package yzh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calWin extends JFrame
{

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					calWin frame = new calWin();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calWin()
	{
		setTitle("\u8BA1\u7B97\u5668");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 323);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 424, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		final String s="";
		final JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s+="1";
				textField.setText(s);
			}
		});
		btnNewButton.setBounds(10, 40, 51, 36);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("4");
		button.setBounds(10, 99, 39, 36);
		contentPane.add(button);
		
		JButton button_1 = new JButton("6");
		button_1.setBounds(135, 99, 39, 36);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("7");
		button_2.setBounds(10, 159, 39, 36);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.setBounds(71, 99, 39, 36);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("2");
		button_4.setBounds(71, 40, 39, 36);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("3");
		button_5.setBounds(135, 40, 39, 36);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton(".");
		button_6.setBounds(71, 218, 39, 36);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.setBounds(135, 159, 39, 36);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.setBounds(71, 159, 39, 36);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("+");
		button_9.setBounds(212, 40, 39, 36);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.setBounds(212, 99, 39, 36);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("*");
		button_11.setBounds(212, 159, 39, 36);
		contentPane.add(button_11);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(291, 40, 39, 36);
		contentPane.add(btnC);
		
		JButton button_13 = new JButton("0");
		button_13.setBounds(10, 218, 39, 36);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("=");
		button_14.setBounds(135, 218, 39, 36);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("1");
		button_15.setBounds(291, 99, 39, 36);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("/");
		button_16.setBounds(212, 218, 39, 36);
		contentPane.add(button_16);
	}

}
