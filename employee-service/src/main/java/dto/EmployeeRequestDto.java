package dto;

import lombok.Data;

@Data
public class EmployeeRequestDto {

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private String designation;

    private String branchName;

    private Double salary;
}