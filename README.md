# SpringBootApp

A simple Spring boot RESTful  API for doctor database


#### URL 
API url   : https://javaproject-humble-bonobo-ph.cfapps.io/api/doctors
<br>
APP url  :  https://javaprojectui--master1.repl.co/


Supported Endpoints:

#### GET : 
`/api/doctors` : To fetch all doctors

#### GET : 
`/api/doctors/{id} `: To fetch detail of a simple doctor

#### POST : 
`/api/doctors `: To create or update existing data

#### DELETE : 
`/api/doctors `: To delete the doctor with the provided ID.


Body :

`{
    "name": "Dr.Foo",
    "special": "General Surgeon",
    "salary": 78000,
    "room": 23,
    "degree": "MBBS,MS,Fiages Consultant - General Surgeon"
}`


(Note : If the app fails to start , change your default jdk to 1.8)


