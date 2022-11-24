package com.sirim.msiapp.controller;

import com.sirim.msiapp.model.Guest;
import com.sirim.msiapp.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/guest")
@CrossOrigin
public class GuestController {

    @Autowired
    public GuestService guestService;

    @PostMapping("/add")
    public String add(@RequestBody Guest guest) {
        guestService.saveGuest(guest);
        return "New guest is added";
    }

    @GetMapping("/getAll")
    public List<Guest> getAllGuests() {
        return guestService.getAllGuests();
    }

/*
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    Optional<Guest> getGuestById(@PathVariable int id) {
        return guestService.getGuestById(id);
    }*/


    @RequestMapping(method = RequestMethod.GET)
    public List<Guest> getGuestByCompany(@RequestParam(value="company") String company) {
        return guestService.getGuestByCompany(company);
    }

}
