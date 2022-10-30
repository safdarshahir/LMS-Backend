package com.nissan.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.FieldOfficer;

@Repository
public interface IFieldRepository extends JpaRepositoryImplementation<FieldOfficer, Integer> {

}
