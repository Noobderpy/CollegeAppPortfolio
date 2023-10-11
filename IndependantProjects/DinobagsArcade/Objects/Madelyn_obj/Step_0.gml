var l39A54D62_0 = instance_place(x + 0, y + 0, Player_obj);
if ((l39A54D62_0 > 0))
{
	with(ProgressTracker)
{
	alarm_set(9, 120)
}
	room_goto(room13);

	audio_play_sound(Jumpscare_mp3, 0, 0);

	alarm_set(2, 45);
}
depth = -y

var l041E9BF0_0 = instance_place(x + 0, y + 0, Flashlight_obj);
if ((l041E9BF0_0 > 0))
{
	if path_speed = 0
	{
		path_speed = -40
	}
}

if (!(l041E9BF0_0 > 0)) && attacking = 0
{
		path_speed = 0
}

if Difficulty = 0
{
	x = 1000000
	y = 1000000
}

if (!(path_index = Medelyn_Path)) && (!(Difficulty = 0))
{
	path_start(Medelyn_Path, 0, path_action_restart, true)
}