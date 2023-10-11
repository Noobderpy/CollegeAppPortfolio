for(i=0; i < layerNodes[0]; i++)
{
	neurons[0][i] = get_integer("Enter a double: ", 0);
}

Solve();
show_message(neurons[numLayers - 1]);
//show_message(neurons[0]);



/*
ini_open("NeuralNet.ini");
for(i=0; i<hiddenLayers+1; i++)
{
	ini_write_real( "WEIGHT", "weight " + string(i), weight[i]);
	ini_write_real( "BIAS", "bias " + string(i), bias[i]);
}
ini_close();
show_message(output);*/