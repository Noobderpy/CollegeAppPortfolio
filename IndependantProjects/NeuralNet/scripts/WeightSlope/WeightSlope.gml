// Script assets have changed for v2.3.0 see
// https://help.yoyogames.com/hc/en-us/articles/360005277377 for more information
function WeightSlope(weight, prevActivation, bias, observed, expected)
{
	var CostActivation = 2*(observed - expected);
	
	var z = CalcZ(weight, prevActivation, bias);
	var ActivationZ = Sigmoid(z)*(1-Sigmoid(z));
	var ZWeight = prevActivation;
	return CostActivation*ActivationZ*ZWeight;
}