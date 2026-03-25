package com.attendance.controller;

import com.attendance.model.Attendance;
import com.attendance.service.AttendanceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attendance")
@CrossOrigin(origins = "*")
public class AttendanceController {

    private final AttendanceService service;

    public AttendanceController(AttendanceService service) {
        this.service = service;
    }

    @PostMapping
    public Attendance mark(@RequestBody Attendance attendance) {
        return service.markAttendance(attendance);
    }

    @GetMapping
    public List<Attendance> getAll() {
        return service.getAttendance();
    }
}