package br.eti.kinoshita.biostrings;

import java.util.Set;

public interface XString {

    public default Set<Character> alphabet() {
        return null;
    }

    public int length();

}
