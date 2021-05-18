package tester;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.io.File;
import java.util.Scanner;
public class BracuCarParkingLotTest {

	@Before
	public void setUp() throws Exception {
		//BCPL = new BracuCarParkingLot;
	}

	@Test
	public void testaddVehicle() {
		try {
			Scanner sc= new Scanner(new File("C:\\Users\\User\\Desktop\\Semester 10\\Cse470\\project ideas\\Git\\Parking_Lot_Management_System\\MVC\\2021-4-26.txt"));
			while(sc.hasNext()){
				System.out.print(sc.nextLine());
			}
			
		}catch(Exception e){
			
		}
		
	}

	public void testdeleteVehicle() {
		try {
			Scanner sc= new Scanner(new File("C:\\Users\\User\\Desktop\\Semester 10\\Cse470\\project ideas\\Git\\Parking_Lot_Management_System\\MVC\\2021-4-29.txt"));
			while(sc.hasNext()){
				System.out.print(sc.nextLine());
			}
			
		}catch(Exception e){
			
		}
		
	}
	
	public void testprintVehicleList() {
		try {
			Scanner sc= new Scanner(new File("C:\\Users\\User\\Desktop\\Semester 10\\Cse470\\project ideas\\Git\\Parking_Lot_Management_System\\MVC\\2021-4-30.txt"));
			while(sc.hasNext()){
				System.out.print(sc.nextLine());
			}
			
		}catch(Exception e){
			
		}
		
	}
}
