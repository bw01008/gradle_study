package gradle_study;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gradle_study.ui.DepartmentUI;
import gradle_study.ui.TitleUI;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnDepartment;
	private JButton btnTitle;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserUI frame = new UserUI();
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
	public UserUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblTitle = new JLabel("UserUI");
		lblTitle.setFont(new Font("굴림", Font.BOLD, 40));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitle, BorderLayout.CENTER);
		
		JPanel pBtn = new JPanel();
		contentPane.add(pBtn, BorderLayout.SOUTH);
		
		btnDepartment = new JButton("부서");
		btnDepartment.addActionListener(this);
		pBtn.add(btnDepartment);
		
		btnTitle = new JButton("직책");
		btnTitle.addActionListener(this);
		pBtn.add(btnTitle);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnTitle) {
			actionPerformedBtnTitle(arg0);
		}
		if (arg0.getSource() == btnDepartment) {
			actionPerformedBtnDepartment(arg0);
		}
	}
	protected void actionPerformedBtnDepartment(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null, "부서버튼 클릭");
		DepartmentUI frame = new DepartmentUI();
		frame.setVisible(true);
	}
	protected void actionPerformedBtnTitle(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null, "직책버튼 클릭");
		TitleUI frame = new TitleUI();
		frame.setVisible(true);
	}
}
