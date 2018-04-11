package id.co.swamedia.workshop.pointservice.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_transaction_point")
@Data
public class TransactionPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date tanggal;

    @ManyToOne
    private Action action;

    private Long employeeId;
}
