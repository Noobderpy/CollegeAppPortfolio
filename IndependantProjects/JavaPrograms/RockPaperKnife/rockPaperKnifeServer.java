import java.awt.Color;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import javax.swing.JFrame;
import java.util.*;
import java.lang.Math;

class rockPaperKnifeServer {
   public static void main(String[] args) throws Exception {
      ServerSocket server = new ServerSocket(3333);
      Socket socket1 = server.accept();
      Socket socket2 = server.accept();
      DataInputStream din1 = new DataInputStream(socket1.getInputStream());
      DataInputStream din2 = new DataInputStream(socket2.getInputStream());
      DataOutputStream dout1 = new DataOutputStream(socket1.getOutputStream());
      DataOutputStream dout2 = new DataOutputStream(socket2.getOutputStream());
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int winner;
      int[] choices = {-1, -1};
      int[][] cardsLeft = new int[2][4];
      for(int x=0;x<2;x++)
      {
        for(int y=0; y<4; y++)
        {
          cardsLeft[x][y] = 4;
        }
      }
      int[] scores = {0, 0};
      dout1.writeInt(0);
      dout2.writeInt(1);
      System.out.println("Giving playNums");

      for(int i = 0; i<12; i++)
      {
          choices[0] = din1.readInt();
          choices[1] = din2.readInt();
          System.out.println(choices[0] + " " + choices[1]);
          dout1.writeInt(choices[0]);
          dout2.writeInt(choices[0]);
          dout1.writeInt(choices[1]);
          dout2.writeInt(choices[1]);
          if((choices[0] == 0 && choices[1] == 2) || (choices[0] == 1 && choices[1] == 0) || (choices[0] == 2 && choices[1] == 1))
          {
            winner = 0;
          }
          else if((choices[0] == 0 && choices[1] == 1) || (choices[0] == 1 && choices[1] == 2) || (choices[0] == 2 && choices[1] == 0))
          {
            winner = 1;
          }
          else
          {
            winner = -1;
          }
            System.out.println(winner);
          dout1.writeInt(winner);
          dout2.writeInt(winner);
      }

      din1.close();
      din2.close();
      dout1.close();
      dout2.close();
      socket1.close();
      socket2.close();
      server.close();
   }
}
