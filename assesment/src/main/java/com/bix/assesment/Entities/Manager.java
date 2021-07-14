package com.bix.assesment.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String name;

    @ManyToMany(mappedBy = "managers")
    private List<Team> teams;

    @JsonIgnore
    @OneToMany(mappedBy = "manager")
    private List<Agent> agents;
}
