package org.MyStore.dao;

import org.MyStore.model.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {

}
