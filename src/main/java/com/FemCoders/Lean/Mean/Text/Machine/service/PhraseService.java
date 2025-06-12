package com.FemCoders.Lean.Mean.Text.Machine.service;

import com.FemCoders.Lean.Mean.Text.Machine.Model.Phrase;

import java.util.List;
import java.util.Optional;

public interface PhraseService {
    List<Phrase> getAllPhrases();
    Optional<Phrase> getPhraseById(Long id);
    Phrase savePhrase(Phrase phrase);
    Optional<Phrase> updatePhrase(Long id, Phrase phrase);
    void deletePhrase(Long id);
}
