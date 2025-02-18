package com.example.college.service;

import com.example.college.entity.College;
import com.example.college.Repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CollegeService {

    @Autowired
    private CollegeRepository collegeRepository;

    public College addCollege(College college) {
        return collegeRepository.save(college);
    }

    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }

    public Optional<College> getCollegeById(Long id) {
        return collegeRepository.findById(id);
    }

    public Optional<College> getCollegeByName(String name) {
        return collegeRepository.findByName(name);
    }

    public College updateCollegeName(Long id, String newName) {
        College college = collegeRepository.findById(id).orElseThrow();
        college.setName(newName);
        return collegeRepository.save(college);
    }

    public void deleteCollegeById(Long id) {
        collegeRepository.deleteById(id);
    }
}