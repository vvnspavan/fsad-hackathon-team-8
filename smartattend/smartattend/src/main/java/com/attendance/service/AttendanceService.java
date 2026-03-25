package com.attendance.service;

import com.attendance.model.Attendance;
import com.attendance.repository.AttendanceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceService {

    private final AttendanceRepository repo;

    public AttendanceService(AttendanceRepository repo) {
        this.repo = repo;
    }

    public Attendance markAttendance(Attendance attendance) {
        return repo.save(attendance);
    }

    public List<Attendance> getAttendance() {
        return repo.findAll();
    }
}