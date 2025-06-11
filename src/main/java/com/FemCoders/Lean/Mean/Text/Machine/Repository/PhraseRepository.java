package com.FemCoders.Lean.Mean.Text.Machine.Repository;

import com.FemCoders.Lean.Mean.Text.Machine.Model.Phrase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhraseRepository extends JpaRepository<Phrase, Long> {
}