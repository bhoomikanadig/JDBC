package com.xwork.resort;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity

public class ResortEntity {
 private int id;
 private String name;
 private String location;
 private LocalTime checkintime;
 private LocalTime checkouttime;
 private String createBy;
 private LocalDate createDate;
 private  LocalDate updateDate;
 private String owner;
 private double priceperday;
 
 
 
 
}