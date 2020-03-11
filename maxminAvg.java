function maxminAvg(arr)
{
	var sum = 0;
	var max = arr[0];
	var min = arr[0];
	for (var i = 0; i < arr.length; i++)
	{
		if (arr[i]>max)
		{
			max = arr[i];
		}
	}
	for (var i = 0; i < arr.length; i++)
	{
		if (arr[i]<min)
		{
			min = arr[i];
		}
	}
	for (var i = 0; i < arr.length; i++)
	{
		sum = sum + arr[i];
	}
	var avg = sum/arr.length;
	var arr2 = [max,min,avg];
	return arr2;
}
