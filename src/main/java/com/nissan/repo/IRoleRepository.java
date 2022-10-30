package com.nissan.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.Role;

@Repository
public interface IRoleRepository extends JpaRepositoryImplementation<Role, Integer> {

}
