import java.util.*;
import java.awt.*;
import javax.swing.*;
class Genesis{


	public static void main(String args[])throws Exception{
		//final int CHROMOSOMEINCREASE = 0;
		final int ROWS = 15;
		final int COLUMNS = 10;
		final int POPSIZE = 141;
		final int CHROMOSOMES = 36;
		final int STARTX = 0;
		final int STARTY = 0;
		final double SWITCHVAL = 0.7;
		Random rng = new Random();
		int[][] walls = new int[COLUMNS][ROWS];
		int[][] chromosomes = new int[POPSIZE][CHROMOSOMES];
		int[][] tempChromosomes = new int[POPSIZE][CHROMOSOMES];
		double[] fitness = new double[POPSIZE];
		Bob[] population = new Bob[POPSIZE];
		JFrame theWindow = new JFrame();
		Container thePane = theWindow.getContentPane();
		GenesisPanel thePanel = new GenesisPanel(new Color(180, 20, 30)); // created an RGB color using a Color constructor);
		thePane.add(thePanel);
		theWindow.setTitle("Maze");
		theWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theWindow.setSize(1000, 600);

		theWindow.setVisible(true);
		boolean done = false;
		boolean notFinished = true;

		while(!thePanel.getInfo())
		{
			System.out.println("Waiting");
			done = false;
		}
		System.out.println("Done");
		for(int i = 0; i<COLUMNS; i++)
		{
			for(int j = 0; j<ROWS; j++)
			{
				walls[i][j] = thePanel.sendWalls(i, j);
			}
		}
		for(int i = 0; i < POPSIZE; i++)
		{
			for(int j = 0; j < CHROMOSOMES; j++)
			{
				chromosomes[i][j] = rng.nextInt(4);
				System.out.print(chromosomes[i][j]);
				//rng.setSeed(rng.nextLong());
			}
			System.out.println(" ");
			fitness[i] = 0;
		}
		while(!done)
		{
			System.out.println("****************************************************************************************");
			createPopulation(walls, chromosomes, population, POPSIZE, CHROMOSOMES, STARTX, STARTY);
			runPopulation(population, POPSIZE, CHROMOSOMES, thePanel);
			getFitness(fitness, population, POPSIZE);
			/*for(int i=0; i<POPSIZE; i++)
			{
				if(population[i].doneMoving() == false)
				{
					notFinished = true;
					i = POPSIZE;
				}
			}*/
			if(/*!notFinished*/true)
			{
				double totalFitness = 0;
				double holder = 2;
				double holder2 = 0;
				double[] breakPoint = new double[POPSIZE];
				/*for(int i=0; i<POPSIZE; i++)
				{
					if(fitness[i] < holder)
					{
						holder = fitness[i];
						holder2 = i;
					}
				}
				for(int i=0; i<POPSIZE; i++)
				{
					fitness[i] += ((-1*holder));
				}*/
				holder = 0;
				holder2 = 0;
				/*for(i=0; i<POPSIZE; i++)
				{
					if(movesLeft[i] < holder)
					{
						holder = movesLeft[i];
						holder2 = i;
					}
				}
				for(i=0; i<POPSIZE; i++)
				{
					movesLeft[i] += ((-holder) + 1);
				}
				for(i=0;i<POPSIZE; i++)
				{
					fitness[i] = fitness[i] * movesLeft[i];
				}*/
				holder = 0;
				for(int i=0; i<POPSIZE; i++)
				{
					if(fitness[i] > holder)
					{
						holder = fitness[i];
						holder2 = i;
					}

				}
				for(int i=0; i<CHROMOSOMES; i++)
				{
					tempChromosomes[0][i] = chromosomes[(int)holder2][i];
				}
				for(int i = 0; i<POPSIZE; i++)
				{
					breakPoint[i] = totalFitness + fitness[i];
					totalFitness += fitness[i];
				}

				for(int i=1; i<POPSIZE; i+=2)
				{
					double selection1 = (totalFitness - 0) * rng.nextDouble();
					//show_message(selection1);
					//show_message(breakPoint);
					double selection2 = (totalFitness - 0) * rng.nextDouble();
					//System.out.println(selection1);
					//System.out.println(breakPoint[0]);

					int realSelect1 = -1;
					int realSelect2 = -1;
					int swapPoint = rng.nextInt(CHROMOSOMES);
					//System.out.println(swapPoint);
					for(int j=0; j<POPSIZE;j++)
					{
						if(selection1 <= breakPoint[j])
						{
							realSelect1 = j;
							j=POPSIZE;
							//show_message(j);
						}
					}
					for(int j=0; j<POPSIZE;j++)
					{
						if(selection2 <= breakPoint[j])
						{
							realSelect2 = j;
							//System.out.println(realSelect2);
							j=POPSIZE;
						}
					}
					if(rng.nextDouble() > SWITCHVAL)
						swapPoint = CHROMOSOMES;
					for(int j=0; j < CHROMOSOMES; j++)
					{
						//var rng = random_range(0,1);
						//if(rng < 0.5)

						if(j<swapPoint)
						{
							tempChromosomes[i][j] = chromosomes[realSelect1][j];
							tempChromosomes[i+1][j] = chromosomes[realSelect2][j];
						}
						else
						{
							tempChromosomes[i][j] = chromosomes[realSelect2][j];
							tempChromosomes[i+1][j] = chromosomes[realSelect1][j];
						}
					}
				}
				for(int i=1;i<POPSIZE; i++)
				{
					for(int j=0; j<CHROMOSOMES; j++)
					{
						if(rng.nextDouble(1) <= 0.002)
						{
							tempChromosomes[i][j] = rng.nextInt(4);
						}
					}
				}
				for(int i=0; i<POPSIZE; i++)
				{
					for(int j=0; j<CHROMOSOMES; j++)
					{
						chromosomes[i][j] = tempChromosomes[i][j];

						System.out.print(chromosomes[i][j]);
					}
					System.out.println(" ");
					fitness[i] = 0;
					/*with(projectile[i])
					{
						commands = 0;
						instance_destroy();
					}*/
				}
				//global.turns += global.increaseVal;
				/*for(i=0; i<global.popSize;i++)
				{
					for(j=global.increaseVal; j > 0; j--)
					{
						chromosomes[i][global.turns - j] = irandom_range(0, 7);
					}
				}*/
				//MovingWall.path_position = 0;
				/*for(k = 0; k<global.popSize; k++)
				{
					CreateBob(k);
				}*/
			}
		}
	}
	public static void createPopulation(int[][] wallSpots, int[][] commands,Bob [] population, int popSize, int chromosome, int startX, int startY)
	{
		for(int i=0; i<popSize; i++)
		{
			population[i] = new Bob(wallSpots, commands, i, startX, startY);
		}
	}
	public static void runPopulation(Bob[] population, int popSize, int chromosomes, GenesisPanel thePanel) throws InterruptedException
	{
		for(int i=0; i<popSize; i++)
		{
			for(int j = 0; j<chromosomes; j++)
			{

				population[i].Run(j);
				if(i==0)
				{
					//System.out.println(population[0].getX() + " : " + population[0].getY());
					thePanel.bestPosition(population[0].getX(), population[0].getY());
					Thread.sleep(10);
					thePanel.removePosition(population[0].getX(), population[0].getY());
				}
			}
		}
	}
	public static void getFitness(double[] fitness, Bob[] population, int popSize)
	{
		for(int i=0; i<popSize; i++)
		{
			fitness[i] = population[i].getFitness();
			//System.out.println(fitness[i]);
		}
	}

}
