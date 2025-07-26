package com.example.demo.repostiory;

import com.example.demo.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Long> {


}
