package com.in28minutes.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplTest {

	@Test
	void findTheGreatestFromAllData_basicScenario1() {
		DataServiceStub1 dataServiceStub = new DataServiceStub1();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
		int result=businessImpl.findTheGreatestFromAllData();
		assertEquals(25,result);
	}
	
	@Test
	void findTheGreatestFromAllData_basicScenario2() {
		DataServiceStub2 dataServiceStub = new DataServiceStub2();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
		int result=businessImpl.findTheGreatestFromAllData();
		assertEquals(35,result);
	}
}
class DataServiceStub1 implements DataService{
	
	public int[] retrieveAllData() {
		return new int[] {25,15,5};
	}
}

class DataServiceStub2 implements DataService{
	
	public int[] retrieveAllData() {
		return new int[] {35};
	}
}