package naumen.railway;

import naumen.railway.Carriage;
import naumen.railway.Train;

public abstract class Carriage {
	private long numOfCarriage;
	private Train train;
	private float longOfCarriage; //длина в метрах
	private float loadingСapacity; //грузоподъемность (кг)
	private float weightOfCarriage; //масса телеги (кг)
	
	public abstract float getWeight();
	
	
	public long getNumOfCarriage() {
		return numOfCarriage;
	}

	public void setNumOfCarriage(long numOfCarriage) {
		this.numOfCarriage = numOfCarriage;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public float getLongOfCarriage() {
		return longOfCarriage;
	}

	public void setLongOfCarriage(float longOfCarriage) {
		this.longOfCarriage = longOfCarriage;
	}

	public float getLoadingСapacity() {
		return loadingСapacity;
	}

	public void setLoadingСapacity(float loadingСapacity) {
		this.loadingСapacity = loadingСapacity;
	}

	public float getWeightOfCarriage() {
		return weightOfCarriage;
	}

	public void setWeightOfCarriage(float weightOfCarriage) {
		this.weightOfCarriage = weightOfCarriage;
	}


	//вопрос: как сравнивать по instance (сравнения и для дочерних классов)
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (numOfCarriage ^ (numOfCarriage >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carriage other = (Carriage) obj;
		if (numOfCarriage != other.numOfCarriage)
			return false;
		return true;
	}
	
	
	
	
}
	