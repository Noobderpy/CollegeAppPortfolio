import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
class KeynasianBeautyContestClient{
	public static void main(String args[])throws Exception{
		InetAddress address1 = InetAddress.getByName("192.168.206.182");
		Socket s=new Socket(address1,3333);
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int myGuess = -1;
    int winnerNum = -1;
    int yourNum = -1;
    double avg = -1.0;
		int wait = 1;
    int num[] = {-1, -1, -1, -1 , -1};
		int alive[] = {1, 1, 1, 1, 1};

  	JFrame theWindow = new JFrame();
		theWindow.setTitle("KeynasianBeautyContest");
		theWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theWindow.setSize(1000, 600);

		Container thePane = theWindow.getContentPane();

		KeynasianBeautyContestPanel thePanel = new KeynasianBeautyContestPanel(new Color(180, 20, 30)); // created an RGB color using a Color constructor

		thePane.add(thePanel);

		theWindow.setVisible(true);

    yourNum = din.readInt();
	  //loop
    while(true)
    {
			System.out.println("Running Round");
			if(alive[yourNum] > 0)
			{
      	while(thePanel.getNumGuess() < 0)
      	{
        	System.out.println("Hello");
      	}
				System.out.println("Getting Everything");
      	myGuess = thePanel.getNumGuess();
      	dout.writeInt(myGuess);
			}
      avg = din.readDouble();
      winnerNum = din.readInt();
      for(int x=0; x<5; x++)
      {
        num[x] = din.readInt();
      }
      thePanel.displayWin(avg, winnerNum, num[0], num[1], num[2], num[3], num[4]);
			for(int x=0; x<5; x++)
      {
        alive[x] = din.readInt();
      }
    }
    //dout.close();
		//din.close();
  	//s.close();
  }
}
