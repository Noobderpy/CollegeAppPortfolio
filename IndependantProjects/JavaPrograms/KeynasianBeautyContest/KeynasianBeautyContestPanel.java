import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KeynasianBeautyContestPanel extends JPanel implements ActionListener
{
  int numGuess = -1;
	JTextField numSelectText;
	JTextField theNumbers;
	JButton[] buttons = new JButton[101];
  int[] scores = {0, 0, 0, 0, 0};
  String[] names = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"};
  public KeynasianBeautyContestPanel (Color c)
  {
    setBackground(c);
    numSelectText = new JTextField("-1");
    add(numSelectText);
    numSelectText.setEditable(false);
    numSelectText.setVisible(false);
    theNumbers = new JTextField("-1");
    add(theNumbers);
    theNumbers.setEditable(false);
    theNumbers.setVisible(false);
    for(int i= 0;i < 101; i++){
      buttons[i] = new JButton(names[i]);
      buttons[i].addActionListener(this);
      add(buttons[i]);
    }
  }

  public void actionPerformed(ActionEvent e) {
    JButton src = (JButton) e.getSource();
    for (int i = 0; i < buttons.length; i++) {
      if (src==buttons[i]) {
         numGuess = i;
      }
      buttons[i].setVisible(false);
    }
    numSelectText.setText(Integer.toString(numGuess));
    numSelectText.setFont(new Font("Serif", Font.BOLD, 400));
    numSelectText.setVisible(true);
  }
  public int getNumGuess()
  {
    return numGuess;
  }
  public void displayWin(double avg, int winNum, int num1, int num2, int num3, int num4, int num5) throws InterruptedException
  {
    Thread.sleep(1000);
    numGuess = -1;
    numSelectText.setVisible(false);
    theNumbers.setColumns(50);
    theNumbers.setText("Player 1: " + num1 + "Player 2: " + num2 + "Player 3: " + num3 + "Player 4: " + num4 + "Player 5: " + num5);
    theNumbers.setVisible(true);
    Thread.sleep(5000);
    theNumbers.setText("The average of the numbers was: " + avg + ", after multiplying by 0.8 the new number is: " + (avg*0.8));
    //theAverage.setVisible(true);
    Thread.sleep(5000);
    theNumbers.setText("The Winner is: Player " + (winNum + 1));
    //theWinner.setVisible(true);
    for(int x=0;x<5;x++)
    {
      if(x != (winNum))
      {
        scores[x] -= 1;
      }
    }
    Thread.sleep(5000);
    theNumbers.setText("The scores are now as follows: Player 1: " + scores[0] + "Player 2: " + scores[1] + "Player 3: " + scores[2] + "Player 4: " + scores[3] + "Player 5: " + scores[4]);
    Thread.sleep(5000);
    theNumbers.setVisible(false);
    for(int x = 0; x<101; x++)
    {
      buttons[x].setVisible(true);
    }
  }
}
