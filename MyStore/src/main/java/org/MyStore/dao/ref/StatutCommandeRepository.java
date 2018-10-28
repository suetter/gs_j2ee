package org.MyStore.dao.ref;

import org.MyStore.model.ref.StatutCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StatutCommandeRepository extends JpaRepository<StatutCommande, Long> {

}
