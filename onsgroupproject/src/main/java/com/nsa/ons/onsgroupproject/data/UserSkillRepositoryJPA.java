package com.nsa.ons.onsgroupproject.data;

import com.nsa.ons.onsgroupproject.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserSkillRepositoryJPA extends JpaRepository<User,Long> {

    @Query("SELECT u FROM User u, UserSkill u_s WHERE u_s.skill_id = :searchTerm AND u.id = u_s.user_id")
    List <User> findUsersSkillBySkillId(@Param("searchTerm") Long searchTerm);



}