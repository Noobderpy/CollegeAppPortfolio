// Script assets have changed for v2.3.0 see
// https://help.yoyogames.com/hc/en-us/articles/360005277377 for more information
function Cost(){
	var cost = 0;
	for(var i=0; i<maxTraining; i++)
	{
		ini_open("TrainingData");
		for(var j=0; j<layerNodes[0]; j++)
		{
			neurons[0][j] = ini_read_real("SAMPLE " + string(i), "Input " + string(j), 0)
		}
		for(var j=0; j<layerNodes[numLayers-1]; j++)
		{
		
			expected[j] = ini_read_real("SAMPLE " + string(i), "Output " + string(j), 0);
		}
		ini_close();
		Solve()
		for(var j=0; j<layerNodes[numLayers-1]; j++)
		{
			cost += sqr(neurons[numLayers-1][j] - expected[j]);
		}
	}
	return cost / maxTraining;
}