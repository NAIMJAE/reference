package kr.co.reference.searchEngine;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KomoranIndexRepository extends JpaRepository<KomoranIndex,String> {
}
