# Employee Service

Refer to the department-service for:
- Register to service registry (Eureka)
- Use externalized configuration (Spring Cloud Config Server)
- Distributed tracing (Zipkin)
- Build REST APIs

## API Testing 

### Add an employee

Request:
```bash
http POST :8082/employees id=1 departmentId=1 name="William" age=28 position="Manager"
```

Response:
```json
{
  "age": 28,
  "departmentId": 1,
  "id": 1,
  "name": "William",
  "position": "Manager"
}
```

Add more employees:
```bash
http POST :8082/employees id=2 departmentId=1 name="John" age=30 position="Business Consultant"
http POST :8082/employees id=3 departmentId=2 name="Tommy" age=32 position="Sales"
```

### Find an employee by id

Request:
```bash
http GET :8082/employees/1
```

Response:
```json
{
    "age": 28,
    "departmentId": 1,
    "id": 1,
    "name": "William",
    "position": "Manager"
}
```

### Find all employees

Request:
```bash
http GET :8082/employees
```

Response:
```json
[
  {
    "age": 28,
    "departmentId": 1,
    "id": 1,
    "name": "William",
    "position": "Manager"
  },
  {
    "age": 30,
    "departmentId": 1,
    "id": 2,
    "name": "John",
    "position": "Business Consultant"
  },
  {
    "age": 32,
    "departmentId": 2,
    "id": 3,
    "name": "Tommy",
    "position": "Sales"
  }
]
```

### Find an employee by department id

Request:
```bash
http GET :8082/employees/departments/1
```

Response:
```json
[
  {
    "age": 28,
    "departmentId": 1,
    "id": 1,
    "name": "William",
    "position": "Manager"
  },
  {
    "age": 30,
    "departmentId": 1,
    "id": 2,
    "name": "John",
    "position": "Business Consultant"
  }
]
```
