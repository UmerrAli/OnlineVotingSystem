
# Online Voting System - Poll Genie

The Online Voting System, built with Java using Spring MVC, is a web-based software that allows administrators to manage elections and enables voters to participate in polls.

## Demo

https://github.com/UmerrAli/OnlineVotingSystem/assets/106273026/7c7e80de-23da-4d77-b7c9-1cba2f73ecad

## Run Locally
To run this project on your system you need:
- IDE (Eclipse or NetBeans or IntelliJ IDEA Ultimate)
- Java 20
- Tomcat 10
- MYSQL

### Steps
1. Clone the project.
2. Install all dependencies using Maven.
3. Create a database in MYSQL using this statement "CREATE DATABASE onlinevotingsystem".
4. Configure dataSource Bean in file dispacher-servlet.xml according to your database (username and password)
5. Configure Tomcat server with Eclipse and start the server.
6. After successfully deploying on your local Tomcat server visit this link in your browser http://localhost:8080/Online-Voting-System/
7. Use admin as both username and password to login as admin.

Note: You don't need to create tables as **Hibernate** will create and manage all tables in database. 

## Features
### Admin
- **Register New Voters**: Admins can register new voters with the system.
- **Create New Polls (Elections):** Admins can create new polls for various elections.
- **Manage Multiple Polls:** Admins can manage multiple polls simultaneously.
- **Add Candidates for Each Poll:** Admins can specify and manage candidates for each poll.
- **Delete Polls or Announce Results:** Admins can delete polls or announce the results once voting is complete.

### Voter
- **Login:** Voters can log in using the username and password provided by the admin.
- **Select Election and Vote:** Voters can choose an election and select a candidate from the list.
- **Voting Restriction:** Voters can only vote if the results have not been announced.
- **View Election Results:** Voters can view the winner once the results are announced.

## Improvements
- Improve the UI of the project.
- Add a logout button.
- Add a home button.
- Handle exceptions such as poll draw situations.
- Containerize the application using Docker.
