package com.relation.demorealtion.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.apache.catalina.UserDatabase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private String name;


    @OneToMany(
        mappedBy = "user",
        cascade=CascadeType.ALL,
        orphanRemoval=true

    )


    private List<Order> orders=new ArrayList<>();


    @OneToOne(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name="detail_id",referencedColumnName = "id")
    @JsonManagedReference
    private UserDetail userDetail;



    @ManyToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns=@JoinColumn(name="role_id")
    )
    private Set<Role> roles=new HashSet<>();

    public void addOrder(Order order){
        orders.add(order);
        order.setUser(this);
    }

    public void removeOrder(Order order){
        orders.remove(order);
        order.setUser(null);
    }
    public void addRole(Role role){

        roles.add(role);
        role.getUsers().add(this);


    }

    public void removeRole(Role role){
        roles.remove(role);;
        role.getUsers().remove(this);
    }

}
