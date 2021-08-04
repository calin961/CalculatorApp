package calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc {

	private JFrame frame;
	private JTextField txtDisplay;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 706);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 60));
		txtDisplay.setBounds(26, 29, 437, 62);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		//Row1--------------------------------------------------------------------------------
		JButton btnbackspace = new JButton("\uF0E7");
		btnbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtDisplay.getText().length() >0 ) {
					
					String backspace = null;
					
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnbackspace.setFont(new Font("Dialog", Font.BOLD, 60));
		btnbackspace.setBounds(28, 115, 100, 100);
		frame.getContentPane().add(btnbackspace);
		
		JButton btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 70));
		btnclear.setBounds(138, 115, 100, 100);
		frame.getContentPane().add(btnclear);
		
		JButton btnModulus = new JButton("%");
		btnModulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btnModulus.setFont(new Font("Tahoma", Font.BOLD, 50));
		btnModulus.setBounds(248, 115, 100, 100);
		frame.getContentPane().add(btnModulus);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 70));
		btnPlus.setBounds(363, 115, 100, 100);
		frame.getContentPane().add(btnPlus);
		
		//Row2---------------------------------------------------------------------------------
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn7.setBounds(26, 225, 100, 100);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn8.setBounds(138, 225, 100, 100);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn9.setBounds(248, 225, 100, 100);
		frame.getContentPane().add(btn9);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 70));
		btnMinus.setBounds(363, 225, 100, 100);
		frame.getContentPane().add(btnMinus);
		
		//Row3----------------------------------------------------------------------------
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn4.setBounds(26, 335, 100, 100);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn5.setBounds(138, 335, 100, 100);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn6.setBounds(248, 335, 100, 100);
		frame.getContentPane().add(btn6);
		
		JButton btnx = new JButton("*");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnx.setFont(new Font("Tahoma", Font.BOLD, 70));
		btnx.setBounds(363, 335, 100, 100);
		frame.getContentPane().add(btnx);
		
		//Row4--------------------------------------------------------------------------------
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn1.setBounds(26, 445, 100, 100);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn2.setBounds(138, 445, 100, 100);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn3.setBounds(248, 445, 100, 100);
		frame.getContentPane().add(btn3);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 70));
		btnDivide.setBounds(363, 445, 100, 100);
		frame.getContentPane().add(btnDivide);
		
		//Row5--------------------------------------------------------------------
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn0.setBounds(26, 559, 100, 100);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = txtDisplay.getText() + btnDot.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 70));
		btnDot.setBounds(138, 559, 100, 100);
		frame.getContentPane().add(btnDot);
		
		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double plusminus = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				plusminus = plusminus*(-1);
				txtDisplay.setText(String.valueOf(plusminus));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 70));
		btnPM.setBounds(248, 559, 100, 100);
		frame.getContentPane().add(btnPM);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				
				if(operations == "+") 
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 70));
		btnEqual.setBounds(363, 559, 100, 100);
		frame.getContentPane().add(btnEqual);
	}
}
