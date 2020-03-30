package com.success.academy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.success.models.InstituteCourses;

@Repository
public interface CourseRepo extends JpaRepository<InstituteCourses, String>{

}
