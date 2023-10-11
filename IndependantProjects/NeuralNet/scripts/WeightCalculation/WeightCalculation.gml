// Script assets have changed for v2.3.0 see
// https://help.yoyogames.com/hc/en-us/articles/360005277377 for more information
function WeightCalculation(Layer, node, prevNode){
	var zWeight = neurons[Layer-1][prevNode];
	var ActivationZ = (Sigmoid(z[Layer][node]) * (1-Sigmoid(z[Layer][node])));
	var CostActivation = 0;
	
	if(Layer < (numLayers-1))
	{
		for(var i = 0; i<layerNodes[Layer + 1]; i++)
		{
			CostActivation += WeightCalculation(Layer+1, i, node);
		}
	}
	else
	{
		CostActivation = 2*(neurons[Layer][node] - expected[node]);
		
	}
	return zWeight*ActivationZ*CostActivation;
}