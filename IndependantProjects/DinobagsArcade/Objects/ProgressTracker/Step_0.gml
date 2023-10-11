if LevelsComplete = 0 && TasksComplete = 5
{
	unlockdoor = 1
}
else if LevelsComplete = 1 && TasksComplete = 6
{
	unlockdoor = 1
}
else if LevelsComplete = 2 && TasksComplete = 8
{
	unlockdoor = 1
}
else if LevelsComplete = 3 && TasksComplete = 11
{
	unlockdoor = 1
}
else if LevelsComplete = 4 && TasksComplete = 15
{
	unlockdoor = 1
}
else if LevelsComplete = 5 && TasksComplete = 20
{
	unlockdoor = 1
}
else
unlockdoor = 0

LevelsComplete = 6
if LevelsComplete = 6
{
	global.gameComplete = 1
	LevelsComplete = 0
}

if LevelsComplete > 0
	global.normaltasks = 1