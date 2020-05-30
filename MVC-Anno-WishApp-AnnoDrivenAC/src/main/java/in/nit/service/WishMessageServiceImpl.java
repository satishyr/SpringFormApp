package in.nit.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service("WishService")
public class WishMessageServiceImpl implements WishMessageService{

	public String getWishMessage() {

		Calendar calendar=null;
		int hour=0;
		calendar=Calendar.getInstance();
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		 if(hour<12)
			 return "Good Morning::";
		 else if(hour<16)
			 return "Good Aftertoon";
		 else if(hour<20)
			 return "Good Evening";
		 else
			 return "Good night";	}
}
