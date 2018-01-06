package br.eti.kinoshita.biostrings;

import java.util.Objects;

public class BString implements XString {

    private final String bigString;

    public BString(String bigString) {
        Objects.requireNonNull(bigString, "The big string must not be null");
        this.bigString = bigString;
    }

    @Override
    public int length() {
        return bigString.length();
    }

    @Override
    public String toString() {
        return bigString;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(bigString);
    }

    @Override
    public boolean equals(Object obj) {
        return Objects.equals(bigString, obj);
    }

}
