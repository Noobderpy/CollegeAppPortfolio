var l1648E47C_0 = instance_place(x + 0, y + 0, Player_obj);
if ((l1648E47C_0 > 0))
{

	ProgressTracker.LevelsComplete += 1
	ProgressTracker.TasksComplete = 0
ini_open("file.ini");
ini_write_real( "STATE", "LevelsComplete", ProgressTracker.LevelsComplete);
ini_close();

ini_open("file.ini");
ini_write_real( "STATE", "gameComplete", global.gameComplete);
ini_close();
	room_goto(Menu)

}