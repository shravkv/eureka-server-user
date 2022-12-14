package com.bridgelabz.bookstore_user.repository;

import com.bridgelabz.bookstore_user.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<UserData, Long>{

    @Query(value = "SELECT * from users u where u.email = :mail",nativeQuery = true)
    UserData findByEmail(@Param("mail") String mail);
}
