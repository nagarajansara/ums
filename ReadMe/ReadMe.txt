1. Checkoutr the given URL Github the URL "https://github.com/nagarajansara/ums.git"
2. RUN the .sql file
3. Sample Request and Input Body
		GET: http://localhost:8080/ums/api/user?limit=&offset=
		PUT: http://localhost:8080/ums/api/user/{id}
		POST: http://localhost:8080/ums/api/user
				 [  
					  {  
						 "email":"rnagarajan.ramalingam@gmail.com",
						 "first_name":"Nagarajan",
						 "last_name":"Ramalingam",
						 "role_id":"1",
						 "mobile_no":"9597921805",
						 "status":"active",
						 "gender":"male"
					  }
				 ]
		DELETE: http://localhost:8080/ums/api/user/{id}

4. Before build the application, Need to change the data base details in "db.properties"
5. Artifact location is {web/target/ums.war}
		
Constraints:
************
	1. Not use the SQL transaction
	2. Not maintain the authetification
	3. Data base user name and password not encrypted
	
Deployment Details
***************
1. Build Tool : Maven
2. Java 7
3. Server: Tomcat 7
4. MySQL version  5.7.11