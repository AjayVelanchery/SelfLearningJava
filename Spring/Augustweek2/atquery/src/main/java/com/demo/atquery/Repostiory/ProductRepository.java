package com.demo.atquery.Repostiory;

import com.demo.atquery.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;



public interface ProductRepository extends JpaRepository<Product,Long>{

    @Query(value = "SELECT * FROM products WHERE LOWER(name) LIKE LOWER(CONCAT('%', :name, '%'))", nativeQuery = true)
    List<Product> searchByName(@Param("name") String name);



    @Query("SELECT p FROM Product p WHERE LOWER(p.name)LIKE LOWER(CONCAT('%', :name,'%'))")
    List<Product>SearchByNameJPQL(@Param("name")String name);
}

//LOWER(name) converts the column name to lowercase, so case differences don't affect the search.

//LIKE checks if a pattern matches.
//
//CONCAT('%', :name, '%') → surrounds your search text with % so it matches anywhere inside the name.
//
//:name is a named parameter — Spring will replace it with the method's argument value.
//
//LOWER(...) here ensures the search term is also lowercase for a case-insensitive match.

//Native SQL → Works directly on the database tables and columns.
//
//JPQL → Works on entity names and fields, not raw DB names.