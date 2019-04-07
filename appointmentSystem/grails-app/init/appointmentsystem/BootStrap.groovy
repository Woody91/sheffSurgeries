package com.awoodliffe

class BootStrap {

    def init = { servletContext ->

def appointmentOne=new
Appointment(
appDate: new Date('08/05/2019'),
appTime:'5pm',
appDurationMins:15,
roomNumber:'A-111'

).save()

def appointmentTwo=new
Appointment(
appDate: new Date('11/05/2019'),
appTime:'4pm',
appDurationMins:10,
roomNumber:'B-111'

).save()

def surgeryBig=new
Surgery(
name:'Hillsborough',
address:'123 Surgery Road',
postcode:'S6 123',
telephone:'0114 123 4567',
numberOfPatients:'1000',
description:'''A rather large surgery. Still almost impossible to get an appointment.''',
openingTime:'8.30am'

).save()

def surgerySmall=new
Surgery(
name:'Firth Park',
address:'123 Stubbin Lane',
postcode:'S5 A23',
telephone:'0114 111 2222',
numberOfPatients:'500',
description:'''A rather small surgery. Definitely almost impossible to get an appointment.''',
openingTime:'8.30am'

).save()

def receptionistOne=new
Receptionist(
recepName:'Susan',
recepEmail:'notadoctor@surgery.com',
recepUsername:'BigSue',
recepPassword:'password',
recepPhone:'0114 246 1130'


).save()

def receptionistTwo=new
Receptionist(
recepName:'Linda',
recepEmail:'iknownothing@surgery.com',
recepUsername:'NosyLinda',
recepPassword:'password',
recepPhone:'0114 246 1135'

).save()

def prescriptionOne=new
Prescription(
pharmacyName:'Lloyds',
prescripNumber:'1',
medicine:'Piles Cream',
totalCost:'£20',
dateIssued: new Date('20/06/2019'),
patientPaying:'True'

).save()

def prescriptionTwo=new
Prescription(
pharmacyName:'Lloyds',
prescripNumber:'2',
medicine:'Lansoprazole',
totalCost:'£15',
dateIssued: new Date('12/06/2019'),
patientPaying:'False'

).save()

def patientOne=new
Patient(
patientName:'Adam',
patientAddress:'Garden Of Eden',
patientResidence:'Earth',
patientDob: new Date('01/01/0001'),
patientID:'0001',
dateRegistered: new Date('02/01/0001'),
patientPhone:'0773155473'

).save()

def patientTwo=new
Patient(
patientName:'Eve',
patientAddress:'666 The Bad Place',
patientResidence:'Hell',
patientDob: new Date('01/01/0001'),
patientID:'0002',
dateRegistered: new Date('03/01/0001'),
patientPhone:'07712345678'

).save()

def nurseOne=new
Nurse(
nurseName:'Nurse Joy',
qualifications:'BSc Adult Nursing',
nurseEmail:'nursejoy@surgery.com',
nurseOffice:'B-1234',
nursePhone:'0114 245 8899',


).save()

def nurseTwo=new
Nurse(
nurseName:'Nurse Misery',
qualifications:'BSc Mental Health Nursing',
nurseEmail:'nursemisery@surgery.com',
nurseOffice:'C-1234',
nursePhone:'0114 245 7788',


).save()

def doctorOne=new
Doctor(
fullName:'Dr John Dorian',
qualification:'MD Medicine',
position:'Chief of Medicine',
doctorEmail:'scrubsjd@surgery.com',
password:'password',
doctorOffice:'A-9991',
doctorPhone:'07724681012',
bio:'''I can't do this all on my own, no I know, I'm no superman.'''
).save()

def doctorTwo=new
Doctor(
fullName:'Dr Chris Turk',
qualification:'MD Surgery',
position:'Head Surgeon',
doctorEmail:'callturk@surgery.com',
password:'password',
doctorOffice:'A-9992',
doctorPhone:'07711558875',
bio:'''I'm bout' to do a mad slizice in ya insideeeees yo'''
).save()


patientOne.addToPrescriptions(prescriptionOne)
patientTwo.addToPrescriptions(prescriptionTwo)

patientOne.addToDoctors(doctorOne)
patientTwo.addToDoctors(doctorTwo)

patientOne.addToAppointments(appointmentOne)
patientTwo.addToAppointments(appointmentTwo)

doctorOne.addToPatients(patientOne)
doctorTwo.addToPatients(patientTwo)

doctorOne.addToPrescriptions(prescriptionOne)
doctorTwo.addToPrescriptions(prescriptionTwo)

doctorOne.addToAppointments(appointmentOne)
doctorTwo.addToAppointments(appointmentTwo)

doctorOne.addToNurses(nurseOne)
doctorTwo.addToNurses(nurseTwo)

surgeryBig.addToPatients(patientOne)
surgerySmall.addToPatients(patientTwo)

surgeryBig.addToNurses(nurseOne)
surgerySmall.addToNurses(nurseTwo)

surgeryBig.addToReceptionists(receptionistOne)
surgerySmall.addToReceptionists(receptionistTwo)

surgeryBig.addToAppointments(appointmentOne)
surgerySmall.addToAppointments(appointmentTwo)

surgeryBig.addToDoctors(doctorOne)
surgerySmall.addToDoctors(doctorTwo)

    }
    def destroy = {
    }
}
