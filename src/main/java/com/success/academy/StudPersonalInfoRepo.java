package com.success.academy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.success.models.StudPersonalDetails;


@CrossOrigin(origins = "http://localhost:4200")
public interface StudPersonalInfoRepo extends JpaRepository<StudPersonalDetails, String> {
	@Query("select c from StudPersonalDetails c where c.studentId like ?1%  ORDER BY c.registrationDate ASC")
	    public List<StudPersonalDetails> checkStudPresence(String studentId);

}
