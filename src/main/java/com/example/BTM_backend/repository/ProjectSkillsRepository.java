  
package com.example.BTM_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BTM_backend.model.ProjectSkills;

@Repository
public interface ProjectSkillsRepository extends JpaRepository<ProjectSkills, Long>{

}
