package tnsif.c2tc.m07.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import tnsif.c2tc.m07.entity.Shop;

public interface ShopRepo extends //CrudRepository<Shop, Long> {
	                              JpaRepository<Shop, Long>{

}
