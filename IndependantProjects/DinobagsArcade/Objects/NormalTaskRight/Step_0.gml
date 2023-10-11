depth = 1000

if alarm_get(0) > 0
{
	Player_obj.x = Player_obj.xprevious
	Player_obj.y = Player_obj.yprevious
	Player_obj.sprite_index = Player_Right_spr
}