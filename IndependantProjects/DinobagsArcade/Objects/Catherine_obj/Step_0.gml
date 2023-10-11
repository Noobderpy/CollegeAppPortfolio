depth = -y

var l7BEC26FD_0 = instance_place(x + 0, y + 0, Player_obj);
if ((l7BEC26FD_0 > 0))
{
audio_play_sound(Jumpscare_mp3, 0, 0);
with(ProgressTracker)
{
	alarm_set(9, 120)
}
room_goto(room9)
}

path_speed = spd

if y = 1085
{
	triggered = 1
}