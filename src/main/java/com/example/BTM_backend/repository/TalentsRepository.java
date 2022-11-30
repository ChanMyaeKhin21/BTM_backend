  
package com.example.BTM_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BTM_backend.model.Talents;

@Repository
public interface TalentsRepository extends JpaRepository<Talents, Long>{

}
