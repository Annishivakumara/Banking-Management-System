package controller;

import dto.EmployeeRequestDto;
import dto.EmployeeResponseDto;
import org.springframework.web.bind.annotation.*;
import service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public EmployeeResponseDto createEmployee(
            @RequestBody EmployeeRequestDto request) {

        return employeeService.createEmployee(request);
    }

    @GetMapping("/{id}")
    public EmployeeResponseDto getEmployeeById(
            @PathVariable Long id) {

        return employeeService.getEmployeeById(id);
    }

    @GetMapping
    public List<EmployeeResponseDto> getAllEmployees() {

        return employeeService.getAllEmployees();
    }

    @PutMapping("/{id}")
    public EmployeeResponseDto updateEmployee(
            @PathVariable Long id,
            @RequestBody EmployeeRequestDto request) {

        return employeeService.updateEmployee(id, request);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(
            @PathVariable Long id) {

        employeeService.deleteEmployee(id);

        return "Employee deleted successfully";
    }
}