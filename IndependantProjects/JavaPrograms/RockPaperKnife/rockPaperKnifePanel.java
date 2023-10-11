import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class rockPaperKnifePanel extends JPanel implements ActionListener
{
  int numGuess = -1;
	JTextField report;
  JTextField choicesLeft;
  JTextField selection;
	JButton[] buttons = new JButton[3];
  int[] scores = {0, 0};
  String[] names = {"Rock", "Paper", "Knife"};
  int[] choices = {4, 4, 4};
  public rockPaperKnifePanel (Color c)
  {
    setBackground(c);
    report = new JTextField("-1");
    selection = new JTextField("-1");
    add(report);
    add(selection);
    report.setEditable(false);
    selection.setEditable(false);
    report.setVisible(false);
    selection.setVisible(false);
    choicesLeft = new JTextField("Rock: " + choices[0] + " Paper: " + choices[1] + "Knife: " + choices[2]);
    add(choicesLeft);
    choicesLeft.setEditable(false);
    choicesLeft.setVisible(true);
    for(int i= 0;i < 3; i++){
      buttons[i] = new JButton(names[i]);
      buttons[i].addActionListener(this);
      add(buttons[i]);
    }
  }

  public void actionPerformed(ActionEvent e) {
    JButton src = (JButton) e.getSource();
    for (int i = 0; i < buttons.length; i++) {
      if(choices[i] > 0)
      {
        if (src==buttons[i]) {
          numGuess = i;
          choices[i]--;
        }
        buttons[i].setVisible(false);
      }
    }
    selection.setText(Integer.toString(numGuess));
    selection.setFont(new Font("Serif", Font.BOLD, 400));
    selection.setVisible(true);
    choicesLeft.setVisible(false);
  }
  public int getNumGuess()
  {
    return numGuess;
  }
  public void displayWin(int choice1, int choice2, int winner) throws InterruptedException
  {
    Thread.sleep(1000);
    selection.setVisible(false);
    report.setVisible(true);
    numGuess = -1;
    report.setColumns(50);
    report.setText("Player 1: " + choice1 + "Player 2: " + choice2);
    Thread.sleep(5000);
    report.setText("The Winner is: Player " + (winner + 1));
    for(int x=0;x<5;x++)
    {
      if(x == winner)
      {
        scores[x] += 1;
      }
    }
    Thread.sleep(5000);
    report.setText("The scores are now as follows: Player 1: " + scores[0] + "Player 2: " + scores[1]);
    Thread.sleep(5000);
    report.setVisible(false);
    choicesLeft.setText("Rock: " + choices[0] + " Paper: " + choices[1] + "Knife: " + choices[2]);
    choicesLeft.setVisible(true);
    for(int x = 0; x<3; x++)
    {
      if(choices[x] > 0)
        buttons[x].setVisible(true);
    }
  }
}
