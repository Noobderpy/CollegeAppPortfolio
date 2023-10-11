var l47BE783B_0 = instance_place(x + 0, y + 0, Player_obj);
if ((l47BE783B_0 > 0))
{
with(ProgressTracker)
{
	alarm_set(9, 120)
}
room_goto(room11)
audio_play_sound(Jumpscare_mp3, 0, 0);
alarm_set(2, 45)
}

depth = -y