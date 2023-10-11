alarm_set(0, (room_speed * 4.85))
var l25851DD8_0 = instance_place(x + 0, y + 0, Flashlight_obj);
if (!(l25851DD8_0 > 0))
{
if random_range(1, 100) <= Difficulty
{
	if (collision_line(x, y, Player_obj.x, Player_obj.y, Wall_obj, false, true) || Player_obj.x = Player_obj.xprevious || Player_obj.y = Player_obj.yprevious)
	{
		path_speed = random_range(50, 150)
		alarm_set(1, 15)
	}
	if (!(collision_line(x, y, Player_obj.x, Player_obj.y, Wall_obj, false, true))) && distance_to_object(Player_obj) < 512
	{
		if Player_obj.x != Player_obj.xprevious || Player_obj.y != Player_obj.yprevious
		{
			path_end()
			direction = point_direction(x, y, Player_obj.x, Player_obj.y)
			speed = random_range(50, 150)
			alarm_set(1, 15)
		}
	}
}
}