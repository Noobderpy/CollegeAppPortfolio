var xadd = (keyboard_check(vk_right) - keyboard_check(vk_left))
var yadd = (keyboard_check(vk_down) - keyboard_check(vk_up))
randomize()
randomize()

if (place_meeting(x + (xadd * spd), y, Wall_obj))
{
	while (! place_meeting(x + sign(xadd), y, Wall_obj))
	x += sign(xadd)
}
else
if (place_meeting(x + (xadd * spd), y, Arcade_obj))
{
	while (! place_meeting(x + sign(xadd), y, Arcade_obj))
	x += sign(xadd)
}
else
if (place_meeting(x + (xadd * spd), y, Counter_obj))
{
	while (! place_meeting(x + sign(xadd), y, Counter_obj))
	x += sign(xadd)
}
else
if (place_meeting(x + (xadd * spd), y, Door_obj))
{
	while (! place_meeting(x + sign(xadd), y, Door_obj))
	x += sign(xadd)
}
else
if (place_meeting(x + (xadd * spd), y, NormalTaskBack))
{
	while (! place_meeting(x + sign(xadd), y, NormalTaskBack))
	x += sign(xadd)
}
else
if (place_meeting(x + (xadd * spd), y, NormalTaskFront))
{
	while (! place_meeting(x + sign(xadd), y, NormalTaskFront))
	x += sign(xadd)
}
else
if (place_meeting(x + (xadd * spd), y, NormalTaskRight))
{
	while (! place_meeting(x + sign(xadd), y, NormalTaskRight))
	x += sign(xadd)
}
else
if (place_meeting(x + (xadd * spd), y, NormalTaskLeft))
{
	while (! place_meeting(x + sign(xadd), y, NormalTaskLeft))
	x += sign(xadd)
}
else
if (place_meeting(x + (xadd * spd), y, Chair_obj))
{
	while (! place_meeting(x + sign(xadd), y, Chair_obj))
	x += sign(xadd)
}
else
if (place_meeting(x + (xadd * spd), y, Box_obj))
{
	while (! place_meeting(x + sign(xadd), y, Box_obj))
	x += sign(xadd)
}
else
{
		x += xadd * spd
}

if (place_meeting(x, y + (yadd * spd), Wall_obj))
{
	while (! place_meeting(x, y + sign(yadd), Wall_obj))
	y += sign(yadd)
}
else
if (place_meeting(x, y + (yadd * spd), Arcade_obj))
{
	while (! place_meeting(x, y + sign(yadd), Arcade_obj))
	y += sign(yadd)
}
else
if (place_meeting(x, y + (yadd * spd), Counter_obj))
{
	while (! place_meeting(x, y + sign(yadd), Counter_obj))
	y += sign(yadd)
}
else
if (place_meeting(x, y + (yadd * spd), Door_obj))
{
	while (! place_meeting(x, y + sign(yadd), Door_obj))
	y += sign(yadd)
}
else
if (place_meeting(x, y + (yadd * spd), NormalTaskBack))
{
	while (! place_meeting(x, y + sign(yadd), NormalTaskBack))
	y += sign(yadd)
}
else
if (place_meeting(x, y + (yadd * spd), NormalTaskFront))
{
	while (! place_meeting(x, y + sign(yadd), NormalTaskFront))
	y += sign(yadd)
}
else
if (place_meeting(x, y + (yadd * spd), NormalTaskLeft))
{
	while (! place_meeting(x, y + sign(yadd), NormalTaskLeft))
	y += sign(yadd)
}
else
if (place_meeting(x, y + (yadd * spd), NormalTaskRight))
{
	while (! place_meeting(x, y + sign(yadd), NormalTaskRight))
	y += sign(yadd)
}
else
if (place_meeting(x, y + (yadd * spd), Chair_obj))
{
	while (! place_meeting(x, y + sign(yadd), Chair_obj))
	y += sign(yadd)
}
else
if (place_meeting(x, y + (yadd * spd), Box_obj))
{
	while (! place_meeting(x, y + sign(yadd), Box_obj))
	y += sign(yadd)
}
else
{
		y += yadd * spd
}

if(yadd = 1)
{	
sprite_set_speed(Player_Front_spr, 5, spritespeed_framespersecond)
sprite_index = Player_Front_spr;
}

if(yadd = -1)
{
sprite_set_speed(Player_Back_spr, 5, spritespeed_framespersecond)
sprite_index = Player_Back_spr;
}

if(xadd = 1)
{
sprite_set_speed(Player_Right_spr, 5, spritespeed_framespersecond)
sprite_index = Player_Right_spr;
}

if(xadd = -1)
{
sprite_set_speed(Player_Left_spr, 5, spritespeed_framespersecond)
sprite_index = Player_Left_spr;
}

if xadd = 0
{
	if yadd = 0
	{
		image_index = 0
		sprite_set_speed(Player_Left_spr, 0, spritespeed_framespersecond)
	}
}



layer_sprite_y(Player_obj, y)

depth = -y;
	
if sprite_index = Player_Front_spr
{
		global.flash = 0
}

if sprite_index = Player_Right_spr
{
		global.flash = 90
}

if sprite_index = Player_Left_spr
{
		global.flash = -90
}

if sprite_index = Player_Back_spr
{
		global.flash = 180
}

if x != xprevious || y != yprevious
{
path_add_point(Catherine_Path, x, y, 100)
Catherine_obj.path_position = ((Catherine_obj.path_position - ((Catherine_obj.path_position * 3) / path_get_length(Catherine_Path))))
}

if Task.alarms > 0
{
	x = xprevious
	y = yprevious
	sprite_index = Player_Front_spr
}