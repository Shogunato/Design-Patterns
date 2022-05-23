import classes.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MementoMain extends JFrame{
   public static void main(String[] args) {
       
	   new MementoMain();
       
   }
   
   //UI
   private JButton saveBut, undoBut, redoBut;
   
   private JTextArea theArticle = new JTextArea(40,60);
   
   Caretaker caretaker = new Caretaker();
   
   Originator originator = new Originator();
   
   int savedFiles = 0, currentArticle = 0;
   
   public MementoMain(){
	   
	   this.setSize(750,780);
	   this.setTitle("Memento Design Pattern");
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   JPanel panel1 = new JPanel();
	   
	   panel1.add(new JLabel("Article"));
	   panel1.add(theArticle);
	   
	   
	   ButtonListener saveListener = new ButtonListener();
	   ButtonListener undoListener = new ButtonListener();
	   ButtonListener redoListener = new ButtonListener();
	   
	   saveBut = new JButton("Save");
	   saveBut.addActionListener(saveListener);
	   
	   undoBut = new JButton("Undo");
	   undoBut.addActionListener(undoListener);
	   
	   redoBut = new JButton("Redo");
	   redoBut.addActionListener(redoListener);
	   
	   panel1.add(saveBut);
	   panel1.add(undoBut);
	   panel1.add(redoBut);
	   
	   this.add(panel1);
	   this.setVisible(true);
	   
   }
   
   class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			//Save Button code
			if(e.getSource() == saveBut){	
				
				String textInTextArea = theArticle.getText();
							
				originator.setArticle(textInTextArea);
				
				caretaker.addMemento( originator.storeMemento() );
				
				savedFiles++;
				currentArticle++;
				
				System.out.println("Save Files " + savedFiles);
				
				undoBut.setEnabled(true);
				
			//Undo Button code
			} else if(e.getSource() == undoBut){
					
					if(currentArticle >= 1){
						
						currentArticle--;
					
						String textBoxString = originator.restoreFromMemento( caretaker.getMemento(currentArticle) );
						
						theArticle.setText(textBoxString);
						
						redoBut.setEnabled(true);
					
					} else {
						
						undoBut.setEnabled(false);
						
					}
					
				//Redo Button code
				} else if(e.getSource() == redoBut){
					
					if((savedFiles - 1) > currentArticle){
						
						currentArticle++;
					
						String textBoxString = originator.restoreFromMemento( caretaker.getMemento(currentArticle) );
						
						theArticle.setText(textBoxString);
						
						undoBut.setEnabled(true);
					
					} else {
						
						redoBut.setEnabled(false);
						
					}
					
				}
			
		}
		
	}
   
}
