package study.jparest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.jparest.entity.ProductEntity;

@Repository
public interface Myrepository extends JpaRepository<ProductEntity, Integer>{

}
