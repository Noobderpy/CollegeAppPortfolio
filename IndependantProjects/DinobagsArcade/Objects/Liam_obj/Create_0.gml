alarm_set(0, 300)
attacking = 0
if ProgressTracker.LevelsComplete = 0
{
	Difficulty = 0
}
if ProgressTracker.LevelsComplete = 1
{
	Difficulty = 25
}
if ProgressTracker.LevelsComplete = 2
{
	Difficulty = 40
}
if ProgressTracker.LevelsComplete = 3
{
	Difficulty = 60
}
if ProgressTracker.LevelsComplete = 4
{
	Difficulty = 75
}
if ProgressTracker.LevelsComplete = 5
{
	Difficulty = 85
}
if ProgressTracker.LevelsComplete = 6
{
	Difficulty = global.liamdifficulty * 2
}