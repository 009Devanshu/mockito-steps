package com.in28minutes.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplTest {

	@Test
	void test() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl();
		businessImpl.findTheGreatestFromAllData();
		
	}

}
