if(commands[readNum] == 0)
{
	x += 0*spd;
	y += -1*spd;
}
if(commands[readNum] == 1)
{
	//x += -1*spd
	x += sqrt(0.5)*spd;
	y += -sqrt(0.5)*spd;
}
if(commands[readNum] == 2)
{
	x += 1*spd;
	y += 0*spd;
}
if(commands[readNum] == 3)
{
	x += sqrt(0.5)*spd;
	y += sqrt(0.5)*spd;
}
if(commands[readNum] == 4)
{
	x += 0*spd;
	y += 1*spd;
}
if(commands[readNum] == 5)
{
	x += -sqrt(0.5)*spd;
	y += sqrt(0.5)*spd;
}
if(commands[readNum] == 6)
{
	x += -1*spd;
	y += 0*spd;
}
if(commands[readNum] == 7)
{
	x += -sqrt(0.5)*spd;
	y += -sqrt(0.5)*spd;
}

readNum++;
if(readNum < global.turns)
{
	alarm_set(0, 1);
}
else
{
	var xDiff = abs(GoalObj.x - x);
	var yDiff = abs(GoalObj.y - y);
	fitness = -(sqrt(sqr(xDiff)+ sqr(yDiff)));
	if(dead = true)
	{
		//fitness = fitness - 1000
		fitness = fitness*1.25
	}
	if(place_meeting(x, y, GoalObj))
	{
		fitness = 1000;
	}
	geneticHandler.movesLeft[projectileNum]= remainingMoves - global.turns;
	geneticHandler.fitness[projectileNum] = (fitness);
	doneMoving = true;
}