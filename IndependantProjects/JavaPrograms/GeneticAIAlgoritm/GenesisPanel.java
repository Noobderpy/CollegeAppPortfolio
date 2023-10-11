import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class GenesisPanel extends JPanel implements ActionListener, KeyListener
{
  final int ROWS = 15;
  final int COLUMNS = 10;
  int[][] walls = new int[COLUMNS][ROWS];

	boolean sendInfo = false;
  int holder = -1;
  Scanner input = new Scanner(System.in);
	JButton[][] buttons = new JButton[COLUMNS][ROWS];
  JButton FinishedButton;
  JTextField key;

  public GenesisPanel (Color c)
  {
    setBackground(c);
      for(int i = 0; i < COLUMNS; i++)
      {
        for(int j = 0; j < ROWS; j++)
        {
          /*walls[i][j] = 1;
          buttons[i][j] = new JButton();
          buttons[i][j].addActionListener(this);
          buttons[i][j].setBackground(Color.black);*/
          walls[i][j] = 0;
          buttons[i][j] = new JButton();
          buttons[i][j].addActionListener(this);
          buttons[i][j].setBackground(Color.white);
          add(buttons[i][j]);
      }
    }
    key = new JTextField();
    buttons[0][0].addKeyListener(this);
    //FinishedButton = new JButton("Finished");
    //FinishedButton.addActionListener(this);

    setLayout(new GridLayout(COLUMNS, ROWS));
    //add(FinishedButton);
  }

  public void keyPressed(KeyEvent e) {
    sendInfo = true;
  }
  public void keyReleased(KeyEvent e) {

  }
  public void keyTyped(KeyEvent e) {

  }

  public void actionPerformed(ActionEvent e) {
    if(!sendInfo)
    {
      JButton src = (JButton) e.getSource();
      /*if(src == FinishedButton)
      {
        sendInfo = true;
      }
      else*/

      for (int i = 0; i < COLUMNS; i++)
      {
        for( int j = 0; j < ROWS; j++)
        {
          if (src==buttons[i][j])
          {
            if(buttons[i][j].getBackground() == Color.black)
            {
              walls[i][j] = 0;
              buttons[i][j].setBackground(Color.white);
            }
            else
            {
              walls[i][j] = 1;
              buttons[i][j].setBackground(Color.black);
            }
            //System.out.println(i + " : " + j);
          }
        }
      }
    }
  }

  public boolean getInfo()
  {
    return sendInfo;
  }

  public void bestPosition(int x, int y)
  {
    buttons[x][y].setBackground(Color.green);
  }

  public void removePosition(int x, int y)
  {
    if(walls[x][y] == 1)
      buttons[x][y].setBackground(Color.black);
    else
      buttons[x][y].setBackground(Color.white);
  }

  public int sendWalls(int x, int y)
  {
    return walls[x][y];
  }
}
