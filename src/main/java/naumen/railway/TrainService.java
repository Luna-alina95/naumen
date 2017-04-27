package naumen.railway;

import java.util.ArrayList;

import naumen.railway.Carriage;
import naumen.railway.Train;

public class TrainService {
	/*public static TrainService instance;
	private TrainService(){}
	public static TrainService getInstance() {
		if (instance == null) {
			instance = new TrainService();
		}
		return instance;
	}*/
	
	//Добавление вагона
	public void addCarriage(Carriage newCarriage, Train train) {
		newCarriage.setTrain(train);
		ArrayList<Carriage> carriages = train.getCarriages();
		boolean i = true;
		for (Carriage carriage : carriages) {
			 if (carriage.equals(newCarriage) ) {
			    i = false;
			    break;
			  }
		}
		if(i) {
			train.addCarriage(newCarriage);
		} else {
			System.out.println("Вагон под таким номером уже есть в составе!");
		}
		
	}
	
	//удаление вагона
	public void removeCarriage(Carriage carriage, Train train) {
		train.removeCarriage(carriage);	
	}
}

