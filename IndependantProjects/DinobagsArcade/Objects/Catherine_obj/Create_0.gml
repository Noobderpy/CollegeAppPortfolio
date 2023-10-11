if ProgressTracker.LevelsComplete = 0
{
	Difficulty = 0
}
if ProgressTracker.LevelsComplete = 1
{
	Difficulty = 60
}
if ProgressTracker.LevelsComplete = 2
{
	Difficulty = 75
}
if ProgressTracker.LevelsComplete = 3
{
	Difficulty = 83
}
if ProgressTracker.LevelsComplete = 4
{
	Difficulty = 89
}
if ProgressTracker.LevelsComplete = 5
{
	Difficulty = 94
}
if ProgressTracker.LevelsComplete = 6
{
	Difficulty = global.catherinedifficulty * 2
}

path_clear_points(Catherine_Path)
path_add_point(Catherine_Path, 1056, 1504, 100)
path_add_point(Catherine_Path, 1376, 1504, 100)
path_add_point(Catherine_Path, 1376, 1280, 100)
path_add_point(Catherine_Path, 1056, 1280, 100)
path_add_point(Catherine_Path, 1056, 1024, 100)
path_add_point(Catherine_Path, 1120, 1024, 100)
path_add_point(Catherine_Path, 1120, 1056, 100)
spd = (Difficulty / 35)
path_start(Catherine_Path, 100, path_action_restart, true)
triggered = 0