import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.Font;

public class SortFrame {
	private JFrame frmSortingElementsUsing;
	private JTextField textField;
	private JTextField textField_1;
	int iArr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					SortFrame window = new SortFrame();
					window.frmSortingElementsUsing.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SortFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSortingElementsUsing = new JFrame();
		frmSortingElementsUsing.setTitle("Sorting Elements Using Swing");
		frmSortingElementsUsing.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Public\\Pictures\\Sample Pictures\\Hydrangeas.jpg"));
		frmSortingElementsUsing.getContentPane().setBackground(Color.CYAN);
		frmSortingElementsUsing.setBounds(100, 100, 557, 398);
		frmSortingElementsUsing.setBackground(Color.cyan);
		frmSortingElementsUsing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSortingElementsUsing.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SORTING ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(239, 23, 190, 34);
		frmSortingElementsUsing.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(164, 76, 367, 34);
		frmSortingElementsUsing.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter The Element");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBackground(Color.GREEN);
		lblNewLabel_1.setBounds(32, 75, 128, 34);
		frmSortingElementsUsing.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sorted Element");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(32, 163, 96, 27);
		frmSortingElementsUsing.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(172, 160, 359, 34);
		frmSortingElementsUsing.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("SORT");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"Insert some value");
				}
				/*else {
					String s=textField.getText();
					//String c[]=s.split("\\s");
					char c1[]=s.toCharArray();
	                int l=c1.length;
	                char t;
	                for(int i=0;i<l;i++) {
	                	for(int j=1+i;j<l;j++) {
	                		if(c1[i]>c1[j]) {
	                		t=c1[i];
	                		c1[i]=c1[j];
	                		c1[j]=t;
	                		}
	                	}
	                }
	                String str=String.valueOf(c1);
	                StringBuilder sb = new StringBuilder(str);
	                for (int i=1; i<sb.length(); i+=2)
	                    sb.insert(i,' ');
	                textField_1.setText(sb.toString());
				}*/
				else {
					String str=textField.getText();
					String sp[]=str.split("\\s");
					
					int slen=sp.length;
					int iArr[]=new int[slen];
					String str1[]=new String[iArr.length];
					int t;
					for(int i=0;i<slen;i++) {
						iArr[i]=Integer.parseInt(sp[i]);
					}
					for(int i=0;i<slen;i++) {
						
						for(int j=i+1;j<slen;j++) {
							if(iArr[i]>=iArr[j]) {
								t=iArr[i];
								iArr[i]=iArr[j];
								iArr[j]=t;
								
							}
						}
						
					}
					for(int k=0;k<iArr.length;k++) {
						str1[k]=String.valueOf(iArr[k]);
					}
					textField_1.setText(Arrays.toString(str1));
					
				}
			}
		});
		btnNewButton.setBounds(195, 223, 89, 23);
		frmSortingElementsUsing.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" ");
				textField_1.setText(" ");
			}
		});
		btnNewButton_1.setBounds(312, 223, 89, 23);
		frmSortingElementsUsing.getContentPane().add(btnNewButton_1);
	}
}
