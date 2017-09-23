package com.cg.enquiry.UI;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.cg.enquiry.DTO.EnquiryBean;
import com.cg.enquiry.SERVICE.EnquiryServiceImpl;
import com.cg.enquiry.SERVICE.IEnquiryService;

public class EnquiryUI {

	public static void main(String[] args) throws IOException, SQLException 
	
	
	{
		EnquiryUI o = new EnquiryUI();
		o.getOperations();
	}
	Scanner sc=new Scanner(System.in);
		
	void getOperations() throws IOException, SQLException{
	//EnquiryUI o = new EnquiryUI();
		 
	System.out.println("Choose an Operation");
	System.out.println("*********************");
	/*while(true)
	{*/
		
	System.out.println("1.Add Details");
	System.out.println("2.All Details");
	System.out.println("3.Exit");
	
	System.out.println("Enter your choice ");
	int choice= sc.nextInt();

	switch(choice)
	{
	case 1:getAllDetails();
	break;
	case 2:getByEnquiryId();
	break;
	case 3:System.exit(0);
	break;
	}	
	}
	private void getAllDetails() {
		// TODO Auto-generated method stub
		
	}
	//}
	IEnquiryService ies=new EnquiryServiceImpl();
	
	private void getByEnquiryId() throws IOException, SQLException
	{
		
	
		System.out.println("Enter the Enquiry Id ");
		int e_id=sc.nextInt();
		ArrayList<EnquiryBean> list = ies.getByEnquiryId(e_id); 
		/*if(eb.getFname() == null)
		{
			System.out.println("Details Not found");
		}
		else
		{
			System.out.println("\nE_Id\tFNAME\tLNAME\tPHONE\tDOMAIN\tLOCATE");
			System.out.println(eb);
		}*/
		
		for(EnquiryBean out:list){
			System.out.println(out);

			
			//System.out.println(list);
		}
		
		
	}

}
