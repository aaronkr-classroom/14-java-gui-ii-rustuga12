// #4 예시 : 무명 클래스
import java.awt.event.*;

import javax.swing.JButton;

import java.applet.*;

public class Ex1501 extends JFrame {

	JPanel panel = new JPanel();
	add(panel);
	
	JButton button = new JButton("버튼을 누르세요.");
	panel.add(button);
	
	//익명 클래스를 사용하기
	button.addActinListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			button.setText("버튼이 눌렸습니다!~");

		}
	});
}
