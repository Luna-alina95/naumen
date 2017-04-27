package naumen.railway;

import naumen.railway.Carriage;
import naumen.railway.Train;

public class Platform extends Carriage {

	private String passport; //название вещества
	private float weight; //вес
	
	public Platform() {
		
	}
	
	public Platform(long numOfCarriage, Train train, float longOfCarriage, float loadingСapacity, float weightOfCarriage, String passport, float weight) {
		setNumOfCarriage(numOfCarriage);
		setTrain(train);
		setLongOfCarriage(longOfCarriage);
		setLoadingСapacity(loadingСapacity);
		setWeightOfCarriage(weightOfCarriage);
		
		setPassport(passport);
		setWeight(weight);
	}
	
	@Override
	public float getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}


}
