package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeResponseDto {

    private Long employeeId;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private String designation;

    private String branchName;

    private Double salary;

    private String status;
}