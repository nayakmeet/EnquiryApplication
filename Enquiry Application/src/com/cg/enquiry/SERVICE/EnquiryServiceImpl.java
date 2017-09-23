package com.cg.enquiry.SERVICE;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import com.cg.enquiry.DAO.EnquiryDAOImpl;
import com.cg.enquiry.DAO.IEnquiryDAO;
import com.cg.enquiry.DTO.EnquiryBean;

public class EnquiryServiceImpl implements IEnquiryService {
	
	IEnquiryDAO ida=new EnquiryDAOImpl();

	public ArrayList<EnquiryBean> getByEnquiryId(int e_id) throws IOException, SQLException{
		
		return ida.getByEnquiryId(e_id);
	
	}
	
	@Override
	public ArrayList<EnquiryBean> getAllDetails() 
		{
		
		return ida.addEnquiryDetails();
		
		}
	}
