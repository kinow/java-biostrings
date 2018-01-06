package br.eti.kinoshita.biostrings;

public interface XString {

    public default String[] alphabet() {
        return null;
    }

    public int length();

}
