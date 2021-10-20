package com.example.UseCaseJewel;

import java.util.HashMap;

public class Jwelary {

	public static void main(String args[])
	{

     String availJewelArr[]= {"Bentex","Silver","Gold","Platinum"};
     int   availPrice[]= {20,50,2600,3000};
     String purchasedJewelsArr[]= {"Silver","Gold","Platinum"};
     int purchasedQuaantity[]= {20,7,3};
     
     calclualteBill(availJewelArr,availPrice,purchasedJewelsArr,purchasedQuaantity);
     
	
	
	}

	private static void calclualteBill
	(String[] availJewelArr, int[] availPrice, String[] purchasedJewelsArr, int[] purchasedQuaantity) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> jwelaryPriceMap=new HashMap<String, Integer>();
		Double bill=0.0;
		Double bill2=0.0;
		for(int i=0;i< availJewelArr.length ;i++)
		{
			jwelaryPriceMap.put(availJewelArr[i], availPrice[i]);
		}
		
		for(int i=0;i< purchasedJewelsArr.length ;i++)
		{

		int price=jwelaryPriceMap.get(purchasedJewelsArr[i]);
		int quantity=purchasedQuaantity[i];
		bill+=quantity*price;	
		}

		if(bill > 20000.0)
		{			
			bill2= (double) (0.97 * bill);
		}
		System.out.println("total bill "+bill2);
		
	}
	
}
