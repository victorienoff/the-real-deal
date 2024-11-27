package com.example.therealdealback.Dao;

import com.example.therealdealback.Model.Teams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoTeams extends JpaRepository<Teams, Integer> {
}
