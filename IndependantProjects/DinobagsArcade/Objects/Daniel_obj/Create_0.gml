startx = x
starty = y

if ProgressTracker.LevelsComplete = 0
Difficulty = 0
if ProgressTracker.LevelsComplete = 1
Difficulty = 0
if ProgressTracker.LevelsComplete = 2
Difficulty = 10
if ProgressTracker.LevelsComplete = 3
Difficulty = 20
if ProgressTracker.LevelsComplete = 4
Difficulty = 27
if ProgressTracker.LevelsComplete = 5
Difficulty = 31
if ProgressTracker.LevelsComplete = 6
{
	Difficulty = global.danieldifficulty * 2
}

alarm_set(0, (room_speed * 5.6))