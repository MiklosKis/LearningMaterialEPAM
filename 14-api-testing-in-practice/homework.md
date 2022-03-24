###### Test Automation Mentoring Program 2021

## Module 14 - API testing in practice

##### Homework
 _**Precondition**_
 1. Copy and unpack the `dummy-rest-api-example-master.zip` in your TAM repository
 2. Enter into the `dummy-rest-api-example-master` folder 
 3. Build Image: ```docker build -t dummyrestapi .``` _~5 minutes_
 4. Run Image:
     * **Git bash/WSL2:** ```docker run -d -p 80:8080 dummyrestapi```
     * **Desktop UI** 
     
Use the following API endpoints to complete the homework. 
The dummy API used from: https://github.com/kovaku/dummy-rest-api-example
* GET		http://0.0.0.0:80/api/v1/employees 		(Get all employee data)
* GET		http://0.0.0.0:80/api/v1/employee/{id} 	(Get a single employee data based on id)
* POST		http://0.0.0.0:80/api/v1/create			(Create new employee)
* PUT		http://0.0.0.0:80/api/v1/update/{id}		(Update employee record based on id)
* DELETE	http://0.0.0.0:80/api/v1/delete/{id}		(Delete employee based on id)
 
_**Execute the following steps in Postman**_

1. Create new employee (Json fields: name, salary, age)
2. Retrieve the data of the created employee
3. Update salary of the employee (mandatory Json fields: name, salary, age)
4. Retrieve the data of the employee and check the updated salary
5. Try to create new employee with the same name and check the response
6. Delete the employee 
7. Save the responses to files and upload them to GIT

_**RestAssured**_
1. Write a test case to GET 1st employee and validate the response status code

_**Optional (mandatory for the primary skill)**_  
1. Create employee and validate the response code and the name field of the created employee
2. Delete employee and validate the following text in the response body: "successfully! deleted Records"

##### Evaluation Criteria
* **0 point:** No homework provided.
* **3 points:** Postman related tasks are completed.
* **5 points:** All the tasks are completed.