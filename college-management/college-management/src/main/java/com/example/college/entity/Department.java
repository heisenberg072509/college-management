package com.example.college.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "college_id")
    private College college;

    @OneToOne
    @JoinColumn(name = "hod_id")
    private Faculty hod;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Faculty> faculties;

    // Getters and Setters
}