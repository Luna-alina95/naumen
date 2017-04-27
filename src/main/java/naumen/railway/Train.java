package naumen.railway;

import java.util.ArrayList;

import naumen.railway.Carriage;
import naumen.railway.State;
import naumen.railway.Train;

enum  State{
	ARRIVE, FORMING, FORM, SEND
}

public class Train {
	
		private long numOfTrain;
		private ArrayList<Carriage> Carriages = new ArrayList<Carriage>();
		private State StateOfTrain;
		
		public Train(long numOfTrain, String thisState) {
			setNumOfTrain(numOfTrain);
			setStateOfTrain(thisState);	
		}
		
		public Train() {
			StateOfTrain = State.FORMING;
		}
		
		
		public long getNumOfTrain(){	
			return numOfTrain;
		}
		
		public void setNumOfTrain(long newNumOfTrain) {
			if(newNumOfTrain > 0) {
				numOfTrain = newNumOfTrain;
			} else {
				System.out.println("Некорректный номер поезда!");
				
			}
		}
		
		public void addCarriage(Carriage newCarriage) {
			Carriages.add(newCarriage);
		}
		
		public void removeCarriage(Carriage carriage) {
			Carriages.remove(carriage);
		}
		
		
		public ArrayList<Carriage> getCarriages() {
			return Carriages;
		}

		public void setCarriages(ArrayList<Carriage> carriages) {
			Carriages = carriages;
		}

		public void setStateOfTrain(String thisState) {
			if (thisState.equals("ARRIVE")) {
				this.StateOfTrain = State.ARRIVE;	
			} else if (thisState.equals("FORMING")) {
				this.StateOfTrain = State.FORMING;
			} else if (thisState.equals("FORM")) {
				this.StateOfTrain = State.FORM;
			} else if (thisState.equals("SEND")) {
				this.StateOfTrain = State.SEND;
			} else {
				System.out.println("Нет такого действия!");
			}	
		}
		
		public State getStateOfTrain() {
			return StateOfTrain;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (numOfTrain ^ (numOfTrain >>> 32));
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
			Train other = (Train) obj;
			if (numOfTrain != other.numOfTrain)
				return false;
			return true;
		}
		
		
		
		
}

