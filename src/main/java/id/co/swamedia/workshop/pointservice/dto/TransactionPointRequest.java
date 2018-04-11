package id.co.swamedia.workshop.pointservice.dto;

import lombok.Data;

@Data
public class TransactionPointRequest {
    private Integer actionId;
    private Long employeeId;
}
