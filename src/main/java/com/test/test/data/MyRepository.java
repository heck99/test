package com.test.test.data;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;
import javax.persistence.QueryHint;
import java.util.List;

import static org.hibernate.LockOptions.SKIP_LOCKED;

@Repository
public interface MyRepository extends JpaRepository<Parent, Long> {

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @QueryHints({@QueryHint(name = "javax.persistence.lock.timeout", value = SKIP_LOCKED + "")})
    List<Parent> findByName(String name, Pageable page);
}
