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
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamId;
    private String name;

    @JsonIgnore
    @ManyToMany
    private List<Manager> managers;
    @JsonIgnore
    @OneToMany(mappedBy = "team")
    private List<Agent> agents;
}
