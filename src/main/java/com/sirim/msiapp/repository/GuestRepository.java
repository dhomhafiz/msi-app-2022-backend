package com.sirim.msiapp.repository;
import com.sirim.msiapp.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Integer> {
    @Query("SELECT g FROM Guest g WHERE g.company = ?1")
    List<Guest> findGuestByCompany(String company);

    @Query("SELECT g FROM Guest g ORDER BY g.company")
    List<Guest> findAllOrderByCompany();

}

