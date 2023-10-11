// Script assets have changed for v2.3.0 see
// https://help.yoyogames.com/hc/en-us/articles/360005277377 for more information
function Modify(){
	//show_message(biasGradiant[3][0])
	for(i=1; i < numLayers; i++)
	{
		for(j=0; j< layerNodes[i]; j++)
		{
			for(k=0; k<layerNodes[i-1]; k++)
			{
				//weight[i][j][k] = random_range(-1, 1);
				//show_message(weightGradiant[i][j][k]);
				weight[i][j][k] -= .01*weightGradiant[i][j][k];
			}
			bias[i][j] -= .01*biasGradiant[i][j];
		}
	}
}