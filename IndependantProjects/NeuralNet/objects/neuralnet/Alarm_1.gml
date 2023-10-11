//Learn
//code to just compute the slope of the final weight
for(a=0; a<500; a++)
{

	for(i=1; i < numLayers; i++)
	{
		for(j=0; j< layerNodes[i]; j++)
		{
			for(k=0; k<layerNodes[i-1]; k++)
			{
				//weight[i][j][k] = random_range(-1, 1);
			
				weightGradiant[i][j][k] = 0;
			}
			biasGradiant[i][j] = 0;
		}
	}
	for(b=0; b<maxTraining;b++)
	{
		ini_open("TrainingData");
		for(i=0; i<layerNodes[0]; i++)
		{
			neurons[0][i] = ini_read_real("SAMPLE " + string(b), "Input " + string(i), 0)
		}
		for(i=0; i<layerNodes[numLayers-1]; i++)
		{
		
			expected[i] = ini_read_real("SAMPLE " + string(b), "Output " + string(i), 0);
		}
		ini_close();
		Solve()
		for(i=1; i < numLayers; i++)
		{
			for(j=0; j< layerNodes[i]; j++)
			{
				for(k=0; k<layerNodes[i-1]; k++)
				{
					//weight[i][j][k] = random_range(-1, 1);
					//show_message(WeightCalculation(i, j, k))
					weightGradiant[i][j][k] += WeightCalculation(i, j, k);
					//show_message(weightGradiant[i][j][k])
				}
				biasGradiant[i][j] += BiasCalculation(i, j);
			}
		}
	}
	Modify();
}
show_message(Cost());
ini_open("NeuralNet.ini");
for(i=1; i < numLayers; i++)
{
	for(j=0; j< layerNodes[i]; j++)
	{
		for(k=0; k<layerNodes[i-1]; k++)
		{
			ini_write_real("WEIGHT", "Weight " + string(i) + " " + string(j) + " " + string(k), weight[i][j][k]);
		}
		ini_write_real("BIAS", "Bias " + string(i) + " " + string(j), bias[i][j]);
	}
}
ini_close();
/*
ini_open("NeuralNet.ini");
for(i=0; i<inputLayerNodes; i++)
{
	for(j=0; j < hiddenOneNodes; j++)
	{
		ini_write_real("WEIGHT", "weightInputHiddenOne " + string(i) + " " + string(j), weightInputHiddenOne[i][j]);
		ini_write_real("BIAS", "hiddenBias " + string(j), hiddenBias[j]);
	}
}

for(i=0; i<hiddenOneNodes; i++)
{
	for(j=0; j < outputNodes; j++)
	{
		ini_write_real("WEIGHT", "weightHiddenOneOutput " + string(i) + " " + string(j), weightHiddenOneOutput[i][j]);
		ini_write_real("BIAS", "outputBias " + string(j), outputBias[j]);
	}
}
ini_close()