package ForTests;

import static org.junit.Assert.*;

import org.junit.Test;

import naumen.railway.HalfOfCarriage;
import naumen.railway.Tank;
import naumen.railway.Train;
import naumen.railway.TrainService;

public class TestsForTrain {
	
	private Train train1 = new Train(322,"FORMING");
	
	private HalfOfCarriage myCarriage1 = new HalfOfCarriage(1000000, train1, 2000, 1000, 300, "Tais1", 780);
	private Tank myCarriage2 = new Tank(1000001, train1, 2000, 1000, 300, "Бензин", 300, 3);
	private Tank myCarriage3 = new Tank(1000002, train1, 2000, 1000, 300, "Бензин", 300, 3);
	
	
	//Добавление
	@Test
	public void addCarraiges() {
		TrainService trainService = new TrainService();
		
		trainService.addCarriage(myCarriage1, train1);
		trainService.addCarriage(myCarriage2, train1);
		trainService.addCarriage(myCarriage3, train1);
		
		assertEquals(train1.getCarriages().get(0).getNumOfCarriage(), 1000000);
		assertEquals(train1.getCarriages().get(1).getNumOfCarriage(), 1000001);
		assertEquals(train1.getCarriages().get(2).getNumOfCarriage(), 1000002);
		
	}
	
	//Удаление
		@Test
		public void removeCarraiges() {
			TrainService trainService = new TrainService();
			
			trainService.addCarriage(myCarriage1, train1);
			trainService.addCarriage(myCarriage2, train1);
			trainService.addCarriage(myCarriage3, train1);
			
			trainService.removeCarriage(myCarriage2, train1);
			
			assertEquals(train1.getCarriages().get(0).getNumOfCarriage(), 1000000);
			assertEquals(train1.getCarriages().get(1).getNumOfCarriage(), 1000002);
			
		}

}