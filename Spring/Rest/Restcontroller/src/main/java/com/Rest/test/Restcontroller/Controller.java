package com.Rest.test.Restcontroller;

import com.Rest.test.Restcontroller.RestcontrollerApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/api")
public class Controller {

    private List<Details> detailsList = new ArrayList<>();

    // GET API to fetch all details
    @GetMapping("/details")
    public List<Details> getAllDetails() {
        return detailsList;
    }

    // POST API to add new details
    @PostMapping("/details")
    public String addDetails(@RequestBody Details details) {
        detailsList.add(details);
        return "Data Inserted Successfully";
    }

    // DELETE API to remove an entry by ID
    @DeleteMapping("/details/{id}")
    public String deleteDetails(@PathVariable int id) {
        detailsList.removeIf(details -> details.getId() == id);
        return "Data Deleted Successfully";

    }

    @PutMapping("/details/{id}")
    public String updateDetails(@PathVariable int id, @RequestBody Details newDetails) {
        for (int i = 0; i < detailsList.size(); i++) {
            if (detailsList.get(i).getId() == id) {
                detailsList.set(i, newDetails);
                return "Data Updated Successfully";
            }
        }
        return "Detail with ID " + id + " not founded";
    }
}