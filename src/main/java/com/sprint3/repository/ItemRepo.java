package com.sprint3.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sprint3.entities.Item;
public interface ItemRepo extends JpaRepository<Item,Long> {
	
}
