package com.azure.demodb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    Integer course_code;
    Integer coordinator_id;
    String course_name;

    String level;

    public Integer getCourse_code() {
        return course_code;
    }

    public void setCourse_code(Integer course_code) {
        this.course_code = course_code;
    }

    public Integer getCoordinator_id() {
        return coordinator_id;
    }

    public void setCoordinator_id(Integer coordinator_id) {
        this.coordinator_id = coordinator_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

}


