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

class KeynasianBeautyContestServer {
   public static void main(String[] args) throws Exception {
      ServerSocket server = new ServerSocket(3333);
      Socket socket1 = server.accept();
      Socket socket2 = server.accept();
      Socket socket3 = server.accept();
      Socket socket4 = server.accept();
      Socket socket5 = server.accept();
      DataInputStream din1 = new DataInputStream(socket1.getInputStream());
      DataInputStream din2 = new DataInputStream(socket2.getInputStream());
      DataInputStream din3 = new DataInputStream(socket3.getInputStream());
      DataInputStream din4 = new DataInputStream(socket4.getInputStream());
      DataInputStream din5 = new DataInputStream(socket5.getInputStream());
      DataOutputStream dout1 = new DataOutputStream(socket1.getOutputStream());
      DataOutputStream dout2 = new DataOutputStream(socket2.getOutputStream());
      DataOutputStream dout3 = new DataOutputStream(socket3.getOutputStream());
      DataOutputStream dout4 = new DataOutputStream(socket4.getOutputStream());
      DataOutputStream dout5 = new DataOutputStream(socket5.getOutputStream());
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      double holder = -1;
      int winNum = -1;
      double total = 0;
      int[] scoresSubmitted = {-1, -1, -1, -1, -1};
      int[] playersAlive = {1, 1, 1, 1, 1};
      int totalAlive = 5;
      int[] scores = {0, 0, 0, 0, 0};
      double avg = -1;
      double winScore = -1;
      dout1.writeInt(0);
      dout2.writeInt(1);
      dout3.writeInt(2);
      dout4.writeInt(3);
      dout5.writeInt(4);

      //loop
      while(totalAlive > 1)
      {
        if(playersAlive[0] > 0)
          scoresSubmitted[0] = din1.readInt();
        else
          scoresSubmitted[0] = -1;
        if(playersAlive[1] > 0)
          scoresSubmitted[1] = din2.readInt();
        else
          scoresSubmitted[1] = -1;
        if(playersAlive[2] > 0)
          scoresSubmitted[2] = din3.readInt();
        else
          scoresSubmitted[2] = -1;
        if(playersAlive[3] > 0)
          scoresSubmitted[3] = din4.readInt();
        else
          scoresSubmitted[3] = -1;
        if(playersAlive[4] > 0)
          scoresSubmitted[4] = din5.readInt();
        else
          scoresSubmitted[4] = -1;

        total = 0;
        avg = 0;
        for(int x = 0; x<5; x++)
        {
          if(playersAlive[x] > 0)
          {
            avg += scoresSubmitted[x];
            total++;
          }
        }
        avg = avg/total;
        winScore = avg * 0.8;
        //System.out.println("avg: " + avg + "win: " + winScore);

        holder = Math.abs(scoresSubmitted[0] - winScore);
        winNum = 0;
        for(int x = 1; x<5; x++)
        {
          if(playersAlive[x] > 0)
          {
            if(Math.abs(scoresSubmitted[x] - winScore) < holder)
            {
              holder = Math.abs(scoresSubmitted[x] - winScore);
              winNum = x;
            }
            else if(Math.abs(scoresSubmitted[x] - winScore) == holder)
            {
              winNum = -1;
            }
          }
        }

        for(int x=0;x<5;x++)
        {
          if(x != (winNum))
          {
            scores[x] -= 1;
          }
        }
        dout1.writeDouble(avg);
        dout1.writeInt(winNum);
        dout2.writeDouble(avg);
        dout2.writeInt(winNum);
        dout3.writeDouble(avg);
        dout3.writeInt(winNum);
        dout4.writeDouble(avg);
        dout4.writeInt(winNum);
        dout5.writeDouble(avg);
        dout5.writeInt(winNum);
        for(int x=0; x<5; x++)
        {
          dout1.writeInt(scoresSubmitted[x]);
          dout2.writeInt(scoresSubmitted[x]);
          dout3.writeInt(scoresSubmitted[x]);
          dout4.writeInt(scoresSubmitted[x]);
          dout5.writeInt(scoresSubmitted[x]);
        }
        totalAlive = 5;
        for(int x=0;x<5;x++)
        {
          if(scores[x] <= -10)
          {
            playersAlive[x] = 0;
            totalAlive--;
          }
          System.out.println(playersAlive[x] + "Score: " + scores[x]);
          if(playersAlive[x] > 0)
          {
            dout1.writeInt(1);
            dout2.writeInt(1);
            dout3.writeInt(1);
            dout4.writeInt(1);
            dout5.writeInt(1);
          }
          else
          {
            dout1.writeInt(0);
            dout2.writeInt(0);
            dout3.writeInt(0);
            dout4.writeInt(0);
            dout5.writeInt(0);
          }
        }
      }

      din1.close();
      din2.close();
      din3.close();
      din4.close();
      din5.close();
      dout1.close();
      dout2.close();
      dout3.close();
      dout4.close();
      dout5.close();
      socket1.close();
      socket2.close();
      socket3.close();
      socket4.close();
      socket5.close();
      server.close();
   }
}
