if attacking = 1
{
audio_play_sound(Jumpscare_mp3, 0, 0);
room_goto(room15)
}
alarm_set(0, (room_speed * 5.6))