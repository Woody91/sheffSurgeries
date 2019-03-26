package com.awoodliffe

class Appointment {
Date appDate
String appTime
int appDurationMins
String roomNumber

    static constraints = {
appDate nullable: false, blank: false
appTime nullable: false, blank: false
appDurationMins nullable: false, blank: false
roomNumber nullable: false, blank: false
    }
}
