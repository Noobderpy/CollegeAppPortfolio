randomize();
var notFinished = false
for(i=0; i<global.popSize; i++)
{
	if(projectile[i].doneMoving == false)
	{
		notFinished = true;
		i = global.popSize;
	}
}
if(notFinished = false)
{
	var totalFitness = 0;
	var holder = 0;
	var holder2 = 0;
	for(i=0; i<global.popSize; i++)
	{
		if(fitness[i] < holder)
		{
			holder = fitness[i];
			holder2 = i;
		}
	}
	for(i=0; i<global.popSize; i++)
	{
		fitness[i] += ((-holder) + 1);
	}
	holder = 0;
	holder2 = 0;
	for(i=0; i<global.popSize; i++)
	{
		if(movesLeft[i] < holder)
		{
			holder = movesLeft[i];
			holder2 = i;
		}
	}
	for(i=0; i<global.popSize; i++)
	{
		movesLeft[i] += ((-holder) + 1);
	}
	for(i=0;i<global.popSize; i++)
	{
		fitness[i] = fitness[i] * movesLeft[i];
	}
	holder = 0;
	for(i=0; i<global.popSize; i++)
	{
		if(fitness[i] > holder)
		{
			holder = fitness[i];
			holder2 = i;
		}
		
	}
	for(i=0; i<global.turns; i++)
	{
		tempChromosomes[0][i] = chromosomes[holder2][i];
	}
	for(i = 0; i<global.popSize; i++)
	{
		breakPoint[i] = totalFitness + fitness[i];
		totalFitness += fitness[i];
	}
	
	for(i=1; i<global.popSize; i+=2)
	{
		var selection1 = irandom_range(0, totalFitness);
		//show_message(selection1);
		//show_message(breakPoint);
		var selection2 = irandom_range(0, totalFitness);
		var realSelect1;
		var realSelect2;
		var swapPoint = irandom_range(0, global.turns);
		for(j=0; j<global.popSize;j++)
		{
			
			if(selection1 <= breakPoint[j])
			{
				realSelect1 = j;
				break;
				//show_message(j);
			}
		}
		for(j=0; j<global.popSize;j++)
		{
			if(selection2 <= breakPoint[j])
			{
				realSelect2 = j;
				break;
			}
		}
		for(j=0; j < global.turns; j++)
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
	for(i=1;i<global.popSize; i++)
	{
		for(j=0; j<global.turns; j++)
		{
			if(random_range(0, 1) <= 0.0002)
			{
				tempChromosomes[i][j] = irandom_range(0, 7);
			}
		}
	}
	for(i=0; i<global.popSize; i++)
	{
		for(j=0; j<global.turns; j++)
		{
			chromosomes[i][j] = tempChromosomes[i][j];
		}
		fitness[i] = 0;
		with(projectile[i])
		{
			commands = 0;
			instance_destroy();
		}
	}
	global.turns += global.increaseVal;
	for(i=0; i<global.popSize;i++)
	{
		for(j=global.increaseVal; j > 0; j--)
		{
			chromosomes[i][global.turns - j] = irandom_range(0, 7);
		}
	}
	MovingWall.path_position = 0;
	for(k = 0; k<global.popSize; k++)
	{
		CreateBob(k);
	}
}