package com.attendance.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long studentId;
    private LocalDate date;
    private boolean present;

    public Attendance() {}

    public Attendance(Long studentId, LocalDate date, boolean present) {
        this.studentId = studentId;
        this.date = date;
        this.present = present;
    }

    public Long getId() { return id; }
    public Long getStudentId() { return studentId; }
    public LocalDate getDate() { return date; }
    public boolean isPresent() { return present; }

    public void setId(Long id) { this.id = id; }
    public void setStudentId(Long studentId) { this.studentId = studentId; }
    public void setDate(LocalDate date) { this.date = date; }
    public void setPresent(boolean present) { this.present = present; }
}