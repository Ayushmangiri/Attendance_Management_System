package com.Attendance.Attendance_Management_System.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Data
@Generated
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Attendance {
    @Id  //Ye primary key hoga (unique ID har student ka)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Auto-increment karega ID ko DB ke through
    private Long id;
    private LocalDate date;
    private String status;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
