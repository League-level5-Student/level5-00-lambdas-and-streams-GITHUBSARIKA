package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		addNumbers.addActionListener((ActionEvent e)->{
			String numOne=JOptionPane.showInputDialog("Type a number.");
			int yay=Integer.parseInt(numOne);
			String numTwo=JOptionPane.showInputDialog("Type a number.");
			int unicorn=Integer.parseInt(numTwo);
			System.out.println("The sum is " + (yay+unicorn));
		});
		randNumber.addActionListener((ActionEvent e)->{
			Random random=new Random();
			int r=random.nextInt();
			System.out.println(r);
		});
		tellAJoke.addActionListener((ActionEvent e)->{
			JOptionPane.showMessageDialog(null, "Hear about the new restarant called Karma?");
			JOptionPane.showMessageDialog(null,"There is no menu: You get what you deserve.");          
		});
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
