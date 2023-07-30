
Note: Contact me for any issue

# Online Voting System - PollGenie
Spring MVC(Java) application for conducting and managing online elections.




## Technologies Used
    1. Java 20
    2. Spring MVC
    3. Hibernate
    4. Tomcat 10
    5. MySQL
    6. JSP and JSTL
    7. HTML CSS and Bootstrap
    8. Maven
    9. IntelliJ IDEA Ultimate.

## Features
### Admin
- Admin can register new voters.
- Admin can add new polls(Election).
- Admin can create Multiple polls.
- Admin can add options(candidates) for each poll.
- Admin can delete or anncounce result for poll.

### Voter 
- Voter can login by username and password provided by admin.
- Voter can first chose election and then select one option(candidate) from the list of candidates.
- Voter can only vote if result is not anncounced.
- Voter can see winner if result is anncounced.




### Admin - Screenshots

Admin Home:
![AdminHome](https://github.com/UmerrAli/Poll-Genie/assets/106273026/81d2b024-4687-48aa-8dd1-80f5d711cad4)

Voters List:
![VoterList](https://github.com/UmerrAli/Poll-Genie/assets/106273026/fbf21803-913e-4ca8-b6cd-fa40b530de4c)

Add Options:
![addOptions](https://github.com/UmerrAli/Poll-Genie/assets/106273026/10137685-956f-441b-8985-ecf1e2a7207a)


### Voter - Screenshots
Voter Login:
![VoterLogin](https://github.com/UmerrAli/Poll-Genie/assets/106273026/44d79ecc-9b57-4a6f-877d-e968939584db)

Voter Home:
![VoterHome](https://github.com/UmerrAli/Poll-Genie/assets/106273026/fd2f9bd9-fdb2-4c10-bc7b-0176102f6773)

Vote Page:
![VoterVote](https://github.com/UmerrAli/Poll-Genie/assets/106273026/943ec667-dc40-4f82-b663-682ba5da7e2b)
## Run Locally

- Clone the project
- You can use any IDE
- Use Java17 or above
- Tomcat 10 or above
- Install all dependencies using Maven.
- Install MYSQL
- Configure dataSource Bean in file dispacher-servlet.xml according to your database.
- After deploying on your local Tomcat server visit this link in your browser http://localhost:8080/admin/login 
- Use **admin** as both username and password to login as admin.
- To login as voter visit this link http://localhost:8080/voter/login

