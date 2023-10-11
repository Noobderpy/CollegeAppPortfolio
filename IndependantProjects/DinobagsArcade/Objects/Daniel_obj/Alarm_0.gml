if random_range(1, 100) < Difficulty
	{
		while place_empty(x, y) = false
		{
			x = random_range((Player_obj.x - 512), (Player_obj.x + 512))
			y = random_range((Player_obj.y - 384), (Player_obj.y + 384))
		}
		if place_empty(x, y) = true
		{
			audio_play_sound(Daniel_footsteps, 0, 0)
			attacking = 1
			alarm_set(1, room_speed * 25)
		}
		else
		{
			x = startx
			y = starty
		}
	}
	else
	alarm_set(0, 330)