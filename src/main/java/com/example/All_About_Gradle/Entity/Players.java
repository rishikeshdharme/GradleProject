package com.example.All_About_Gradle.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="players")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Players {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pid")
    private int Pid;

    @Column(name="name")
    private String Name;

    @Column(name="base_Price")
    private double Base_Price;

    @Enumerated(EnumType.STRING)
    private Teams Team;

    @Column(name="specialist")
    private String Specialist;

    @Column(name="country")
    private String Country;

    @Column(name="centuries")
    private int Centuries;

    @Column(name="fifties")
    private int Fifties;

    @Column(name="best_score")
    private int Best_Score;

}
