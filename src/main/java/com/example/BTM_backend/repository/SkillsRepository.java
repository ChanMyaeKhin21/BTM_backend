  
package com.example.BTM_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BTM_backend.model.Skills;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Long>{

}
