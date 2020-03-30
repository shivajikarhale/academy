package com.success.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.success.academy.StudPersonalInfoRepo;
import com.success.models.StudPersonalDetails;

@Component
@Service
public class StudentService {
	@Autowired
	StudPersonalInfoRepo studPersonalInfoRepo;
	
    public StudPersonalDetails addStudPersonalInfo(StudPersonalDetails studPersonalDetails) 
    {
    	StudPersonalDetails studNewDetails =checkStudPresence(studPersonalDetails);
        /*Optional<StudPersonalDetails> studInfo = studPersonalInfoRepo.findById(entity.getStudentId());
         
        if(studInfo.isPresent())
        {
        	StudentR newEntity = studInfo.get();
            newEntity.setEmail(entity.getEmail());
            newEntity.setFirstName(entity.getFirstName());
            newEntity.setLastName(entity.getLastName());
 
            newEntity = studPersonalInfoRepo.save(newEntity);
             
            return newEntity;
        } else {*/
    	studNewDetails = studPersonalInfoRepo.save(studNewDetails);
             
            return studNewDetails;
       // }
    }
    
    public String checkForId(String genId){
    	 studPersonalInfoRepo.findById(genId);
    	 
    	 return null;
    }
    
    public StudPersonalDetails checkStudPresence(StudPersonalDetails studDetails) {
    	
    	String courseToJoin =studDetails.getFirstCourse();
		String studName=studDetails.getFirstName();
		String studIdGenerated="";
		if (courseToJoin.length() > 6)
		{
			studIdGenerated = courseToJoin.substring(0, 6);
		}
		else
		{
			studIdGenerated = courseToJoin;
		}
		if (studName.length() > 2)
		{
			studIdGenerated += studName.substring(0, 2);
		}
		else
		{
			studIdGenerated += studName;
		}
		
        List<StudPersonalDetails> studInfo=studPersonalInfoRepo.checkStudPresence(studIdGenerated.toUpperCase());
        String presentId=null;
    	if(studInfo!=null && !studInfo.isEmpty())
    	{
    		StudPersonalDetails lastRegStud=studInfo.get(studInfo.size()-1);
    		presentId =lastRegStud.getStudentId();
    	}
		
		System.out.println("Student Id found in studIdGenerated=============="+studIdGenerated);
		System.out.println("Student Id found in DB=============="+presentId);
		if(presentId!=null && presentId.length()>8)
		{
			int num =Integer.parseInt(presentId.substring(8, presentId.length()));
			num++;
			studIdGenerated +=num;
			
		}
		else
		{
			studIdGenerated +="1";
		}
			
		
		studDetails.setStudentId(studIdGenerated.toUpperCase());
		studDetails.setRegistrationDate(new Date());
    	return studDetails;
    	
    }
}
