
package com.chyld.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.chyld.models.Claim;

public interface ClaimRepository extends PagingAndSortingRepository<Claim, Integer> {
}