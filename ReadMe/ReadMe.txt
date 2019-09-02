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


		
Constraints:
	1. Not use the SQL transaction
	2. Not maintain the authetification