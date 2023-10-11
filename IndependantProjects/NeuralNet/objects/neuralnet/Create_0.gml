/*ini_open("file.ini");
ini_write_real( "STATE", "LevelsComplete", ProgressTracker.LevelsComplete);
ini_close();
ini_open("NeuralNet.ini");
weights = ini_read_real( "WEIGHT", "totalWeights", weights);
ini_close();*/
/*
hiddenLayers = 1;
input = 0;
output = 0;
weight[0] = 0;
bias[0] = 0;
neurons[0] = 0;
ini_open("NeuralNet.ini");
for(i=0; i<hiddenLayers + 1; i++)
{
	weight[i] = ini_read_real("WEIGHT", "weight " + string(i), random_range(-1, 1));
	bias[i] = ini_read_real("BIAS", "bias " + string(i), random_range(-1, 1));
}*/

/*
randomize();
inputLayerNodes = 1;
hiddenOneNodes = 1;
outputNodes = 1;
inputLayer[0] = 0;
outputLayer[0] = 0;
hiddenLayer[0] = 0;
hiddenBias[0] = 0;
outputBias[0] = 0;
weightInputHiddenOne[0][0] = 0 ;
weightHiddenOneOutput[0][0] = 0;
weightGradiant[0] = 0;
biasGradiant[0] = 0;
ini_open("NeuralNet.ini");
for(i=0; i<inputLayerNodes; i++)
{
	for(j=0; j < hiddenOneNodes; j++)
	{
		weightInputHiddenOne[i][j] = ini_read_real("WEIGHT", "weightInputHiddenOne " + string(i) + " " + string(j), random_range(-1, 1));
		hiddenBias[j] = ini_read_real("BIAS", "hiddenBias " + string(j), random_range(-1, 1));
	}
}

for(i=0; i<hiddenOneNodes; i++)
{
	for(j=0; j < outputNodes; j++)
	{
		weightHiddenOneOutput[i][j] = ini_read_real("WEIGHT", "weightHiddenOneOutput " + string(i) + " " + string(j), random_range(-1, 1));
		outputBias[j] = ini_read_real("BIAS", "outputBias " + string(j), random_range(-1, 1));
	}
}
ini_close();
*/

randomize();
maxTraining = 8;
layerNodes[0] = 2;
layerNodes[1] = 1;
numLayers = array_length(layerNodes);
neurons[0][0] = 0;
bias[0][0] = 0;
weight[0][0][0] = 0;
weightGradiant[0][0][0] = 0;
biasGradiant[0][0] = 0;
z[0][0] = 0;
expected[0] = 0;

ini_open("NeuralNet.ini");

for(i=1; i < numLayers; i++)
{
	for(j=0; j< layerNodes[i]; j++)
	{
		for(k=0; k<layerNodes[i-1]; k++)
		{
			weight[i][j][k] = ini_read_real("WEIGHT", "Weight " + string(i) + " " + string(j) + " " + string(k), random_range(-1, 1));
		}
		bias[i][j] = ini_read_real("BIAS", "Bias " + string(i) + " " + string(j), random_range(-1, 1));
	}
}
ini_close();