package service;

import dto.EmployeeRequestDto;
import dto.EmployeeResponseDto;

import java.util.List;

public interface EmployeeService {

    EmployeeResponseDto createEmployee(EmployeeRequestDto request);

    EmployeeResponseDto getEmployeeById(Long employeeId);

    List<EmployeeResponseDto> getAllEmployees();

    EmployeeResponseDto updateEmployee(Long employeeId,
                                       EmployeeRequestDto request);

    void deleteEmployee(Long employeeId);
}