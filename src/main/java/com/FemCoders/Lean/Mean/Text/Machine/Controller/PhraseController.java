package com.FemCoders.Lean.Mean.Text.Machine.Controller;

import com.FemCoders.Lean.Mean.Text.Machine.Model.Phrase;
import com.FemCoders.Lean.Mean.Text.Machine.Repository.PhraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/phrases")
public class PhraseController {

    @Autowired
    private PhraseRepository phraseRepository;

    // Get all phrases
    @GetMapping
    public List<Phrase> getAllPhrases() {
        return phraseRepository.findAll();
    }

    // Get phrase by ID
    @GetMapping("/{id}")
    public Optional<Phrase> getPhraseById(@PathVariable Long id) {
        return phraseRepository.findById(id);
    }

    // Add a new phrase
    @PostMapping
    public Phrase addPhrase(@RequestBody Phrase phrase) {
        return phraseRepository.save(phrase);
    }

    // Update a phrase
    @PutMapping("/{id}")
    public Phrase updatePhrase(@PathVariable Long id, @RequestBody Phrase updatedPhrase) {
        return phraseRepository.findById(id).map(phrase -> {
            phrase.setText(updatedPhrase.getText());
            phrase.setAuthor(updatedPhrase.getAuthor());
            return phraseRepository.save(phrase);
        }).orElseGet(() -> {
            updatedPhrase.setId(id);
            return phraseRepository.save(updatedPhrase);
        });
    }

    // Delete a phrase
    @DeleteMapping("/{id}")
    public void deletePhrase(@PathVariable Long id) {
        phraseRepository.deleteById(id);
    }
}