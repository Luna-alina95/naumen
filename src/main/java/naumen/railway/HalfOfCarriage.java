package naumen.railway;

import naumen.railway.Carriage;
import naumen.railway.Train;

public class HalfOfCarriage extends Carriage {
	
	private String name; //название вещества
	private float weight; //вес
	
	public HalfOfCarriage() {
		
	}
	
	public HalfOfCarriage(long numOfCarriage, Train train, float longOfCarriage, float loadingСapacity, float weightOfCarriage, String name, float weight) {
		setNumOfCarriage(numOfCarriage);
		setTrain(train);
		setLongOfCarriage(longOfCarriage);
		setLoadingСapacity(loadingСapacity);
		setWeightOfCarriage(weightOfCarriage);
		
		setName(name);
		setWeight(weight);
	}
	
	@Override
	public float getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	

}