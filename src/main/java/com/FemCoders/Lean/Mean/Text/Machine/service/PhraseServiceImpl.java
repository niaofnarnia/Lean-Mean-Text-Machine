package com.FemCoders.Lean.Mean.Text.Machine.service;

import com.FemCoders.Lean.Mean.Text.Machine.Model.Phrase;
import com.FemCoders.Lean.Mean.Text.Machine.Repository.PhraseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhraseServiceImpl implements PhraseService {

    private final PhraseRepository phraseRepository;

    public PhraseServiceImpl(PhraseRepository phraseRepository) {
        this.phraseRepository = phraseRepository;
    }

    @Override
    public List<Phrase> getAllPhrases() {
        return phraseRepository.findAll();
    }

    @Override
    public Optional<Phrase> getPhraseById(Long id) {
        return phraseRepository.findById(id);
    }

    @Override
    public Phrase savePhrase(Phrase phrase) {
        return phraseRepository.save(phrase);
    }

    @Override
    public Optional<Phrase> updatePhrase(Long id, Phrase updatedPhrase) {
        return phraseRepository.findById(id).map(existingPhrase -> {
            existingPhrase.setText(updatedPhrase.getText());
            existingPhrase.setAuthor(updatedPhrase.getAuthor());
            return phraseRepository.save(existingPhrase);
        });
    }

    @Override
    public void deletePhrase(Long id) {
        phraseRepository.deleteById(id);
    }
}