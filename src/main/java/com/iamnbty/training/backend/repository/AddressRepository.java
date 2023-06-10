package com.iamnbty.training.backend.repository;

import com.iamnbty.training.backend.entity.Address;
import com.iamnbty.training.backend.entity.Social;
import com.iamnbty.training.backend.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddressRepository extends CrudRepository<Address, String> {

    List<Address> findByUser(User user);


}
