package br.eti.kinoshita.biostrings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class DNAString implements XString {

    private final String dna;

    private final Set<Character> alphabet = Collections.unmodifiableSet(new HashSet<>(
            Arrays.asList('A', 'C', 'G', 'T', 'M', 'R', 'W', 'S', 'Y', 'K', 'V', 'H', 'D', 'B', 'N', '-', '+', '.')));

    // Calling Set::contains in a stream
    @SuppressWarnings("unlikely-arg-type")
    public DNAString(String dna) {
        Objects.requireNonNull(dna, "The DNA sequence must not be null");
        boolean invalidCharacter = dna.chars()
                .anyMatch((c) -> alphabet.contains(Character.toUpperCase(c)) == Boolean.FALSE);
        if (invalidCharacter) {
            throw new IllegalArgumentException("Invalid DNA character in sequence: " + dna);
        }
        this.dna = dna;
    }

    @Override
    public int length() {
        return dna.length();
    }

    @Override
    public Set<Character> alphabet() {
        return alphabet;
    }

    @Override
    public String toString() {
        return dna;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dna);
    }

    @Override
    public boolean equals(Object obj) {
        return Objects.equals(dna, obj);
    }
}
