package id.co.swamedia.workshop.pointservice.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "t_action")
@Data
public class Action {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 12, nullable = false)
    @NotNull
    private String nama;

    @Column(name = "jumlah_poin")
    private Integer jumlahPoin;

    @OneToMany(mappedBy = "action")
    private List<TransactionPoint> transactionPoints;
}
