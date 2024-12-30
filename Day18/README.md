## AOP:

- Logging: Logging method calls, parameters, return values, exceptions: helpful for debugging, monitoring, and auditing without logging into main business logic

- Security: Checking user permissions for method access (check using @Before)

-  Transaction Management: Handling transactions across multiple methods or services (using @Around and @Transactional)

- Caching: Implementing caching for methods without modifying business logic (using @Around)

## PointCut:

1. Pointcut for All Methods
```Java
@Pointcut("execution(* com.hetvi.taskmanager.restcontroller.TaskController.*(..))")
public void allTaskControllerMethods() {}
```

2. Pointcut for a Specific Method
```Java
@Pointcut("execution(* com.hetvi.taskmanager.restcontroller.TaskController.createTask(..))")
public void createTaskMethod() {}
```

3. Pointcut with Parameters
```Java
@Pointcut("execution(* com.hetvi.taskmanager.restcontroller.TaskController.updateTask(com.hetvi.taskmanager.model.Task))")
public void updateTaskMethod(Task task) {}
```

4. Pointcut for Methods Returning a Specific Type
```Java
@Pointcut("execution(com.hetvi.taskmanager.model.Task com.hetvi.taskmanager.restcontroller.TaskController.*(..))")
public void taskReturningMethods() {}
```