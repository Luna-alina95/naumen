package naumen.railway;

import naumen.railway.Carriage;
import naumen.railway.Train;

public class Tank extends Carriage {

	private String substance; //название вещества
	private float density; //плотность
	private float volume; //объем
	
	public Tank() {
		
	}
	
	public Tank(long numOfCarriage, Train train, float longOfCarriage, float loadingСapacity, float weightOfCarriage, String substance, float density, float volume) {
		setNumOfCarriage(numOfCarriage);
		setTrain(train);
		setLongOfCarriage(longOfCarriage);
		setLoadingСapacity(loadingСapacity);
		setWeightOfCarriage(weightOfCarriage);
		
		setSubstance(substance);
		setDensity(density);
		setVolume(volume);
	}
	
	@Override
	public float getWeight() {
		return density*volume;
	}

	public String getSubstance() {
		return substance;
	}

	public void setSubstance(String substance) {
		this.substance = substance;
	}

	public float getDensity() {
		return density;
	}

	public void setDensity(float density) {
		this.density = density;
	}

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}
	
	
		

}