package com.sirim.msiapp.service;

import com.sirim.msiapp.model.Guest;

import java.util.List;
import java.util.Optional;

public interface GuestService {
    public Guest saveGuest(Guest guest);
    public List<Guest> getAllGuests();

/*
    Optional<Guest> getGuestById(int id);*/

    public List<Guest> getGuestByCompany(String company);


}


