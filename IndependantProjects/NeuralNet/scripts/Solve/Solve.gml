// Script assets have changed for v2.3.0 see
// https://help.yoyogames.com/hc/en-us/articles/360005277377 for more information
function Solve(){
	//neurons[0][0] = input;
	for(i=1; i < numLayers; i++)
	{
		for(j=0; j<layerNodes[i]; j++)
		{
			var tot = 0;
			for(k=0; k<layerNodes[i-1]; k++)
			{
				tot += neurons[i-1][k]*weight[i][j][k];
			}
			z[i][j] = tot + bias[i][j];
			neurons[i][j] = Sigmoid(z[i][j]);
		}
	}
	/*
	for(j=0; j < hiddenOneNodes; j++)
	{
		var tot = 0;
		for(i=0; i<inputLayerNodes; i++)
		{
			tot += inputLayer[i]*weightInputHiddenOne[i][j];	
		}
		hiddenLayer[j] = Sigmoid(tot+hiddenBias[j]);
	}

	for(j=0; j < outputNodes; j++)
	{
		var tot = 0;
		for(i=0; i<hiddenOneNodes; i++)
		{
			tot += hiddenLayer[i]*weightHiddenOneOutput[i][j];
		}
		outputLayer[j] = Sigmoid(tot+hiddenBias[j]);
	}*/
}