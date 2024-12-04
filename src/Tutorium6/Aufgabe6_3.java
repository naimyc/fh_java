class VektorAddition
{
	public static void main(String[] args)
	{
	float[] vectorArr01 = {9.0f, 8.0f , 3.0f};
	float[] vectorArr02 = {3.0f, 2.0f , 4.0f};
	
	float[] vector = new float[3];
	
	
	
	vector[0] = vectorArr01[0] + vectorArr02[0];
	vector[1] = vectorArr01[1] + vectorArr02[1];
	vector[2] = vectorArr01[2] + vectorArr02[2];
	
	for(float v : vector)
		System.out.println(v);
	
	}
}