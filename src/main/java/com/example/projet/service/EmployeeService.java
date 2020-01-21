package com.example.projet.service;

import com.example.projet.doman.Employee;
import com.example.projet.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@AllArgsConstructor
@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;


    UUID uuid=UUID.randomUUID();
    String Uuid=uuid.toString();
    Employee employee= new Employee();
    employee.setId(Uuid)

}
