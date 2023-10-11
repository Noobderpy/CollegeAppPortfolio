if x = startx && y = starty
{
	depth = -y - 35
	attacking = 0
	speed = 0
}
else
depth = -y

if place_meeting(x, y, Flashlight_obj) && attacking = 1
{
	attacking = 0
	speed = 50
	audio_play_sound(Daniel_footsteps_away, 0, 0)
		if Player_obj.sprite_index = Player_Left_spr
		{
			direction = 180;
		}
		if Player_obj.sprite_index = Player_Back_spr
		{
			direction = 90;
		}
		if Player_obj.sprite_index = Player_Right_spr
		{
			direction = 0;
		}
		if Player_obj.sprite_index = Player_Front_spr
		{
			direction = 270;
		}
}

if attacking = 0 && place_empty(x, y) && x != startx && y != starty
{
	speed = 0
	x = startx
	y = starty
	audio_stop_sound(Daniel_footsteps)
	alarm_set(1, (room_speed * (50 - Difficulty)))
}