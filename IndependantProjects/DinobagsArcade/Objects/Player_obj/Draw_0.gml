if surface_exists(Blackout.surf){
	surface_set_target(Blackout.surf)
	
	draw_clear_alpha(c_black, 0)
	
	draw_set_color(c_black)
	draw_rectangle(0, 0, room_width, room_height, false)
	draw_set_color(c_white)
	
	gpu_set_blendmode(bm_subtract)
	draw_circle(x, y - 33, 100, false)
	if sprite_index = 0
	draw_sprite_ext(Flashlight_spr, 0, x, y - 33, 2, 2, -90, c_white, 1)
	if sprite_index = 1
	draw_sprite_ext(Flashlight_spr, 0, x, y - 33, 2, 2, 90, c_white, 1)
	if sprite_index = 2
	draw_sprite_ext(Flashlight_spr, 0, x, y - 33, 2, 2, 0, c_white, 1)
	if sprite_index = 3
	draw_sprite_ext(Flashlight_spr, 0, x, y - 33, 2, 2, 180, c_white, 1)
	gpu_set_blendmode(bm_normal)
	
	surface_reset_target()
}

draw_self()