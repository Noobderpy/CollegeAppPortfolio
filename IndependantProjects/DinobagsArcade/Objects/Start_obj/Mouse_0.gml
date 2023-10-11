
if image_index = 0 && visible = true
{
Call_obj.visible = true
global.gameComplete = 0
ProgressTracker.LevelsComplete = 0
game_save("Save.dat")
}


if image_index = 1 && visible = true
room_goto(Prize_Room)

if image_index = 2 && visible = true
{
	Call_obj.visible = true	
}

visible = false