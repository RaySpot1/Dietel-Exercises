package com.technophiles.newdiaryapp.repositories;

import com.technophiles.newdiaryapp.models.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryRepository extends JpaRepository<Entry, Long> {
}
