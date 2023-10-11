import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
class rockPaperKnifeClient{
	public static void main(String args[])throws Exception{
		InetAddress address1 = InetAddress.getByName("127.0.0.1");
		Socket s=new Socket(address1,3333);
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int yourNum;
    int chosenNum;
    int[] choices = {0, 0};
    int winner;

  	JFrame theWindow = new JFrame();
		theWindow.setTitle("RPK");
		theWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theWindow.setSize(1000, 600);

		Container thePane = theWindow.getContentPane();

		rockPaperKnifePanel thePanel = new rockPaperKnifePanel(new Color(180, 20, 30)); // created an RGB color using a Color constructor

		thePane.add(thePanel);

		theWindow.setVisible(true);

    yourNum = din.readInt();
    while(true)
    {
      while(thePanel.getNumGuess() < 0)
      {
        System.out.println(thePanel.getNumGuess());
      }
      dout.writeInt(thePanel.getNumGuess());
      System.out.println("sentChoice " + thePanel.getNumGuess());
      for(int x = 0; x<2; x++)
      {
        choices[x] = din.readInt();
      }
      winner = din.readInt();
      thePanel.displayWin(choices[0], choices[1], winner);
    }


    //dout.close();
		//din.close();
  	//s.close();
  }
}
