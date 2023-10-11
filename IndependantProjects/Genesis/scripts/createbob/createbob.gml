// Script assets have changed for v2.3.0 see
// https://help.yoyogames.com/hc/en-us/articles/360005277377 for more information
function CreateBob(num){
	projectile[num] = instance_create_layer(x, y, "Instances", BobObj);
	for(i = 0; i<global.turns; i++)
	{
		projectile[num].commands[i] = chromosomes[num][i];
	}
	projectile[num].projectileNum = num;
	with(projectile[num])
	{
		alarm_set(0, 1);
	}
}