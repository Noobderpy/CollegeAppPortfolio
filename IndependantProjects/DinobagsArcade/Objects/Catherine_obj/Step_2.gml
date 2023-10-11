if x > xprev
{
sprite_set_speed(Catherine_right_spr, 5, spritespeed_framespersecond)
sprite_index = Catherine_right_spr;
}

if x < xprev
{
sprite_set_speed(Catherine_left_spr, 5, spritespeed_framespersecond)
sprite_index = Catherine_left_spr;
}

if y < yprev
{
sprite_set_speed(Catherine_back_spr, 5, spritespeed_framespersecond)
sprite_index = Catherine_back_spr;
}

if y > yprev
{
sprite_set_speed(Catherine_front_spr, 5, spritespeed_framespersecond)
sprite_index = Catherine_front_spr;
}
