var l041E9BF0_0 = instance_place(x + 0, y + 0, Flashlight_obj);
alarm_set(0, (room_speed * 5))
if random_range(1, 100) <= Difficulty
{
attacking = 1
alarm_set(1, 15)
if collision_line(x, y, Player_obj.x, Player_obj.y, Wall_obj, false, true)
{
	path_speed = random_range(35, 100);
}

if (!(collision_line(x, y, Player_obj.x, Player_obj.y, Wall_obj, false, true))) && (!(l041E9BF0_0 > 0)) && distance_to_object(Player_obj) < 512
{
	path_end()
	direction = point_direction(x, y, Player_obj.x, Player_obj.y);
	speed = random_range(35, 100)
}
}