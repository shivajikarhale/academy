package com.success.academy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.success.models.TestDetailIdentity;
import com.success.models.TestDetails;

@Repository
public interface TestDetailsRepo extends JpaRepository<TestDetails, TestDetailIdentity>{

}
