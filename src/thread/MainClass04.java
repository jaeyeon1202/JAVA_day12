package thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
class A04 extends Thread{
	public void run() {
		Scanner input = new Scanner(System.in);
		String str;
		while(true) {
			System.out.println("입력: ");
			str=input.next();
			System.out.println("값: "+str);
		}
	}
}

public class MainClass04 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("제목");
		Container c = frame.getContentPane();
		
		JLabel label = new JLabel("test gui");
		c.add(label);
		label.setFont(new Font(null, Font.ITALIC,32));
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.setLocation(1000, 200);
		frame.setPreferredSize(new Dimension(500, 200));
		frame.pack(); //프레임 사이즈 설정
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label.setText("웩! 집에가고싶다~!");
	}
}
