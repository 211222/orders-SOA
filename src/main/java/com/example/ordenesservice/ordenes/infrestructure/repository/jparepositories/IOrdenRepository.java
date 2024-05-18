package com.example.ordenesservice.ordenes.infrestructure.repository.jparepositories;

import com.example.ordenesservice.ordenes.infrestructure.models.MySQLOrdenModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrdenRepository extends JpaRepository<MySQLOrdenModel, String> {

}
