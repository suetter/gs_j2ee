package org.MyStore.dao.ref;

import org.MyStore.model.ref.StatutFacture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StatutFactureRepository extends JpaRepository<StatutFacture, Long> {

}
