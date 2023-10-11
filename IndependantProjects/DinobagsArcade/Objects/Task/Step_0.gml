if ProgressTracker.LevelsComplete = 0 && ProgressTracker.TasksComplete = 0
{
	image_index = 1
}
else
{
	image_index = 0
}

depth = -y - 50

alarms = alarm_get(0)

active = image_index