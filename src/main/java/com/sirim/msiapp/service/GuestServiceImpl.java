package com.sirim.msiapp.service;

import com.sirim.msiapp.model.Guest;
import com.sirim.msiapp.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestRepository guestRepository;

    @Override
    public Guest saveGuest(Guest guest) {
        return guestRepository.save(guest);
    }

    @Override
    public List<Guest> getAllGuests() {
        return guestRepository.findAllOrderByCompany();
    }

/*    @Override
    public Optional<Guest> getGuestById(int id) {
        return guestRepository.findById(id);
    }*/

    @Override
    public List<Guest> getGuestByCompany(String company) {
        return guestRepository.findGuestByCompany(company);
    }

}
