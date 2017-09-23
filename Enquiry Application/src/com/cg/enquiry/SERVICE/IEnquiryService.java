package com.cg.enquiry.SERVICE;


import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;



import com.cg.enquiry.DTO.EnquiryBean;

public interface IEnquiryService {
	
	public ArrayList<EnquiryBean> getByEnquiryId(int e_id) throws IOException, SQLException;
	 public ArrayList<EnquiryBean> getAllDetails();

}
