global.popSize = 500;
global.turns = 100;
global.increaseVal = 3;
randomize();
chromosomes[0][0] = 0;
tempChromosomes[0][0] = 0;
fitness[0] = 0;
projectile[0] = 0; 
movesLeft[0] = 0;
for(i = 0; i < global.popSize; i++)
{
	for(j = 0; j < global.turns; j++)
	{
		chromosomes[i][j] = irandom_range(0, 7);
	}
	fitness[i] = 0;
}

for(k = 0; k<global.popSize; k++)
{
	CreateBob(k);
}
