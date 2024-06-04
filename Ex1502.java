import javax.swing.*;

public class Ex1502 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public ExMenu01() {
			setTitle("메뉴 만들기");
			setSize(400, 200);
			
			//menuBar 생성
			JMenuBar menuBar = new JMenuBar();
					
			JMenu m1 = new JMenu("File");
			JMenu m2 = new JMenu("Edit");
			JMenu m3 = new JMenu("Help");
			menuBar.add(menu01); 
			menuBar.add(menu02);
			menuBar.add(menu03);
			
			JMenuItem item01 = new JMenuItem("New");
			JMenuItem item02 = new JMenuItem("Open");
			menu01.add(item01);
			menu02.add(item02);
			
					
			setJManuBar(menuBar);
			
			setLayout(null);
			setVisible(true);
			
		}
		public static void main(String[] args) {
			new ExMenu01();
		}

	}

}
