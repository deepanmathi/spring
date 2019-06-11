package spring;

import java.util.Random;

public class happyFortune implements fortuneService{

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		String arr[]= {"happy","awesome","wonderful"};
		Random r=new Random();
        int randomNumber=r.nextInt(arr.length);
		return arr[randomNumber];
	}

}
