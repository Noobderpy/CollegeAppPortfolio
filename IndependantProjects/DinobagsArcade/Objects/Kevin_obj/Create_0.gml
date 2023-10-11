path_start(Kevin_Path, 0, path_action_restart, true)
alarm_set(0, (room_speed * 4.85))
if ProgressTracker.LevelsComplete = 0
{
	Difficulty = 0
}
if ProgressTracker.LevelsComplete = 1
{
	Difficulty = 20
}
if ProgressTracker.LevelsComplete = 2
{
	Difficulty = 40
}
if ProgressTracker.LevelsComplete = 3
{
	Difficulty = 65
}
if ProgressTracker.LevelsComplete = 4
{
	Difficulty = 87
}
if ProgressTracker.LevelsComplete = 5
{
	Difficulty = 92
}
if ProgressTracker.LevelsComplete = 6
{
	Difficulty = global.kevindifficulty * 2
}