package id.co.swamedia.workshop.pointservice.repository;

import id.co.swamedia.workshop.pointservice.entity.TransactionPoint;
import org.springframework.data.repository.CrudRepository;

public interface TransactionPointRepository extends CrudRepository<TransactionPoint, Integer> {

}
